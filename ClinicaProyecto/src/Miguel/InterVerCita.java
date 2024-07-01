package Miguel;

// Proyecto Clinica
//import Cuenca.*;
import Modelo_Menu.*;

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
 * @author cuenca y giron
 */
public class InterVerCita extends javax.swing.JInternalFrame {

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
    Menu objMenuCita;
    ModeloCita objMenuCitaPaciente;

    public InterVerCita() {
        
        objMenuCitaPaciente = new ModeloCita();
        objMenuCita = new Menu();

        initComponents();
        this.setSize(new Dimension(900, 500));
        this.setTitle("Gestionar Citas");
        //Cargar tabla
        this.CargarTablaCita();
        this.CargarComboPaciente();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_citas = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jComboBox_paciente = new javax.swing.JComboBox<>();
        jButton_elegirPaciente = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel_wallpaper = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ver Citas");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, -1, -1));

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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 710, 370));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 730, 410));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBox_paciente.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jComboBox_paciente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione el dia:", "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado" }));
        jComboBox_paciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_pacienteActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBox_paciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 110, -1));

        jButton_elegirPaciente.setBackground(new java.awt.Color(51, 204, 0));
        jButton_elegirPaciente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_elegirPaciente.setText("Paciente");
        jButton_elegirPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_elegirPacienteActionPerformed(evt);
            }
        });
        jPanel2.add(jButton_elegirPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 100, 30));

        jLabel6.setText("Paciente:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        jButton1.setText("Mostrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 100, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 50, 130, 410));
        getContentPane().add(jLabel_wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox_pacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_pacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_pacienteActionPerformed

    private void jButton_elegirPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_elegirPacienteActionPerformed
        //Metodo para obtener el idPaciente mediante la eleccion en el JCombo
        
        Connection con = Menu.ConectarBD();

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        CargarTablaCita();
        
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton_elegirPaciente;
    private javax.swing.JComboBox<String> jComboBox_paciente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel_wallpaper;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
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
        Connection con = Menu.ConectarBD();
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
    //int idPacienteSeleccionado = objMenuCitaPaciente.getIdPaciente();
     // Asegúrate de que esta variable tenga el valor adecuado en algún punto de tu código

private void CargarTablaCita() {
    IdPacienteSeleccionado = objMenuCitaPaciente.getIdPaciente();
    Connection con = Menu.ConectarBD();
    DefaultTableModel model = new DefaultTableModel();
    String sql = "SELECT idRecepcionista, idDoctor, idPaciente, fechaCita, fechaRegistro, costoTotal, estado FROM cita WHERE idPaciente = ?";
    PreparedStatement pst;
    try {
        pst = con.prepareStatement(sql);
        pst.setInt(1, IdPacienteSeleccionado); // Establece el valor del parámetro
        ResultSet rs = pst.executeQuery();
        InterVerCita.jTable_citas = new JTable(model);
        InterVerCita.jScrollPane1.setViewportView(InterVerCita.jTable_citas);

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
//                EnviarDatosCitaSeleccionada(idDoctor);
            }
        }
    });
}


    

}
