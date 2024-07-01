package Cuenca;

// Proyecto Clinica
import Modelo_Menu.*;

import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author cuenca y giron
 */
public class InterGestionarCita extends javax.swing.JInternalFrame {

    private long idDoctor;
    public int idPaciente;
    private String idDoctorString;
    private String idPacienteString;

    private long lunes;
    private long martes;
    private long miercoles;
    private long jueves;
    private long viernes;
    private long sabado;
    Menu objMenuCita;
    ModeloCita objMenuCitaPaciente;

    public InterGestionarCita() {
        objMenuCitaPaciente = new ModeloCita();
        objMenuCita = new Menu();

        initComponents();
        this.setSize(new Dimension(900, 500));
        this.setTitle("Gestionar Citas");
        //Cargar tabla
        this.CargarTablaCita();
        this.CargarComboPaciente();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_citas = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jComboBox_paciente = new javax.swing.JComboBox<>();
        jButton_elegirPaciente = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_apellido = new javax.swing.JTextField();
        txt_costo = new javax.swing.JTextField();
        jComboBox_dia = new javax.swing.JComboBox<>();
        jButton_actualizarDia = new javax.swing.JButton();
        jLabel_wallpaper = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Administrar Citas");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 710, 250));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 730, 270));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBox_paciente.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBox_paciente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione el dia:", "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado" }));
        jComboBox_paciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_pacienteActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBox_paciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 110, -1));

        jButton_elegirPaciente.setBackground(new java.awt.Color(51, 204, 0));
        jButton_elegirPaciente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_elegirPaciente.setText("Paciente");
        jButton_elegirPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_elegirPacienteActionPerformed(evt);
            }
        });
        jPanel2.add(jButton_elegirPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 100, 40));

        jLabel6.setText("Paciente:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 50, 130, 270));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Nombre:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 90, -1));

        txt_nombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel3.add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 170, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Apellido:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 90, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Costo:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 90, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Elegir Dia:");
        jLabel5.setToolTipText("");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, 90, -1));

        txt_apellido.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel3.add(txt_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 170, -1));

        txt_costo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel3.add(txt_costo, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 170, -1));

        jComboBox_dia.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBox_dia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione el dia:", "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado" }));
        jComboBox_dia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_diaActionPerformed(evt);
            }
        });
        jPanel3.add(jComboBox_dia, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, 170, -1));

        jButton_actualizarDia.setBackground(new java.awt.Color(51, 204, 0));
        jButton_actualizarDia.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_actualizarDia.setText("Registrar cita");
        jButton_actualizarDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_actualizarDiaActionPerformed(evt);
            }
        });
        jPanel3.add(jButton_actualizarDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 10, 200, 60));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 870, 100));
        getContentPane().add(jLabel_wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*
     * *****************************************************
     * metodo para aumentar en uno la ocupacion de cada doctor por dia
     * *****************************************************
     */

    private void jButton_actualizarDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_actualizarDiaActionPerformed

        Connection con = Menu.ConectarBD();
        String sql = "select idDoctor, nombre, apellido, costo, lunes, martes, miercoles, jueves, viernes, sabado from doctor";
        Statement st;

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

            objMenuCita.enviarElementosCita("6", idDoctorString, idPacienteString, "f", "f", "f", "Pendiente");

            //mostrar tabla actualizada
            CargarTablaCita();

        } catch (SQLException e) {
            System.out.println("Error al actualizar la tabla citas: " + e);
        }
    }//GEN-LAST:event_jButton_actualizarDiaActionPerformed

    private void jComboBox_diaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_diaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_diaActionPerformed

    private void jComboBox_pacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_pacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_pacienteActionPerformed

    private void jButton_elegirPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_elegirPacienteActionPerformed
        //Metodo para obtener el idPaciente mediante la eleccion en el JCombo

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_actualizarDia;
    private javax.swing.JButton jButton_elegirPaciente;
    private javax.swing.JComboBox<String> jComboBox_dia;
    private javax.swing.JComboBox<String> jComboBox_paciente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel_wallpaper;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
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
        Connection con = Menu.ConectarBD();
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
        Connection con = Menu.ConectarBD();
        DefaultTableModel model = new DefaultTableModel();
        String sql = "select idDoctor, nombre, apellido, costo, lunes, martes, miercoles, jueves, viernes, sabado from doctor";
        Statement st;
        try {
            st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            InterGestionarCita.jTable_citas = new JTable(model);
            InterGestionarCita.jScrollPane1.setViewportView(InterGestionarCita.jTable_citas);

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
            Connection con = Menu.ConectarBD();
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
