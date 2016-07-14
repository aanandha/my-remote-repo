package com.flp.ems.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.flp.ems.domain.Employee;

public class EmployeeDaoImplForList implements IemployeeDao {
	public List<Employee> list=new ArrayList();
	Employee emp=new Employee();
	
	public void AddEmployee(Employee emp)
	{
		System.out.println("inside dao create");
		list.add(emp);
		System.out.println("list of all employees" +list);
		
		System.out.println("employee added to list");
		
	}
	public void ModifyEmployee()
	{
		
	}
	public void SearchEmployee()
	{
		
	}
	public void RemoveEmployee()
	{
		
	}
	public void getAllEmployee()
	{
		//System.out.println("list of all employees" +list.iterator().next());
		
		 Iterator iterator = list.iterator();
		 System.out.println("inside dao");
	        while (iterator.hasNext()) {
	        	System.out.println("inside dao while");
	        	
	            Employee emp=(Employee) iterator.next();
	            System.out.print("KINID \t\t" +emp.getKinid());
	            System.out.print("EMailid \t\t" +emp.getEMailid());
	            System.out.print("Name \t\t" +emp.getName());
	            System.out.print("Role \t\t" +emp.getRole());
	            System.out.print("Department \t\t" +emp.getDepartment());
	            
	            
	        } 
	}

}
