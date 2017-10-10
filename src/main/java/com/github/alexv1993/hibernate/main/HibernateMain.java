package com.github.alexv1993.hibernate.main;

import com.github.alexv1993.hibernate.model.Employee;
import com.github.alexv1993.hibernate.util.HibernateUtil;
import org.hibernate.Session;

import java.util.Date;

/**
 * Created by vendin on 10.10.2017.
 */
public class HibernateMain {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setNAME("Pankaj");
        emp.setROLE("CEO");
        emp.setINSERT_TIME(new Date());

        //Get Session
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        //start transaction
        session.beginTransaction();
        //Save the Model object
        session.save(emp);
        //Commit transaction
        session.getTransaction().commit();
        System.out.println("Employee ID=" + emp.getID());

        //terminate session factory, otherwise program won't end
        HibernateUtil.getSessionFactory().close();
    }
}
