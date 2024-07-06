package MenuRecepcionista;

import Modelo_Menu.Repository;

/**
 *
 * @author Giron
 */
public class VentanaRegistrarRecepcionista extends javax.swing.JFrame {

    public Repository objMenuRecepcionista;

    /**
     * Creates new form VentanaRegistrarRecepcionista
     */
    public VentanaRegistrarRecepcionista() {
        objMenuRecepcionista = new Repository();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background1 = new javax.swing.JPanel();
        Nombres2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        CampoContrasena1 = new javax.swing.JTextField();
        jSeparatorUsuario = new javax.swing.JSeparator();
        CampoNombres = new javax.swing.JTextField();
        jSeparatorNombre1 = new javax.swing.JSeparator();
        CampoUsuario = new javax.swing.JTextField();
        jSeparatorUsuario1 = new javax.swing.JSeparator();
        jButtonSalir = new javax.swing.JButton();
        jButtonRegistrar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jSeparatorNombre2 = new javax.swing.JSeparator();
        CampoApellidos = new javax.swing.JTextField();
        InformacionPersonal = new javax.swing.JLabel();
        Apellidos = new javax.swing.JLabel();
        CampoDNI = new javax.swing.JTextField();
        jSeparatorNombre5 = new javax.swing.JSeparator();
        Direccion = new javax.swing.JLabel();
        CampoDireccion = new javax.swing.JTextField();
        jSeparatorNombre6 = new javax.swing.JSeparator();
        Correo = new javax.swing.JLabel();
        CampoCorreo = new javax.swing.JTextField();
        jSeparatorNombre7 = new javax.swing.JSeparator();
        NumeroDeCelular = new javax.swing.JLabel();
        CampoNumero = new javax.swing.JTextField();
        jSeparatorNombre8 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        CampoCosto = new javax.swing.JTextField();
        jSeparatorNombre3 = new javax.swing.JSeparator();
        InformacionContacto = new javax.swing.JLabel();
        Apellidos1 = new javax.swing.JLabel();
        InformacionContacto1 = new javax.swing.JLabel();
        jSeparatorUsuario2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Background1.setBackground(new java.awt.Color(255, 255, 255));
        Background1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Nombres2.setFont(new java.awt.Font("Bahnschrift", 1, 20)); // NOI18N
        Nombres2.setForeground(new java.awt.Color(0, 0, 0));
        Nombres2.setText("Nombres:");
        Background1.add(Nombres2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, -1, 30));

        jLabel7.setFont(new java.awt.Font("Bahnschrift", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Usuario:");
        Background1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 360, -1, 30));

        jLabel8.setFont(new java.awt.Font("Bahnschrift", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Contraseña");
        Background1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 420, -1, 30));

        CampoContrasena1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        CampoContrasena1.setForeground(new java.awt.Color(153, 153, 153));
        CampoContrasena1.setText("Ingresa tu contraseña...");
        CampoContrasena1.setBorder(null);
        CampoContrasena1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CampoContrasena1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                CampoContrasena1MouseReleased(evt);
            }
        });
        CampoContrasena1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoContrasena1ActionPerformed(evt);
            }
        });
        Background1.add(CampoContrasena1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 440, 280, 30));

        jSeparatorUsuario.setBackground(new java.awt.Color(0, 0, 0));
        jSeparatorUsuario.setForeground(new java.awt.Color(0, 0, 0));
        Background1.add(jSeparatorUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 220, 280, 20));

        CampoNombres.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        CampoNombres.setForeground(new java.awt.Color(153, 153, 153));
        CampoNombres.setText("Ingrese nombre...");
        CampoNombres.setBorder(null);
        CampoNombres.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CampoNombresMousePressed(evt);
            }
        });
        CampoNombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoNombresActionPerformed(evt);
            }
        });
        Background1.add(CampoNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 260, 30));

        jSeparatorNombre1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparatorNombre1.setForeground(new java.awt.Color(0, 0, 0));
        Background1.add(jSeparatorNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 260, -1));

        CampoUsuario.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        CampoUsuario.setForeground(new java.awt.Color(153, 153, 153));
        CampoUsuario.setText("Ingrese usuario...");
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
        Background1.add(CampoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 380, 280, 30));

        jSeparatorUsuario1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparatorUsuario1.setForeground(new java.awt.Color(0, 0, 0));
        Background1.add(jSeparatorUsuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 410, 280, 20));

        jButtonSalir.setBackground(new java.awt.Color(223, 208, 184));
        jButtonSalir.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButtonSalir.setForeground(new java.awt.Color(0, 0, 0));
        jButtonSalir.setText("Salir");
        jButtonSalir.setBorder(null);
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });
        Background1.add(jButtonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 620, 110, 40));

        jButtonRegistrar.setBackground(new java.awt.Color(223, 208, 184));
        jButtonRegistrar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButtonRegistrar.setForeground(new java.awt.Color(0, 0, 0));
        jButtonRegistrar.setText("Registrar");
        jButtonRegistrar.setBorder(null);
        jButtonRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButtonRegistrarMousePressed(evt);
            }
        });
        jButtonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarActionPerformed(evt);
            }
        });
        Background1.add(jButtonRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 620, 110, 40));

        jLabel6.setFont(new java.awt.Font("Bahnschrift", 1, 34)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("REGISTRAR RECEPCIONISTA");
        Background1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, -1, -1));

        jSeparatorNombre2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparatorNombre2.setForeground(new java.awt.Color(0, 0, 0));
        Background1.add(jSeparatorNombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 260, 10));

        CampoApellidos.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        CampoApellidos.setForeground(new java.awt.Color(153, 153, 153));
        CampoApellidos.setText("Ingrese nombre...");
        CampoApellidos.setBorder(null);
        CampoApellidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CampoApellidosMousePressed(evt);
            }
        });
        Background1.add(CampoApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 260, 30));

        InformacionPersonal.setFont(new java.awt.Font("Bahnschrift", 1, 25)); // NOI18N
        InformacionPersonal.setForeground(new java.awt.Color(0, 0, 0));
        InformacionPersonal.setText("1. Información personal");
        Background1.add(InformacionPersonal, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        Apellidos.setFont(new java.awt.Font("Bahnschrift", 1, 20)); // NOI18N
        Apellidos.setForeground(new java.awt.Color(0, 0, 0));
        Apellidos.setText("DNI:");
        Background1.add(Apellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, -1, 30));

        CampoDNI.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        CampoDNI.setForeground(new java.awt.Color(153, 153, 153));
        CampoDNI.setText("Ingrese nombre...");
        CampoDNI.setBorder(null);
        CampoDNI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CampoDNIMousePressed(evt);
            }
        });
        Background1.add(CampoDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 260, 30));

        jSeparatorNombre5.setBackground(new java.awt.Color(0, 0, 0));
        jSeparatorNombre5.setForeground(new java.awt.Color(0, 0, 0));
        Background1.add(jSeparatorNombre5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, 260, 10));

        Direccion.setFont(new java.awt.Font("Bahnschrift", 1, 20)); // NOI18N
        Direccion.setForeground(new java.awt.Color(0, 0, 0));
        Direccion.setText("Dirección:");
        Background1.add(Direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, -1, 30));

        CampoDireccion.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        CampoDireccion.setForeground(new java.awt.Color(153, 153, 153));
        CampoDireccion.setText("Ingrese nombre...");
        CampoDireccion.setBorder(null);
        CampoDireccion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CampoDireccionMousePressed(evt);
            }
        });
        Background1.add(CampoDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, 260, 30));

        jSeparatorNombre6.setBackground(new java.awt.Color(0, 0, 0));
        jSeparatorNombre6.setForeground(new java.awt.Color(0, 0, 0));
        Background1.add(jSeparatorNombre6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 420, 260, 10));

        Correo.setFont(new java.awt.Font("Bahnschrift", 1, 20)); // NOI18N
        Correo.setForeground(new java.awt.Color(0, 0, 0));
        Correo.setText("Correo:");
        Background1.add(Correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 430, -1, 30));

        CampoCorreo.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        CampoCorreo.setForeground(new java.awt.Color(153, 153, 153));
        CampoCorreo.setText("Ingrese nombre...");
        CampoCorreo.setBorder(null);
        CampoCorreo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CampoCorreoMousePressed(evt);
            }
        });
        Background1.add(CampoCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 450, 260, 30));

        jSeparatorNombre7.setBackground(new java.awt.Color(0, 0, 0));
        jSeparatorNombre7.setForeground(new java.awt.Color(0, 0, 0));
        Background1.add(jSeparatorNombre7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 480, 260, 10));

        NumeroDeCelular.setFont(new java.awt.Font("Bahnschrift", 1, 20)); // NOI18N
        NumeroDeCelular.setForeground(new java.awt.Color(0, 0, 0));
        NumeroDeCelular.setText("Número de celular");
        Background1.add(NumeroDeCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 490, -1, 30));

        CampoNumero.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        CampoNumero.setForeground(new java.awt.Color(153, 153, 153));
        CampoNumero.setText("Ingrese nombre...");
        CampoNumero.setBorder(null);
        CampoNumero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CampoNumeroMousePressed(evt);
            }
        });
        Background1.add(CampoNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 510, 260, 30));

        jSeparatorNombre8.setBackground(new java.awt.Color(0, 0, 0));
        jSeparatorNombre8.setForeground(new java.awt.Color(0, 0, 0));
        Background1.add(jSeparatorNombre8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 540, 260, 10));

        jPanel3.setBackground(new java.awt.Color(21, 52, 72));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 930, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        Background1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 930, 60));

        jLabel14.setFont(new java.awt.Font("Bahnschrift", 1, 25)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("1. Información personal");
        Background1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        jLabel9.setFont(new java.awt.Font("Bahnschrift", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Nombres:");
        Background1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, -1, 30));

        CampoCosto.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        CampoCosto.setForeground(new java.awt.Color(153, 153, 153));
        CampoCosto.setText("Ingrese tarifa...");
        CampoCosto.setBorder(null);
        CampoCosto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CampoCostoMousePressed(evt);
            }
        });
        CampoCosto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoCostoActionPerformed(evt);
            }
        });
        Background1.add(CampoCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 190, 280, 30));

        jSeparatorNombre3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparatorNombre3.setForeground(new java.awt.Color(0, 0, 0));
        Background1.add(jSeparatorNombre3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 230, -1));

        InformacionContacto.setFont(new java.awt.Font("Bahnschrift", 1, 25)); // NOI18N
        InformacionContacto.setForeground(new java.awt.Color(0, 0, 0));
        InformacionContacto.setText("3. Crear cuenta");
        Background1.add(InformacionContacto, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 330, -1, -1));

        Apellidos1.setFont(new java.awt.Font("Bahnschrift", 1, 20)); // NOI18N
        Apellidos1.setForeground(new java.awt.Color(0, 0, 0));
        Apellidos1.setText("Apellidos:");
        Background1.add(Apellidos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, -1, 30));

        InformacionContacto1.setFont(new java.awt.Font("Bahnschrift", 1, 25)); // NOI18N
        InformacionContacto1.setForeground(new java.awt.Color(0, 0, 0));
        InformacionContacto1.setText("2. Tarifa");
        Background1.add(InformacionContacto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 160, -1, -1));

        jSeparatorUsuario2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparatorUsuario2.setForeground(new java.awt.Color(0, 0, 0));
        Background1.add(jSeparatorUsuario2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 470, 280, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background1, javax.swing.GroupLayout.PREFERRED_SIZE, 707, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CampoContrasena1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CampoContrasena1MousePressed
        // TODO add your handling code here:
        CampoContrasena1.setText("");

        if (CampoNombres.getText().trim().isEmpty()) {
            CampoNombres.setText("Ingrese nombres...");
        }
        if (CampoApellidos.getText().trim().isEmpty()) {
            CampoApellidos.setText("Ingrese apellidos...");
        }
        if (CampoDNI.getText().trim().isEmpty()) {
            CampoDNI.setText("Ingrese DNI...");
        }
        if (CampoDireccion.getText().trim().isEmpty()) {
            CampoDireccion.setText("Ingrese dirección...");
        }
        if (CampoCorreo.getText().trim().isEmpty()) {
            CampoCorreo.setText("Ingrese correo...");
        }
        if (CampoNumero.getText().trim().isEmpty()) {
            CampoNumero.setText("Ingrese número...");
        }
        if (CampoCosto.getText().trim().isEmpty()) {
            CampoCosto.setText("Ingrese costo...");
        }
        if (CampoUsuario.getText().trim().isEmpty()) {
            CampoUsuario.setText("Ingrese usuario...");
        }
    }//GEN-LAST:event_CampoContrasena1MousePressed

    private void CampoContrasena1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CampoContrasena1MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoContrasena1MouseReleased

    private void CampoNombresMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CampoNombresMousePressed
        // TODO add your handling code here:
        CampoNombres.setText("");

        if (CampoApellidos.getText().trim().isEmpty()) {
            CampoApellidos.setText("Ingrese apellidos...");
        }
        if (CampoDNI.getText().trim().isEmpty()) {
            CampoDNI.setText("Ingrese DNI...");
        }
        if (CampoDireccion.getText().trim().isEmpty()) {
            CampoDireccion.setText("Ingrese dirección...");
        }
        if (CampoCorreo.getText().trim().isEmpty()) {
            CampoCorreo.setText("Ingrese correo...");
        }
        if (CampoNumero.getText().trim().isEmpty()) {
            CampoNumero.setText("Ingrese número...");
        }
        if (CampoCosto.getText().trim().isEmpty()) {
            CampoCosto.setText("Ingrese costo...");
        }
        if (CampoUsuario.getText().trim().isEmpty()) {
            CampoUsuario.setText("Ingrese usuario...");
        }
        if (CampoContrasena1.getText().trim().isEmpty()) {
            CampoContrasena1.setText("Ingrese contraseña...");
        }
    }//GEN-LAST:event_CampoNombresMousePressed

    private void CampoUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CampoUsuarioMousePressed
        // TODO add your handling code here:
        CampoUsuario.setText("");

        if (CampoNombres.getText().trim().isEmpty()) {
            CampoNombres.setText("Ingrese nombres...");
        }
        if (CampoApellidos.getText().trim().isEmpty()) {
            CampoApellidos.setText("Ingrese apellidos...");
        }
        if (CampoDNI.getText().trim().isEmpty()) {
            CampoDNI.setText("Ingrese DNI...");
        }
        if (CampoDireccion.getText().trim().isEmpty()) {
            CampoDireccion.setText("Ingrese dirección...");
        }
        if (CampoCorreo.getText().trim().isEmpty()) {
            CampoCorreo.setText("Ingrese correo...");
        }
        if (CampoNumero.getText().trim().isEmpty()) {
            CampoNumero.setText("Ingrese número...");
        }
        if (CampoCosto.getText().trim().isEmpty()) {
            CampoCosto.setText("Ingrese costo...");
        }
        if (CampoContrasena1.getText().trim().isEmpty()) {
            CampoContrasena1.setText("Ingrese contraseña...");
        }
    }//GEN-LAST:event_CampoUsuarioMousePressed

    private void CampoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoUsuarioActionPerformed

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jButtonRegistrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonRegistrarMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonRegistrarMousePressed

    private void jButtonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarActionPerformed
        // TODO add your handling code here:
        String nombre = CampoNombres.getText();
        String apellido = CampoApellidos.getText();
        String dni = CampoDNI.getText();
        String direccion = CampoDireccion.getText();
        String correo = CampoCorreo.getText();
        String celular = CampoNumero.getText();
        String usuario = CampoUsuario.getText();
        String contrasena = CampoContrasena1.getText();
        int costo = Integer.parseInt(CampoCosto.getText());

        objMenuRecepcionista.enviarElementosRecepcionista(nombre, apellido, dni, direccion, correo, celular, usuario, contrasena, costo);

        CampoNombres.setText("Ingrese nombres...");
        CampoApellidos.setText("Ingrese apellidos...");
        CampoDNI.setText("Ingrese DNI...");
        CampoDireccion.setText("Ingrese dirección...");
        CampoCorreo.setText("Ingrese correo...");
        CampoNumero.setText("Ingrese celular...");
        CampoUsuario.setText("Ingrese usuario...");
        CampoContrasena1.setText("Ingrese Contraseña...");
        CampoCosto.setText("Ingrese costo...");

    }//GEN-LAST:event_jButtonRegistrarActionPerformed

    private void CampoApellidosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CampoApellidosMousePressed
        // TODO add your handling code here:
        CampoApellidos.setText("");

        if (CampoNombres.getText().trim().isEmpty()) {
            CampoNombres.setText("Ingrese nombres...");
        }
        if (CampoDNI.getText().trim().isEmpty()) {
            CampoDNI.setText("Ingrese DNI...");
        }
        if (CampoDireccion.getText().trim().isEmpty()) {
            CampoDireccion.setText("Ingrese dirección...");
        }
        if (CampoCorreo.getText().trim().isEmpty()) {
            CampoCorreo.setText("Ingrese correo...");
        }
        if (CampoNumero.getText().trim().isEmpty()) {
            CampoNumero.setText("Ingrese número...");
        }
        if (CampoCosto.getText().trim().isEmpty()) {
            CampoCosto.setText("Ingrese costo...");
        }
        if (CampoUsuario.getText().trim().isEmpty()) {
            CampoUsuario.setText("Ingrese usuario...");
        }
        if (CampoContrasena1.getText().trim().isEmpty()) {
            CampoContrasena1.setText("Ingrese contraseña...");
        }
    }//GEN-LAST:event_CampoApellidosMousePressed

    private void CampoDNIMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CampoDNIMousePressed
        // TODO add your handling code here:
        CampoDNI.setText("");

        if (CampoNombres.getText().trim().isEmpty()) {
            CampoNombres.setText("Ingrese nombres...");
        }
        if (CampoApellidos.getText().trim().isEmpty()) {
            CampoApellidos.setText("Ingrese apellidos...");
        }
        if (CampoDireccion.getText().trim().isEmpty()) {
            CampoDireccion.setText("Ingrese dirección...");
        }
        if (CampoCorreo.getText().trim().isEmpty()) {
            CampoCorreo.setText("Ingrese correo...");
        }
        if (CampoNumero.getText().trim().isEmpty()) {
            CampoNumero.setText("Ingrese número...");
        }
        if (CampoCosto.getText().trim().isEmpty()) {
            CampoCosto.setText("Ingrese costo...");
        }
        if (CampoUsuario.getText().trim().isEmpty()) {
            CampoUsuario.setText("Ingrese usuario...");
        }
        if (CampoContrasena1.getText().trim().isEmpty()) {
            CampoContrasena1.setText("Ingrese contraseña...");
        }
    }//GEN-LAST:event_CampoDNIMousePressed

    private void CampoDireccionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CampoDireccionMousePressed
        // TODO add your handling code here:
        CampoDireccion.setText("");

        if (CampoNombres.getText().trim().isEmpty()) {
            CampoNombres.setText("Ingrese nombres...");
        }
        if (CampoApellidos.getText().trim().isEmpty()) {
            CampoApellidos.setText("Ingrese apellidos...");
        }
        if (CampoDNI.getText().trim().isEmpty()) {
            CampoDNI.setText("Ingrese DNI...");
        }
        if (CampoCorreo.getText().trim().isEmpty()) {
            CampoCorreo.setText("Ingrese correo...");
        }
        if (CampoNumero.getText().trim().isEmpty()) {
            CampoNumero.setText("Ingrese número...");
        }
        if (CampoCosto.getText().trim().isEmpty()) {
            CampoCosto.setText("Ingrese costo...");
        }
        if (CampoUsuario.getText().trim().isEmpty()) {
            CampoUsuario.setText("Ingrese usuario...");
        }
        if (CampoContrasena1.getText().trim().isEmpty()) {
            CampoContrasena1.setText("Ingrese contraseña...");
        }
    }//GEN-LAST:event_CampoDireccionMousePressed

    private void CampoCorreoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CampoCorreoMousePressed
        // TODO add your handling code here:
        CampoCorreo.setText("");

        if (CampoNombres.getText().trim().isEmpty()) {
            CampoNombres.setText("Ingrese nombres...");
        }
        if (CampoApellidos.getText().trim().isEmpty()) {
            CampoApellidos.setText("Ingrese apellidos...");
        }
        if (CampoDNI.getText().trim().isEmpty()) {
            CampoDNI.setText("Ingrese DNI...");
        }
        if (CampoDireccion.getText().trim().isEmpty()) {
            CampoDireccion.setText("Ingrese dirección...");
        }
        if (CampoNumero.getText().trim().isEmpty()) {
            CampoNumero.setText("Ingrese número...");
        }
        if (CampoCosto.getText().trim().isEmpty()) {
            CampoCosto.setText("Ingrese costo...");
        }
        if (CampoUsuario.getText().trim().isEmpty()) {
            CampoUsuario.setText("Ingrese usuario...");
        }
        if (CampoContrasena1.getText().trim().isEmpty()) {
            CampoContrasena1.setText("Ingrese contraseña...");
        }
    }//GEN-LAST:event_CampoCorreoMousePressed

    private void CampoNumeroMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CampoNumeroMousePressed
        // TODO add your handling code here:
        CampoNumero.setText("");

        if (CampoNombres.getText().trim().isEmpty()) {
            CampoNombres.setText("Ingrese nombres...");
        }
        if (CampoApellidos.getText().trim().isEmpty()) {
            CampoApellidos.setText("Ingrese apellidos...");
        }
        if (CampoDNI.getText().trim().isEmpty()) {
            CampoDNI.setText("Ingrese DNI...");
        }
        if (CampoDireccion.getText().trim().isEmpty()) {
            CampoDireccion.setText("Ingrese dirección...");
        }
        if (CampoCorreo.getText().trim().isEmpty()) {
            CampoCorreo.setText("Ingrese correo...");
        }
        if (CampoCosto.getText().trim().isEmpty()) {
            CampoCosto.setText("Ingrese costo...");
        }
        if (CampoUsuario.getText().trim().isEmpty()) {
            CampoUsuario.setText("Ingrese usuario...");
        }
        if (CampoContrasena1.getText().trim().isEmpty()) {
            CampoContrasena1.setText("Ingrese contraseña...");
        }

    }//GEN-LAST:event_CampoNumeroMousePressed

    private void CampoCostoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CampoCostoMousePressed
        // TODO add your handling code here:
        CampoCosto.setText("");

        if (CampoNombres.getText().trim().isEmpty()) {
            CampoNombres.setText("Ingrese nombres...");
        }
        if (CampoApellidos.getText().trim().isEmpty()) {
            CampoApellidos.setText("Ingrese apellidos...");
        }
        if (CampoDNI.getText().trim().isEmpty()) {
            CampoDNI.setText("Ingrese DNI...");
        }
        if (CampoDireccion.getText().trim().isEmpty()) {
            CampoDireccion.setText("Ingrese dirección...");
        }
        if (CampoCorreo.getText().trim().isEmpty()) {
            CampoCorreo.setText("Ingrese correo...");
        }
        if (CampoNumero.getText().trim().isEmpty()) {
            CampoNumero.setText("Ingrese numero...");
        }
        if (CampoUsuario.getText().trim().isEmpty()) {
            CampoUsuario.setText("Ingrese usuario...");
        }
        if (CampoContrasena1.getText().trim().isEmpty()) {
            CampoContrasena1.setText("Ingrese contraseña...");
        }
    }//GEN-LAST:event_CampoCostoMousePressed

    private void CampoNombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoNombresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoNombresActionPerformed

    private void CampoCostoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoCostoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoCostoActionPerformed

    private void CampoContrasena1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoContrasena1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoContrasena1ActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaRegistrarRecepcionista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaRegistrarRecepcionista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaRegistrarRecepcionista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaRegistrarRecepcionista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaRegistrarRecepcionista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Apellidos;
    private javax.swing.JLabel Apellidos1;
    private javax.swing.JPanel Background1;
    private javax.swing.JTextField CampoApellidos;
    private javax.swing.JTextField CampoContrasena1;
    private javax.swing.JTextField CampoCorreo;
    private javax.swing.JTextField CampoCosto;
    private javax.swing.JTextField CampoDNI;
    private javax.swing.JTextField CampoDireccion;
    private javax.swing.JTextField CampoNombres;
    private javax.swing.JTextField CampoNumero;
    private javax.swing.JTextField CampoUsuario;
    private javax.swing.JLabel Correo;
    private javax.swing.JLabel Direccion;
    private javax.swing.JLabel InformacionContacto;
    private javax.swing.JLabel InformacionContacto1;
    private javax.swing.JLabel InformacionPersonal;
    private javax.swing.JLabel Nombres2;
    private javax.swing.JLabel NumeroDeCelular;
    private javax.swing.JButton jButtonRegistrar;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparatorNombre1;
    private javax.swing.JSeparator jSeparatorNombre2;
    private javax.swing.JSeparator jSeparatorNombre3;
    private javax.swing.JSeparator jSeparatorNombre5;
    private javax.swing.JSeparator jSeparatorNombre6;
    private javax.swing.JSeparator jSeparatorNombre7;
    private javax.swing.JSeparator jSeparatorNombre8;
    private javax.swing.JSeparator jSeparatorUsuario;
    private javax.swing.JSeparator jSeparatorUsuario1;
    private javax.swing.JSeparator jSeparatorUsuario2;
    // End of variables declaration//GEN-END:variables
}
