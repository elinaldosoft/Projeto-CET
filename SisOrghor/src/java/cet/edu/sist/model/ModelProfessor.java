/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cet.edu.sist.model;

import cet.edu.sist.dominio.Professor;
import cet.edu.sist.persistence.DaoProfessor;

/**
 *
 * @author Nayebe
 */
public class ModelProfessor {
    
    private DaoProfessor daoProfessor = new DaoProfessor();

    public ModelProfessor() {
    }
    
    public void salvar(Professor professor){
        daoProfessor.salvar(professor);
    }
    
}
