/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo_Menu;

/**
 *
 * @author PC
 */
public class Paciente {

    private int idPaciente;
    private String nombre;
    private String apellido;
    private int dni;
    private String direccion;
    private String correo;
    private int celular;
    private String nombreContacto;
    private int celularEmergencia;
    private String usuario;
    private String contrasena;

    public Paciente(){
        this.idPaciente = 0;
        this.nombre = "";
        this.apellido = "";
        this.dni = 0;
        this.direccion = "";
        this.correo = "";
        this.celular = 0;
        this.nombreContacto = "";
        this.celularEmergencia = 0;
        this.usuario = "";
        this.contrasena = "";
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public String getNombreContacto() {
        return nombreContacto;
    }

    public void setNombreContacto(String nombreContacto) {
        this.nombreContacto = nombreContacto;
    }

    public int getCelularEmergencia() {
        return celularEmergencia;
    }

    public void setCelularEmergencia(int celularEmergencia) {
        this.celularEmergencia = celularEmergencia;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    
}
