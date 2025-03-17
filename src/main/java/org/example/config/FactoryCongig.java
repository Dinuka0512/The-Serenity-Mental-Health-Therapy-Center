package org.example.config;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FactoryCongig {
    public static FactoryCongig factoryCongig;
    public SessionFactory sessionFactory;

    private FactoryCongig(){
        Configuration configuration = new Configuration().configure("hibernate.cfg.xml");

        //Annotated Classes

        sessionFactory = configuration.buildSessionFactory();
    }

    public static FactoryCongig getInstance(){
        return (factoryCongig == null)? factoryCongig = new FactoryCongig(): factoryCongig;
    }

    public Session getSession(){
        return sessionFactory.openSession();
    }
}
