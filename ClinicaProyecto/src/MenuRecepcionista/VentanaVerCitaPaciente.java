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
import java.sql.Date;

/**
 *
 * @author Suyco
 */
public class VentanaVerCitaPaciente extends javax.swing.JFrame {

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
    private Recepcionista objRecepcionista;
    Repository objMenuCita;
    ModeloCita objMenuCitaPaciente;

    /**
     * Creates new form VerCitaxPaciente
     */
    public VentanaVerCitaPaciente(Recepcionista objRecepcionista) {
        objMenuCitaPaciente = new ModeloCita();
        objMenuCita = new Repository();

        initComponents();
        this.objRecepcionista = objRecepcionista;
        //this.setSize(new Dimension(900, 500));
        this.setTitle("Gestionar Citas");
        //Cargar tabla
        this.CargarTablaCita();
        this.CargarComboPaciente();
    }

    private VentanaVerCitaPaciente() {
        throw new UnsupportedOperationException("Not supported yet.");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_citas = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jComboBox_paciente = new javax.swing.JComboBox<>();
        jButton_elegirPaciente = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jButtonCancelar1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, 710, 320));

        jPanel2.setBackground(new java.awt.Color(60, 91, 111));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBox_paciente.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBox_paciente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione el dia:", "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado" }));
        jComboBox_paciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_pacienteActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBox_paciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 110, -1));

        jButton_elegirPaciente.setBackground(new java.awt.Color(223, 208, 184));
        jButton_elegirPaciente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_elegirPaciente.setText("Seleccionar");
        jButton_elegirPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_elegirPacienteActionPerformed(evt);
            }
        });
        jPanel2.add(jButton_elegirPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 120, 30));

        jButton1.setBackground(new java.awt.Color(223, 208, 184));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("Mostrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 120, 40));

        jLabel7.setText("Paciente:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        jButtonCancelar1.setBackground(new java.awt.Color(223, 208, 184));
        jButtonCancelar1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonCancelar1.setText("Volver");
        jButtonCancelar1.setBorder(null);
        jButtonCancelar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButtonCancelar1MousePressed(evt);
            }
        });
        jButtonCancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelar1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonCancelar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 120, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Escoge un paciente");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 170, 380));

        jLabel1.setFont(new java.awt.Font("Bahnschrift", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(21, 52, 72));
        jLabel1.setText("Ver Citas");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, -1, 40));

        jPanel5.setBackground(new java.awt.Color(21, 52, 72));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(415, 100, 180, 5));

        jPanel6.setBackground(new java.awt.Color(21, 52, 72));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1010, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelar1ActionPerformed
        // TODO add your handling code here:
        VentanaMenuRecepcionista objMenu_Recepcionista = new VentanaMenuRecepcionista(objRecepcionista);
        objMenu_Recepcionista.setLocationRelativeTo(null);
        objMenu_Recepcionista.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonCancelar1ActionPerformed

    private void jButtonCancelar1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCancelar1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCancelar1MousePressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        CargarTablaCita();
    }//GEN-LAST:event_jButton1ActionPerformed

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

    private void jComboBox_pacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_pacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_pacienteActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(VentanaVerCitaPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaVerCitaPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaVerCitaPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaVerCitaPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaVerCitaPaciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonCancelar1;
    private javax.swing.JButton jButton_elegirPaciente;
    private javax.swing.JComboBox<String> jComboBox_paciente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    public static javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jTable_citas;
    // End of variables declaration//GEN-END:variables

    private int IdPacienteSeleccionado;

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
     * metodo para mostrar todos las citas registrados en la tabla
     * *****************************************************
     */
    // Asegúrate de que esta variable tenga el valor adecuado en algún punto de tu código
    private void CargarTablaCita() {
        IdPacienteSeleccionado = objMenuCitaPaciente.getIdPaciente();
        Connection con = Repository.ConectarBD();
        DefaultTableModel model = new DefaultTableModel();
        String sql = "SELECT idRecepcionista, idDoctor, idPaciente, fechaCita, fechaRegistro, costoTotal, estado FROM cita WHERE idPaciente = ?";
        PreparedStatement pst;
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, IdPacienteSeleccionado); // Establece el valor del parámetro
            ResultSet rs = pst.executeQuery();
            VentanaVerCitaPaciente.jTable_citas = new JTable(model);
            VentanaVerCitaPaciente.jScrollPane1.setViewportView(VentanaVerCitaPaciente.jTable_citas);

            model.addColumn("idRecepcionista");
            model.addColumn("idDoctor");
            model.addColumn("idPaciente");
            model.addColumn("fechaCita");
            model.addColumn("fechaRegistro");
            model.addColumn("costoTotal");
            model.addColumn("estado");

            while (rs.next()) {
                Object fila[] = new Object[7];
                for (int i = 0; i < 7; i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                model.addRow(fila);
            }
            con.close();
        } catch (SQLException e) {
            System.out.println("Error al llenar la tabla citas: " + e);
        }
        // Evento para obtener campo al cual el usuario da click
        // y obtener la interfaz que mostrara la informacion general
        jTable_citas.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int fila_point = jTable_citas.rowAtPoint(e.getPoint());
                int columna_point = 0;

                if (fila_point > -1) {
                    idDoctor = (Long) model.getValueAt(fila_point, columna_point);

                }
            }
        });
    }

}
