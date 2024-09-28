package com.cetpa;

import java.util.List;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class App4 
{
    public static void main( String[] args )
    {
        SessionFactory factory=new Configuration().configure().buildSessionFactory();
        Session session=factory.openSession();
        Query query=session.createQuery("delete from Person where city=:arg1");
        query.setParameter("arg1","Lucknow");
        Transaction tr=session.getTransaction();
        tr.begin();
        query.executeUpdate();
        tr.commit();
    }
}
