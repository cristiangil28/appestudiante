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
public class Estudiante {
    private int codigo;
    private String nombre;
    private String apellido;
    private Curso curso1;
    private Curso curso2;
    private Curso curso3;
    private Curso curso4;
    private Curso curso5;

    public Estudiante(int codigo, String nombre, String apellido) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso1 = new Curso("6561", "algoritmos", 5);
        this.curso2 = new Curso("6562", "fundamentos de programación", 5);
        this.curso3 = new Curso("6563", "base de datos", 5);
        this.curso4 = new Curso("6564", "redes", 5);
        this.curso5 = new Curso("6565", "calculo integral", 5);
    }
    
    public boolean asignarCurso(Curso curso){
       
        return curso != null;
        
    }
    
    public double calcularPromedio(){
        return 0.0;
    }
    public boolean pensumIncluyeCurso(String codigoCurso){
        return false;
    }
    public boolean estudianteEstaPrueba(){
        return false;
    }
    public boolean tieneCursosCompletos(String codigoCurso){
        return false;
    }
    public Curso buscarCurso(String codigoCurso){
        return null;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Curso getCurso1() {
        return curso1;
    }

    public Curso getCurso2() {
        return curso2;
    }

    public Curso getCurso3() {
        return curso3;
    }

    public Curso getCurso4() {
        return curso4;
    }

    public Curso getCurso5() {
        return curso5;
    }

}
