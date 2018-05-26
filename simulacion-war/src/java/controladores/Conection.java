/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
 */
package  controladores;

import entidad.user.User;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author usuario
 */
public class Conection {

    public User user = null;
    EntityManagerFactory emf;
    EntityManager em;

    public Conection() {
        emf = Persistence.createEntityManagerFactory("simulacion-warPU");
        em = emf.createEntityManager();
        //em.getTransaction().begin();
    }

    public boolean loginControl(String email, String password) {
        try {
            user = em.createNamedQuery("User.ingresar", User.class).setParameter("email", email).setParameter("password", password).getSingleResult();
            if (user != null) {
                return true;
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }
}
