/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sacnhez;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
/**root@roundhouse.proxy.rlwy.net:32627
 *
 * @author Tuturjdbc:mysql://roundhouse.proxy.rlwy.net:32627/?user=root
 */
class Conexion {
    //conexion local
    public static Connection conectar(){
        try {
            Connection cn=DriverManager.getConnection("jdbc:mysql://roundhouse.proxy.rlwy.net:32627/railway","root","SZMLbFvdYPEKhJjVzhyqyHwAxJbknAJt");
            return cn;
        } catch (SQLException e) {
            System.out.println("Erroren la conexion local: "+e);
        }
        System.out.println("Error");
        return null;
    }
}
