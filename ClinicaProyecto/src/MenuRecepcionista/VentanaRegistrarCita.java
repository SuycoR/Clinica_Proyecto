package MenuRecepcionista;

import Modelo_Menu.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Suyco
 */
public class VentanaRegistrarCita extends javax.swing.JFrame {

    private long idDoctor;
    public int idPaciente;
    private String idDoctorString;
    private String idPacienteString;
    private int costo;
    private int costoRecepcionista;
    private int costoTotal;

    private String fechaRegistro;
    private String fechaCita;
    private long lunes;
    private long martes;
    private long miercoles;
    private long jueves;
    private long viernes;
    private long sabado;
    private Recepcionista objRecepcionista;
    Repository objMenuCita;
    ModeloCita objMenuCitaPaciente;
    private String idRecepcionista;

    /**
     * Creates new form RegistrarCita
     */
    public VentanaRegistrarCita(Recepcionista objRecepcionista) {
        objMenuCitaPaciente = new ModeloCita();
        objMenuCita = new Repository();
        initComponents();
        this.objRecepcionista = objRecepcionista;

        this.setTitle("Gestionar Citas");
        //Cargar tabla
        this.CargarTablaCita();
        this.CargarComboPaciente();

    }

    private VentanaRegistrarCita() {
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_citas = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jComboBox_paciente = new javax.swing.JComboBox<>();
        jButton_elegirPaciente = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jDateChooserFecha = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_apellido = new javax.swing.JTextField();
        txt_costo = new javax.swing.JTextField();
        jComboBox_dia = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jButton_actualizarDia = new javax.swing.JButton();
        jButton_cerrarsesion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(60, 91, 111));
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
        jScrollPane1.setViewportView(jTable_citas);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 710, 230));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Escoge doctor");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, -1, -1));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, 730, 270));

        jPanel3.setBackground(new java.awt.Color(60, 91, 111));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBox_paciente.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBox_paciente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione el dia:", "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado" }));
        jComboBox_paciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_pacienteActionPerformed(evt);
            }
        });
        jPanel3.add(jComboBox_paciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 110, -1));

        jButton_elegirPaciente.setBackground(new java.awt.Color(223, 208, 184));
        jButton_elegirPaciente.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_elegirPaciente.setForeground(new java.awt.Color(0, 0, 0));
        jButton_elegirPaciente.setText("Seleccionar");
        jButton_elegirPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_elegirPacienteActionPerformed(evt);
            }
        });
        jPanel3.add(jButton_elegirPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 120, 40));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Escoge la fecha");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, -1));

        jDateChooserFecha.setDateFormatString("yyyy-MM-dd");
        jPanel3.add(jDateChooserFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 180, 40));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Escoge un paciente");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 220, 270));

        jPanel4.setBackground(new java.awt.Color(60, 91, 111));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.setForeground(new java.awt.Color(60, 91, 111));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Nombre:");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 80, -1));

        txt_nombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombreActionPerformed(evt);
            }
        });
        jPanel4.add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 170, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Apellido:");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 80, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Costo:");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 90, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Elegir Dia:");
        jLabel5.setToolTipText("");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 90, -1));

        txt_apellido.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel4.add(txt_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 170, -1));

        txt_costo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_costo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_costoActionPerformed(evt);
            }
        });
        jPanel4.add(txt_costo, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, 170, -1));

        jComboBox_dia.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBox_dia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione el dia:", "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado" }));
        jComboBox_dia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_diaActionPerformed(evt);
            }
        });
        jPanel4.add(jComboBox_dia, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, 170, -1));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 590, 100));

        jLabel1.setFont(new java.awt.Font("Bahnschrift", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(21, 52, 72));
        jLabel1.setText("Registrar cita");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, -1, 40));

        jPanel5.setBackground(new java.awt.Color(21, 52, 72));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, 250, 5));

        jPanel6.setBackground(new java.awt.Color(21, 52, 72));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1010, 50));

        jPanel7.setBackground(new java.awt.Color(60, 91, 111));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton_actualizarDia.setBackground(new java.awt.Color(223, 208, 184));
        jButton_actualizarDia.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_actualizarDia.setForeground(new java.awt.Color(0, 0, 0));
        jButton_actualizarDia.setText("Registrar cita");
        jButton_actualizarDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_actualizarDiaActionPerformed(evt);
            }
        });
        jPanel7.add(jButton_actualizarDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 200, 35));

        jButton_cerrarsesion.setBackground(new java.awt.Color(223, 208, 184));
        jButton_cerrarsesion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton_cerrarsesion.setForeground(new java.awt.Color(0, 0, 0));
        jButton_cerrarsesion.setText("Volver");
        jButton_cerrarsesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_cerrarsesionActionPerformed(evt);
            }
        });
        jPanel7.add(jButton_cerrarsesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 200, 35));

        jPanel2.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 420, 320, 100));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 993, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox_pacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_pacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_pacienteActionPerformed

    private void jButton_elegirPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_elegirPacienteActionPerformed
        //Metodo para obtener el idPaciente mediante la eleccion en el JCombo

        Connection con = Repository.ConectarBD();

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
                if (nombreCompleto.equals(jComboBox_paciente.getSelectedItem())) {
                    idPaciente = id;
                    objMenuCitaPaciente.setIdPaciente(idPaciente);
                    break;
                }
            }

            con.close();

        } catch (SQLException e) {
            System.out.println("Error al elegir paciente: " + e);
        }
    }//GEN-LAST:event_jButton_elegirPacienteActionPerformed

    private void txt_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombreActionPerformed

    private void txt_costoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_costoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_costoActionPerformed

    private void jComboBox_diaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_diaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_diaActionPerformed

    private void jButton_actualizarDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_actualizarDiaActionPerformed

        Connection con = Repository.ConectarBD();
        String sql = "select idDoctor, nombre, apellido, costo, lunes, martes, miercoles, jueves, viernes, sabado from doctor";
        String sqlRecepcionista = "select * from recepcionista";
        Statement st;
        Statement stRecepcionista;

        try {
            st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                Object fila[] = new Object[10];
                for (int i = 0; i < 10; i++) {

                    fila[i] = rs.getObject(i + 1);
                    switch (i) {

                        case 4 ->
                            lunes = (Long) fila[i];
                        case 5 ->
                            martes = (Long) fila[i];
                        case 6 ->
                            miercoles = (Long) fila[i];
                        case 7 ->
                            jueves = (Long) fila[i];
                        case 8 ->
                            viernes = (Long) fila[i];
                        case 9 ->
                            sabado = (Long) fila[i];

                    }

                }

                //Consulta para actualizar segun la eleccion del JComboDia
                PreparedStatement consulta = con.prepareStatement("update doctor set lunes = ?, martes = ?, miercoles = ?, jueves = ?, viernes = ?, sabado = ? where idDoctor ='" + idDoctor + "'");

                if (jComboBox_dia.getSelectedItem() == "Lunes") {
                    lunes++;
                } else if (jComboBox_dia.getSelectedItem() == "Martes") {
                    martes++;
                } else if (jComboBox_dia.getSelectedItem() == "Miércoles") {
                    miercoles++;
                } else if (jComboBox_dia.getSelectedItem() == "Jueves") {
                    jueves++;
                } else if (jComboBox_dia.getSelectedItem() == "Viernes") {
                    viernes++;
                } else if (jComboBox_dia.getSelectedItem() == "Sábado") {
                    sabado++;
                }

                consulta.setLong(1, lunes);
                consulta.setLong(2, martes);
                consulta.setLong(3, miercoles);
                consulta.setLong(4, jueves);
                consulta.setLong(5, viernes);
                consulta.setLong(6, sabado);

                consulta.executeUpdate();

            }

            //Convertir id a string para usarlo como parametro en enviarElementos
            idDoctorString = Long.toString(idDoctor);
            idPacienteString = Integer.toString(idPaciente);

            fechaCita = ((JTextField) jDateChooserFecha.getDateEditor().getUiComponent()).getText();

            //Obtener la fecha actual
            LocalDate fechaActual = LocalDate.now();

            // Formateador de fecha para obtener el formato deseado
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

            // Formatear la fecha actual como un String en el formato especificado
            String fechaRegistro = fechaActual.format(formatter);

            //Sumar costo entre recepcionista y doctor
            try {

                stRecepcionista = con.createStatement();
                ResultSet rsRecepcionista = stRecepcionista.executeQuery(sqlRecepcionista);

                while (rsRecepcionista.next()) {

                    //Cambiar el 6 al idRecepcionista obtenido en el login (MELENDEZ)
                    if (objRecepcionista.getIdRecepcionista() == rsRecepcionista.getInt("idRecepcionista")) {
                        costoRecepcionista = rsRecepcionista.getInt("costo");
                        break;
                    }
                }
            } catch (SQLException ex) {
                System.out.println("Error al entrar a la tabla recepcionista");
            }
            idRecepcionista = String.valueOf(objRecepcionista.getIdRecepcionista());
            //ActualizarDate
            objMenuCita.enviarElementosCita(idRecepcionista, idDoctorString, idPacienteString, Date.valueOf(fechaCita), Date.valueOf(fechaRegistro), costo + costoRecepcionista, "Pendiente");

            //mostrar tabla actualizada
            CargarTablaCita();

        } catch (SQLException e) {
            System.out.println("Error al actualizar la tabla citas: " + e);
        }
    }//GEN-LAST:event_jButton_actualizarDiaActionPerformed

    private void jButton_cerrarsesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_cerrarsesionActionPerformed
        // TODO add your handling code here:
        VentanaMenuRecepcionista objMenu_Recepcionista = new VentanaMenuRecepcionista(objRecepcionista);
        objMenu_Recepcionista.setLocationRelativeTo(null);
        objMenu_Recepcionista.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton_cerrarsesionActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaRegistrarCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaRegistrarCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaRegistrarCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaRegistrarCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaRegistrarCita().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_actualizarDia;
    private javax.swing.JButton jButton_cerrarsesion;
    private javax.swing.JButton jButton_elegirPaciente;
    private javax.swing.JComboBox<String> jComboBox_dia;
    private javax.swing.JComboBox<String> jComboBox_paciente;
    private com.toedter.calendar.JDateChooser jDateChooserFecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    public static javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jTable_citas;
    private javax.swing.JTextField txt_apellido;
    private javax.swing.JTextField txt_costo;
    private javax.swing.JTextField txt_nombre;
    // End of variables declaration//GEN-END:variables

    /*
     * *****************************************************
     * metodo para cargar pacientes en el JcomboPaciente desde la tabla paciente
     * *****************************************************
     */
    private void CargarComboPaciente() {
        Connection con = Repository.ConectarBD();
        String sql = "select * from paciente";
        Statement st;
        try {

            st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            jComboBox_paciente.removeAllItems();
            jComboBox_paciente.addItem("Seleccione paciente:");
            while (rs.next()) {
                jComboBox_paciente.addItem(rs.getString("nombre") + " " + rs.getString("apellido"));
            }
            con.close();
        } catch (SQLException e) {
            System.out.println("!Error al cargar pacientes¡");
        }
    }

    /*
     * *****************************************************
     * metodo para mostrar todos los doctores registrados en la tabla
     * *****************************************************
     */
    private void CargarTablaCita() {
        Connection con = Repository.ConectarBD();
        DefaultTableModel model = new DefaultTableModel();
        String sql = "select idDoctor, nombre, apellido, costo, lunes, martes, miercoles, jueves, viernes, sabado from doctor";
        Statement st;
        try {
            st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            VentanaRegistrarCita.jTable_citas = new JTable(model);
            VentanaRegistrarCita.jScrollPane1.setViewportView(VentanaRegistrarCita.jTable_citas);

            model.addColumn("idDoctor");
            model.addColumn("nombre");
            model.addColumn("apellido");
            model.addColumn("costo");
            model.addColumn("lunes");
            model.addColumn("martes");
            model.addColumn("miercoles");
            model.addColumn("jueves");
            model.addColumn("viernes");
            model.addColumn("sabado");

            while (rs.next()) {
                Object fila[] = new Object[10];
                for (int i = 0; i < 10; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                model.addRow(fila);
            }
            con.close();
        } catch (SQLException e) {
            System.out.println("Error al llenar la tabla citas: " + e);
        }
        //evento para obtener campo al cual el usuario da click
        //y obtener la interfaz que mostrara la informacion general
        jTable_citas.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int fila_point = jTable_citas.rowAtPoint(e.getPoint());
                int columna_point = 0;

                if (fila_point > -1) {
                    idDoctor = (Long) model.getValueAt(fila_point, columna_point);

                    EnviarDatosCitaSeleccionada(idDoctor);
                }
                if (fila_point > -1) {
                    costo = (int) model.getValueAt(fila_point, 3);

                }
            }
        });

    }

    /*
     * **************************************************
     * Metodo que envia datos del doctor seleccionado al cuadro de texto
     * **************************************************
     */
    private void EnviarDatosCitaSeleccionada(long idDoctor) {
        try {
            Connection con = Repository.ConectarBD();
            PreparedStatement pst = con.prepareStatement(
                    "select * from doctor where idDoctor = '" + idDoctor + "'");
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                txt_nombre.setText(rs.getString("nombre"));
                txt_apellido.setText(rs.getString("apellido"));
                txt_costo.setText(rs.getString("costo"));

            }
            con.close();
        } catch (SQLException e) {
            System.out.println("Error al seleccionar cita: " + e);
        }
    }
}
