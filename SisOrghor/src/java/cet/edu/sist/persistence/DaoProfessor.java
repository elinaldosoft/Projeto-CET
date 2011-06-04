/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cet.edu.sist.persistence;

import cet.edu.sist.dominio.Professor;

/**
 *
 * @author Nayebe
 */
public class DaoProfessor extends BaseDaoJPA2<Professor> implements BaseDao<Professor> {
    
    @Override
    protected Class<Professor> getClassDominio(){
        
        return Professor.class;
    }
    
}
