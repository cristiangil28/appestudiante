/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import java.util.Scanner;
import javax.swing.JOptionPane;
import modelo.Estudiante;

/**
 *
 * @author oncel
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Registrar estudiante");
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Apellido: ");
        String apellido = sc.nextLine();
        System.out.print("Codigo: ");
        int codigo =sc.nextInt();
        System.out.println("");
        Estudiante estudiante = new Estudiante(codigo, nombre, apellido);
        System.out.println("Se registró el estudiante "+estudiante.getNombre()+" apellido: "
                +estudiante.getApellido()+" codigo: "+estudiante.getCodigo());
        sc.close();
    
    }
}
