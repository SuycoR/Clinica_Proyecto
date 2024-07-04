
package Sacnhez;


import Modelo_Menu.Menu;
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
/**
 *
 * @author Tutur
 */

public class InterFracturacion extends javax.swing.JInternalFrame {
    Menu objMenuCita;
    private long idDoctor;
    public int idPaciente;
    private String idDoctorString;
    private String idPacienteString;
    
    private String fechaRegistro;
    private Date fechaRegistros;
    private long lunes;
    private long martes;
    private long miercoles;
    private long jueves;
    private long viernes;
    private long sabado;
    ModeloCita objMenuCitaPaciente;
    //modelo de datos
    private DefaultTableModel modeloDatosProducto;
    
    public InterFracturacion() {
        objMenuCitaPaciente = new ModeloCita();
        objMenuCita = new Menu();
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
    //netodo para inciializar la taval;
    private void inicializarTablaProducto(){
        modeloDatosProducto=new DefaultTableModel();
        //añadir columnas
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
        getContentPane().add(jButton_RegistarVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 350, 170, 100));

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, -1, -1));
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
        String clienteBuscar="";
        clienteBuscar =txt_cantidad.getText().trim();
        Connection cn=Menu.ConectarBD();
        String sql ="select nombre,apellido from paciente where dni="+clienteBuscar+"";
        Statement st;
        try {
            st=cn.createStatement();
            ResultSet rs=st.executeQuery(sql);
            if(rs.next()){
                jComboBox_cliente1.setSelectedItem(rs.getString("nombre")+" "+rs.getString("apellido"));
            }
            else{
                jComboBox_cliente1.setSelectedItem("Seleccionar paciente: " );
                JOptionPane.showMessageDialog(null, "DNI del paciente incorrecta o no encontrada");
            }
            txt_cantidad.setText("");
            cn.close();
        } catch (Exception e) {
            System.out.println("Error al buscar cliente "+e);
        }
    }//GEN-LAST:event_jButton_buscar_clienteActionPerformed

    private void txt_cambioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cambioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cambioActionPerformed

    private void jTextField_subtotal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_subtotal1ActionPerformed
        // TODO add your handling code here:
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
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_calcular_cambioActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Connection con = Menu.ConectarBD();

        String sqlPaciente = "select * from paciente";
        Statement st;

        try {
            st = con.createStatement();

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

            con.close();
            
            }catch(SQLException e){
            System.out.println("Error al cargar clientes "+e);
         }
        CargarTablaCita();
    }//GEN-LAST:event_jButton1ActionPerformed


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
    private int IdPacienteSeleccionado;

    private void CargarComboPacientes(){
        Connection cn=Menu.ConectarBD();
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
    IdPacienteSeleccionado = objMenuCitaPaciente.getIdPaciente();
        System.out.println(IdPacienteSeleccionado);
    Connection con = Menu.ConectarBD();
    DefaultTableModel model = new DefaultTableModel();
    String sql = "SELECT idDoctor, idPaciente, fechaCita, fechaRegistro, costoTotal, estado FROM cita WHERE idPaciente = ?";
    PreparedStatement pst;
    try {
        pst = con.prepareStatement(sql);
        pst.setInt(1, IdPacienteSeleccionado); // Establece el valor del parámetro
        ResultSet rs = pst.executeQuery();
        InterFracturacion.jTable_citas = new JTable(model);
        InterFracturacion.this.jScrollPanes.setViewportView(InterFracturacion.jTable_citas);

        model.addColumn("N");
        model.addColumn("idDoctor");
        model.addColumn("idPaciente");
        model.addColumn("fechaCita");
        model.addColumn("fechaRegistro");
        model.addColumn("costoTotal");
        model.addColumn("estado");
        int contador = 1;
        while (rs.next()) {
            Object fila[] = new Object[7];
        
        fila[0] = contador++; // Asignar el número de fila
        fila[1] = rs.getObject("idDoctor");
        fila[2] = rs.getObject("idPaciente");
        fila[3] = rs.getObject("fechaCita");
        fila[4] = rs.getObject("fechaRegistro");
        fila[5] = rs.getObject("costoTotal");
        fila[6] = rs.getObject("estado");
        
        // Añadir la fila al modelo
        model.addRow(fila);
        }
        con.close();
    } catch (SQLException e) {
        System.out.println("Error al llenar la tabla citas: " + e);
    }
    
    // Evento para obtener campo al cual el usuario da click
    // y obtener la interfaz que mostrara la informacion general

}
}
