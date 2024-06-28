/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo_Menu;

import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PC
 */
public class Menu {

    public Menu() {
    }
    
    static Connection objConnection;
    
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
            
        } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
            
        }
    }
    
    public void enviarElementosPersonal(String nom, String ap, String dni, String dir, String corr, String cel, String u, String c, String o){
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
        } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
 
}
