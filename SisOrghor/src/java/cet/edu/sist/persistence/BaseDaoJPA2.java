/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cet.edu.sist.persistence;

import cet.edu.sist.dominio.BaseEntity;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author bestoff
 */
public abstract class BaseDaoJPA2<T extends BaseEntity> implements BaseDao<T> {


    protected abstract Class<T> getClassDominio();


    @Override
    public void salvar(T entity) {

        EntityManager em = new JPAUtil().getEntityManager();

        if (entity.isPersistence()) {
            
            em.getTransaction().begin();
            em.merge(entity);
            em.getTransaction().commit();
            
        } else {
            
            em.getTransaction().begin();
            em.persist(entity);
            em.getTransaction().commit();
        }

    }
    
}
