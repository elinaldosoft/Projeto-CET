/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cet.edu.sist.persistence;

import cet.edu.sist.dominio.BaseEntity;

/**
 *
 * @author bestoff
 */

public interface BaseDao<T extends BaseEntity> {
    
    void salvar(T entity);
}
