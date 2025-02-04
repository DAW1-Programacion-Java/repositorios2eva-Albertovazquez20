package Tema4.ejercicio13;

public class Producto {
    private int codigo;
    private String nombre;
    private String tipo;
    private double precioVenta;
    private double precioCompra;
    private int unidades;

    public Producto(int codigo, String nombre, String tipo, double precioVenta, double precioCompra, int unidades) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.tipo = tipo;
        this.precioVenta = precioVenta;
        this.precioCompra = precioCompra;
        this.unidades = unidades;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "codigo=" + codigo +
                ", nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                ", precioVenta=" + precioVenta +
                ", precioCompra=" + precioCompra +
                ", unidades=" + unidades +
                '}';
    }
}
