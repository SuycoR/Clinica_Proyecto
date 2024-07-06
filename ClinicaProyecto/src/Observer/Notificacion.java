package Observer;

import javax.swing.JOptionPane;

/**
 *
 * @author Melendez
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
