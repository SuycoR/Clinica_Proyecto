/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Sacnhez;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import Modelo_Menu.Repository;
import com.itextpdf.text.pdf.qrcode.WriterException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.net.URL;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import java.util.Random;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class PruebasDePdf {
    private static final String RUTA_IMAGEN = "src/img/logo.png"; // Ruta a la imagen del logo
    private static final String RUTA_ARCHIVO = "src/pdf/";
    public static String ruta;
    public double idDoctor=0.0;
    // Constructor de la clase
    public int contarFacturas() {
        int totalFacturas = 0;

        // Consulta SQL para contar el número de facturas
        String sql = "SELECT idDoctor, COUNT(idFactura) AS totalFacturas FROM Facturas GROUP BY idDoctor";

        try (
            Connection conn = Repository.ConectarBD();  // Conexión a la base de datos
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery()
        ) {
            // Obtener el resultado de la consulta
            if (rs.next()) {
                totalFacturas = rs.getInt("totalFacturas");
                idDoctor=rs.getInt("idDoctor");
            }
        } catch (SQLException e) {
            System.out.println("Error al contar las facturas: " + e.getMessage());
        }

        return totalFacturas;
    }
    
    public void generarFacturaPDF(int idPaciente) throws SQLException  {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        int idFactura=contarFacturas();
        try{
            conn = Repository.ConectarBD();

             // Consulta para obtener datos del paciente
            String queryPaciente = "SELECT nombre, dni, celular, direccion FROM paciente WHERE id = ?";
            stmt = conn.prepareStatement(queryPaciente);
            stmt.setInt(1, idPaciente);
            rs = stmt.executeQuery();

            // Variables para almacenar los datos del paciente
            String nombreCli = "";
            String cedulaCli = "";
            String telefonoCli = "";
            String direccionCli = "";

            // Verificar si se encontró el paciente y obtener sus datos
            if (rs.next()) {
                nombreCli = rs.getString("nombre");
                cedulaCli = rs.getString("dni");
                telefonoCli = rs.getString("celular");
                direccionCli = rs.getString("direccion");
            } else {
                System.out.println("No se encontró el paciente con ID: " + idPaciente);
                return; // O manejar el caso según tu lógica de negocio
            }
            // Consulta para obtener nombre del doctor
            String queryDoctor = "SELECT nombre,dni FROM doctor WHERE idDoctor = ?";
            stmt = conn.prepareStatement(queryDoctor);
            stmt.setInt(1, (int)idDoctor); 
            rs = stmt.executeQuery();
            String nombreDoctor = "";
            String RucDoctor="";
            // Verificar si se encontró el doctor y obtener su nombre
            if (rs.next()) {
                nombreDoctor = "Dr. " + rs.getString("nombre"); // Agregar el prefijo "Dr."
                RucDoctor=rs.getString("dni");
            } else {
                System.out.println("No se encontró el doctor con ID: " + idPaciente);
                return; // O manejar el caso según tu lógica de negocio
            }
            double descuentoTotal=0.0 ;
            double subtotal=0.0  ;        
            double igv =0.0 ;
            double totalPagar =0.0 ;
            int nfilas=0 ;
            int numeroaleatorio=0;
            //Datoas factura
            String sql = "SELECT * FROM Facturas WHERE idFactura = ?";

            try (
                Connection conno = Repository.ConectarBD();  // Conexión a la base de datos
                PreparedStatement pstmt = conno.prepareStatement(sql)
            ) {
                // Establecer los parámetros de la sentencia SQL
                pstmt.setInt(1, idFactura);

                try (ResultSet rsss = pstmt.executeQuery()) {
                    if (rsss.next()) {
                        descuentoTotal = rsss.getDouble("descuentoTotal");
                        subtotal = rsss.getDouble("subtotal");
                        igv = rsss.getDouble("igv");
                        totalPagar = rsss.getDouble("totalPagar");
                        nfilas = rsss.getInt("nfilas")-1;
                        numeroaleatorio=rsss.getInt("codigoFactura");
                    }
                }
            } catch (SQLException e) {
                System.out.println("Error al obtener la factura: " + e.getMessage());
            }
            
            
            String fechaActual = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy/MM/dd"));
            String nombreArhivo = "Factura_" + fechaActual.replace("/", "_") + ".pdf";
            
            File file = new File(RUTA_ARCHIVO + nombreArhivo);
            FileOutputStream archivo = new FileOutputStream(file);
            Document doc = new Document();
            PdfWriter.getInstance(doc, archivo);
            doc.open();
            
            
            String numeroFormateado = String.format("%04d", numeroaleatorio);
            // Encabezado con imagen y datos de la farmacia
            Image img = Image.getInstance(RUTA_IMAGEN);
            img.scaleToFit(90, 100);
            PdfPTable encabezado = new PdfPTable(3);
            
            encabezado.setWidthPercentage(100);
            encabezado.getDefaultCell().setBorder(0);
            encabezado.setWidths(new float[]{20f, 45f,40f});
            PdfPCell cell1 = new PdfPCell(img);
            Font negrita=new Font(Font.FontFamily.TIMES_ROMAN,12,Font.BOLD);
            Font boldFont = new Font(Font.FontFamily.COURIER, 20, Font.BOLD,new BaseColor(66, 135, 245));
            //informacion de la empresa
            String ruc_emp="20602802281";
            String tel_emp="+51 1 234 5678";
            String razon_emp=" Clínica Bienestar S.A.C.";

            // Creación de las frases
            float leading = 20f; // Espaciado entre líneas
            Phrase combinedPhrase = new Phrase(leading);
            combinedPhrase.add(new Phrase("Clínica Bienestar\n", boldFont));
            combinedPhrase.add(new Phrase("Razon social: " + razon_emp, negrita));
            combinedPhrase.add(new Phrase("\nDireccion: Avenida Javier Prado Este 1234, San Isidro, Lima, Perú\n", negrita));
            combinedPhrase.add(new Phrase("Telefono: " + tel_emp + "\n", negrita));
            combinedPhrase.add(new Phrase("Fecha de emision: " + fechaActual , negrita));
            cell1.setBorder(PdfPCell.NO_BORDER);
            
            //boleta frase
            PdfPCell boleta=new PdfPCell(new Phrase("RUC: "+ruc_emp+"\nBOLETA DE VENTA ELECTRONICA \nB001-0000"+numeroFormateado,negrita));
            boleta.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
            boleta.setVerticalAlignment(PdfPCell.ALIGN_MIDDLE);
            
            encabezado.addCell(cell1);
            encabezado.addCell(combinedPhrase);
            encabezado.addCell( boleta);
            doc.add(encabezado);
            //Espacio en blanco
            //espacio en blanco
            Paragraph espacio=new Paragraph();
            espacio.add(Chunk.NEWLINE);
            espacio.add("");
            espacio.setAlignment(Element.ALIGN_CENTER);
            doc.add(espacio);
            

            //Datos doctor
            // Título y detalles del cliente
            PdfPTable datosTable= new PdfPTable(2);
            datosTable.setWidthPercentage(100);
            datosTable.setWidths(new float[]{50f, 50f});
            datosTable.getDefaultCell().setBorder(0);
            
            
            
            Phrase clientePhrase = new Phrase(leading);
            clientePhrase.add(new Phrase("Cliente\n", boldFont));
            clientePhrase.add(new Phrase("BOLETA: "+nombreCli+"\n", negrita));
            clientePhrase.add(new Phrase("RUC/DNI: "+cedulaCli+" \n", negrita));
            clientePhrase.add(new Phrase("Telefono: "+telefonoCli+" \n", negrita));
            clientePhrase.add(new Phrase("Direccion: "+direccionCli+" \n", negrita));
            Phrase doctorPhrase = new Phrase();
            doctorPhrase.add(new Phrase("Atendido por:\n", boldFont));
            doctorPhrase.add(new Phrase("Cargo: "+nombreDoctor+" \n", negrita));
            doctorPhrase.add(new Phrase("DNI: "+RucDoctor+" \n", negrita));
            
            
            datosTable.addCell(clientePhrase);
            datosTable.addCell(doctorPhrase);
            doc.add(datosTable);
            
            // Detalles de la factura
            doc.add(espacio);
            
            String[][] data = new String[0][0];
            try (Connection ampere = Repository.ConectarBD();
                PreparedStatement psta = ampere.prepareStatement(
                        "SELECT cita.idCita, doctor.nombre AS nombreDoctor, CONCAT(paciente.nombre, ' ', paciente.apellido) AS nombrePaciente, " +
                                "cita.fechaCita, cita.fechaRegistro, cita.costoTotal, cita.estado, cita.idDoctor " +
                                "FROM cita " +
                                "JOIN doctor ON cita.idDoctor = doctor.idDoctor " +
                                "JOIN paciente ON cita.idPaciente = paciente.id " +
                                "WHERE paciente.id = ? AND cita.estado = 'atendido'")) {
               psta.setInt(1, idPaciente);
               try (ResultSet urss = psta.executeQuery()) {


                   // Crear la matriz de cadenas
                   data = new String[nfilas][6]; // Ya que tienes 6 columnas en tu tabla PDF

                   int contador = 0;
                   double subtotalpci=0.0;
                   double descuentopaci=0.0;
                   double resultado=0.0;
                   
                   while (urss.next()) {
                       data[contador][0] = String.valueOf(contador + 1); // Número
                       data[contador][1] = urss.getString("fechaCita"); // Fecha de Cita
                       data[contador][2] = urss.getString("nombreDoctor"); // Nombre Doctor

                       subtotalpci = urss.getDouble("costoTotal");
                       descuentopaci = subtotalpci * 0.04;
                       resultado=subtotalpci *0.96;
                       data[contador][4] = String.format("%.2f", descuentopaci); // Descuento
                       data[contador][3] = String.format("%.2f", subtotalpci); // Costo Total
                       data[contador][5] = String.format("%.2f", resultado); // Total a Pagar

                       contador++;
                   }
               }
           } catch (SQLException e) {
               System.out.println("Error al llenar la tabla citas: " + e);
               data = new String[0][0]; // Manejo de error, asignar matriz vacía en caso de excepción
           }
            // Tabla de conceptos
            PdfPTable tablaConceptos = new PdfPTable(6); // Reducir a 6 columnas
            tablaConceptos.setWidthPercentage(100);
            tablaConceptos.setWidths(new float[]{9f, 20f, 20f, 13f, 10f, 15f}); // Ajusta los anchos según tus necesidades
            tablaConceptos.setHorizontalAlignment(Element.ALIGN_CENTER);

            BaseColor colorEncabezado = new BaseColor(55, 183, 195); // Color del encabezado

            // Encabezados de la tabla
            Font fontBold = new Font(Font.FontFamily.HELVETICA, 10, Font.BOLD, BaseColor.WHITE);

            PdfPCell header1 = new PdfPCell(new Phrase("Numero", fontBold));
            PdfPCell header2 = new PdfPCell(new Phrase("Fecha de Cita", fontBold));
            PdfPCell header3 = new PdfPCell(new Phrase("Nombre Doctor", fontBold)); // Ajusté el texto del encabezado para coincidir con el contenido de la columna
            PdfPCell header4 = new PdfPCell(new Phrase("Costo Total", fontBold));
            PdfPCell header5 = new PdfPCell(new Phrase("Descuento", fontBold));
            PdfPCell header6 = new PdfPCell(new Phrase("Total a Pagar", fontBold));

                    // Establecer borde superior e inferior para las celdas de encabezado
            header1.setBorder(Rectangle.TOP | Rectangle.BOTTOM);
            header2.setBorder(Rectangle.TOP | Rectangle.BOTTOM);
            header3.setBorder(Rectangle.TOP | Rectangle.BOTTOM);
            header4.setBorder(Rectangle.TOP | Rectangle.BOTTOM);
            header5.setBorder(Rectangle.TOP | Rectangle.BOTTOM);
            header6.setBorder(Rectangle.TOP | Rectangle.BOTTOM);
            float altoEncabezado = 30f;
            header1.setFixedHeight(altoEncabezado);
            header2.setFixedHeight(altoEncabezado);
            header3.setFixedHeight(altoEncabezado);
            header4.setFixedHeight(altoEncabezado);
            header5.setFixedHeight(altoEncabezado);
            header6.setFixedHeight(altoEncabezado);

            header1.setVerticalAlignment(PdfPCell.ALIGN_MIDDLE);
            header2.setVerticalAlignment(PdfPCell.ALIGN_MIDDLE);
            header3.setVerticalAlignment(PdfPCell.ALIGN_MIDDLE);
            header4.setVerticalAlignment(PdfPCell.ALIGN_MIDDLE);
            header5.setVerticalAlignment(PdfPCell.ALIGN_MIDDLE);
            header6.setVerticalAlignment(PdfPCell.ALIGN_MIDDLE);

            header1.setBackgroundColor(colorEncabezado);
            header2.setBackgroundColor(colorEncabezado);
            header3.setBackgroundColor(colorEncabezado);
            header4.setBackgroundColor(colorEncabezado);
            header5.setBackgroundColor(colorEncabezado);
            header6.setBackgroundColor(colorEncabezado);

            // Agregar celdas de encabezado a la tabla
            // Añadir encabezados a la tabla
            tablaConceptos.addCell(header1);
            tablaConceptos.addCell(header2);
            tablaConceptos.addCell(header3);
            tablaConceptos.addCell(header4);
            tablaConceptos.addCell(header5);
            tablaConceptos.addCell(header6);



            Font fontNormal = new Font(Font.FontFamily.HELVETICA, 10);

            // Agregar datos a la tabla
            for (String[] row : data) {
                for (int i = 0; i < row.length; i++) {  
                    PdfPCell pdfCell = new PdfPCell(new Phrase(row[i], fontNormal));
                    pdfCell.setVerticalAlignment(PdfPCell.ALIGN_MIDDLE);
                    pdfCell.setMinimumHeight(25f); // Altura mínima de la celda
                    pdfCell.setFixedHeight(35f);
                    // Establecer borde superior e inferior para las celdas de datos
                    if (i == 0) {
                        pdfCell.setBorder(Rectangle.TOP | Rectangle.BOTTOM);
                    } else {
                        pdfCell.setBorder(Rectangle.BOTTOM);
                    }
                    
                    tablaConceptos.addCell(pdfCell);
                }
            }     
            
            doc.add(tablaConceptos);

            //tabla de impuestos 
            PdfPTable tablaImpuesatos= new PdfPTable(4);
            tablaImpuesatos.getDefaultCell().setBorder(0);
            tablaImpuesatos.setWidthPercentage(100);
            tablaImpuesatos.setWidths(new float[]{60,25,12,3});
            tablaImpuesatos.setHorizontalAlignment(Element.ALIGN_RIGHT);
            
            Phrase impuestoPhrase= new Phrase(leading);
            impuestoPhrase.add(new Phrase("OP. GRABADAS: S/  " , negrita));
            impuestoPhrase.add(new Phrase("\nIGV: S/ ",negrita));
            impuestoPhrase.add(new Phrase("\nTOTAL A PAGAR: S/" , negrita));
            
            Phrase valorPhrase = new Phrase(leading);
            valorPhrase.add(new Phrase( String.format(" %.2f",subtotal) , negrita));
            valorPhrase.add(new Phrase( String.format(" %.2f",igv) , negrita));
            valorPhrase.add(new Phrase( String.format(" %.2f",totalPagar) , negrita));

            PdfPCell celdaIgv = new PdfPCell(impuestoPhrase);
            celdaIgv.setHorizontalAlignment(Element.ALIGN_RIGHT);
            celdaIgv.setBorder(Rectangle.NO_BORDER);

            PdfPCell celdaTotal = new PdfPCell(valorPhrase);
            celdaTotal.setHorizontalAlignment(Element.ALIGN_RIGHT);
            celdaTotal.setBorder(Rectangle.NO_BORDER);
            
            tablaImpuesatos.addCell("");
            tablaImpuesatos.addCell(celdaIgv);
            tablaImpuesatos.addCell(celdaTotal);
            tablaImpuesatos.addCell("");
            doc.add(tablaImpuesatos);
            
            doc.add(espacio);
            // Total y otros detalles
            String textoConvertido = ConvertidorNumeroTexto.convertirNumeroATexto(totalPagar);
            Paragraph totalDetails = new Paragraph("SON "+textoConvertido, negrita);
            totalDetails.setAlignment(Element.ALIGN_LEFT);
            // Información personal
            Paragraph informacionPersonal = new Paragraph("\n\nInformación adicional", negrita);
            Paragraph datos = new Paragraph("\nForma de pago: Efectivo\nCaja: 1", fontNormal);
            Paragraph banco = new Paragraph("\n\nBANCO DE CRÉDITO DEL PERÚ Soles N°: 191993607777046\nCCI: 0021911936907777046569", negrita);
            Paragraph admin = new Paragraph("\n\nVendedor: ", negrita);
            Paragraph admin2 = new Paragraph("Admintrador ", fontNormal);
            Phrase info2 = new Phrase(leading);
            info2.add(totalDetails);
            info2.add(informacionPersonal);
            info2.add(datos);
            info2.add(banco);
            info2.add(admin);
            info2.add(admin2);
            
            
            PdfPTable tablaFinal = new PdfPTable(2);
            tablaFinal.getDefaultCell().setBorder(0);
            tablaFinal.setWidthPercentage(100);
            tablaFinal.setWidths(new float[]{70, 30});

            
            // Añadir información y código QR
            String rutaQR = "src/img/codigo_qr.png"; 
            Image qr = Image.getInstance(rutaQR);
            qr.scaleToFit(120, 120);
            PdfPCell celdafinal=new PdfPCell(new Paragraph(info2));
            celdafinal.setBorder(0);
            PdfPCell celdaqr=new PdfPCell(qr);
            celdaqr.setBorder(0);
            celdaqr.setHorizontalAlignment(PdfPCell.ALIGN_CENTER);
            tablaFinal.addCell(celdafinal);
            tablaFinal.addCell(celdaqr);
            
            doc.add(tablaFinal);
            doc.close();
            archivo.close();
            ruta=nombreArhivo;
            Desktop.getDesktop().open(file);
            EnviarArchivoPDF enviararchivo = new EnviarArchivoPDF();

            // Llamar al método EnviarArchivo de la instancia creada
            enviararchivo.EnviarArchivo(idPaciente, idFactura);

        } catch (DocumentException | IOException e) {
            System.out.println("Error en "+e);
        }
    }
}
