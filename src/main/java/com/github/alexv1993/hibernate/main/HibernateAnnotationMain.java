package com.github.alexv1993.hibernate.main;

import com.github.alexv1993.hibernate.model.Employee1;
import com.github.alexv1993.hibernate.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.Date;

/**
 * Created by vendin on 10.10.2017.
 */
public class HibernateAnnotationMain {

    public static void main(String[] args) {
        Employee1 emp = new Employee1();
        emp.setNAME("David");
        emp.setROLE("Developer");
        emp.setINSERT_TIME(new Date());

        //Get Session
        SessionFactory sessionFactory = HibernateUtil.getSessionAnnotationFactory();
        Session session = sessionFactory.getCurrentSession();

        try {
            //start transaction
            session.beginTransaction();
            //Save the Model object
            session.save(emp);
            //Commit transaction
            session.getTransaction().commit();
            System.out.println("Employee ID=" + emp.getID());
        } catch (Exception ex) {
            session.getTransaction().rollback();
            ex.printStackTrace();
        } finally {
            //terminate session factory, otherwise program won't end
            sessionFactory.close();
        }

    }

}
