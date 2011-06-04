/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cet.edu.sist.dominio;

import javax.persistence.Entity;

/**
 *
 * @author bestoff
 */
@Entity
public class Cursos extends BaseEntity {
    
    private String nomeCurso;

    public Cursos() {
  
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }
    
    
    
    
}
