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
        Department dept1=new Department("Sales","Arun");
        Department dept2=new Department("Marketing","Alok");
        Department dept3=new Department("Training","Santosh");
        ses.save(new Employee(101,"Rakesh Maurya",70000,dept1));
        ses.save(new Employee(102,"Suman Devi",72000,dept1));
        ses.save(new Employee(103,"Imran Ahmad",67000,dept1));
        ses.save(new Employee(104,"Hemant Verma",80000,dept2));
        ses.save(new Employee(105,"Ratnesh Dixit",84000,dept2));
        ses.save(new Employee(106,"Atul Pathak",80000,dept3));
        tr.commit();
        
    }
}
