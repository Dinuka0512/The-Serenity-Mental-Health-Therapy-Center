package org.example.config;

import org.example.entities.Patient;
import org.example.entities.Payment;
import org.example.entities.TherapyProgram;
import org.example.entities.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FactoryCongig {
    public static FactoryCongig factoryCongig;
    public SessionFactory sessionFactory;

    private FactoryCongig(){
        Configuration configuration = new Configuration().configure("hibernate.cfg.xml");

        //Annotated Classes
        configuration.addAnnotatedClass(User.class);
        configuration.addAnnotatedClass(Patient.class);
        configuration.addAnnotatedClass(Payment.class);
        configuration.addAnnotatedClass(TherapyProgram.class);

        sessionFactory = configuration.buildSessionFactory();
    }

    public static FactoryCongig getInstance(){
        return (factoryCongig == null)? factoryCongig = new FactoryCongig(): factoryCongig;
    }

    public Session getSession(){
        return sessionFactory.openSession();
    }
}
