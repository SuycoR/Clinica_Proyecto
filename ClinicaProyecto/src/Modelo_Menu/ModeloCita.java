/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo_Menu;
import java.sql.Date;
/**
 *
 * @author migue
 */
public class ModeloCita {
    private int idRecepcionista;
    private int idDoctor;
    private int idPaciente;
    private int costoTotal;
    private  Date specificDate;
    public ModeloCita(){
        this.idRecepcionista = 0;
        this.idDoctor= 0;
        this.idPaciente = 0;
        this.costoTotal=0;
    }

    public ModeloCita(int idRecepcionista, int idDoctor, int idPaciente, int costoTotal, Date specificDate) {
        this.idRecepcionista = idRecepcionista;
        this.idDoctor = idDoctor;
        this.idPaciente = idPaciente;
        this.costoTotal = costoTotal;
        this.specificDate = specificDate;
    }
    public void setFecha(String fecha){
        this.specificDate =  Date.valueOf(fecha);
    }
    public Date getFecha(){
        return specificDate;
    }
    public int getIdRecepcionista() {
        return idRecepcionista;
    }
    
    public void setIdRecepcionista(int idRecepcionista) {
        this.idRecepcionista = idRecepcionista;
    }

    public int getIdDoctor() {
        return idDoctor;
    }

    public void setIdDoctor(int idDoctor) {
        this.idDoctor = idDoctor;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public int getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(int costoTotal) {
        this.costoTotal = costoTotal;
    }
    
}
