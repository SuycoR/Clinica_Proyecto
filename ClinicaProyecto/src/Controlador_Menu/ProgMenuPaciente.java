/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador_Menu;

import Modelo_Menu.*;
import Vista_Ventana.VentanaRegistrarPaciente;
import java.sql.Connection;

/**
 *
 * @author migue
 */
public class ProgMenuPaciente {
    
    //Objeto de la ventana inicio
    public VentanaRegistrarPaciente objVentanaInicio;
    public Menu objMenu;

    public ProgMenuPaciente() {
        //Objeto de la ventana inicio
        objVentanaInicio = new VentanaRegistrarPaciente();

        //Objeto del menu
        objMenu = new Menu();

    }

    public static void main(String[] args) {
        ProgMenuPaciente objProgMenu = new ProgMenuPaciente();

        //Conectar base de datos 
        objProgMenu.conectarBaseDatos();
        
        //Objeto del ProgMenu
        objProgMenu.mostrarVentanaInicio();
    }
    
    public void conectarBaseDatos() {
        Connection bd = objMenu.ConectarBD();
    }   

    public void mostrarVentanaInicio() {
        objVentanaInicio.setSize(900,700);
        objVentanaInicio.setLocationRelativeTo(null);
        objVentanaInicio.setVisible(true);
    }
}
