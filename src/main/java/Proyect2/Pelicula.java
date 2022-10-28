/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyect2;

/**
 *
 * @author ochoa
 */
public class Pelicula {

    private String nombrePelicula;
    private int yearCreado;
    private Personaje protagonista;
    private String nombreCreador;
    private float duracion;

    public Pelicula(String nombrePelicula, int yearCreado, String nombreCreador, float duracion) {
        this.nombrePelicula = nombrePelicula;
        this.yearCreado = yearCreado;
        this.nombreCreador = nombreCreador;
        this.duracion = duracion;
    }

    

    public String getNombrePelicula() {
        return nombrePelicula;
    }

    public void setNombrePelicula(String nombrePelicula) {
        this.nombrePelicula = nombrePelicula;
    }

    public int getYearCreado() {
        return yearCreado;
    }

    public void setYearCreado(int yearCreado) {
        this.yearCreado = yearCreado;
    }

    public String getNombreCreador() {
        return nombreCreador;
    }

    public void setNombreCreador(String nombreCreador) {
        this.nombreCreador = nombreCreador;
    }

    

    

    public float getDuracion() {
        return duracion;
    }

    public void setDuracion(float duracion) {
        this.duracion = duracion;
    }

    public Personaje getProtagonista() {
        return protagonista;
    }

    public void setProtagonista(Personaje protagonista) {
        this.protagonista = protagonista;
    }
    

    public String peliculaViejaNueva(int yearActual) {

        var retorno = "Antiguo o Moderno";

        if (this.getYearCreado() > 2018 && this.getYearCreado() < yearActual) {
            retorno = "Es una pelicula Nueva";

        } else {
            retorno = "Es una pelicula antigua";
        }

        return retorno;
    }

    public String mostrarInfoPelicula() {

        return "La pelicula se llama " + this.getNombrePelicula() + " la duracion de la pelicula es "+this.getDuracion() 
                + " hora, fue creado en el " + this.getYearCreado()
                + " el creador de la pelicula se llama " + this.getNombreCreador() + " y el protagonista de la pelicula es "+ this.protagonista.getNombrePersonaje();
    }

}
