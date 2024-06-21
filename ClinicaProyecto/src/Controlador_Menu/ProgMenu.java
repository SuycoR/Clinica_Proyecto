/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador_Menu;

import Vista_Ventana.*;

/**
 *
 * @author PC
 */
public class ProgMenu {

    public VentanaLogin objVentanaLogin;
    public VentanaInicio objVentanaInicio;
    
    public ProgMenu() {
        //Objeto de la ventana login
        objVentanaLogin = new VentanaLogin();
        
        //Objeto de la ventana inicio
        objVentanaInicio = new VentanaInicio();
    }

    public static void main(String[] args) {
        //Objeto del ProgMenu
        ProgMenu objMenu = new ProgMenu();
        objMenu.mostrarVentanaInicio();
    }
    
    public void mostrarVentanaInicio(){
        objVentanaInicio.setVisible(true);
    }

}
