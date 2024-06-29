/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador_Menu;

import Modelo_Menu.Menu;
import Vista_Ventana.VentanaRegistrarRecepcionista;
import java.sql.Connection;

/**
 *
 * @author migue
 */
public class ProgMenuRecepcionista {
    
    //Objeto de la ventana inicio
    public VentanaRegistrarRecepcionista objVentanaInicio;
    public Menu objMenu;

    public ProgMenuRecepcionista() {
        //Objeto de la ventana inicio
        objVentanaInicio = new VentanaRegistrarRecepcionista();

        //Objeto del menu
        objMenu = new Menu();
    }

    public static void main(String[] args) {
        ProgMenuRecepcionista objProgMenu = new ProgMenuRecepcionista();

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
}