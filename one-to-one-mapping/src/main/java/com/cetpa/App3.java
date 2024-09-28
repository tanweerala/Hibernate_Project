package com.cetpa;

import java.time.LocalDate;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class App3 
{
    public static void main( String[] args )
    {
        SessionFactory factory=new Configuration().configure().buildSessionFactory();
        Session ses=factory.openSession();
        Transaction tr=ses.getTransaction();
        AdharCard card=ses.get(AdharCard.class,102);
        Person p=card.getPerson();
        System.out.println(p.getName());
    }
}
