/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyect2;

/**
 *
 * @author ochoa
 */
public class Actor {
    
    private String nombreActor;
    private int inicioPelicula;
    private int edad;
    Personaje interpret;
    Pelicula cine;

    public Actor(String nombreActor, int inicioPelicula, int edad, Personaje interpret, Pelicula cine) {
        this.nombreActor = nombreActor;
        this.inicioPelicula = inicioPelicula;
        this.edad = edad;
        this.interpret = interpret;
        this.cine = cine;
    }

   

    
    public String getNombreActor() {
        return nombreActor;
    }

    public void setNombreActor(String nombreActor) {
        this.nombreActor = nombreActor;
    }

    public int getInicioPelicula() {
        return inicioPelicula;
    }

    public void setInicioPelicula(int inicioPelicula) {
        this.inicioPelicula = inicioPelicula;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Pelicula getCine() {
        return cine;
    }

    public void setCine(Pelicula cine) {
        this.cine = cine;
    }

    public Personaje getInterpret() {
        return interpret;
    }

    public void setInterpret(Personaje interpret) {
        this.interpret = interpret;
    }
    
    public String mostrarInfo(){
        
        return " El actor de la pelicula se llama " + this.getNombreActor() + " tiene "+  this.getEdad() + " year que interpreta el personaje de " 
                + this.interpret.getNombrePersonaje() + " donde protagoniza en la pelicula de " + this.cine.getNombrePelicula() + " su actuacion comenzo en el year "
                + this.getInicioPelicula();
        
    }
    
}
