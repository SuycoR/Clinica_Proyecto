/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package MenuRecepcionista;

import Vista_Ventana.*;
import Modelo_Menu.*;
import Sacnhez.*;
import Modelo_Menu.*;
import Vista_Ventana.*;
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
import java.sql.Date;
/**
 *
 * @author Suyco
 */
public class VentanaMenuRecepcionista extends javax.swing.JFrame {

    private Recepcionista objRecepcionista;
    private long idRecepcionista;
    /**
     * Creates new form Menu_Recepcionista
     */
    public VentanaMenuRecepcionista(Recepcionista objRecepcionista) {
        
        initComponents();
        this.objRecepcionista=objRecepcionista;
        idRecepcionista = objRecepcionista.getIdRecepcionista();
        obtenerDatosxIdRecepcionista(idRecepcionista);
        
        
    }
    
    private VentanaMenuRecepcionista() {
       throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        txt_Recepcionista = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButtonCancelar1 = new javax.swing.JButton();
        botonFactura = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(223, 208, 184));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Ver Citas Atendidas");
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 350, 50));

        jButton2.setBackground(new java.awt.Color(223, 208, 184));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("Registrar Cita");
        jButton2.setBorderPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, 350, 50));

        jButton3.setBackground(new java.awt.Color(223, 208, 184));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 0));
        jButton3.setText("Ver Cita de un Paciente");
        jButton3.setBorderPainted(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 350, 50));

        jButton4.setBackground(new java.awt.Color(223, 208, 184));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 0, 0));
        jButton4.setText("Ver Todas las Citas de Pacientes");
        jButton4.setBorderPainted(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 350, 50));

        jPanel5.setBackground(new java.awt.Color(21, 52, 72));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 910, 50));

        txt_Recepcionista.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        txt_Recepcionista.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(txt_Recepcionista, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 247, 40));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Bienvenido,");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, 40));

        jButtonCancelar1.setBackground(new java.awt.Color(60, 91, 111));
        jButtonCancelar1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButtonCancelar1.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCancelar1.setText("Cerrar Sesión");
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
        jPanel2.add(jButtonCancelar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 410, 370, 50));

        botonFactura.setBackground(new java.awt.Color(223, 208, 184));
        botonFactura.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        botonFactura.setForeground(new java.awt.Color(0, 0, 0));
        botonFactura.setText("Facturar");
        botonFactura.setBorderPainted(false);
        botonFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonFacturaActionPerformed(evt);
            }
        });
        jPanel2.add(botonFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 330, 350, 50));

        jButton7.setBackground(new java.awt.Color(223, 208, 184));
        jButton7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton7.setForeground(new java.awt.Color(0, 0, 0));
        jButton7.setText("Registrar Paciente");
        jButton7.setBorderPainted(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 190, 350, 50));

        jButton6.setBackground(new java.awt.Color(223, 208, 184));
        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(0, 0, 0));
        jButton6.setText("Registrar Doctor");
        jButton6.setBorderPainted(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 260, 350, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 901, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelar1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCancelar1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCancelar1MousePressed

    private void jButtonCancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelar1ActionPerformed
        // TODO add your handling code here:
        VentanaInicio objVentanaInicio = new VentanaInicio();
        objVentanaInicio.setLocationRelativeTo(null);
        objVentanaInicio.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonCancelar1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        VentanaVerCitaPaciente objverCitaxPaciente = new VentanaVerCitaPaciente(objRecepcionista); 
        objverCitaxPaciente.setLocationRelativeTo(null);
        objverCitaxPaciente.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        VentanaRegistrarCita objregistrarCita = new VentanaRegistrarCita(objRecepcionista);
        objregistrarCita.setLocationRelativeTo(null);
        objregistrarCita.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        VentanaCitasPendientes objcitasPendientes = new VentanaCitasPendientes(objRecepcionista);
        objcitasPendientes.setLocationRelativeTo(null);
        objcitasPendientes.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        VentanaCitasAtendidas objcitasAtendidas = new VentanaCitasAtendidas(objRecepcionista);
        objcitasAtendidas.setLocationRelativeTo(null);
        objcitasAtendidas.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void botonFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonFacturaActionPerformed
        // TODO add your handling code here:
        objInterFacturacion ventanaInterFacturacion = new objInterFacturacion();
        ventanaInterFacturacion.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonFacturaActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        VentanaRegistrarPaciente objVentanaRegistrarPaciente = new VentanaRegistrarPaciente(objRecepcionista);
        objVentanaRegistrarPaciente.setLocationRelativeTo(null);
        objVentanaRegistrarPaciente.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaMenuRecepcionista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaMenuRecepcionista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaMenuRecepcionista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaMenuRecepcionista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new VentanaMenuRecepcionista().setVisible(true);
                VentanaMenuRecepcionista ventanar = new VentanaMenuRecepcionista();
                ventanar.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonFactura;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButtonCancelar1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel txt_Recepcionista;
    // End of variables declaration//GEN-END:variables
    
    public void obtenerDatosxIdRecepcionista(long idRecepcionista){
        try {
            Connection con = Repository.ConectarBD();
            PreparedStatement pst = con.prepareStatement(
                    "select * from recepcionista where idRecepcionista = '" + idRecepcionista + "'");
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                objRecepcionista.setNombre(rs.getString("nombre"));
                objRecepcionista.setApellido(rs.getString("apellido"));
                txt_Recepcionista.setText(rs.getString("nombre"));  
            }
            con.close();
        } catch (SQLException e) {
            System.out.println("Error al seleccionar cita: " + e);
        }
    }
}
