/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Observer;

/**
 *
 * @author PC
 */
public interface LoginObservable {
    void addObserver(Notificacion objNotificacion);
    void notifyObservers();
}
