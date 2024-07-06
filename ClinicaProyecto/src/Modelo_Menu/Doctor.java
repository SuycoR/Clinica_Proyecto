package Modelo_Menu;

/**
 *
 * @author Cuenca
 */
public class Doctor {

    //Atributos
    private int idDoctor;
    private String nombre;
    private String apellido;
    private int dni;
    private String direccion;
    private String correo;
    private int celular;
    private String usuario;
    private String contrasena;
    private String costo;
    private int lunes;
    private int martes;
    private int miercoles;
    private int jueves;
    private int viernes;
    private int sabado;

    //Constructor
    public Doctor() {
        this.idDoctor = 0;
        this.nombre = "";
        this.apellido = "";
        this.dni = 0;
        this.direccion = "";
        this.correo = "";
        this.celular = 0;
        this.usuario = "";
        this.contrasena = "";
        this.costo = "";
        this.lunes = 0;
        this.martes = 0;
        this.miercoles = 0;
        this.jueves = 0;
        this.viernes = 0;
        this.sabado = 0;
    }
    //Constructor sobrecargado

    public Doctor(int idDoctor, String nombre, String apellido, int dni, String direccion, String correo, int celular, String usuario, String contrasena, String costo, int lunes, int martes, int miercoles, int jueves, int viernes, int sabado) {
        this.idDoctor = idDoctor;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.direccion = direccion;
        this.correo = correo;
        this.celular = celular;
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.costo = costo;
        this.lunes = lunes;
        this.martes = martes;
        this.miercoles = miercoles;
        this.jueves = jueves;
        this.viernes = viernes;
        this.sabado = sabado;
    }

    //Getters y Setters
    public int getIdDoctor() {
        return idDoctor;
    }

    public void setIdDoctor(int idDoctor) {
        this.idDoctor = idDoctor;
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

    public String getCosto() {
        return costo;
    }

    public void setCosto(String costo) {
        this.costo = costo;
    }

    public int getLunes() {
        return lunes;
    }

    public void setLunes(int lunes) {
        this.lunes = lunes;
    }

    public int getMartes() {
        return martes;
    }

    public void setMartes(int martes) {
        this.martes = martes;
    }

    public int getMiercoles() {
        return miercoles;
    }

    public void setMiercoles(int miercoles) {
        this.miercoles = miercoles;
    }

    public int getJueves() {
        return jueves;
    }

    public void setJueves(int jueves) {
        this.jueves = jueves;
    }

    public int getViernes() {
        return viernes;
    }

    public void setViernes(int viernes) {
        this.viernes = viernes;
    }

    public int getSabado() {
        return sabado;
    }

    public void setSabado(int sabado) {
        this.sabado = sabado;
    }

}
