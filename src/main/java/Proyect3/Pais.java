/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyect3;

/**
 *
 * @author ochoa
 */
public class Pais {
    
    private String nombrePasi;
    private double NumerosPersonas;
    private String idioma;

    public Pais(String nombrePasi, double NumerosPersonas, String idioma) {
        this.nombrePasi = nombrePasi;
        this.NumerosPersonas = NumerosPersonas;
        this.idioma = idioma;
    }
    
    public String mostrarInfoPais(){
        
        var retorno = "";
        retorno += "Pais: " + this.getNombrePasi();
        retorno += "\nIdioma: " + this.getIdioma();
        retorno += "\nHabitantes: " + this.getNumerosPersonas();
        retorno += "\nContinente: " + this.getContinente() ;
        return retorno;
        
    }
     public String getContinente() {

        var retorno = "";
        var continente = "";
        continente= this.getNombrePasi().substring(0, 7);

        switch (continente) {
            case "Ecuador":
                retorno = "Sudamerica";
                break;
            case "EEUU":
                retorno = "Latinoamerica";
                break;
            case "Francia":
                retorno = "Europa";
                break;
            case "Senegal":
                retorno = "Sudafrica";
                break;

            default:
                retorno = "no definido";

        }

        return retorno;
    }
    

    public String getNombrePasi() {
        return nombrePasi;
    }

    public void setNombrePasi(String nombrePasi) {
        this.nombrePasi = nombrePasi;
    }

    public double getNumerosPersonas() {
        return NumerosPersonas;
    }

    public void setNumerosPersonas(double NumerosPersonas) {
        this.NumerosPersonas = NumerosPersonas;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }
    
    
}
