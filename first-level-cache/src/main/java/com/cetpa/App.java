package com.cetpa;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        SessionFactory factory=new Configuration().configure().buildSessionFactory();
        Session ses=factory.openSession();
        Transaction tr=ses.getTransaction();
        tr.begin();
        ses.save(new Person(101,"Rahul","Noida","7788996655",23));
        ses.save(new Person(102,"Rakesh","Lucknow","1188996655",20));
        ses.save(new Person(103,"Imran","Kanpur","9988996655",45));
        tr.commit();
    }
}
