package com.cetpa;

import java.time.LocalDate;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        SessionFactory factory=new Configuration().configure().buildSessionFactory();
        Session ses=factory.openSession();
        Transaction tr=ses.getTransaction();
        Person p1=new Person("Rahul Mishra","Noida","4455667788","11-12-1998");
        Person p2=new Person("Hemant Yadav","Kanpur","9955667788","10-09-2001");
        Person p3=new Person("Kuldeep Pathak","Delhi","1255667788","01-11-1990");
        tr.begin();
        ses.save(new AdharCard(102,"111555999333",LocalDate.now(),p3));
        tr.commit();
    }
}
