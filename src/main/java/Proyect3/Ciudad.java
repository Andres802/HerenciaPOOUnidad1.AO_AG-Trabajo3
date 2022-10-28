/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyect3;

/**
 *
 * @author ochoa
 */
public class Ciudad {
    
    private String nombreCiudad;
    private String creadoCuidad;
    private double yearCreador;

    public Ciudad(String nombreCiudad, String creadoCuidad, double yearCreador) {
        this.nombreCiudad = nombreCiudad;
        this.creadoCuidad = creadoCuidad;
        this.yearCreador = yearCreador;
    }
    
    public String mostrarInfoCiudad(){
        var retorno = "";
        
        retorno += "Ciudad: " + this.getNombreCiudad();
        retorno += "\ncreador de la ciudad:" + this.getCreadoCuidad();
        retorno += "\nYear creado: "+ this.getYearCreador();
        
        return retorno;
        
    }

    public String getNombreCiudad() {
        return nombreCiudad;
    }

    public void setNombreCiudad(String nombreCiudad) {
        this.nombreCiudad = nombreCiudad;
    }

    public String getCreadoCuidad() {
        return creadoCuidad;
    }

    public void setCreadoCuidad(String creadoCuidad) {
        this.creadoCuidad = creadoCuidad;
    }

    public double getYearCreador() {
        return yearCreador;
    }

    public void setHabitantes(double habitantes) {
        this.yearCreador = habitantes;
    }
    
    
}
