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
    private int yearCreador;
    private Provincia provincia;

    public Ciudad(String nombreCiudad, String creadoCuidad, int yearCreador) {
        this.nombreCiudad = nombreCiudad;
        this.creadoCuidad = creadoCuidad;
        this.yearCreador = yearCreador;
       
    }
    
    public String mostrarInfoCiudad(){
        var retorno = "";
        
        retorno += "Provincia: " + this.provincia.getNombreProvincia();
        retorno += "\nCiudad: " + this.getNombreCiudad();
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

    public int getYearCreador() {
        return yearCreador;
    }

    public void setHabitantes(int yearCreador) {
        this.yearCreador = yearCreador;
    }

    public Provincia getProvincia() {
        return provincia;
    }

    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }
    
    
}
