package MenuPaciente;

import Modelo_Menu.*;
import Vista_Ventana.*;

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
public class VentanaMenuPaciente extends javax.swing.JFrame {

    private Paciente objPaciente;
    public long idPaciente;

    /**
     * Creates new form Menu_Paciente
     */
    public VentanaMenuPaciente(Paciente objPaciente) {
        initComponents();
        this.objPaciente = objPaciente;
        idPaciente = objPaciente.getIdPaciente();
        //Imprime en la interfaz el nombre 
        obtenerDatosxIdPaciente(idPaciente);
        this.CargarTabla();
    }

    private VentanaMenuPaciente() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jButtonCancelar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txt_Paciente = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
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

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, 520, 280));

        jPanel5.setBackground(new java.awt.Color(21, 52, 72));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Bahnschrift", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("es el siguiente");
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, 50));

        jButtonCancelar.setBackground(new java.awt.Color(60, 91, 111));
        jButtonCancelar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButtonCancelar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCancelar.setText("VOLVER");
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
        jPanel5.add(jButtonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, 220, 34));

        jLabel10.setFont(new java.awt.Font("Bahnschrift", 1, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Tu historial de citas");
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, 50));

        jLabel11.setFont(new java.awt.Font("Bahnschrift", 1, 30)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Bienvenido,");
        jPanel5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, 50));

        txt_Paciente.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        txt_Paciente.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.add(txt_Paciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 247, 40));

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 300, 560));

        jLabel1.setFont(new java.awt.Font("Bahnschrift", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(21, 52, 72));
        jLabel1.setText("Mi Historial");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 50, -1, 40));

        jPanel4.setBackground(new java.awt.Color(21, 52, 72));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 80, 180, 5));

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
            java.util.logging.Logger.getLogger(VentanaMenuPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaMenuPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaMenuPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaMenuPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaMenuPaciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    public static javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jTable1;
    private javax.swing.JLabel txt_Paciente;
    // End of variables declaration//GEN-END:variables
    private int IdPacienteLogeado;

    private void CargarTabla() {
        IdPacienteLogeado = objPaciente.getIdPaciente();
        Connection con = Repository.ConectarBD();
        DefaultTableModel model = new DefaultTableModel();
        String sql = "SELECT idCita,idRecepcionista, idDoctor, idPaciente, fechaCita, fechaRegistro, costoTotal, estado FROM cita WHERE idPaciente = ? ";
        PreparedStatement pst;
        try {
            pst = con.prepareStatement(sql);
            pst.setInt(1, IdPacienteLogeado); // Establece el valor del parámetro

            ResultSet rs = pst.executeQuery();
            VentanaMenuPaciente.jTable1 = new JTable(model);
            VentanaMenuPaciente.jScrollPane1.setViewportView(VentanaMenuPaciente.jTable1);

            model.addColumn("Cita");
            model.addColumn("Doctor");
            model.addColumn("Fecha Cita");
            model.addColumn("Fecha de Registro");
            model.addColumn("Costo ($)");
            model.addColumn("Estado");

            while (rs.next()) {

                Object fila[] = new Object[6];

                fila[0] = rs.getObject("idCita");

                fila[1] = rs.getObject("idDoctor");
                fila[2] = rs.getObject("fechaCita");
                fila[3] = rs.getObject("fechaRegistro");
                fila[4] = rs.getObject("costoTotal");
                fila[5] = rs.getObject("estado");
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

            }
        });

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
                txt_Paciente.setText(rs.getString("nombre") + " " + rs.getString("apellido"));
            }
            con.close();
        } catch (SQLException e) {
            System.out.println("Error al seleccionar cita: " + e);
        }
    }
}
