/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.Serializable;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import modelo.Asociado;

/**
 *
 * @author LAB.INFORMATICA12
 */

public class AsociadoAPP{
    
    public String nombre;
    @PersistenceContext
    private static EntityManagerFactory emf;
    private static EntityManager em;
    
    public Asociado crearAsociado(String asociado){
        Asociado a = new Asociado();
        a.setNombre(asociado);
        em.getTransaction().begin();
        em.persist(a);
        return a;
    }
    
    public AsociadoAPP buscarAsociado(String nombre){
        return null;
    }
}