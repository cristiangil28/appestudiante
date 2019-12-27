/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import java.util.Scanner;
import modelo.*;

/**
 *
 * @author oncel
 */
public class Main {

    public static boolean isNumeric(String cadena) {
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Registrar estudiante");
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Apellido: ");
        String apellido = sc.nextLine();
        System.out.print("Codigo: ");
        String codigo = sc.nextLine();
        System.out.println("");
        Estudiante estudiante;
        if (isNumeric(codigo)) {
            estudiante = new Estudiante(Integer.parseInt(codigo), nombre, apellido);
            System.out.println("Se registró el estudiante con nombre: " + estudiante.getNombre() + " apellido: "
                    + estudiante.getApellido() + " codigo: " + estudiante.getCodigo());
            System.out.println("Asignar curso:");
            Curso curso1 = new Curso("6561", "algoritmos", 4);
            Curso curso2 = new Curso("6562", "fundamentos de programación", 3);
            Curso curso3 = new Curso("6563", "base de datos", 4);
            Curso curso4 = new Curso("6564", "redes", 4);
            Curso curso5 = new Curso("6565", "calculo integral", 3);
            System.out.println(estudiante.asignarCurso(curso1) ? "curso: " + estudiante.getCurso1().getNombreCurso() : "el estudiante ya llego al tope de incripcions");
            System.out.println(estudiante.asignarCurso(curso2) ? "curso: " + estudiante.getCurso2().getNombreCurso() : "el estudiante ya llego al tope de incripcions");
            System.out.println(estudiante.asignarCurso(curso3) ? "curso: " + estudiante.getCurso3().getNombreCurso() : "el estudiante ya llego al tope de incripcions");
            System.out.println(estudiante.asignarCurso(curso4) ? "curso: " + estudiante.getCurso4().getNombreCurso() : "el estudiante ya llego al tope de incripcions");
            System.out.println(estudiante.asignarCurso(curso5) ? "curso: " + estudiante.getCurso5().getNombreCurso() : "el estudiante ya llego al tope de incripcions");

            System.out.println("Ingrese el código a buscar del curso");
            String codigoCurso = sc.nextLine();
            if (estudiante.pensumIncluyeCurso(codigoCurso)) {
                System.out.println("El estudiante se encuentra cursando el curso");
            } else {
                System.out.println("El estudiante no está viendo el curso por el momento o el código no corresponde a un curso");
            }
            
            System.out.println("Asignar nota curso:");
            estudiante.getCurso1().setNota(4.5);
            estudiante.getCurso2().setNota(3.4);
            estudiante.getCurso3().setNota(3.8);
            estudiante.getCurso4().setNota(4.0);
            estudiante.getCurso5().setNota(3.2);
            
            System.out.println("Notas del semestre");
            System.out.println("Materia: "+estudiante.getCurso1().getNombreCurso()+" nota: "+estudiante.getCurso1().getNota());
            System.out.println("Materia: "+estudiante.getCurso2().getNombreCurso()+" nota: "+estudiante.getCurso2().getNota());
            System.out.println("Materia: "+estudiante.getCurso3().getNombreCurso()+" nota: "+estudiante.getCurso3().getNota());
            System.out.println("Materia: "+estudiante.getCurso4().getNombreCurso()+" nota: "+estudiante.getCurso4().getNota());
            System.out.println("Materia: "+estudiante.getCurso5().getNombreCurso()+" nota: "+estudiante.getCurso5().getNota());
            
            System.out.println("Promedio: "+estudiante.calcularPromedio());
            System.out.println((estudiante.estudianteEstaPrueba())?"el estudiante no se encuentra en prueba académica":"el estudiante se encuentra en prueba académica");
        } else {
            System.out.println("el código tiene que ser numérico");
        }
    }
}
