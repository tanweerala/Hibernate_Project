package com.cetpa;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class Select 
{
    public static void main( String[] args )
    {
        SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory(); 
        Session ses=factory.openSession();
        Product p=ses.get(Product.class,109);
        if(p!=null)
        {
        	System.out.println(p);
        }
        else
        {
        	System.out.println("Record not found");
        }
    }
}
