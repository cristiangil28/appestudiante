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
    }
    
    public boolean asignarCurso(Curso curso){
       int contador = 0;
        if (curso1 == null) {
            curso1 = new Curso(curso.getCodigoCurso(), curso.getNombreCurso(), curso.getCreditos());
            contador++;
            return true;
        }
        if (curso2 == null) {
            curso2 = new Curso(curso.getCodigoCurso(), curso.getNombreCurso(), curso.getCreditos());
            contador++;
            return true;
        }
        if (curso3 == null) {
            curso3 = new Curso(curso.getCodigoCurso(), curso.getNombreCurso(), curso.getCreditos());
            contador++;
            return true;
        }
        if (curso4 == null) {
            curso4 = new Curso(curso.getCodigoCurso(), curso.getNombreCurso(), curso.getCreditos());
            contador++;
            return true;
        }
        if (curso5 == null) {
            curso5 = new Curso(curso.getCodigoCurso(), curso.getNombreCurso(), curso.getCreditos());
            contador++;
            return true;
        }
        return false;
    }
    
    public double calcularPromedio(){
        return 0.0;
    }
    public boolean pensumIncluyeCurso(String codigoCurso){
        if(this.buscarCurso(codigoCurso) != null){
            return true;
        }
        return false;
    }
    public boolean estudianteEstaPrueba(){
        return false;
    }
    public boolean tieneCursosCompletos(String codigoCurso){
        
        return false;
    }
    public Curso buscarCurso(String codigoCurso){
        if (this.getCurso1().getCodigoCurso().equals(codigoCurso)) {
            return this.getCurso1();
            
        }
        if (this.getCurso2().getCodigoCurso().equals(codigoCurso)) {
            return this.getCurso2();
            
        }
        if (this.getCurso3().getCodigoCurso().equals(codigoCurso)) {
            return this.getCurso3();
            
        }
        if (this.getCurso4().getCodigoCurso().equals(codigoCurso)) {
            return this.getCurso4();
            
        }
        if (this.getCurso5().getCodigoCurso().equals(codigoCurso)) {
            return this.getCurso5();
            
        }
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
