/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista_Ventana;
import Modelo_Menu.Menu;
/**
 *
 * @author PC
 */
public class VentanaRegister extends javax.swing.JFrame {
    public Menu objMenu;
    /**
     * Creates new form VentanaRegister
     */
    public VentanaRegister() {
        objMenu = new Menu();
        initComponents();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldRegisterContrasena = new javax.swing.JTextField();
        jSeparatorUsuario = new javax.swing.JSeparator();
        jTextFieldRegisterNombre = new javax.swing.JTextField();
        jSeparatorNombre1 = new javax.swing.JSeparator();
        jTextFieldRegisterUsuario = new javax.swing.JTextField();
        jSeparatorUsuario1 = new javax.swing.JSeparator();
        jComboBoxTipoUsuario = new javax.swing.JComboBox<>();
        jButtonBorrar = new javax.swing.JButton();
        jButtonCrear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Bahnschrift", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Tipo de usuario:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, -1, -1));

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

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 0, 270, 580));

        jLabel2.setFont(new java.awt.Font("Bahnschrift", 1, 34)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("CREA TU CUENTA");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        jLabel3.setFont(new java.awt.Font("Bahnschrift", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Nombre:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        jLabel4.setFont(new java.awt.Font("Bahnschrift", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Usuario:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        jLabel5.setFont(new java.awt.Font("Bahnschrift", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Contraseña");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, -1, -1));

        jTextFieldRegisterContrasena.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jTextFieldRegisterContrasena.setForeground(new java.awt.Color(153, 153, 153));
        jTextFieldRegisterContrasena.setText("Ingresa tu contraseña...");
        jTextFieldRegisterContrasena.setBorder(null);
        jTextFieldRegisterContrasena.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextFieldRegisterContrasenaMousePressed(evt);
            }
        });
        jPanel2.add(jTextFieldRegisterContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 230, 40));

        jSeparatorUsuario.setBackground(new java.awt.Color(0, 0, 0));
        jSeparatorUsuario.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparatorUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 230, 20));

        jTextFieldRegisterNombre.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jTextFieldRegisterNombre.setForeground(new java.awt.Color(153, 153, 153));
        jTextFieldRegisterNombre.setText("Ingresa tu nombre...");
        jTextFieldRegisterNombre.setBorder(null);
        jTextFieldRegisterNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextFieldRegisterNombreMousePressed(evt);
            }
        });
        jPanel2.add(jTextFieldRegisterNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 230, 40));

        jSeparatorNombre1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparatorNombre1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparatorNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 230, 20));

        jTextFieldRegisterUsuario.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jTextFieldRegisterUsuario.setForeground(new java.awt.Color(153, 153, 153));
        jTextFieldRegisterUsuario.setText("Ingresa tu nombre...");
        jTextFieldRegisterUsuario.setBorder(null);
        jTextFieldRegisterUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextFieldRegisterUsuarioMousePressed(evt);
            }
        });
        jTextFieldRegisterUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldRegisterUsuarioActionPerformed(evt);
            }
        });
        jPanel2.add(jTextFieldRegisterUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 230, 40));

        jSeparatorUsuario1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparatorUsuario1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(jSeparatorUsuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 230, 20));

        jComboBoxTipoUsuario.setBackground(new java.awt.Color(255, 255, 255));
        jComboBoxTipoUsuario.setForeground(new java.awt.Color(204, 204, 204));
        jComboBoxTipoUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Paciente", "Doctor", "Recepcionista" }));
        jComboBoxTipoUsuario.setBorder(null);
        jComboBoxTipoUsuario.setName(""); // NOI18N
        jComboBoxTipoUsuario.setOpaque(true);
        jComboBoxTipoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxTipoUsuarioActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBoxTipoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 230, 40));

        jButtonBorrar.setBackground(new java.awt.Color(223, 208, 184));
        jButtonBorrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonBorrar.setForeground(new java.awt.Color(0, 0, 0));
        jButtonBorrar.setText("Borrar");
        jButtonBorrar.setBorder(null);
        jButtonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBorrarActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 490, 110, 40));

        jButtonCrear.setBackground(new java.awt.Color(223, 208, 184));
        jButtonCrear.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonCrear.setForeground(new java.awt.Color(0, 0, 0));
        jButtonCrear.setText("Crear");
        jButtonCrear.setBorder(null);
        jButtonCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCrearActionPerformed(evt);
            }
        });
        jPanel2.add(jButtonCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 490, 110, 40));

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

    private void jTextFieldRegisterContrasenaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldRegisterContrasenaMousePressed
        // TODO add your handling code here:
        jTextFieldRegisterContrasena.setText("");
    }//GEN-LAST:event_jTextFieldRegisterContrasenaMousePressed

    private void jTextFieldRegisterNombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldRegisterNombreMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldRegisterNombreMousePressed

    private void jTextFieldRegisterUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldRegisterUsuarioMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldRegisterUsuarioMousePressed

    private void jTextFieldRegisterUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldRegisterUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldRegisterUsuarioActionPerformed

    private void jComboBoxTipoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxTipoUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxTipoUsuarioActionPerformed

    private void jButtonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBorrarActionPerformed
        // TODO add your handling code here:
        
        
        
    }//GEN-LAST:event_jButtonBorrarActionPerformed

    private void jButtonCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCrearActionPerformed
        // TODO add your handling code here:
        String nombre = jTextFieldRegisterNombre.getText();
        String usuario = jTextFieldRegisterUsuario.getText();
        String contrasena = jTextFieldRegisterContrasena.getText();
        String tipo_usuario = jComboBoxTipoUsuario.getSelectedItem().toString();
        
        objMenu.enviarElementosUsuario(nombre, usuario, contrasena, tipo_usuario);
    }//GEN-LAST:event_jButtonCrearActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaRegister().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBorrar;
    private javax.swing.JButton jButtonCrear;
    private javax.swing.JComboBox<String> jComboBoxTipoUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparatorNombre1;
    private javax.swing.JSeparator jSeparatorUsuario;
    private javax.swing.JSeparator jSeparatorUsuario1;
    private javax.swing.JTextField jTextFieldRegisterContrasena;
    private javax.swing.JTextField jTextFieldRegisterNombre;
    private javax.swing.JTextField jTextFieldRegisterUsuario;
    // End of variables declaration//GEN-END:variables
}
