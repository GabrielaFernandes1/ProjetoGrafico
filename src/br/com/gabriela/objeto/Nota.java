/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gabriela.objeto;

/**
 *
 * @author SATC
 */
public class Nota {
   private String disciplina;
   private float nota; 

    public Nota(String disciplina, float nota) {
        this.disciplina = disciplina;
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Nota{" + "disciplina=" + disciplina + ", nota=" + nota + '}';
    }
   
   
    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    
   
   
    
    
}
