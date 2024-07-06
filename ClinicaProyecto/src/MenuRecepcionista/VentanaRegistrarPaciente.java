package MenuRecepcionista;

import Modelo_Menu.Repository;
import Modelo_Menu.*;

/**
 *
 * @author Cuenca
 */
public class VentanaRegistrarPaciente extends javax.swing.JFrame {

    private Recepcionista objRecepcionista;
    public Repository objMenu;

    /**
     * Creates new form VentanaRegister
     */
    public VentanaRegistrarPaciente(Recepcionista objRecepcionista) {

        objMenu = new Repository();

        initComponents();
        this.objRecepcionista = objRecepcionista;
    }

    private VentanaRegistrarPaciente() {
        throw new UnsupportedOperationException("Not supported yet.");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        Nombres = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        CampoContrasena = new javax.swing.JTextField();
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
        jTextFieldRegisterNombre1 = new javax.swing.JTextField();
        jSeparatorNombre3 = new javax.swing.JSeparator();
        CampoNombreContacto = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        InformacionContacto = new javax.swing.JLabel();
        jSeparatorNombre4 = new javax.swing.JSeparator();
        Apellidos1 = new javax.swing.JLabel();
        jSeparatorNombre9 = new javax.swing.JSeparator();
        jLabel17 = new javax.swing.JLabel();
        CampoNumeroContacto = new javax.swing.JTextField();
        InformacionContacto1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);

        Background.setBackground(new java.awt.Color(255, 255, 255));
        Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Nombres.setFont(new java.awt.Font("Bahnschrift", 1, 20)); // NOI18N
        Nombres.setForeground(new java.awt.Color(0, 0, 0));
        Nombres.setText("Nombres:");
        Background.add(Nombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, -1, 30));

        jLabel4.setFont(new java.awt.Font("Bahnschrift", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Usuario:");
        Background.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 360, -1, 30));

        jLabel5.setFont(new java.awt.Font("Bahnschrift", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Contraseña");
        Background.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 420, 110, 30));

        CampoContrasena.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        CampoContrasena.setForeground(new java.awt.Color(153, 153, 153));
        CampoContrasena.setText("Contraseña");
        CampoContrasena.setBorder(null);
        CampoContrasena.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CampoContrasenaMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                CampoContrasenaMouseReleased(evt);
            }
        });
        CampoContrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoContrasenaActionPerformed(evt);
            }
        });
        Background.add(CampoContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 440, 280, 30));

        jSeparatorUsuario.setBackground(new java.awt.Color(0, 0, 0));
        jSeparatorUsuario.setForeground(new java.awt.Color(0, 0, 0));
        Background.add(jSeparatorUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 470, 280, 20));

        CampoNombres.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        CampoNombres.setForeground(new java.awt.Color(153, 153, 153));
        CampoNombres.setText("Nombres");
        CampoNombres.setBorder(null);
        CampoNombres.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CampoNombresMousePressed(evt);
            }
        });
        Background.add(CampoNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 260, 30));

        jSeparatorNombre1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparatorNombre1.setForeground(new java.awt.Color(0, 0, 0));
        Background.add(jSeparatorNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 260, -1));

        CampoUsuario.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        CampoUsuario.setForeground(new java.awt.Color(153, 153, 153));
        CampoUsuario.setText("Usuario");
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
        Background.add(CampoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 380, 280, 30));

        jSeparatorUsuario1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparatorUsuario1.setForeground(new java.awt.Color(0, 0, 0));
        Background.add(jSeparatorUsuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 410, 280, 20));

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
        Background.add(jButtonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 620, 110, 40));

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
        Background.add(jButtonRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 620, 110, 40));

        jLabel6.setFont(new java.awt.Font("Bahnschrift", 1, 34)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("REGISTRANDO PACIENTE");
        Background.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, -1, -1));

        jSeparatorNombre2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparatorNombre2.setForeground(new java.awt.Color(0, 0, 0));
        Background.add(jSeparatorNombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 260, 10));

        CampoApellidos.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        CampoApellidos.setForeground(new java.awt.Color(153, 153, 153));
        CampoApellidos.setText("Apellidos");
        CampoApellidos.setBorder(null);
        CampoApellidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CampoApellidosMousePressed(evt);
            }
        });
        CampoApellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoApellidosActionPerformed(evt);
            }
        });
        Background.add(CampoApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 260, 30));

        InformacionPersonal.setFont(new java.awt.Font("Bahnschrift", 1, 25)); // NOI18N
        InformacionPersonal.setForeground(new java.awt.Color(0, 0, 0));
        InformacionPersonal.setText("1. Información personal");
        Background.add(InformacionPersonal, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        Apellidos.setFont(new java.awt.Font("Bahnschrift", 1, 20)); // NOI18N
        Apellidos.setForeground(new java.awt.Color(0, 0, 0));
        Apellidos.setText("DNI:");
        Background.add(Apellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, -1, 30));

        CampoDNI.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        CampoDNI.setForeground(new java.awt.Color(153, 153, 153));
        CampoDNI.setText("DNI");
        CampoDNI.setBorder(null);
        CampoDNI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CampoDNIMousePressed(evt);
            }
        });
        Background.add(CampoDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 260, 30));

        jSeparatorNombre5.setBackground(new java.awt.Color(0, 0, 0));
        jSeparatorNombre5.setForeground(new java.awt.Color(0, 0, 0));
        Background.add(jSeparatorNombre5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, 260, 10));

        Direccion.setFont(new java.awt.Font("Bahnschrift", 1, 20)); // NOI18N
        Direccion.setForeground(new java.awt.Color(0, 0, 0));
        Direccion.setText("Dirección:");
        Background.add(Direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, -1, 30));

        CampoDireccion.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        CampoDireccion.setForeground(new java.awt.Color(153, 153, 153));
        CampoDireccion.setText("Dirección");
        CampoDireccion.setBorder(null);
        CampoDireccion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CampoDireccionMousePressed(evt);
            }
        });
        Background.add(CampoDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, 260, 30));

        jSeparatorNombre6.setBackground(new java.awt.Color(0, 0, 0));
        jSeparatorNombre6.setForeground(new java.awt.Color(0, 0, 0));
        Background.add(jSeparatorNombre6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 420, 260, 10));

        Correo.setFont(new java.awt.Font("Bahnschrift", 1, 20)); // NOI18N
        Correo.setForeground(new java.awt.Color(0, 0, 0));
        Correo.setText("Correo:");
        Background.add(Correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 430, -1, 30));

        CampoCorreo.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        CampoCorreo.setForeground(new java.awt.Color(153, 153, 153));
        CampoCorreo.setText("Correo");
        CampoCorreo.setBorder(null);
        CampoCorreo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CampoCorreoMousePressed(evt);
            }
        });
        Background.add(CampoCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 450, 260, 30));

        jSeparatorNombre7.setBackground(new java.awt.Color(0, 0, 0));
        jSeparatorNombre7.setForeground(new java.awt.Color(0, 0, 0));
        Background.add(jSeparatorNombre7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 480, 260, 10));

        NumeroDeCelular.setFont(new java.awt.Font("Bahnschrift", 1, 20)); // NOI18N
        NumeroDeCelular.setForeground(new java.awt.Color(0, 0, 0));
        NumeroDeCelular.setText("Número de celular");
        Background.add(NumeroDeCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 490, -1, 30));

        CampoNumero.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        CampoNumero.setForeground(new java.awt.Color(153, 153, 153));
        CampoNumero.setText("Celular");
        CampoNumero.setBorder(null);
        CampoNumero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CampoNumeroMousePressed(evt);
            }
        });
        Background.add(CampoNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 510, 260, 30));

        jSeparatorNombre8.setBackground(new java.awt.Color(0, 0, 0));
        jSeparatorNombre8.setForeground(new java.awt.Color(0, 0, 0));
        Background.add(jSeparatorNombre8, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 540, 260, 10));

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

        Background.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 930, 60));

        jLabel14.setFont(new java.awt.Font("Bahnschrift", 1, 25)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("1. Información personal");
        Background.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        jLabel9.setFont(new java.awt.Font("Bahnschrift", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Nombres:");
        Background.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, -1, 30));

        jTextFieldRegisterNombre1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jTextFieldRegisterNombre1.setForeground(new java.awt.Color(153, 153, 153));
        jTextFieldRegisterNombre1.setText("Ingrese nombre...");
        jTextFieldRegisterNombre1.setBorder(null);
        jTextFieldRegisterNombre1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextFieldRegisterNombre1MousePressed(evt);
            }
        });
        Background.add(jTextFieldRegisterNombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 230, 30));

        jSeparatorNombre3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparatorNombre3.setForeground(new java.awt.Color(0, 0, 0));
        Background.add(jSeparatorNombre3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 230, -1));

        CampoNombreContacto.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        CampoNombreContacto.setForeground(new java.awt.Color(153, 153, 153));
        CampoNombreContacto.setText("Nombres de contacto");
        CampoNombreContacto.setBorder(null);
        CampoNombreContacto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CampoNombreContactoMousePressed(evt);
            }
        });
        Background.add(CampoNombreContacto, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 210, 280, 30));

        jLabel15.setFont(new java.awt.Font("Bahnschrift", 1, 20)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Nombres de contacto:");
        Background.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 190, 240, 30));

        InformacionContacto.setFont(new java.awt.Font("Bahnschrift", 1, 25)); // NOI18N
        InformacionContacto.setForeground(new java.awt.Color(0, 0, 0));
        InformacionContacto.setText("3. Crear cuenta");
        Background.add(InformacionContacto, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 330, -1, -1));

        jSeparatorNombre4.setBackground(new java.awt.Color(0, 0, 0));
        jSeparatorNombre4.setForeground(new java.awt.Color(0, 0, 0));
        Background.add(jSeparatorNombre4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 240, 280, -1));

        Apellidos1.setFont(new java.awt.Font("Bahnschrift", 1, 20)); // NOI18N
        Apellidos1.setForeground(new java.awt.Color(0, 0, 0));
        Apellidos1.setText("Apellidos:");
        Background.add(Apellidos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, -1, 30));

        jSeparatorNombre9.setBackground(new java.awt.Color(0, 0, 0));
        jSeparatorNombre9.setForeground(new java.awt.Color(0, 0, 0));
        Background.add(jSeparatorNombre9, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 300, 280, -1));

        jLabel17.setFont(new java.awt.Font("Bahnschrift", 1, 20)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Número de emergencia:");
        Background.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 250, 240, 30));

        CampoNumeroContacto.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        CampoNumeroContacto.setForeground(new java.awt.Color(153, 153, 153));
        CampoNumeroContacto.setText("Celular de emergencia");
        CampoNumeroContacto.setBorder(null);
        CampoNumeroContacto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CampoNumeroContactoMousePressed(evt);
            }
        });
        Background.add(CampoNumeroContacto, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 270, 280, 30));

        InformacionContacto1.setFont(new java.awt.Font("Bahnschrift", 1, 25)); // NOI18N
        InformacionContacto1.setForeground(new java.awt.Color(0, 0, 0));
        InformacionContacto1.setText("2. Información de contacto");
        Background.add(InformacionContacto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 160, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, 707, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CampoContrasenaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CampoContrasenaMousePressed
        // TODO add your handling code here:
        CampoContrasena.setText("");

        if (CampoNombres.getText().trim().isEmpty()) {
            CampoNombres.setText("Nombres");
        }
        if (CampoApellidos.getText().trim().isEmpty()) {
            CampoApellidos.setText("Apellidos");
        }
        if (CampoDNI.getText().trim().isEmpty()) {
            CampoDNI.setText("DNI");
        }
        if (CampoDireccion.getText().trim().isEmpty()) {
            CampoDireccion.setText("Dirección");
        }
        if (CampoCorreo.getText().trim().isEmpty()) {
            CampoCorreo.setText("Correo");
        }
        if (CampoNumero.getText().trim().isEmpty()) {
            CampoNumero.setText("Celular");
        }
        if (CampoNombreContacto.getText().trim().isEmpty()) {
            CampoNombreContacto.setText("Contacto de emergencia");
        }
        if (CampoNumeroContacto.getText().trim().isEmpty()) {
            CampoNumeroContacto.setText("Celular de emergencia ");
        }
        if (CampoUsuario.getText().trim().isEmpty()) {
            CampoUsuario.setText("Usuario");
        }


    }//GEN-LAST:event_CampoContrasenaMousePressed

    private void CampoNombresMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CampoNombresMousePressed
        // TODO add your handling code here:
        CampoNombres.setText("");

        if (CampoApellidos.getText().trim().isEmpty()) {
            CampoApellidos.setText("Apellidos");
        }
        if (CampoDNI.getText().trim().isEmpty()) {
            CampoDNI.setText("DNI");
        }
        if (CampoDireccion.getText().trim().isEmpty()) {
            CampoDireccion.setText("Dirección");
        }
        if (CampoCorreo.getText().trim().isEmpty()) {
            CampoCorreo.setText("Correo");
        }
        if (CampoNumero.getText().trim().isEmpty()) {
            CampoNumero.setText("Celular");
        }
        if (CampoNombreContacto.getText().trim().isEmpty()) {
            CampoNombreContacto.setText("Contacto de emergencia");
        }
        if (CampoNumeroContacto.getText().trim().isEmpty()) {
            CampoNumeroContacto.setText("Celular de emergencia ");
        }
        if (CampoUsuario.getText().trim().isEmpty()) {
            CampoUsuario.setText("Usuario");
        }
        if (CampoContrasena.getText().trim().isEmpty()) {
            CampoContrasena.setText("Contraseña");
        }


    }//GEN-LAST:event_CampoNombresMousePressed

    private void CampoUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CampoUsuarioMousePressed
        // TODO add your handling code here:
        CampoUsuario.setText("");

        if (CampoNombres.getText().trim().isEmpty()) {
            CampoNombres.setText("Nombres");
        }
        if (CampoApellidos.getText().trim().isEmpty()) {
            CampoApellidos.setText("Apellidos");
        }
        if (CampoDNI.getText().trim().isEmpty()) {
            CampoDNI.setText("DNI");
        }
        if (CampoDireccion.getText().trim().isEmpty()) {
            CampoDireccion.setText("Dirección");
        }
        if (CampoCorreo.getText().trim().isEmpty()) {
            CampoCorreo.setText("Correo");
        }
        if (CampoNumero.getText().trim().isEmpty()) {
            CampoNumero.setText("Celular");
        }
        if (CampoNombreContacto.getText().trim().isEmpty()) {
            CampoNombreContacto.setText("Contacto de emergencia");
        }
        if (CampoNumeroContacto.getText().trim().isEmpty()) {
            CampoNumeroContacto.setText("Celular de emergencia ");
        }
        if (CampoContrasena.getText().trim().isEmpty()) {
            CampoContrasena.setText("Contraseña");
        }

    }//GEN-LAST:event_CampoUsuarioMousePressed

    private void CampoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoUsuarioActionPerformed

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        // TODO add your handling code here:
        VentanaMenuRecepcionista objMenu_Recepcionista = new VentanaMenuRecepcionista(objRecepcionista);
        objMenu_Recepcionista.setLocationRelativeTo(null);
        objMenu_Recepcionista.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void jButtonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarActionPerformed
        // TODO add your handling code here:
        String nombre = CampoNombres.getText();
        String apellido = CampoApellidos.getText();
        String dni = CampoDNI.getText();
        String direccion = CampoDireccion.getText();
        String correo = CampoCorreo.getText();
        String celular = CampoNumero.getText();
        String nombreContacto = CampoNombreContacto.getText();
        String celularEmergencia = CampoNumeroContacto.getText();
        String usuario = CampoUsuario.getText();
        String contrasena = CampoContrasena.getText();

        objMenu.enviarElementosPaciente(nombre, apellido, dni, direccion, correo, celular, nombreContacto, celularEmergencia, usuario, contrasena);

        CampoNombres.setText("Nombres");
        CampoApellidos.setText("Apellidos");
        CampoDNI.setText("DNI");
        CampoDireccion.setText("Dirección");
        CampoCorreo.setText("Correo");
        CampoNumero.setText("Celular");
        CampoNombreContacto.setText("Contacto de emergencia");
        CampoNumeroContacto.setText("Celular de emergencia");
        CampoUsuario.setText("Usuario");
        CampoContrasena.setText("Contraseña");


    }//GEN-LAST:event_jButtonRegistrarActionPerformed

    private void CampoContrasenaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CampoContrasenaMouseReleased
        // TODO add your handling code here:

    }//GEN-LAST:event_CampoContrasenaMouseReleased

    private void CampoApellidosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CampoApellidosMousePressed
        // TODO add your handling code here:
        CampoApellidos.setText("");

        if (CampoNombres.getText().trim().isEmpty()) {
            CampoNombres.setText("Nombres");
        }
        if (CampoDNI.getText().trim().isEmpty()) {
            CampoDNI.setText("DNI");
        }
        if (CampoDireccion.getText().trim().isEmpty()) {
            CampoDireccion.setText("Dirección");
        }
        if (CampoCorreo.getText().trim().isEmpty()) {
            CampoCorreo.setText("Correo");
        }
        if (CampoNumero.getText().trim().isEmpty()) {
            CampoNumero.setText("Celular");
        }
        if (CampoNombreContacto.getText().trim().isEmpty()) {
            CampoNombreContacto.setText("Contacto de emergencia");
        }
        if (CampoNumeroContacto.getText().trim().isEmpty()) {
            CampoNumeroContacto.setText("Celular de emergencia ");
        }
        if (CampoUsuario.getText().trim().isEmpty()) {
            CampoUsuario.setText("Usuario");
        }
        if (CampoContrasena.getText().trim().isEmpty()) {
            CampoContrasena.setText("Contraseña");
        }
    }//GEN-LAST:event_CampoApellidosMousePressed

    private void CampoDNIMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CampoDNIMousePressed
        // TODO add your handling code here:
        CampoDNI.setText("");

        if (CampoNombres.getText().trim().isEmpty()) {
            CampoNombres.setText("Nombres");
        }
        if (CampoApellidos.getText().trim().isEmpty()) {
            CampoApellidos.setText("Apellidos");
        }
        if (CampoDireccion.getText().trim().isEmpty()) {
            CampoDireccion.setText("Dirección");
        }
        if (CampoCorreo.getText().trim().isEmpty()) {
            CampoCorreo.setText("Correo");
        }
        if (CampoNumero.getText().trim().isEmpty()) {
            CampoNumero.setText("Celular");
        }
        if (CampoNombreContacto.getText().trim().isEmpty()) {
            CampoNombreContacto.setText("Contacto de emergencia");
        }
        if (CampoNumeroContacto.getText().trim().isEmpty()) {
            CampoNumeroContacto.setText("Celular de emergencia ");
        }
        if (CampoUsuario.getText().trim().isEmpty()) {
            CampoUsuario.setText("Usuario");
        }
        if (CampoContrasena.getText().trim().isEmpty()) {
            CampoContrasena.setText("Contraseña");
        }
    }//GEN-LAST:event_CampoDNIMousePressed

    private void CampoDireccionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CampoDireccionMousePressed
        // TODO add your handling code here:
        CampoDireccion.setText("");

        if (CampoNombres.getText().trim().isEmpty()) {
            CampoNombres.setText("Nombres");
        }
        if (CampoApellidos.getText().trim().isEmpty()) {
            CampoApellidos.setText("Apellidos");
        }
        if (CampoDNI.getText().trim().isEmpty()) {
            CampoDNI.setText("DNI");
        }
        if (CampoCorreo.getText().trim().isEmpty()) {
            CampoCorreo.setText("Correo");
        }
        if (CampoNumero.getText().trim().isEmpty()) {
            CampoNumero.setText("Celular");
        }
        if (CampoNombreContacto.getText().trim().isEmpty()) {
            CampoNombreContacto.setText("Contacto de emergencia");
        }
        if (CampoNumeroContacto.getText().trim().isEmpty()) {
            CampoNumeroContacto.setText("Celular de emergencia ");
        }
        if (CampoUsuario.getText().trim().isEmpty()) {
            CampoUsuario.setText("Usuario");
        }
        if (CampoContrasena.getText().trim().isEmpty()) {
            CampoContrasena.setText("Contraseña");
        }
    }//GEN-LAST:event_CampoDireccionMousePressed

    private void CampoCorreoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CampoCorreoMousePressed
        // TODO add your handling code here:
        CampoCorreo.setText("");

        if (CampoNombres.getText().trim().isEmpty()) {
            CampoNombres.setText("Nombres");
        }
        if (CampoApellidos.getText().trim().isEmpty()) {
            CampoApellidos.setText("Apellidos");
        }
        if (CampoDNI.getText().trim().isEmpty()) {
            CampoDNI.setText("DNI");
        }
        if (CampoDireccion.getText().trim().isEmpty()) {
            CampoDireccion.setText("Dirección");
        }
        if (CampoNumero.getText().trim().isEmpty()) {
            CampoNumero.setText("Celular");
        }
        if (CampoNombreContacto.getText().trim().isEmpty()) {
            CampoNombreContacto.setText("Contacto de emergencia");
        }
        if (CampoNumeroContacto.getText().trim().isEmpty()) {
            CampoNumeroContacto.setText("Celular de emergencia ");
        }
        if (CampoUsuario.getText().trim().isEmpty()) {
            CampoUsuario.setText("Usuario");
        }
        if (CampoContrasena.getText().trim().isEmpty()) {
            CampoContrasena.setText("Contraseña");
        }
    }//GEN-LAST:event_CampoCorreoMousePressed

    private void CampoNumeroMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CampoNumeroMousePressed
        // TODO add your handling code here:
        CampoNumero.setText("");

        if (CampoNombres.getText().trim().isEmpty()) {
            CampoNombres.setText("Nombres");
        }
        if (CampoApellidos.getText().trim().isEmpty()) {
            CampoApellidos.setText("Apellidos");
        }
        if (CampoDNI.getText().trim().isEmpty()) {
            CampoDNI.setText("DNI");
        }
        if (CampoDireccion.getText().trim().isEmpty()) {
            CampoDireccion.setText("Dirección");
        }
        if (CampoCorreo.getText().trim().isEmpty()) {
            CampoCorreo.setText("Correo");
        }
        if (CampoNombreContacto.getText().trim().isEmpty()) {
            CampoNombreContacto.setText("Contacto de emergencia");
        }
        if (CampoNumeroContacto.getText().trim().isEmpty()) {
            CampoNumeroContacto.setText("Celular de emergencia ");
        }
        if (CampoUsuario.getText().trim().isEmpty()) {
            CampoUsuario.setText("Usuario");
        }
        if (CampoContrasena.getText().trim().isEmpty()) {
            CampoContrasena.setText("Contraseña");
        }
    }//GEN-LAST:event_CampoNumeroMousePressed

    private void jTextFieldRegisterNombre1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldRegisterNombre1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldRegisterNombre1MousePressed

    private void CampoNombreContactoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CampoNombreContactoMousePressed
        // TODO add your handling code here:
        CampoNombreContacto.setText("");

        if (CampoNombres.getText().trim().isEmpty()) {
            CampoNombres.setText("Nombres");
        }
        if (CampoApellidos.getText().trim().isEmpty()) {
            CampoApellidos.setText("Apellidos");
        }
        if (CampoDNI.getText().trim().isEmpty()) {
            CampoDNI.setText("DNI");
        }
        if (CampoDireccion.getText().trim().isEmpty()) {
            CampoDireccion.setText("Dirección");
        }
        if (CampoCorreo.getText().trim().isEmpty()) {
            CampoCorreo.setText("Correo");
        }
        if (CampoNumero.getText().trim().isEmpty()) {
            CampoNumero.setText("Celular");
        }
        if (CampoNumeroContacto.getText().trim().isEmpty()) {
            CampoNumeroContacto.setText("Celular de emergencia ");
        }
        if (CampoUsuario.getText().trim().isEmpty()) {
            CampoUsuario.setText("Usuario");
        }
        if (CampoContrasena.getText().trim().isEmpty()) {
            CampoContrasena.setText("Contraseña");
        }
    }//GEN-LAST:event_CampoNombreContactoMousePressed

    private void CampoNumeroContactoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CampoNumeroContactoMousePressed
        // TODO add your handling code here:
        CampoNumeroContacto.setText("");

        if (CampoNombres.getText().trim().isEmpty()) {
            CampoNombres.setText("Nombres");
        }
        if (CampoApellidos.getText().trim().isEmpty()) {
            CampoApellidos.setText("Apellidos");
        }
        if (CampoDNI.getText().trim().isEmpty()) {
            CampoDNI.setText("DNI");
        }
        if (CampoDireccion.getText().trim().isEmpty()) {
            CampoDireccion.setText("Dirección");
        }
        if (CampoCorreo.getText().trim().isEmpty()) {
            CampoCorreo.setText("Correo");
        }
        if (CampoNumero.getText().trim().isEmpty()) {
            CampoNumero.setText("Celular");
        }
        if (CampoNombreContacto.getText().trim().isEmpty()) {
            CampoNombreContacto.setText("Contacto de emergencia");
        }
        if (CampoUsuario.getText().trim().isEmpty()) {
            CampoUsuario.setText("Usuario");
        }
        if (CampoContrasena.getText().trim().isEmpty()) {
            CampoContrasena.setText("Contraseña");
        }
    }//GEN-LAST:event_CampoNumeroContactoMousePressed

    private void jButtonRegistrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonRegistrarMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonRegistrarMousePressed

    private void CampoContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoContrasenaActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_CampoContrasenaActionPerformed

    private void CampoApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoApellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoApellidosActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaRegistrarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaRegistrarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaRegistrarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaRegistrarPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaRegistrarPaciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Apellidos;
    private javax.swing.JLabel Apellidos1;
    private javax.swing.JPanel Background;
    private javax.swing.JTextField CampoApellidos;
    private javax.swing.JTextField CampoContrasena;
    private javax.swing.JTextField CampoCorreo;
    private javax.swing.JTextField CampoDNI;
    private javax.swing.JTextField CampoDireccion;
    private javax.swing.JTextField CampoNombreContacto;
    private javax.swing.JTextField CampoNombres;
    private javax.swing.JTextField CampoNumero;
    private javax.swing.JTextField CampoNumeroContacto;
    private javax.swing.JTextField CampoUsuario;
    private javax.swing.JLabel Correo;
    private javax.swing.JLabel Direccion;
    private javax.swing.JLabel InformacionContacto;
    private javax.swing.JLabel InformacionContacto1;
    private javax.swing.JLabel InformacionPersonal;
    private javax.swing.JLabel Nombres;
    private javax.swing.JLabel NumeroDeCelular;
    private javax.swing.JButton jButtonRegistrar;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparatorNombre1;
    private javax.swing.JSeparator jSeparatorNombre2;
    private javax.swing.JSeparator jSeparatorNombre3;
    private javax.swing.JSeparator jSeparatorNombre4;
    private javax.swing.JSeparator jSeparatorNombre5;
    private javax.swing.JSeparator jSeparatorNombre6;
    private javax.swing.JSeparator jSeparatorNombre7;
    private javax.swing.JSeparator jSeparatorNombre8;
    private javax.swing.JSeparator jSeparatorNombre9;
    private javax.swing.JSeparator jSeparatorUsuario;
    private javax.swing.JSeparator jSeparatorUsuario1;
    private javax.swing.JTextField jTextFieldRegisterNombre1;
    // End of variables declaration//GEN-END:variables
}
