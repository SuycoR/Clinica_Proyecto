/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sacnhez;

/**
 *
 * @author Tutur
 */
public class CabececeraVenta {
    private int idCabeceraVenta;
    private int idRecepcionista;
    private int idDoctor;
    private int idPaciente;
    private String fechaCita;
    private String fechaRegistr;
    private double costoTotal;
    private String estado;
    
    public CabececeraVenta(){
        this.idCabeceraVenta=0;
        this.idRecepcionista=0;
        this.idDoctor=0;
        this.idPaciente=0;
        this.fechaCita="";
        this.costoTotal=0.0;
        this.estado="";
    
    }
    //constructio 

    public CabececeraVenta(int idCabeceraVenta, int idRecepcionista, int idDoctor, int idPaciente, String fechaCita, String fechaRegistr, double costoTotal, String estado) {
        this.idCabeceraVenta = idCabeceraVenta;
        this.idRecepcionista = idRecepcionista;
        this.idDoctor = idDoctor;
        this.idPaciente = idPaciente;
        this.fechaCita = fechaCita;
        this.fechaRegistr = fechaRegistr;
        this.costoTotal = costoTotal;
        this.estado = estado;
    }
    //get and set 

    public int getIdCabeceraVenta() {
        return idCabeceraVenta;
    }

    public void setIdCabeceraVenta(int idCabeceraVenta) {
        this.idCabeceraVenta = idCabeceraVenta;
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

    public String getFechaCita() {
        return fechaCita;
    }

    public void setFechaCita(String fechaCita) {
        this.fechaCita = fechaCita;
    }

    public String getFechaRegistr() {
        return fechaRegistr;
    }

    public void setFechaRegistr(String fechaRegistr) {
        this.fechaRegistr = fechaRegistr;
    }

    public double getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(double costoTotal) {
        this.costoTotal = costoTotal;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    //toString

    @Override
    public String toString() {
        return "CabececeraVenta{" + "idCabeceraVenta=" + idCabeceraVenta + ", idRecepcionista=" + idRecepcionista + ", idDoctor=" + idDoctor + ", idPaciente=" + idPaciente + ", fechaCita=" + fechaCita + ", fechaRegistr=" + fechaRegistr + ", costoTotal=" + costoTotal + ", estado=" + estado + '}';
    }
            
}
