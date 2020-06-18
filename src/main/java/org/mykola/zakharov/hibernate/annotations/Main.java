package org.mykola.zakharov.hibernate.annotations;


import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.hibernate.SessionFactory;
import org.mykola.zakharov.hibernate.annotations.entity.Swimmer;
import org.w3c.dom.ls.LSOutput;

import javax.persistence.EntityManager;

public class Main {
    public static void main(String[] args) {
        SessionFactory sessionFactory =
                HibernateFactory.getSessionFactory();
        EntityManager em = sessionFactory.createEntityManager();

        Swimmer swimmer = new Swimmer();
        swimmer.setLastName("Zakharov");
        swimmer.setAge(23);
        swimmer.setRecordMeters(3570);
        em.getTransaction().begin();
        em.persist(swimmer);
        em.getTransaction().commit();
        Swimmer swimmer1 = em.find(Swimmer.class, 1L);
        System.out.println(swimmer1);

        em.close();
        sessionFactory.close();
    }
}
