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
        ses.save(new TeachingStaff(101,"Amit Singh","Noida","6677889900","amit@gmail.com","MCA","Java"));
        ses.save(new TeachingStaff(102,"Alok Verma","Delhi","9977889900","alok@gmail.com","MA","History"));
        ses.save(new TeachingStaff(103,"Suman Singh","Noida","4477889900","suman@gmail.com","MCA","Python"));
        ses.save(new NonTeachingStaff(104,"Rakesh Verma","Kanpur","8777889900","rakesh@gmail.com","Accounts"));
        ses.save(new NonTeachingStaff(105,"Gautam Yadav","Kanpur","5677889900","gautam@gmail.com","Sales"));
        tr.commit();  
    }
}
