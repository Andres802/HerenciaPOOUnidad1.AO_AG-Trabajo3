/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyect3;

/**
 *
 * @author ochoa
 */
public class Provincia {
    
    private String nombreProvincia;
    private Ciudad capitalProvincia;
    private double cantidadCanton;
    private Pais pais;

    public Provincia(String nombreProvincia, Ciudad capitalProvincia, double cantidadCanton, Pais pais) {
        
        this.nombreProvincia = nombreProvincia;
        this.capitalProvincia = capitalProvincia;
        this.cantidadCanton = cantidadCanton;
        this.pais =pais;
    }
    
    public String mostrarInfoProvincia(){
        var retorno = "";
        retorno += "Pais: " + this.pais.getNombrePasi();
        retorno += "\nProvincia: " + this.getNombreProvincia();
        retorno +="\nCapital de la provincia: " + this.capitalProvincia.getNombreCiudad();
        retorno +="\nHabitantes: " + this.getCantidadCanton();
        return retorno;
    }

    public String getNombreProvincia() {
        return nombreProvincia;
    }

    public void setNombreProvincia(String nombreProvincia) {
        this.nombreProvincia = nombreProvincia;
    }

    public double getCantidadCanton() {
        return cantidadCanton;
    }

    public void setCantidadCanton(double cantidadCanton) {
        this.cantidadCanton = cantidadCanton;
    }

    public Ciudad getCapitalProvincia() {
        return capitalProvincia;
    }

    public void setCapitalProvincia(Ciudad capitalProvincia) {
        this.capitalProvincia = capitalProvincia;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }
    
    
}

