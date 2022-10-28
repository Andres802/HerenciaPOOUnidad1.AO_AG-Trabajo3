/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyect2;

/**
 *
 * @author ochoa
 */
public class Personaje {
    
    private String nombrePersonaje;
    Pelicula cine;
    Actor nombreA;

    public Personaje(String nombrePersonaje, Pelicula pelicula) {
        this.nombrePersonaje = nombrePersonaje;
       
    }
    

    public String getNombrePersonaje() {
        return nombrePersonaje;
    }

    public void setNombrePersonaje(String nombrePersonaje) {
        this.nombrePersonaje = nombrePersonaje;
    }

    public Pelicula getCine() {
        return cine;
    }

    public void setCine(Pelicula cine) {
        this.cine = cine;
    }

    public Actor getNombreA() {
        return nombreA;
    }

    public void setNombreA(Actor nombreA) {
        this.nombreA = nombreA;
    }
    
    
    
}
