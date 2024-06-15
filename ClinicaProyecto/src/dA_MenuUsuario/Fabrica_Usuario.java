/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dA_MenuUsuario;

/**
 *
 * @author Miguel Aljeandro Giron Altamirano
 */
public class Fabrica_Usuario {
    public Usuario crearUsuario(String tipo){
        if(tipo.equalsIgnoreCase("DOCTOR")){
            return new Doctor();
        }else if(tipo.equalsIgnoreCase("PACIENTE")){
            return new Paciente();
        }else if(tipo.equalsIgnoreCase("ADMINISTRADOR")){
            return new Administrador();
        }else{
            return null;
        }
        
    }
}
