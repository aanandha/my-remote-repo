package com.flp.ems.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.flp.ems.domain.Employee;

public class EmployeeDaoImplForList implements IemployeeDao {
	public static List<Employee> list=new ArrayList<Employee>();
	//Employee emp=new Employee();
	Iterator<Employee> itr;
	Scanner in=new Scanner(System.in);
	
	@Override
	public void AddEmployee(Employee emp)
	{
		list.add(emp);
		
		System.out.println("employee added to list");
	}
	
	@Override
	public void ModifyEmployee(String Kinid)
	{
		
	}
	
	@Override
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
	
	@Override
	public void RemoveEmployee(int employeeid)
	{
		itr = list.iterator();
		System.out.println("Do you want to remove employee?(y/n)");
		String choice=in.next();
		if(choice=="y")
		{
			while(itr.hasNext()){
					Employee emp=(Employee)itr.next();
				if((emp.getemployeeid()==employeeid)){
					itr.remove();
					System.out.println("Employee Successfully removed");
					return;
				}
			}
		}
		System.out.println("Employee not removed");
	}
	
	@Override
	public void getAllEmployee()
	{
		itr = list.iterator();
		
		System.out.println("Employeeid\t\tKinid\t\tName\t\tRole\t\tDepartment\t\tProject");
		while(itr.hasNext()){
			System.out.println(itr.next());
	        } 
	}

}
