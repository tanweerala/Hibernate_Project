package com.cetpa;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class Save 
{
    public static void main( String[] args )
    {
        SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory(); 
        Session ses=factory.openSession();
        Transaction t=ses.getTransaction();
        t.begin();
        ses.save(new Product(101,"Mouse","Logitech",80,1800));
        ses.save(new Product(102,"Mouse","Dell",20,2200));
        ses.save(new Product(103,"Printer","HP",20,4500));
        ses.save(new Product(104,"Laptop","Acer",10,45000));
        ses.save(new Product(105,"Keyboard","Logitech",180,1200));
        t.commit();
    }
}
