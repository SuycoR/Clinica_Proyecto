package MenuDoctor;

import Modelo_Menu.Doctor;
import Modelo_Menu.*;
import Vista_Ventana.*;

import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Suyco
 */
public class VentanaListaPacientes extends javax.swing.JFrame {

    private Doctor objDoctor;
    private long idDoctor;
    public long idPaciente;
    public int CostoTotal;
    public long idCita;

    Paciente objPaciente;

    /**
     * Creates new form Ventana_LoginMenuDoctor
     */
    public VentanaListaPacientes(Doctor objDoctor) {
        objPaciente = new Paciente();

        // Añade el JLabel al JFrame
        initComponents();
        this.setSize(new Dimension(1000, 600));
        this.setTitle("Gestionar Pacientes");
        this.objDoctor = objDoctor;
        idDoctor = objDoctor.getIdDoctor();
        // Imprime en la interfaz el nombre
        obtenerDatosxId(idDoctor);

        this.CargarTablaAtender();
    }

    private VentanaListaPacientes() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanelPaciente = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_apellido = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_costo = new javax.swing.JTextField();
        jButton_actualizar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        txt_Doctor = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButtonCancelar = new javax.swing.JButton();
        jButtonAtendidos = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();

        setPreferredSize(new java.awt.Dimension(1000, 550));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(51, 51, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, 620, 260));

        jPanelPaciente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Nombre:");
        jPanelPaciente.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 70, -1));

        txt_nombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombreActionPerformed(evt);
            }
        });
        jPanelPaciente.add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 161, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Apellido:");
        jPanelPaciente.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        txt_apellido.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanelPaciente.add(txt_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 161, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Costo:");
        jPanelPaciente.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 60, -1));

        txt_costo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_costo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_costoActionPerformed(evt);
            }
        });
        jPanelPaciente.add(txt_costo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 161, -1));

        jButton_actualizar.setBackground(new java.awt.Color(60, 91, 111));
        jButton_actualizar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_actualizar.setForeground(new java.awt.Color(255, 255, 255));
        jButton_actualizar.setText("MARCAR COMO ATENDIDO");
        jButton_actualizar.setBorder(null);
        jButton_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_actualizarActionPerformed(evt);
            }
        });
        jPanelPaciente.add(jButton_actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, 203, 45));

        jPanel2.add(jPanelPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 390, 620, 140));

        jPanel3.setBackground(new java.awt.Color(21, 52, 72));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_Doctor.setFont(new java.awt.Font("Bahnschrift", 1, 30)); // NOI18N
        txt_Doctor.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(txt_Doctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 247, 40));

        jLabel7.setFont(new java.awt.Font("Bahnschrift", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("pacientes por atender");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, 50));

        jButtonCancelar.setBackground(new java.awt.Color(60, 91, 111));
        jButtonCancelar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButtonCancelar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCancelar.setText("Cerrar Sesión");
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
        jPanel3.add(jButtonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, 220, 34));

        jButtonAtendidos.setBackground(new java.awt.Color(60, 91, 111));
        jButtonAtendidos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButtonAtendidos.setForeground(new java.awt.Color(255, 255, 255));
        jButtonAtendidos.setText("Pacientes Atendidos");
        jButtonAtendidos.setBorder(null);
        jButtonAtendidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButtonAtendidosMousePressed(evt);
            }
        });
        jButtonAtendidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtendidosActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonAtendidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, 220, 34));

        jLabel8.setFont(new java.awt.Font("Bahnschrift", 1, 30)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Dr.");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, 40));

        jLabel9.setFont(new java.awt.Font("Bahnschrift", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Tiene los siguientes");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, 50));

        jLabel10.setFont(new java.awt.Font("Bahnschrift", 1, 30)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Bienvenido,");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, 50));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 300, 560));

        jLabel1.setFont(new java.awt.Font("Bahnschrift", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(21, 52, 72));
        jLabel1.setText("Lista de pacientes");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 50, -1, 40));

        jPanel4.setBackground(new java.awt.Color(21, 52, 72));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 80, 250, 5));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 522, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 990, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 548, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCancelarMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCancelarMousePressed

    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
        // TODO add your handling code here:
        VentanaInicio objVentanaInicio = new VentanaInicio();
        objVentanaInicio.setLocationRelativeTo(null);
        objVentanaInicio.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jButtonAtendidosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAtendidosMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonAtendidosMousePressed

    private void jButtonAtendidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtendidosActionPerformed
        // TODO add your handling code here:

        VentanaAtendidos objVentana_Atendidos = new VentanaAtendidos();
        objVentana_Atendidos.setSize(996, 550);
        objVentana_Atendidos.setLocationRelativeTo(null);
        objVentana_Atendidos.setDatos(objDoctor);
        //objVentana_Atendidos.CargarTablaAtendidos(objDoctor);
        objVentana_Atendidos.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonAtendidosActionPerformed

    private void jButton_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_actualizarActionPerformed
        // TODO add your handling code here:
        //Datos fijos, idDoctorLogeado,idPaciente,CostoTotal, idCita.
        actualizarDatos(idCita);
        //CargarTablaAtender();
    }//GEN-LAST:event_jButton_actualizarActionPerformed

    private void txt_costoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_costoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_costoActionPerformed

    private void txt_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombreActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaListaPacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaListaPacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaListaPacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaListaPacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                //new VentanaListaPacientes(Doctor objDoctor).setVisible(true);
                VentanaListaPacientes ventana = new VentanaListaPacientes();
                ventana.setVisible(true);
            }
        });
    }

//</editor-fold>

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAtendidos;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButton_actualizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanelPaciente;
    public static javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jTable1;
    private javax.swing.JLabel txt_Doctor;
    private javax.swing.JTextField txt_apellido;
    private javax.swing.JTextField txt_costo;
    private javax.swing.JTextField txt_nombre;
    // End of variables declaration//GEN-END:variables

    private int IdDoctorLogeado;

    private void CargarTablaAtender() {
        IdDoctorLogeado = objDoctor.getIdDoctor();
        Connection con = Repository.ConectarBD();
        DefaultTableModel model = new DefaultTableModel();
        String sql = "SELECT idCita,idRecepcionista, idDoctor, idPaciente, fechaCita, fechaRegistro, costoTotal, estado FROM cita WHERE idDoctor = ? AND estado = ?";
        PreparedStatement pst;
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, IdDoctorLogeado); // Establece el valor del parámetro
            pst.setString(2, "Pendiente");
            ResultSet rs = pst.executeQuery();
            VentanaListaPacientes.jTable1 = new JTable(model);
            VentanaListaPacientes.jScrollPane1.setViewportView(VentanaListaPacientes.jTable1);

            model.addColumn("N° cita");
            model.addColumn("ID Recepcionista");
            model.addColumn("ID Paciente");
            model.addColumn("Fecha Cita");
            model.addColumn("Fecha Registro");
            model.addColumn("Costo ($)");
            model.addColumn("Estado");

            while (rs.next()) {

                Object fila[] = new Object[7];

                fila[0] = rs.getObject("idCita");
                fila[1] = rs.getObject("idRecepcionista");
                fila[2] = rs.getObject("idPaciente");
                fila[3] = rs.getObject("fechaCita");
                fila[4] = rs.getObject("fechaRegistro");
                fila[5] = rs.getObject("costoTotal");
                fila[6] = rs.getObject("estado");
                model.addRow(fila);
            }
            con.close();
        } catch (SQLException e) {
            System.out.println("Error al llenar la tabla citas: " + e);
        }
        // Evento para obtener campo al cual el usuario da click
        // y obtener la interfaz que mostrara la informacion general
        jTable1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int fila_point = jTable1.rowAtPoint(e.getPoint());
                int columna_point = 0;

                if (fila_point > -1) {
                    idPaciente = (Long) model.getValueAt(fila_point, 2);
                    EnviarDatosPacienteSeleccionada(idPaciente);

                }
                if (fila_point > -1) {
                    CostoTotal = (Integer) model.getValueAt(fila_point, 5);
                    txt_costo.setText(String.valueOf(CostoTotal));

                }
                if (fila_point > -1) {
                    idCita = (Long) model.getValueAt(fila_point, 0);
                }
            }
        });

    }

    /*
     * **************************************************
     * Metodo que envia datos del doctor seleccionado al cuadro de texto
     * **************************************************
     */
    private void EnviarDatosPacienteSeleccionada(long idPaciente) {
        try {
            Connection con = Repository.ConectarBD();
            PreparedStatement pst = con.prepareStatement(
                    "select * from paciente where id = '" + idPaciente + "'");
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                txt_nombre.setText(rs.getString("nombre"));
                txt_apellido.setText(rs.getString("apellido"));

            }
            con.close();
        } catch (SQLException e) {
            System.out.println("Error al seleccionar cita: " + e);
        }
    }

    public void actualizarDatos(long idCita) {
        //int fila=jTable1.getSelectedColumn();
        String estado = "Atendido";
        try {
            Connection con = Repository.ConectarBD();
            String sql = "UPDATE cita SET estado = '" + estado + "' WHERE idCita = '" + idCita + "'";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.executeUpdate();
            CargarTablaAtender();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se logro actualizar los datos");
        }

    }

    public void obtenerDatosxId(long idDoctor) {
        try {
            Connection con = Repository.ConectarBD();
            PreparedStatement pst = con.prepareStatement(
                    "select * from doctor where idDoctor = '" + idDoctor + "'");
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                objDoctor.setNombre(rs.getString("nombre"));
                objDoctor.setApellido(rs.getString("apellido"));
                txt_Doctor.setText(rs.getString("nombre"));
            }
            con.close();
        } catch (SQLException e) {
            System.out.println("Error al seleccionar cita: " + e);
        }
    }

    public void obtenerDatosxIdPaciente(long idPaciente) {
        try {
            Connection con = Repository.ConectarBD();
            PreparedStatement pst = con.prepareStatement(
                    "select * from paciente where id = '" + idPaciente + "'");
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                objPaciente.setNombre(rs.getString("nombre"));
                objPaciente.setApellido(rs.getString("apellido"));
                txt_Doctor.setText(rs.getString("apellido"));
            }
            con.close();
        } catch (SQLException e) {
            System.out.println("Error al seleccionar cita: " + e);
        }
    }
}
