/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador_Menu;

import java.sql.Connection;
import Vista_Ventana.*;
import Modelo_Menu.Repository;
import MenuDoctor.Ventana_LoginMenuDoctor;
/**
 *
 * @author PC
 */
public class ProgMenu {

    //Objeto de la ventana inicio
    public VentanaInicio objVentanaInicio;
    public Repository objMenuInicio;

    public ProgMenu() {
        //Objeto de la ventana inicio
        objVentanaInicio = new VentanaInicio();

        //Objeto del menu
        objMenuInicio = new Repository();
    }

    public static void main(String[] args) {
        ProgMenu objProgMenuInicio = new ProgMenu();

        //Conectar base de datos 
        objProgMenuInicio.conectarBaseDatos();
        
        //Objeto del ProgMenu
        objProgMenuInicio.mostrarVentanaInicio();
    }

    public void conectarBaseDatos() {
        Connection bd = objMenuInicio.ConectarBD();
    }   

    public void mostrarVentanaInicio() {
        objVentanaInicio.setLocationRelativeTo(null);
        objVentanaInicio.setVisible(true);
    }

}
