/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cet.edu.sist.controller;

import cet.edu.sist.dominio.Endereco;
import cet.edu.sist.dominio.Professor;
import cet.edu.sist.model.ModelProfessor;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Nayebe
 */
@ManagedBean(name="contrprof")
@SessionScoped
public class ControllerProfessor {
    
    private ModelProfessor modelProfessor = new ModelProfessor();
    private Professor professor = new Professor();
    private Endereco endereco = new Endereco();
    private List<Endereco> enderecos = new ArrayList<Endereco>();

    public ControllerProfessor() {
    }
    
    public void cadastrar(){
        
        professor.setEndereco(enderecos);
        modelProfessor.salvar(professor);
        
        professor = new Professor();
        enderecos = new ArrayList<Endereco>();
    }
    
    public void addEndereco(){
        
        enderecos.add(endereco);
        endereco = new Endereco();
        
    }

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }
    
    
    
    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
    
}
