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
public class Menu {

    public VentanaLogin objVentanaLogin;

    public Menu() {
        objVentanaLogin = new VentanaLogin();
    }

    public static void main(String[] args) {
        Menu objMenu = new Menu();
        objMenu.mostrarVentanaLogin();
    }
    
    public void mostrarVentanaLogin(){
        objVentanaLogin.setVisible(true);
    }

}
