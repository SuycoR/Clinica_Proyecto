package Observer;

/**
 *
 * @author Melendez
 */
public interface LoginObservable {

    void addObserver(Notificacion objNotificacion);

    void notifyObservers();
}
