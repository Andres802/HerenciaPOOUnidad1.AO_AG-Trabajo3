/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyect1;

/**
 *
 * @author ochoa
 */
public class Asignatura {

    private String materias;
    private String Institucional;
    Estudiante estudients;

    public String mostrarInfoAsignatura() {

        return " El estudiante " + this.estudients.getNombre() + " estudia en " + this.getInstitucional() + " con la materia de " + this.getMaterias();
    }

    public String getMaterias() {
        return materias;
    }

    public void setMaterias(String materias) {
        this.materias = materias;
    }

    public String getInstitucional() {
        return Institucional;
    }

    public void setInstitucional(String Institucional) {
        this.Institucional = Institucional;
    }

    public Estudiante getEstudients() {
        return estudients;
    }

    public void setEstudients(Estudiante estudients) {
        this.estudients = estudients;
    }
    
    
}
