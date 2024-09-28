package com.cetpa;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        SessionFactory factory=new Configuration().configure().buildSessionFactory();
        Session ses=factory.openSession();
        Transaction tr=ses.getTransaction();
        tr.begin();
        List<SimCard> list1=new ArrayList<SimCard>();
        list1.add(new SimCard("JIO","9988776655"));
        list1.add(new SimCard("VI","7388776655"));
        ses.save(new Person("Amit Singh","Noida",list1));
        List<SimCard> list2=new ArrayList<SimCard>();
        list2.add(new SimCard("JIO","7744776655"));
        list2.add(new SimCard("VI","9878776655"));
        list2.add(new SimCard("BSNL","9488776655"));
        ses.save(new Person("Manoj Mishra","Delhi",list2));
        tr.commit();
        
    }
}
