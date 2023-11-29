package es.tiernoparla.ramdonaccesfile.modelo;

/*
 * nombre del restaurante, nombre
de la calle, código postal, precio medio por persona y un indicador acerca de
la experiencia (nota del 1 al 10, volvería VS no volvería, 5 estrellas...).
 */
public class Restaurante {
    private String nombre;
    private int cp;
    private double precioMedio;
    private double valoracion;

    public Restaurante(String nombre, int cp, double precioMedio, double valoracion) {
        this.nombre = nombre;
        this.cp = cp;
        this.precioMedio = precioMedio;
        this.valoracion = valoracion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCP() {
        return cp;
    }

    public void setCP(int cp) {
        this.cp = cp;
    }

    public double getPrecioMedio() {
        return precioMedio;
    }

    public void setPrecioMedio(double precioMedio) {
        this.precioMedio = precioMedio;
    }

    public double getValoracion() {
        return valoracion;
    }

    public void setValoracion(double valoracion) {
        this.valoracion = valoracion;
    }
    
    
}
