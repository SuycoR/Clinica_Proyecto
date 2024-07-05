/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Observer;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class Login implements LoginObservable {
    private List<Notificacion> notificaciones = new ArrayList<>();
    
    public Login(){
        
    }
    
    private boolean aviso;
    
    @Override
    public void addObserver(Notificacion objNotificacion) {
        notificaciones.add(objNotificacion);
    }
    
    public void Aviso(boolean aviso){
        this.aviso=aviso;
        notifyObservers();
    }
    @Override
    public void notifyObservers() {
        for(Notificacion objNotificacion: notificaciones){
            objNotificacion.update(aviso);
 }
}
}
