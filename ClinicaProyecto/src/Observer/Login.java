package Observer;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Melendez
 */
public class Login implements LoginObservable {

    private List<Notificacion> notificaciones = new ArrayList<>();

    public Login() {

    }

    private boolean aviso;

    @Override
    public void addObserver(Notificacion objNotificacion) {
        notificaciones.add(objNotificacion);
    }

    public void Aviso(boolean aviso) {
        this.aviso = aviso;
        notifyObservers();
    }

    @Override
    public void notifyObservers() {
        for (Notificacion objNotificacion : notificaciones) {
            objNotificacion.update(aviso);
        }
    }
}
