package com.cetpa;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class Delete 
{
    public static void main( String[] args )
    {
        SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory(); 
        Session ses=factory.openSession();
        Transaction t=ses.getTransaction();
        Product p=ses.get(Product.class,105);
        if(p!=null)
        {
        	t.begin();
        	ses.delete(p);
        	t.commit();
        	System.out.println("Record deleted");
        }
        else
        {
        	System.out.println("Record not found");
        }
    }
}
