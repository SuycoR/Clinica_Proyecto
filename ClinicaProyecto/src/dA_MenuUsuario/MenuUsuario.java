/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dA_MenuUsuario;

/**
 *
 * @author Miguel Aljeandro Giron Altamirano
 */
public class MenuUsuario {
    public static void main(String[] args){
        //Constructor generico
        Fabrica_Usuario objFabrica_Usuario = new Fabrica_Usuario();
        
        Usuario giron = objFabrica_Usuario.crearUsuario("DOCTOR");
        giron.ingresar();
    }
}
