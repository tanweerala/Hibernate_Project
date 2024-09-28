package com.cetpa;

import java.util.List;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class App6 
{
    public static void main( String[] args )
    {
        SessionFactory factory=new Configuration().configure().buildSessionFactory();
        Session session=factory.openSession();
        Query<Person> query=session.createQuery("from Person where age>=(select max(age) from Person)",Person.class);
        List<Person> personList=query.list();
        for(Person p:personList)
        {
        	System.out.println(p);
        }
    }
}
