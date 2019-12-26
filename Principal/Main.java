/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import java.awt.Cursor;
import java.util.Scanner;
import javax.swing.JOptionPane;
import modelo.*;

/**
 *
 * @author oncel
 */
public class Main {

    public static boolean isNumeric(String cadena){
        try {
                Integer.parseInt(cadena);
                return true;
        } catch (NumberFormatException nfe){
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
        String codigo =sc.nextLine();
        System.out.println("");
        Estudiante estudiante;
        if(isNumeric(codigo)){
           estudiante = new Estudiante(Integer.parseInt(codigo), nombre, apellido);
           System.out.println("Se registró el estudiante con nombre: "+estudiante.getNombre()+" apellido: "
                +estudiante.getApellido()+" codigo: "+estudiante.getCodigo());
        System.out.println("Asignar curso:");
        System.out.println(estudiante.asignarCurso(estudiante.getCurso1())?"curso: "+estudiante.getCurso1().getNombreCurso():"");
        System.out.println(estudiante.asignarCurso(estudiante.getCurso2())?"curso: "+estudiante.getCurso2().getNombreCurso():"");
        System.out.println(estudiante.asignarCurso(estudiante.getCurso3())?"curso: "+estudiante.getCurso3().getNombreCurso():"");
        System.out.println(estudiante.asignarCurso(estudiante.getCurso4())?"curso: "+estudiante.getCurso4().getNombreCurso():"");
        System.out.println(estudiante.asignarCurso(estudiante.getCurso5())?"curso: "+estudiante.getCurso5().getNombreCurso():"");
        }else{
            System.out.println("el código tiene que ser numérico");
        }
       
    }
}
