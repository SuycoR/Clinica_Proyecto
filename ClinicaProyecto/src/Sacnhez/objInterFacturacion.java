
package Sacnhez;


import Modelo_Menu.Repository;
import Modelo_Menu.ModeloCita;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Date;
import javax.swing.Icon;
import javax.swing.ImageIcon;
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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Tutur
 */

public class objInterFacturacion extends javax.swing.JInternalFrame {
    Repository objMenuCita;
    public long idDoctor=0;
    public int idPaciente;
    private String idDoctorString;
    private String idPacienteString;
    private double totalConIGV=0.0; 
    private String fechaRegistro;
    private Date fechaRegistros;
    private long lunes;
    private long martes;
    private long miercoles;
    private long jueves;
    private long viernes;
    private long sabado;
    private double cantidad=0.0;
    private int IdPacienteSeleccionado;
    ModeloCita objMenuCitaPaciente;
    //modelo de datos
    private DefaultTableModel modeloDatosProducto;
     private PruebasDePdf prueba; 
    
    public objInterFacturacion() {
        prueba = new PruebasDePdf(); 
        objMenuCitaPaciente = new ModeloCita();
        objMenuCita = new Repository();
        initComponents();
        this.setSize(800,600);
        this.setTitle("Facturacion");

        //Cargar paciente
        this.CargarComboPacientes();
        ImageIcon wallpaper=new ImageIcon("src/img/fondo3.jpg");
        Icon icono =new ImageIcon(wallpaper.getImage().getScaledInstance(800, 600, WIDTH));
        jlabel_wallpaper.setIcon(icono);
        this.CargarTablaCita();
        this.repaint();
    }

        
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox_cliente1 = new javax.swing.JComboBox<>();
        txt_cantidad = new javax.swing.JTextField();
        txt_paciente_buscar1 = new javax.swing.JTextField();
        jButton_buscar_cliente = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPanes = new javax.swing.JScrollPane();
        jTable_citas = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txt_cambio = new javax.swing.JTextField();
        jTextField_subtotal1 = new javax.swing.JTextField();
        jTextField_descuento = new javax.swing.JTextField();
        jTextField_igv = new javax.swing.JTextField();
        jTextField_totalpagar = new javax.swing.JTextField();
        txt_efectivo = new javax.swing.JTextField();
        jButton_calcular_cambio = new javax.swing.JButton();
        jButton_RegistarVenta = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jlabel_wallpaper = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Facturación");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, -1, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Paciente:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 100, -1));

        jComboBox_cliente1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione cliente", "Item 2", "Item 3", "Item 4" }));
        jComboBox_cliente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_cliente1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox_cliente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 170, -1));

        txt_cantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cantidadActionPerformed(evt);
            }
        });
        getContentPane().add(txt_cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, 150, -1));

        txt_paciente_buscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_paciente_buscar1ActionPerformed(evt);
            }
        });
        getContentPane().add(txt_paciente_buscar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, 150, -1));

        jButton_buscar_cliente.setText("Buscar");
        jButton_buscar_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_buscar_clienteActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_buscar_cliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 40, 80, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable_citas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable_citas.setEnabled(false);
        jScrollPanes.setViewportView(jTable_citas);

        jPanel1.add(jScrollPanes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 740, 190));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 760, 210));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setVerifyInputWhenFocusTarget(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel5.setText("Descuento:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel6.setText("Efectivo:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel7.setText("Subtotal:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel8.setText("I.G.V:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel9.setText("Cambio:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel10.setText("Total a pagar:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        txt_cambio.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_cambio.setEnabled(false);
        txt_cambio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cambioActionPerformed(evt);
            }
        });
        jPanel2.add(txt_cambio, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 120, -1));

        jTextField_subtotal1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextField_subtotal1.setEnabled(false);
        jTextField_subtotal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_subtotal1ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField_subtotal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 120, -1));

        jTextField_descuento.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextField_descuento.setEnabled(false);
        jTextField_descuento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_descuentoActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField_descuento, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 120, -1));

        jTextField_igv.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextField_igv.setEnabled(false);
        jTextField_igv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_igvActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField_igv, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 120, -1));

        jTextField_totalpagar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextField_totalpagar.setEnabled(false);
        jTextField_totalpagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_totalpagarActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField_totalpagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 120, -1));

        txt_efectivo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_efectivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_efectivoActionPerformed(evt);
            }
        });
        jPanel2.add(txt_efectivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 120, -1));

        jButton_calcular_cambio.setBackground(new java.awt.Color(51, 255, 255));
        jButton_calcular_cambio.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton_calcular_cambio.setText("Calcular Cambio");
        jButton_calcular_cambio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_calcular_cambioActionPerformed(evt);
            }
        });
        jPanel2.add(jButton_calcular_cambio, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 130, 50));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 330, 380, 210));

        jButton_RegistarVenta.setBackground(new java.awt.Color(51, 255, 255));
        jButton_RegistarVenta.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton_RegistarVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/impresora.png"))); // NOI18N
        jButton_RegistarVenta.setText("Registrar Venta");
        jButton_RegistarVenta.setToolTipText("");
        jButton_RegistarVenta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton_RegistarVenta.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton_RegistarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_RegistarVentaActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_RegistarVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 350, 170, 100));

        jButton1.setText("Mostrar informacion");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, -1, -1));
        getContentPane().add(jlabel_wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox_cliente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_cliente1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_cliente1ActionPerformed

    private void txt_cantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cantidadActionPerformed

    private void txt_paciente_buscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_paciente_buscar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_paciente_buscar1ActionPerformed

    private void jButton_buscar_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_buscar_clienteActionPerformed
        String clienteBuscar = txt_cantidad.getText().trim();
        Connection cn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;

        try {
            cn = Repository.ConectarBD();
            String sql ="SELECT nombre, apellido FROM paciente WHERE dni = ?";

            pst = cn.prepareStatement(sql);
            pst.setString(1, clienteBuscar);

            rs = pst.executeQuery();

            if (rs.next()) {
                jComboBox_cliente1.setSelectedItem(rs.getString("nombre") + " " + rs.getString("apellido"));
            } else {
                jComboBox_cliente1.setSelectedItem("Seleccionar paciente:");
                JOptionPane.showMessageDialog(null, "DNI del paciente incorrecto o no encontrado");
            }

            txt_cantidad.setText("");
        } catch (SQLException e) {
            System.out.println("Error al buscar cliente: " + e);
        } finally {
            try {
                if (rs != null) rs.close();
                if (pst != null) pst.close();
                if (cn != null) cn.close();
            } catch (SQLException ex) {
                System.out.println("Error al cerrar conexiones: " + ex);
            }
        }
    }//GEN-LAST:event_jButton_buscar_clienteActionPerformed

    private void txt_cambioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cambioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cambioActionPerformed

    private void jTextField_subtotal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_subtotal1ActionPerformed
       
        
        
    }//GEN-LAST:event_jTextField_subtotal1ActionPerformed

    private void jTextField_descuentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_descuentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_descuentoActionPerformed

    private void jTextField_igvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_igvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_igvActionPerformed

    private void jTextField_totalpagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_totalpagarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_totalpagarActionPerformed

    private void txt_efectivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_efectivoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_efectivoActionPerformed

    private void jButton_calcular_cambioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_calcular_cambioActionPerformed
    try {
        // Obtener el texto ingresado en txt_efectivo
        String textoEfectivo = txt_efectivo.getText().trim();

        // Verificar si el campo no está vacío antes de intentar convertirlo
        if (!textoEfectivo.isEmpty()) {
            // Convertir el texto a double
            double montoPagado = Double.parseDouble(textoEfectivo);

            // Calcular el cambio
            double cambio = montoPagado - cantidad;

            // Mostrar el cambio en txt_cambio
            txt_cambio.setText(String.format("%.2f", cambio));
        } else {
            // Si el campo está vacío, mostrar un mensaje al usuario o tomar otra acción
            txt_cambio.setText("Ingrese un monto válido");
        }
    } catch (NumberFormatException e) {
        // Manejo de la excepción si el texto no se puede convertir a double
        txt_cambio.setText("Ingrese un valor numérico válido");
    }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_calcular_cambioActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    Connection con = null;
    try {
        con = Repository.ConectarBD();

        String sqlPaciente = "SELECT * FROM paciente";
        Statement st = con.createStatement();
        ResultSet rsPaciente = st.executeQuery(sqlPaciente);

        while (rsPaciente.next()) {
            int id = rsPaciente.getInt("id");
            String nombre = rsPaciente.getString("nombre");
            String apellido = rsPaciente.getString("apellido");

            String nombreCompleto = nombre + " " + apellido;

            // Comparar con el elemento seleccionado en el JComboBox
            if (nombreCompleto.equals(jComboBox_cliente1.getSelectedItem())) {
                idPaciente = id;
                objMenuCitaPaciente.setIdPaciente(idPaciente);
                break;
            }
        }

    } catch (SQLException e) {
        System.out.println("Error al cargar clientes " + e);
    } finally {
        try {
            if (con != null) con.close();
        } catch (SQLException e) {
            System.out.println("Error al cerrar la conexión: " + e);
        }
    }
    
    CargarTablaCita();                                   

    }//GEN-LAST:event_jButton1ActionPerformed

private String obtenerNombreCompleto(int idPaciente) throws SQLException {
    String nombreCompleto = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    Connection con=Repository.ConectarBD();
    try {
        String sql = "SELECT CONCAT(nombre, ' ', apellido) AS nombreCompleto FROM paciente WHERE id = ?";
        pst = con.prepareStatement(sql);
        pst.setInt(1, idPaciente);
        rs = pst.executeQuery();

        if (rs.next()) {
            nombreCompleto = rs.getString("nombreCompleto");
        } else {
            System.out.println("Paciente no encontrado");
        }
    } finally {
        // Cerrar recursos
        if (rs != null) rs.close();
        if (pst != null) pst.close();
    }
    
    return nombreCompleto;
}
    private void jButton_RegistarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_RegistarVentaActionPerformed
        int auxiliarPaciente = idPaciente;
        int auxiliarDoctor=(int)idDoctor;
        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;

        try {
  
            // Obtener el nombre completo del paciente
            String nombrePaciente = obtenerNombreCompleto(auxiliarPaciente);

            // Generar la factura PDF
            prueba.generarFacturaPDF(auxiliarPaciente);

            String mensaje = String.format("Se generó la boleta y se envio al correo para la venta de %s", nombrePaciente);
            JOptionPane.showMessageDialog(this, mensaje, "Boleta Generada", JOptionPane.INFORMATION_MESSAGE);

        } catch (SQLException ex) {
            System.out.println("Error al generar la factura PDF: " + ex.getMessage());
            JOptionPane.showMessageDialog(this, "Error al generar la boleta", "Error", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(objInterFacturacion.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            // Cerrar recursos
            try {
                if (rs != null) rs.close();
                if (pst != null) pst.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar recursos: " + e);
            }
        }

    }//GEN-LAST:event_jButton_RegistarVentaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton_RegistarVenta;
    private javax.swing.JButton jButton_buscar_cliente;
    private javax.swing.JButton jButton_calcular_cambio;
    private javax.swing.JComboBox<String> jComboBox_cliente1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPanes;
    public static javax.swing.JTable jTable_citas;
    private javax.swing.JTextField jTextField_descuento;
    private javax.swing.JTextField jTextField_igv;
    private javax.swing.JTextField jTextField_subtotal1;
    private javax.swing.JTextField jTextField_totalpagar;
    private javax.swing.JLabel jlabel_wallpaper;
    private javax.swing.JTextField txt_cambio;
    private javax.swing.JTextField txt_cantidad;
    private javax.swing.JTextField txt_efectivo;
    private javax.swing.JTextField txt_paciente_buscar1;
    // End of variables declaration//GEN-END:variables
    //metodo para cargar clientes

    private void CargarComboPacientes(){
        Connection cn=Repository.ConectarBD();
        String sql="select * from paciente";
        Statement st;
        try{
           st =cn.createStatement();
           ResultSet rs=st.executeQuery(sql); 
           jComboBox_cliente1.removeAllItems();
           jComboBox_cliente1.addItem("Seleccione Paciente:");
           while(rs.next()){
               jComboBox_cliente1.addItem(rs.getString("nombre")+" "+rs.getNString("apellido"));
           }
           
           cn.close();
        }catch(SQLException e){
            System.out.println("Error al cargar clientes "+e);
         }
    }
    
    private void CargarTablaCita() {
    try (Connection con = Repository.ConectarBD();
         PreparedStatement pst = con.prepareStatement(
                 "SELECT cita.idCita, doctor.nombre AS nombreDoctor, CONCAT(paciente.nombre, ' ', paciente.apellido) AS nombrePaciente, " +
                         "cita.fechaCita, cita.fechaRegistro, cita.costoTotal, cita.estado, cita.idDoctor " +
                         "FROM cita " +
                         "JOIN doctor ON cita.idDoctor = doctor.idDoctor " +
                         "JOIN paciente ON cita.idPaciente = paciente.id " +
                         "WHERE paciente.id = ? AND cita.estado = 'atendido'");
         ) {

        pst.setInt(1, objMenuCitaPaciente.getIdPaciente());
        try (ResultSet rs = pst.executeQuery()) {
            DefaultTableModel model = new DefaultTableModel() {
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };

            // Añadir las columnas al modelo
            model.addColumn("N");
            model.addColumn("Nombre Paciente");
            model.addColumn("Nombre Doctor");
            model.addColumn("Fecha Cita");
            model.addColumn("Descuento");
            model.addColumn("Costo Total");
            model.addColumn("Estado");

            int contador = 1;
            double subtotal = 0.0;
            double descuentoTotal = 0.0;

            while (rs.next()) {
                Object fila[] = new Object[7];
                idDoctor = rs.getInt("idDoctor");
                fila[0] = contador++;
                fila[1] = rs.getString("nombrePaciente");
                fila[2] = rs.getString("nombreDoctor");
                fila[3] = rs.getString("fechaCita");

                double descuento = (int)rs.getObject("costoTotal")*0.04;
                String descuentoFormateado = String.format("%.2f", descuento);
                fila[4] = descuentoFormateado;
                descuentoTotal += descuento;
                fila[5] = rs.getObject("costoTotal");
                fila[6] = rs.getObject("estado");

                // Añadir la fila al modelo
                model.addRow(fila);
                subtotal += rs.getDouble("costoTotal");
            }

            double igv = 0.18;
            double totalSinDescuento = subtotal - descuentoTotal;
            double totalIGV = totalSinDescuento * igv;
            double totalConIGV = totalSinDescuento + totalIGV;
            cantidad=totalConIGV;
            // Mostrar descuento total en el JTextField
            jTextField_descuento.setText(String.format("%.2f", descuentoTotal));
            // Mostrar subtotal en el JTextField_subtotal1
            jTextField_subtotal1.setText(String.valueOf(subtotal));
            jTextField_igv.setText(String.format("%.2f", totalIGV));

            // Mostrar total a pagar (subtotal + igv - descuento) en jTextField_totalpagar
            jTextField_totalpagar.setText(String.format("%.2f", totalConIGV));

            // Crear la tabla y establecer el modelo
            objInterFacturacion.jTable_citas.setModel(model);
            if(totalConIGV!=0){
                guardarFactura(idPaciente,(int)idDoctor,descuentoTotal,subtotal,totalIGV,totalConIGV,contador);
            }
            // Ajustar el ancho de las columnas
            TableColumnModel columnModel = objInterFacturacion.jTable_citas.getColumnModel();
            columnModel.getColumn(0).setPreferredWidth(50); // Ancho para la columna de número de fila
            
            for (int i = 1; i < columnModel.getColumnCount(); i++) {
                columnModel.getColumn(i).setPreferredWidth(150); // Ancho para las otras columnas
            }
            
        }

    } catch (SQLException e) {
        System.out.println("Error al llenar la tabla citas: " + e);
    }
}
    
     public void guardarFactura(int idPaciente, int idDoctor, double descuentoTotal,
                                double subtotal, double igv, double totalPagar,int nfilas) {
         // Sentencia SQL para la inserción
         String sql = "INSERT INTO Facturas (idPaciente, idDoctor, descuentoTotal, subtotal, igv, totalPagar,nfilas,codigoFactura) " +
                      "VALUES (?, ?, ?, ?, ?, ?,?,?)";
         
         Random random = new Random();
         int numeroAleatorio = random.nextInt(9999) + 1;
         try (
             Connection conn = Repository.ConectarBD();  // Conexión a la base de datos
             PreparedStatement pstmt = conn.prepareStatement(sql)
         ) {
             // Establecer los parámetros de la sentencia SQL
             pstmt.setInt(1, idPaciente);
             pstmt.setInt(2, idDoctor);
             pstmt.setDouble(3, descuentoTotal);
             pstmt.setDouble(4, subtotal);
             pstmt.setDouble(5, igv);
             pstmt.setDouble(6, totalPagar);
             pstmt.setDouble(7, nfilas);
             pstmt.setInt(8, numeroAleatorio);

             // Ejecutar la inserción
             pstmt.executeUpdate();             
         } catch (SQLException e) {
             System.out.println("Error al guardar la factura: " + e.getMessage());
         }
    }
}
