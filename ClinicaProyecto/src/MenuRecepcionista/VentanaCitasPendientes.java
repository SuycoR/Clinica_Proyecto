/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package MenuRecepcionista;

import Modelo_Menu.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Suyco
 */
public class VentanaCitasPendientes extends javax.swing.JFrame {

    private Recepcionista objRecepcionista;

    /**
     * Creates new form CitasPendientes
     */
    public VentanaCitasPendientes(Recepcionista objRecepcionista) {
        initComponents();
        this.objRecepcionista = objRecepcionista;
        this.CargarTabla();
    }

    private VentanaCitasPendientes() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_citas = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jButtonCancelar1 = new javax.swing.JButton();

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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 710, 320));

        jLabel1.setFont(new java.awt.Font("Bahnschrift", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(21, 52, 72));
        jLabel1.setText("Citas Pendientes");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, -1, 40));

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

        jButtonCancelar1.setBackground(new java.awt.Color(223, 208, 184));
        jButtonCancelar1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonCancelar1.setForeground(new java.awt.Color(0, 0, 0));
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
        jPanel1.add(jButtonCancelar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 500, 120, 30));

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

    private void jButtonCancelar1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCancelar1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCancelar1MousePressed

    private void jButtonCancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelar1ActionPerformed
        // TODO add your handling code here:
        VentanaMenuRecepcionista objMenu_Recepcionista = new VentanaMenuRecepcionista(objRecepcionista);
        objMenu_Recepcionista.setLocationRelativeTo(null);
        objMenu_Recepcionista.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonCancelar1ActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaCitasPendientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaCitasPendientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaCitasPendientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaCitasPendientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                VentanaCitasPendientes ventana_Pendiente = new VentanaCitasPendientes();
                ventana_Pendiente.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    public static javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jTable_citas;
    // End of variables declaration//GEN-END:variables
    private void CargarTabla() {

        Connection con = Repository.ConectarBD();
        DefaultTableModel model = new DefaultTableModel();
        String sql = "SELECT idCita,idRecepcionista, idDoctor, idPaciente, fechaCita, fechaRegistro, costoTotal, estado FROM cita WHERE estado = ? ";
        PreparedStatement pst;
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, "Pendiente"); // Establece el valor del parámetro a comparar
            ResultSet rs = pst.executeQuery();
            VentanaCitasPendientes.jTable_citas = new JTable(model);
            VentanaCitasPendientes.jScrollPane1.setViewportView(VentanaCitasPendientes.jTable_citas);

            model.addColumn("Cita");
            model.addColumn("Recepcionista");
            model.addColumn("Doctor");
            model.addColumn("idPaciente");
            model.addColumn("Fecha Cita");
            model.addColumn("Fecha de Registro");
            model.addColumn("Costo ($)");
            model.addColumn("Estado");

            while (rs.next()) {

                Object fila[] = new Object[8];

                fila[0] = rs.getObject("idCita");
                fila[1] = rs.getObject("idRecepcionista");
                fila[2] = rs.getObject("idDoctor");
                fila[3] = rs.getObject("idPaciente");
                fila[4] = rs.getObject("fechaCita");
                fila[5] = rs.getObject("fechaRegistro");
                fila[6] = rs.getObject("costoTotal");
                fila[7] = rs.getObject("estado");
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

            }
        });

    }
}
