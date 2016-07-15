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
	public void ModifyEmployee(String Kinid)
	{
		
	}
	public void SearchEmployee(String Kinid)
	{
	Iterator itr = list.iterator();
		System.out.println("Employeeid\tKinid\tName\tRole\tDepartment\tProject");
		while(itr.hasNext()){
			Employee emp=(Employee) itr.next();
			if(emp.getKinid().equals(Kinid)||emp.getEMailid().equals(Kinid)||emp.getName().equals(Kinid)){

				System.out.println(emp);
				System.out.println("Employee Successfully Searched");
				return;
			}
		}
		System.out.println("Employee not available");
	
	}
	public void RemoveEmployee(int employeeid)
	{
		
	}
	public void getAllEmployee()
	{
  Iterator	itr = list.iterator();
		System.out.println("Employeeid\t\tKinid\t\tName\t\tRole\t\tDepartment\t\tProject");
		while(itr.hasNext()){
			System.out.println(itr.next());
	            
	            
	        } 
	}

}
