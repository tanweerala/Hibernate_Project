package com.cetpa;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
    	Session session=factory.openSession();
    	Transaction t=session.getTransaction();
    	t.begin();
    	session.save(new Employee(101,"Amit Singh","Sales",60000));
    	session.save(new Employee(102,"Amit Singh","Sales",60000));
    	session.save(new Employee(103,"Amit Singh","Sales",60000));
    	session.save(new Employee(104,"Amit Singh","Sales",60000));
    	session.save(new Employee(105,"Amit Singh","Sales",60000));
    	session.save(new Employee(106,"Amit Singh","Sales",60000));
    	t.commit();
    	
    }
}
