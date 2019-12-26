/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author oncel
 */
public class Curso {
    
    private String codigoCurso;
    private String nombreCurso;
    private int creditos;
    private double nota;
    
    public Curso(String cod, String non, int cred){
        this.codigoCurso = cod;
        this.nombreCurso = non;
        this.creditos = cred;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public int getCreditos() {
        return creditos;
    }

    public double getNota() {
        return nota;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
    public String getDescripcion(){
        return "";
    }
    public boolean estaCalificado(){
        return false;
    }

    public String getCodigoCurso() {
        return codigoCurso;
    }
    
}
