package com.cetpa;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        SessionFactory factory=new Configuration().configure().buildSessionFactory();
        Session session=factory.openSession();
        Transaction t=session.beginTransaction();
        session.save(new Product(101,"Laptop","Dell",45000));
        session.save(new Product(102,"Laptop","HP",80000));
        session.save(new Product(103,"Mouse","Logitech",1200));
        session.save(new Product(104,"Keyboard","Dell",1600));
        session.save(new Product(105,"Printer","HP",5000));
        t.commit();
    }
}
