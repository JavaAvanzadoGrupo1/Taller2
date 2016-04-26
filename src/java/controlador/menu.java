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
import modelo.Asociado;

/**
 *
 * @author LAB.INFORMATICA12
 */
public class menu{
     public static void main(String[] args) {
         
         
         EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("JPAExamples");
         Asociado a = new Asociado();
        a.setNombre("Pepito");  
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
		em.persist(a);
		em.getTransaction().commit();
             
     }
}
