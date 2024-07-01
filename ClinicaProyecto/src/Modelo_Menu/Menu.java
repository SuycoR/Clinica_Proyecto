/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo_Menu;

import com.mysql.cj.xdevapi.Statement;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.Date;
import java.sql.ResultSet;

import Modelo_Menu.Paciente;
import com.mysql.cj.protocol.Resultset;

/**
 *
 * @author PC
 */
public class Menu {

    public static PreparedStatement prepareStatement(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Menu() {
    }

    static Connection objConnection;

    /*
        Coneccion a la base de datos
     */
    public static Connection ConectarBD() {
        objConnection = null;

        String host = "jdbc:mysql://roundhouse.proxy.rlwy.net:32627/railway";
        String user = "root";
        String password = "SZMLbFvdYPEKhJjVzhyqyHwAxJbknAJt";

        try {
            objConnection = DriverManager.getConnection(host, user, password);
            System.out.println("Conexion exitosa");
        } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Conexion no exitosa");
        }
        return objConnection;
    }

    /*
        Métodos para enviar datos a sus respectivas tablas
     */
    public void enviarElementosPaciente(String nom, String ap, String dni, String dir, String corr, String cel, String nomC, String celEm, String u, String c) {

        PreparedStatement objPreparedStatement;
        try {
            objPreparedStatement = objConnection.prepareStatement("insert into paciente(nombre,apellido,dni,direccion,correo,celular,nombreContacto,celularEmergencia,usuario,contrasena)values(?,?,?,?,?,?,?,?,?,?)");
            objPreparedStatement.setString(1, nom);
            objPreparedStatement.setString(2, ap);
            objPreparedStatement.setString(3, dni);
            objPreparedStatement.setString(4, dir);
            objPreparedStatement.setString(5, corr);
            objPreparedStatement.setString(6, cel);
            objPreparedStatement.setString(7, nomC);
            objPreparedStatement.setString(8, celEm);
            objPreparedStatement.setString(9, u);
            objPreparedStatement.setString(10, c);
            objPreparedStatement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Paciente registrado");

        } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);

        }
    }

    public void enviarElementosPersonal(String nom, String ap, String dni, String dir, String corr, String cel, String u, String c, String o) {
        PreparedStatement objPreparedStatement;
        try {
            objPreparedStatement = objConnection.prepareStatement("insert into personal(nombre,apellido,dni,direccion,correo,celular,usuario,contrasena,ocupacion)values(?,?,?,?,?,?,?,?,?)");
            objPreparedStatement.setString(1, nom);
            objPreparedStatement.setString(2, ap);
            objPreparedStatement.setString(3, dni);
            objPreparedStatement.setString(4, dir);
            objPreparedStatement.setString(5, corr);
            objPreparedStatement.setString(6, cel);
            objPreparedStatement.setString(7, u);
            objPreparedStatement.setString(8, c);
            objPreparedStatement.setString(9, o);
            objPreparedStatement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Paciente registrado");
        } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void enviarElementosRecepcionista(String nom, String ap, String dni, String dir, String corr, String cel, String u, String c, int cost) {
        PreparedStatement objPreparedStatement;
        try {
            objPreparedStatement = objConnection.prepareStatement("insert into recepcionista(nombre,apellido,dni,direccion,correo,celular,usuario,contrasena,costo)values(?,?,?,?,?,?,?,?,?)");
            objPreparedStatement.setString(1, nom);
            objPreparedStatement.setString(2, ap);
            objPreparedStatement.setString(3, dni);
            objPreparedStatement.setString(4, dir);
            objPreparedStatement.setString(5, corr);
            objPreparedStatement.setString(6, cel);
            objPreparedStatement.setString(7, u);
            objPreparedStatement.setString(8, c);
            objPreparedStatement.setInt(9, cost);

            objPreparedStatement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Recepcionista registrado");
        } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void enviarElementosDoctor(String nom, String ap, String dni, String dir, String corr, String cel, String u, String c, int cost) {
        PreparedStatement objPreparedStatement;
        try {
            objPreparedStatement = objConnection.prepareStatement("insert into doctor(nombre,apellido,dni,direccion,correo,celular,usuario,contrasena,costo)values(?,?,?,?,?,?,?,?,?)");
            objPreparedStatement.setString(1, nom);
            objPreparedStatement.setString(2, ap);
            objPreparedStatement.setString(3, dni);
            objPreparedStatement.setString(4, dir);
            objPreparedStatement.setString(5, corr);
            objPreparedStatement.setString(6, cel);
            objPreparedStatement.setString(7, u);
            objPreparedStatement.setString(8, c);
            objPreparedStatement.setInt(9, cost);

            objPreparedStatement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Doctor registrado");
        } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void enviarElementosCita(String idRec, String idDoc, String idPac, Date fCita, Date fRegistro, int cTotal, String Estado) {
        PreparedStatement objPreparedStatement;
        try {
            objPreparedStatement = objConnection.prepareStatement("insert into cita(idRecepcionista,idDoctor,idPaciente,fechaCita,fechaRegistro,costoTotal,estado)values(?,?,?,?,?,?,?)");
            objPreparedStatement.setString(1, idRec);
            objPreparedStatement.setString(2, idDoc);
            objPreparedStatement.setString(3, idPac);
            objPreparedStatement.setDate(4, fCita);
            objPreparedStatement.setDate(5, fRegistro);
            objPreparedStatement.setInt(6, cTotal);
            objPreparedStatement.setString(7, Estado);

            objPreparedStatement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Cita registrada");
        } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean loginUser(Paciente objeto) {
        boolean respuesta = false;

        Connection objConnection = Menu.ConectarBD();
        String sql = "select usuario, contrasena from paciente where usuario=? and contrasena=?";
        ResultSet objResultset;

        try {
            PreparedStatement objPreparedStatement = objConnection.prepareStatement(sql);

            objPreparedStatement.setString(1, objeto.getUsuario());
            objPreparedStatement.setString(2, objeto.getContrasena());

            objResultset = objPreparedStatement.executeQuery();
            
            while(objResultset.next()){
                respuesta = true;
            }   

        } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Error al iniciar sesión");
        }

        return respuesta;
    }
}
