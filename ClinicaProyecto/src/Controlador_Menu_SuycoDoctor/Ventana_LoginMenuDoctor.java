/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Controlador_Menu_SuycoDoctor;

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
import javax.swing.JOptionPane;
/**
 *
 * @author Suyco
 */
public class Ventana_LoginMenuDoctor extends javax.swing.JFrame {
    private Doctor objDoctor;
    private long idDoctor;
    public long idPaciente;
    public int CostoTotal;
    public long idCita;
    
    Paciente objPaciente;
   
    /**
     * Creates new form Ventana_LoginMenuDoctor
     */
    public Ventana_LoginMenuDoctor(Doctor objDoctor) {
        objPaciente = new Paciente();
        
        //txt_Doctor.getText(objDoctor.getId());
        // Añade el JLabel al JFrame
        initComponents();
        this.setSize(new Dimension(1000, 600));
        this.setTitle("Gestionar Pacientes");
        this.objDoctor= objDoctor;
        //this.add(txt_Doctor);
       //txt_Doctor.setText(objDoctor.getId());
        txt_Doctor.setText(String.valueOf(objDoctor.getIdDoctor()));
        this.CargarTablaAtender();
    }

    private Ventana_LoginMenuDoctor() {
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

        jPanel1 = new javax.swing.JPanel();
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
        jButton_actualizarDia = new javax.swing.JButton();
        jButton_actualizar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txt_Doctor = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButtonCancelar = new javax.swing.JButton();

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

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 525, 266));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Nombre:");

        txt_nombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombreActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Apellido:");

        txt_apellido.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Costo:");

        txt_costo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txt_costo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_costoActionPerformed(evt);
            }
        });

        jButton_actualizarDia.setBackground(new java.awt.Color(153, 255, 102));
        jButton_actualizarDia.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_actualizarDia.setText("Generar Recibo");
        jButton_actualizarDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_actualizarDiaActionPerformed(evt);
            }
        });

        jButton_actualizar.setBackground(new java.awt.Color(0, 51, 255));
        jButton_actualizar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_actualizar.setForeground(new java.awt.Color(255, 255, 255));
        jButton_actualizar.setText("Paciente Atendido");
        jButton_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_actualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelPacienteLayout = new javax.swing.GroupLayout(jPanelPaciente);
        jPanelPaciente.setLayout(jPanelPacienteLayout);
        jPanelPacienteLayout.setHorizontalGroup(
            jPanelPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPacienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanelPacienteLayout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addGap(18, 18, 18)
                            .addComponent(txt_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanelPacienteLayout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelPacienteLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txt_costo, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addGroup(jPanelPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton_actualizar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_actualizarDia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );
        jPanelPacienteLayout.setVerticalGroup(
            jPanelPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPacienteLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanelPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_nombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelPacienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_costo)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(22, 22, 22))
            .addGroup(jPanelPacienteLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jButton_actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton_actualizarDia, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jPanelPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 570, 120));

        jLabel5.setFont(new java.awt.Font("Bahnschrift", 1, 36)); // NOI18N
        jLabel5.setText("Lista de Pacientes ");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 330, 50));

        jPanel3.setBackground(new java.awt.Color(21, 52, 72));

        txt_Doctor.setFont(new java.awt.Font("Bahnschrift", 1, 36)); // NOI18N
        txt_Doctor.setForeground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Bahnschrift", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("BIENVENIDO");

        jButtonCancelar.setBackground(new java.awt.Color(223, 208, 184));
        jButtonCancelar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txt_Doctor, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_Doctor, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(134, 134, 134))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 0, 329, 550));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 996, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_costoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_costoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_costoActionPerformed

    private void txt_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombreActionPerformed

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

    private void jButton_actualizarDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_actualizarDiaActionPerformed
     
    }//GEN-LAST:event_jButton_actualizarDiaActionPerformed

    private void jButton_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_actualizarActionPerformed
        // TODO add your handling code here:
        //Datos fijos, idDoctorLogeado,idPaciente,CostoTotal, idCita.
        actualizarDatos(idCita);
        //CargarTablaAtender();
        
    }//GEN-LAST:event_jButton_actualizarActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana_LoginMenuDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana_LoginMenuDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana_LoginMenuDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana_LoginMenuDoctor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                //new Ventana_LoginMenuDoctor(Doctor objDoctor).setVisible(true);
                Ventana_LoginMenuDoctor ventana = new Ventana_LoginMenuDoctor();
                ventana.setVisible(true);
                //txt_Doctor.setText(objDoctor.getId);
                //txt_Doctor = objDoctor.getNombre();
                //txt_Doctor.setText(objDoctor.getId());
                //jTextArea1.setText(objDoctor.getId());
              
            }
        });
    }
    
//</editor-fold>

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButton_actualizar;
    private javax.swing.JButton jButton_actualizarDia;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelPaciente;
    public static javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jTable1;
    public static javax.swing.JLabel txt_Doctor;
    private javax.swing.JTextField txt_apellido;
    private javax.swing.JTextField txt_costo;
    private javax.swing.JTextField txt_nombre;
    // End of variables declaration//GEN-END:variables
   
    private int IdDoctorLogeado;

    private void CargarTablaAtender(){
        IdDoctorLogeado = objDoctor.getIdDoctor();
        Connection con = Menu.ConectarBD();
        DefaultTableModel model = new DefaultTableModel();
        String sql = "SELECT idCita,idRecepcionista, idDoctor, idPaciente, fechaCita, fechaRegistro, costoTotal, estado FROM cita WHERE idDoctor = ? AND estado = ?";
        PreparedStatement pst;
        try {
        pst = con.prepareStatement(sql);
        pst.setInt(1, IdDoctorLogeado); // Establece el valor del parámetro
        pst.setString(2,"Pendiente");
        ResultSet rs = pst.executeQuery();
        Ventana_LoginMenuDoctor.jTable1 = new JTable(model);
        Ventana_LoginMenuDoctor.jScrollPane1.setViewportView(Ventana_LoginMenuDoctor.jTable1);

        model.addColumn("idCita");
        model.addColumn("idRecepcionista");
        //model.addColumn("idDoctor");
        model.addColumn("idPaciente");
        model.addColumn("fechaCita");
        model.addColumn("fechaRegistro");
        model.addColumn("costoTotal");
        model.addColumn("estado");

        while (rs.next()) {
            Object fila[] = new Object[7];
            //for (int i = 0; i < 7; i++) {
               // fila[i] = rs.getObject(i + 1);
            //}
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
            Connection con = Menu.ConectarBD();
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
    //private void ActualizarEstadoCita(long idCita) {
        //try {
            //Connection con = Menu.ConectarBD();
            // Crear la sentencia SQL para actualizar el estado
           // String sql = "UPDATE cita SET estado = ? WHERE idCita = '" + idCita + "'";
            //PreparedStatement pst = con.prepareStatement(sql);
            //
            //con.close();
        //} catch (SQLException e) {
            //System.out.println("Error al seleccionar cita: " + e);
        //}
    //}
    public void actualizarDatos(long idCita){
        //int fila=jTable1.getSelectedColumn();
        String estado = "Atendido";
        try {
            Connection con = Menu.ConectarBD();
            String sql = "UPDATE cita SET estado = '"+estado+"' WHERE idCita = '" + idCita + "'";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.executeUpdate();
            CargarTablaAtender();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se logro actualizar los datos");
        }

    }
}

