package com.cetpa;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class EmployeeRepository 
{
	private static Session ses;
	private static Transaction trn;
	static
	{
		SessionFactory fac=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		ses=fac.openSession();
		trn=ses.getTransaction();
	}
	public static void saveEmployee(Employee emp)
	{
		trn.begin();
		ses.save(emp);
		trn.commit();
	}
	public static Employee getEmployee(int eid)
	{
		Employee employee=ses.get(Employee.class,eid);
		return employee;
	}
	public static void deleteEmployee(Employee emp)
	{
		trn.begin();
		ses.delete(emp);
		trn.commit();
	}
	public static void updateEmployee(Employee emp1,Employee emp2)
	{
		trn.begin();
		emp1.setFirstname(emp2.getFirstname());
		emp1.setLastname(emp2.getLastname());
		emp1.setPhone(emp2.getPhone());
		emp1.setEmail(emp2.getEmail());
		emp1.setDepartment(emp2.getDepartment());
		emp1.setSalary(emp2.getSalary());
		trn.commit();
	}
}
