package com.luciano.curso.repository;

import com.luciano.curso.entidade.Cliente;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class ClienteRepository {
    
    private final EntityManagerFactory emf;

    public ClienteRepository() {
        emf = Persistence.createEntityManagerFactory("curso-JPA-Hibernate_PU");
    }
    
    public void salvar(Cliente cliente){
        EntityManager em = emf.createEntityManager();
        EntityTransaction etx = em.getTransaction();
        etx.begin();
        
        em.persist(cliente);
        
        etx.commit();
        em.close();      
    }
    
    public Cliente pesquisarPorId(Integer id){
        EntityManager em = emf.createEntityManager();
        Cliente cliente = em.find(Cliente.class, id);
        em.close();
        return cliente;
    }
}
