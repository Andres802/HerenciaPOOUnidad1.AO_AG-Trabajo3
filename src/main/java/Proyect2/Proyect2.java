/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyect2;

/**
 *
 * @author ochoa
 */
public class Proyect2 {
    
    public static void main(String[] args) {
        
       
        
        var pelicula = new Pelicula("Spider-Man",2020,"Stan Lee",1);
        
        var personaje = new Personaje("Peter Paker", pelicula);
        
        var actor = new Actor("Tom Holland",2010,15,pelicula);
         
        //---------------------------------------------------------------------------//
        
        var pelicula1 = new Pelicula("Rapidos y Furiosos",2001,"Gary Scott",2);
        
        var personaje1 = new Personaje("Dominic Toretto", pelicula1);
        
        var actor1 = new Actor("Vin Diesel",1998,40,pelicula1);
        //------------------------------------------------------------------------------//
        
        var pelicula2 = new Pelicula("Guason",2019,"Bill Camp",3);
        
        var personaje2 = new Personaje("Joker", pelicula2);
        
        var actor2 = new Actor("Todd Phillips",1978,50,pelicula2);
        
        //----------------------------------------------------------------------------//
        
        pelicula.setProtagonista(personaje);
        personaje.setCine(pelicula);
        personaje.setNombreA(actor);
        
         pelicula1.setProtagonista(personaje1);
        personaje1.setCine(pelicula1);
        personaje1.setNombreA(actor1);
        
         pelicula2.setProtagonista(personaje2);
        personaje2.setCine(pelicula2);
        personaje2.setNombreA(actor2);
        
        
        //--------------------------------------------------------------------------//
         System.out.println("-------------------- Actores --------------------");
         System.out.println("Primer Actor");
         System.out.println("" + actor.mostrarInfo());
         System.out.println("Segundo Actor");
         System.out.println("" + actor1.mostrarInfo());
         System.out.println("Tercer Actor");
         System.out.println("" + actor2.mostrarInfo());
        
        System.out.println("-------------------- Peliculas --------------------");
        System.out.println("Primera Pelicula");
        System.out.println("" + pelicula.mostrarInfoPelicula());
        System.out.println("" + pelicula.peliculaViejaNueva(2020));
        System.out.println("Segunda Pelicula");
        System.out.println("" + pelicula1.mostrarInfoPelicula());
        System.out.println("" + pelicula1.peliculaViejaNueva(2021));
        System.out.println("Tercera Pelicula");
        System.out.println("" + pelicula2.mostrarInfoPelicula());
        System.out.println("" + pelicula2.peliculaViejaNueva(2022));
    }
    
}
