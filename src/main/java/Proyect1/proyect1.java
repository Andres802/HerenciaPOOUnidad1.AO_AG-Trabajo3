/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package Proyect1;

/**
 *
 * @author ochoa
 */
public class proyect1 {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        // -------------------- Estudiantes -------------------- //
        var est = new Estudiante();
        est.setNombre("Andres");
        est.setEdad (15);

        var est1 = new Estudiante();
        est1.setNombre ("Luis");
        est1.setEdad (18);

        System.out.println("");
        System.out.println("-------------------- Asignatura --------------------");
        var asig = new Asignatura();
        asig.setInstitucional("Tecnico Salesiano");
        asig.setMaterias ("Matematicas");
        asig.setEstudients(est);
        System.out.println("1." + asig.mostrarInfoAsignatura());

        var asig1 = new Asignatura();
        asig1.setInstitucional("Providencia");
        asig1.setMaterias ("Historia");
        asig1.setEstudients(est1);
        System.out.println("2." + asig1.mostrarInfoAsignatura());

        System.out.println("");
        System.out.println("-------------------- Calificaciones --------------------");
        var clase = new Calificacion();
        clase.setNotas (50);
        clase.setMaterias (asig);
        clase.setEstudiants( est);
        System.out.println("1." + clase.mostrarCalificacion());

        var clase1 = new Calificacion();
        clase1.setNotas (80);
        clase1.setMaterias(asig1);
        clase1.setEstudiants (est1);
        System.out.println("2." + clase1.mostrarCalificacion());

        System.out.println("");
        System.out.println("-------------------- Informacion del Estudiante y su notas --------------------");
        System.out.println("----- Calificacion del primer Estudiante ----- ");
        est.setMateria(asig);
        est.setNota (clase);
        System.out.println("" + est.mostrarInfo());
        System.out.println("su materia fue " + clase.CalificacionNotas());

        System.out.println("----- Calificacion del segundo Estudiante ----- ");
        est1.setNota(clase1);
        est1.setMateria (asig1);
        System.out.println("" + est1.mostrarInfo());
        System.out.println("su materia fue " + clase1.CalificacionNotas());

    }
}
