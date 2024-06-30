
package Controlador_Menu;

import Modelo_Menu.Menu;
import Vista_Ventana.VentanaRegistrarDoctor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author andre
 */
public class ProgMenuDoctor {
    
    //Objeto de la ventana inicio
    public VentanaRegistrarDoctor objVentanaInicio;
    public Menu objMenu;

    public ProgMenuDoctor() {
        //Objeto de la ventana inicio
        objVentanaInicio = new VentanaRegistrarDoctor();

        //Objeto del menu
        objMenu = new Menu();
    }

    public static void main(String[] args) {
        ProgMenuDoctor objProgMenu = new ProgMenuDoctor();

        //Conectar base de datos 
        objProgMenu.conectarBaseDatos();
        
        //Objeto del ProgMenu
        objProgMenu.mostrarVentanaInicio();
    }
    
    public void conectarBaseDatos() {
        Connection bd = objMenu.ConectarBD();
    }   

    public void mostrarVentanaInicio() {
        objVentanaInicio.setSize(900,580);
        objVentanaInicio.setLocationRelativeTo(null);
        objVentanaInicio.setVisible(true);
    }
    
    //actualizar (NO TERMINADO)
    
//    public boolean actualizar(ProgMenuDoctor objeto, int idCita) {
//        boolean respuesta = false;
//        Connection cn = Menu.ConectarBD();
//        try {
//
//            PreparedStatement consulta = cn.prepareStatement("update doctor set lunes = ? martes = ? miercoles = ? jueves = ? viernes = ? sabado = ? where idDoctor ='" + idCita + "'");
//            consulta.setString(10, objeto.getLunes());
//            
//           
//            if (consulta.executeUpdate() > 0) {
//                respuesta = true;
//            }
//            cn.close();
//        } catch (SQLException e) {
//            System.out.println("Error al actualizar cita: " + e);
//        }
//        return respuesta;
//    }
}