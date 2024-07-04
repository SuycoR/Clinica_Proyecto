/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista_Ventana;
import Miguel.InterVerCita;
/**
 *
 * @author PC
 */
import MenuPaciente.*;
import javax.swing.JOptionPane;
import Modelo_Menu.Menu;
import Modelo_Menu.Paciente;

public class VentanaLoginPaciente extends javax.swing.JFrame {

    public Menu objMenu;
    public Paciente objPaciente;
   

    /**
     * Creates new form VentanaLoginPaciente
     */
    public VentanaLoginPaciente() {
        initComponents();
        objMenu = new Menu();
        objPaciente = new Paciente();
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
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        Nombres = new javax.swing.JLabel();
        CampoUsuario = new javax.swing.JTextField();
        jSeparatorNombre1 = new javax.swing.JSeparator();
        Apellidos1 = new javax.swing.JLabel();
        jButtonIniciarSesion = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        CampoContrasena = new javax.swing.JPasswordField();
        jSeparatorNombre3 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Bahnschrift", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Clínica Capitan Peru");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, -1, 40));

        jPanel1.setBackground(new java.awt.Color(21, 52, 72));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 270, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 0, 270, 580));

        jLabel6.setFont(new java.awt.Font("Bahnschrift", 1, 34)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Ingresa tus datos");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, 40));

        Nombres.setFont(new java.awt.Font("Bahnschrift", 1, 20)); // NOI18N
        Nombres.setForeground(new java.awt.Color(0, 0, 0));
        Nombres.setText("Usuario:");
        jPanel2.add(Nombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, -1, 30));

        CampoUsuario.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        CampoUsuario.setForeground(new java.awt.Color(153, 153, 153));
        CampoUsuario.setText("Ingrese nombre...");
        CampoUsuario.setBorder(null);
        CampoUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CampoUsuarioMousePressed(evt);
            }
        });
        CampoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoUsuarioActionPerformed(evt);
            }
        });
        jPanel2.add(CampoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 260, 30));

        jSeparatorNombre1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparatorNombre1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparatorNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 260, -1));

        Apellidos1.setFont(new java.awt.Font("Bahnschrift", 1, 20)); // NOI18N
        Apellidos1.setForeground(new java.awt.Color(0, 0, 0));
        Apellidos1.setText("Contraseña:");
        jPanel2.add(Apellidos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, -1, 30));

        jButtonIniciarSesion.setBackground(new java.awt.Color(223, 208, 184));
        jButtonIniciarSesion.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButtonIniciarSesion.setForeground(new java.awt.Color(0, 0, 0));
        jButtonIniciarSesion.setText("Iniciar sesión");
        jButtonIniciarSesion.setBorder(null);
        jButtonIniciarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButtonIniciarSesionMousePressed(evt);
            }
        });
        jButtonIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIniciarSesionActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, 130, 40));

        jButtonCancelar.setBackground(new java.awt.Color(223, 208, 184));
        jButtonCancelar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButtonCancelar.setForeground(new java.awt.Color(0, 0, 0));
        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.setBorder(null);
        jButtonCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButtonCancelarMousePressed(evt);
            }
        });
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 400, 130, 40));

        CampoContrasena.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        CampoContrasena.setText("jPasswordField1");
        CampoContrasena.setBorder(null);
        jPanel2.add(CampoContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 260, 30));

        jSeparatorNombre3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparatorNombre3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparatorNombre3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 260, 30));

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

    private void CampoUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CampoUsuarioMousePressed
        // TODO add your handling code here:
        CampoUsuario.setText("");

        if (CampoContrasena.getText().trim().isEmpty()) {
            CampoContrasena.setText("Ingrese apellidos...");
        }
    }//GEN-LAST:event_CampoUsuarioMousePressed

    private void CampoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoUsuarioActionPerformed

    private void jButtonIniciarSesionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonIniciarSesionMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonIniciarSesionMousePressed

    private void jButtonIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIniciarSesionActionPerformed
        // TODO add your handling code here:
        String usuario = CampoUsuario.getText().trim();
        String contrasena = CampoContrasena.getText().trim();

        objPaciente.setUsuario(usuario);
        objPaciente.setContrasena(contrasena);
        
        if(objMenu.loginUserPaciente(objPaciente)){
            
            Menu_Paciente objmenu_Paciente = new Menu_Paciente(objPaciente);
            objmenu_Paciente.setLocationRelativeTo(null);
            objmenu_Paciente.setVisible(true);
            this.dispose();
            
            
        }else{
            JOptionPane.showMessageDialog(null, "Datos incorrectos");
        }
    }//GEN-LAST:event_jButtonIniciarSesionActionPerformed

    private void jButtonCancelarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCancelarMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCancelarMousePressed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaLoginPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaLoginPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaLoginPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaLoginPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaLoginPaciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Apellidos1;
    private javax.swing.JPasswordField CampoContrasena;
    private javax.swing.JTextField CampoUsuario;
    private javax.swing.JLabel Nombres;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonIniciarSesion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparatorNombre1;
    private javax.swing.JSeparator jSeparatorNombre3;
    // End of variables declaration//GEN-END:variables
}
