package com.cetpa;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        SessionFactory factory=new Configuration().configure().buildSessionFactory();
        Session session=factory.openSession();
        Transaction tran=session.getTransaction();
        tran.begin();
        session.persist(new Person(101,"Amit Singh","Noida","9988776655",34));
        session.persist(new Person(102,"Manoj Mishra","Noida","4488776655",24));
        session.save(new Person(103,"Hemant Pandey","Lucknow","8888776655",56));
        session.save(new Person(104,"Suman Pandey","Lucknow","5688776655",20));
        session.save(new Person(105,"Imran Ahmad","Delhi","1288776655",26));
        tran.commit();
    }
}
