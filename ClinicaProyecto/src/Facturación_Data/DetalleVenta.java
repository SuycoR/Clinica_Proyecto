package Facturación_Data;

/**
 *
 * @author Tutur
 */
public class DetalleVenta {

    private int idDetalleVenta;
    private int idCabeceraVenta;
    private int idCita;
    private double subtotal;
    private double descuento;
    private double igv;
    private double totalPagar;

    public DetalleVenta() {
        this.idDetalleVenta = 0;
        this.idCabeceraVenta = 0;
        this.idCita = 0;
        this.subtotal = 0.0;
        this.descuento = 0.0;
        this.igv = 0.0;
        this.totalPagar = 0.0;
    }

    public DetalleVenta(int idDetalleVenta, int idCabeceraVenta, int idCita, double subtotal, double descuento, double igv, double totalPagar) {
        this.idDetalleVenta = idDetalleVenta;
        this.idCabeceraVenta = idCabeceraVenta;
        this.idCita = idCita;
        this.subtotal = subtotal;
        this.descuento = descuento;
        this.igv = igv;
        this.totalPagar = totalPagar;
    }

    public int getIdDetalleVenta() {
        return idDetalleVenta;
    }

    public void setIdDetalleVenta(int idDetalleVenta) {
        this.idDetalleVenta = idDetalleVenta;
    }

    public int getIdCabeceraVenta() {
        return idCabeceraVenta;
    }

    public void setIdCabeceraVenta(int idCabeceraVenta) {
        this.idCabeceraVenta = idCabeceraVenta;
    }

    public int getIdCita() {
        return idCita;
    }

    public void setIdCita(int idCita) {
        this.idCita = idCita;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getIgv() {
        return igv;
    }

    public void setIgv(double igv) {
        this.igv = igv;
    }

    public double getTotalPagar() {
        return totalPagar;
    }

    public void setTotalPagar(double totalPagar) {
        this.totalPagar = totalPagar;
    }

    @Override
    public String toString() {
        return "DetalleVenta{" + "idDetalleVenta=" + idDetalleVenta + ", idCabeceraVenta=" + idCabeceraVenta + ", idCita=" + idCita + ", subtotal=" + subtotal + ", descuento=" + descuento + ", igv=" + igv + ", totalPagar=" + totalPagar + '}';
    }

}
