/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sacnhez;
import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
//Opcional
import javax.swing.JOptionPane;
/**
 *
 * @author Tutur
 */
public class evniararchivo {
    public static void main(String[] args){
    String fechaActual = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy/MM/dd"));
    String correo="edujuegos31245@gmail.com";
    String contra="bwbg xlyl zolo chzo";
    String correoDestino="pedro.suyco@unmsm.edu.pe";
    String nombre="rosita.pdf";
     Properties p = new Properties();  
        p.put("mail.smtp.host", "smtp.gmail.com");
        p.setProperty("mail.smtp.starttls.enable", "true");
        p.setProperty("mail.smtp.ssl.protocols", "TLSv1.2");
        p.put("mail.smtp.ssl.trust", "smtp.gmail.com");
        p.setProperty("mail.smtp.port", "587");
        p.setProperty("mail.smtp.user",correo);
        p.setProperty("mail.smtp.auth", "true");
    Session s = Session.getDefaultInstance(p); 
    try {
            

            // Cuerpo del mensaje
            MimeBodyPart cuerpoMensaje = new MimeBodyPart();
            String content = "<p>Estimado/a <strong>[Nombre del Cliente]</strong>,</p>\n" +
        "<p>Esperamos que este mensaje le encuentre bien. Envio la factura correspondiente a los servicios médicos por nuestra clínica.</p>\n" +
        "<h3>Detalles de la Factura:</h3>\n" +
        "<ul>\n" +
        "    <li><strong>Número de Factura:</strong> [Número de Factura]</li>\n" +
        "    <li><strong>Fecha de Emisión:</strong> [Fecha de Emisión]</li>\n" +
        "    <li><strong>Monto Total:</strong> [Monto Total]</li>\n" +
        "</ul>\n" +
        "<p>Agradecemos su preferencia por nuestra clínica y esperamos poder servirle nuevamente en el futuro.</p>\n" +
        "<p>Atentamente,</p>\n" +
        "<p><strong>[Nombre del Representante de la Clínica]</strong><br>\n" +
        "<strong>[Nombre de la Clínica]</strong><br>\n" +
        "<strong>[Teléfono de Contacto]</strong><br>\n" +
        "<strong>[Correo Electrónico de Contacto]</strong></p>";

    // Aquí debes reemplazar los marcadores con los datos reales antes de asignar el contenido al cuerpo del mensaje
        content = content.replace("[Nombre del Cliente]", "Giancarlo");
        content = content.replace("[Número de Factura]", "123456");
        content = content.replace("[Fecha de Emisión]", fechaActual);
        content = content.replace("[Monto Total]", "$1000.00");
        content = content.replace("[Número de Contacto]", "+1234567890");
        content = content.replace("[Nombre del Representante de la Clínica]", "Dr.Fausto Mercado Philco");
        content = content.replace("[Nombre de la Clínica]", "Clinica Bienestar");
        content = content.replace("[Teléfono de Contacto]", "+1234567890");
        content = content.replace("[Correo Electrónico de Contacto]", "ClinicaBienestar@clinica.com");
            cuerpoMensaje.setText(content,"ISO-8859-1","html");

            // Archivo adjunto
            BodyPart adjunto = new MimeBodyPart();
            try {
                File archivoAdjunto = new File("C:/Users/Tutur/Documents/NetBeansProjects/pdfs/src/pdf/"+nombre);
                if (archivoAdjunto.exists()) {
                    adjunto.setDataHandler(new DataHandler(new FileDataSource(archivoAdjunto)));
                    adjunto.setFileName(nombre);
                } else {
                    throw new FileNotFoundException("El archivo adjunto no existe en la ruta especificada.");
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error al adjuntar el archivo: " + e.getMessage());
            } catch (MessagingException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error al crear el mensaje: " + e.getMessage());
            }

            // Multi-part
            MimeMultipart multipart = new MimeMultipart();
            multipart.addBodyPart(cuerpoMensaje);
            multipart.addBodyPart(adjunto);
            
            MimeMessage mensaje = new MimeMessage(s);
            mensaje.setFrom(new InternetAddress(correo));
            mensaje.addRecipient(Message.RecipientType.TO, new InternetAddress(correoDestino));
            
            String subject = "Factura [Número de Factura]- Servicios Médicos ";

            // Reemplazar dinámicamente el número de factura
            subject = subject.replace("[Número de Factura]", "123456");
            mensaje.setSubject(subject);
            
            // Agregar el contenido al mensaje
            mensaje.setContent(multipart);

            Transport t = s.getTransport("smtp");
            t.connect(correo, contra);
            t.sendMessage(mensaje, mensaje.getAllRecipients());
            t.close();


        } catch (AddressException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error en la dirección de correo: " + e.getMessage());
        } catch (MessagingException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al enviar el correo: " + e.getMessage());
        }}
}
