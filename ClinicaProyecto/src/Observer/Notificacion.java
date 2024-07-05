/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Observer;

import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class Notificacion implements LoginObserver {

    private String nombre;

    public Notificacion(String nombre) {
        this.nombre = nombre;
    }

    public void update(boolean notificacion) {
        if (notificacion) {
            JOptionPane.showMessageDialog(null, "Datos correctos");
        } else {
            JOptionPane.showMessageDialog(null, "Datos incorrectos");
        }
    
    }
}
