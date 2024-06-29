/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador_Menu;

import Modelo_Menu.Menu;
import Vista_Ventana.VentanaRegistrarDoctor;
import java.sql.Connection;

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
}