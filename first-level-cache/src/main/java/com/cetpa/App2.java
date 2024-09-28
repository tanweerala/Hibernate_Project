package com.cetpa;

import java.util.Scanner;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class App2 
{
    public static void main( String[] args )
    {
        SessionFactory factory=new Configuration().configure().buildSessionFactory();
        Session ses=factory.openSession();
        Scanner sc=new Scanner(System.in);
        while(true)
        {
        	System.out.print("Enter person id:");
        	int pid=sc.nextInt();
        	Person person=ses.get(Person.class,pid);
        	if(person!=null)
        		System.out.println(person);
        	else
        		System.out.println("Record does not exist");
        	System.out.print("enter 1 to continue or 2 to exit:");
        	int ch=sc.nextInt();
        	if(ch==2)
        	{
        		System.out.println("Program terminated");
        		break;
        	}
        }
        
    }
}
