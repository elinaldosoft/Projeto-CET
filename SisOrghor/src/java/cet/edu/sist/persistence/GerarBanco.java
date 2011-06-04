/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cet.edu.sist.persistence;

import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

/**
 *
 * @author bestoff
 */
public class GerarBanco {
    
    public static void main(String[] args){
        
        new SchemaExport(new AnnotationConfiguration().configure()).create(true, true);
    }
    
}
