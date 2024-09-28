package com.cetpa;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class App2 
{
    public static void main( String[] args )
    {
        SessionFactory factory=new Configuration().configure().buildSessionFactory();
        Session session=factory.openSession();
        Product p=session.get(Product.class,103);
        System.out.println(p);
    }
}
