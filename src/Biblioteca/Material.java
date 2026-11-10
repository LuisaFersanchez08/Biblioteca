package Biblioteca;

public abstract class Material implements Catalogable {

    private String  codigo;
    private  String titulo;
    private int anio;
    private boolean disponible;

// Constructor

    public Material(String codigo, String titulo, int anio, boolean disponible) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.disponible = disponible;
        this.anio = anio;
    }

    //Getters
@Override
    public String getCodigo() {
        return codigo;
    }


    public String getTitulo(){
        return titulo;
    }

    public int getAnio(){
        return anio;
    }

    public boolean isDisponible(){
        return disponible;
    }

    // GetTipo abstracto

    public abstract String getTipo();

    // metodo concreto

    public void mostrarInfo() {

        if (disponible == true) {
            System.out.println("[" + getTipo() + "] " + titulo + " (" + anio + ") - disponible");
        } else {
            System.out.println("[" + getTipo() + "] " + titulo + " (" + anio + ") - prestado");
        }
    }

}
