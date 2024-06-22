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
    
    public void enviarElementosUsuario(String n, String u, String c, String t) {
        
        PreparedStatement objPreparedStatement;
        try {
            objPreparedStatement = objConnection.prepareStatement("insert into usuario(nombre,usuario,contrasena,tipo_usuario)values(?,?,?,?)");
            objPreparedStatement.setString(1, n);
            objPreparedStatement.setString(2, u);
            objPreparedStatement.setString(3, c);
            objPreparedStatement.setString(4, t);
            objPreparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
            
        }
    }
 
}
