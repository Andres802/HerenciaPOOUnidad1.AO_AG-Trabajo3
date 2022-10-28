/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyect1;

/**
 *
 * @author ochoa
 */
public class Estudiante {

    private String nombre;
    private int edad;
    Calificacion nota;
    Asignatura materia;

    public String mostrarInfo() {

        return "- El estudiante se llama " + this.getNombre() + " tiene " + this.getEdad() + " años, la materia es " + 
                this.materia.getMaterias() + " con una nota de " + this.nota.getNotas();

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Calificacion getNota() {
        return nota;
    }

    public void setNota(Calificacion nota) {
        this.nota = nota;
    }

    public Asignatura getMateria() {
        return materia;
    }

    public void setMateria(Asignatura materia) {
        this.materia = materia;
    }
    
}
