package Tema4.ejercicio4;
import java.util.ArrayList;

public class DvdCine {
    private String titulo;
    private String director;
    private String productora;
    private ArrayList <String> actoresPrincipales; // Usamos un array para múltiples actores
    private String genero;
    private String resumen;
    private int duracion; // Duración en minutos


    public DvdCine(String titulo, String director, String productora, ArrayList<String> actoresPrincipales, String genero, String resumen, int duracion) {
        this.titulo = titulo;
        this.director = director;
        this.productora = productora;
        this.actoresPrincipales = actoresPrincipales;
        this.genero = genero;
        this.resumen = resumen;
        this.duracion = duracion;
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getProductora() {
        return productora;
    }

    public void setProductora(String productora) {
        this.productora = productora;
    }

    public ArrayList<String> getActoresPrincipales() {
        return actoresPrincipales;
    }

    public void setActoresPrincipales(ArrayList<String> actoresPrincipales) {
        this.actoresPrincipales = actoresPrincipales;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public boolean esThriller(){
        return genero.equalsIgnoreCase("Thriller");

    }
    public boolean mismaProductora(DvdCine otroDvd){
        return this.productora.equalsIgnoreCase(otroDvd.getProductora());
    }

    @Override
    public String toString() {
        return "DvdCine{" +
                "titulo='" + titulo + '\'' +
                ", director='" + director + '\'' +
                ", productora='" + productora + '\'' +
                ", actoresPrincipales=" + String.join(", ", actoresPrincipales) +
                ", genero='" + genero + '\'' +
                ", resumen='" + resumen + '\'' +
                ", duracion=" + duracion + " minutos" +
                '}';
    }
}
