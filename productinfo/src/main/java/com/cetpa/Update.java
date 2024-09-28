package com.cetpa;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class Update 
{
    public static void main( String[] args )
    {
        SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory(); 
        Session ses=factory.openSession();
        Transaction t=ses.getTransaction();
        Product p=ses.get(Product.class,104);
        if(p!=null)
        {
        	t.begin();
        	p.setQuantity(15);
        	p.setPrice(41000);
        	t.commit();
        	System.out.println("Record updated");
        }
        else
        {
        	System.out.println("Record not found");
        }
    }
}
