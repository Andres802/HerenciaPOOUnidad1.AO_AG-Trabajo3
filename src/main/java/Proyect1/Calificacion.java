/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyect1;

/**
 *
 * @author ochoa
 */
public class Calificacion {

    private int notas;
    Asignatura materias;
    Estudiante estudiants;

    public String CalificacionNotas() {
        var retorno = " ";

        if (this.getNotas() > 70 && this.getNotas() < 100) {

            retorno = "Aprovado";

        } else if (this.getNotas() < 70 && this.getNotas() > 30) {

            retorno = "reprobado";

        } else if (this.getNotas() < 30 && this.getNotas() > 0) {

            retorno = "reprobado tendra que repetir la materia";
        } else {

            retorno = "no ingreso bien las calificacion";
        }

        return retorno;
    }

    public String mostrarCalificacion() {

        return " El estudiante " + this.estudiants.getNombre() + " con la materia de " + this.materias.getMaterias() + " fue " + this.CalificacionNotas();
    }

    public int getNotas() {
        return notas;
    }

    public void setNotas(int notas) {
        this.notas = notas;
    }

    public Asignatura getMaterias() {
        return materias;
    }

    public void setMaterias(Asignatura materias) {
        this.materias = materias;
    }

    public Estudiante getEstudiants() {
        return estudiants;
    }

    public void setEstudiants(Estudiante estudiants) {
        this.estudiants = estudiants;
    }
    

}
