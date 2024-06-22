/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador_Menu;

import java.sql.Connection;
import Vista_Ventana.*;
import Modelo_Menu.Menu;

/**
 *
 * @author PC
 */
public class ProgMenu {

    //Objeto de la ventana inicio
    public VentanaInicio objVentanaInicio;
    public Menu objMenu;

    public ProgMenu() {
        //Objeto de la ventana inicio
        objVentanaInicio = new VentanaInicio();

        //Objeto del menu
        objMenu = new Menu();
    }

    public static void main(String[] args) {
        ProgMenu objProgMenu = new ProgMenu();

        //Conectar base de datos 
        objProgMenu.conectarBaseDatos();
        
        //Objeto del ProgMenu
        objProgMenu.mostrarVentanaInicio();
    }

    public void conectarBaseDatos() {
        Connection bd = objMenu.ConectarBD();
    }   

    public void mostrarVentanaInicio() {
        objVentanaInicio.setVisible(true);
    }

}
