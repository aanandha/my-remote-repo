package com.flp.ems.view;

import com.flp.ems.domain.Department;

//import com.flp.ems.domain.Employee;
import com.flp.ems.domain.Role;
import com.flp.ems.service.EmployeeServiceImpl;
import com.flp.ems.domain.Project;

import java.util.Scanner;

import com.flp.ems.util.Validate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;




public class UserInteraction {
private	static int employeeid=71900;
private	int deptid,Projectid,Roleid,option,i,a;
private	String Name,Address,EMailid,Kinid,Department,Role,PhoneNo,Projectname;
	private String DOB,DOJ;
	EmployeeServiceImpl esi=new  EmployeeServiceImpl();
	Project p=new Project();
	Scanner in =new Scanner(System.in);
//	UserInteraction ui=new UserInteraction();
	public void AddEmployee()
	{
		System.out.println("Enter employee name:");
		
		Name=in.nextLine();
		System.out.println("Enter Kinid:");
		Kinid=in.next();

		System.out.println("Enter EMailid :");
		EMailid=in.next();
		

	
		System.out.println("Enter PhoneNo :");
		PhoneNo=in.next();

		
		System.out.println("Enter DOB (dd/mm/yyyy):");
		DOB=in.next();

		System.out.println("Enter DOJ (dd/mm/yyyy):");
		DOJ=in.next();
		System.out.println("Enter Address :");
		Address=in.next();
		System.out.println("Select Department :");
		Department d=new Department();
		
		d.setdept(option=in.nextInt());
		d.getdept();
		
		if(option==1)
		{
			p.cp();
			p.setproject(i=in.nextInt());
			p.getproject();
			switch(i)
			{
			
			case 1:
	        	Projectname="Employee Management System";
	        	Projectid=1000;
	        	break;
	        case 2:
	        	Projectname="Student Management System";
	        	Projectid=1001;
	        	break;
				
			}
			
		}
		if(option==2)
		{
			p.dp();
			p.setproject(i=in.nextInt());
			p.getproject();
			switch(i)
			{
			
			case 1:
	        	Projectname="Banking Project";
	        	Projectid=2000;
	        	break;
	        case 2:
	        	Projectname="EMS";
	        	Projectid=2001;
	        	break;
				
			}
		}
		if(option==3)
		{
			p.jp();
			p.setproject(i=in.nextInt());
			p.getproject();
			switch(i)
			{
			
			case 1:
	        	Projectname="Android Project";
	        	Projectid=3000;
	        	break;
	        case 2:
	        	Projectname="ERP system";
	        	Projectid=3001;
	        	break;
				
			}
		}
		if(option==4)
		{
			p.mp();
			p.setproject(i=in.nextInt());
			p.getproject();
			switch(i)
			{
			
			case 1:
	        	Projectname="Telecom Billing Management System";
	        	Projectid=4000;
	        	break;
	        case 2:
	        	Projectname="Insurance management System Mainframe Application";
	        	Projectid=4001;
	        	break;
				
			}
		}
		switch(option)
		{
		case 1 :
	        Department="ADM Cloud";
	        deptid=4021;
	        break;
	     case 2 :
	    	 Department="Devops";
	    	 deptid=5034;
	    	 break;
	     case 3 :
	       Department="ADM Java";
	       deptid=4327;
	        break;
	     case 4 :
	        Department="Mainframe";
	        deptid=5464;
	        break;
	     default :
	        System.out.println("Invalid opiton");
	  }
		System.out.println("Select Role :");
		Role r=new Role();
		r.setrole(option=in.nextInt());
		r.getrole();
		switch(option)
		{
		case 1 :
	       Role="HR";
	       Roleid=102;
	        break;
	     case 2 :
	    	 Role="Manager";
	    	 Roleid=103;
	         break;
	     case 3 :
	    	 Role="Consultant";
	    	 Roleid=104;
	        break;
	     case 4 :
	    	 Role="Software Engineer";
	    	 Roleid=105;
	        break;
	     default :
	        System.out.println("Invalid opiton");
	  }
		
//		System.out.println("select Project");1
		
//		Project p=new Project();
//		p.setdeptid(getdeptid());
		
		boolean F1,F2,F3,F4;
		F1= Validate.validateDateFormat(DOJ);
	    F2= Validate.validateDateFormat(DOB);
        F3= Validate.validateEmailAddress(EMailid);
        F4=Validate.validatePhoneNumber(PhoneNo);
         if(F1 && F2 && F3 && F4){
         
        	 System.out.println(" validation success");
        	 
        
		HashMap hm=new HashMap();
		hm.put("employeeid", employeeid);
		hm.put("Name", Name);
		hm.put("Kinid", Kinid);
		hm.put("EMailid", EMailid);
		hm.put("PhoneNo", PhoneNo);
		hm.put("DOB", DOB);
		hm.put("DOJ", DOJ);
		hm.put("Address", Address);
		hm.put("Department", Department);
		hm.put("deptid", deptid);
		hm.put("Projectname", Projectname);
		hm.put("Projectid", Projectid);
		hm.put("Role", Role);
		hm.put("Roleid", Roleid);
		employeeid++;
		esi.AddEmployee(hm);
		 System.out.println("Employee added");
         }
		 else {
        	 System.out.println(" validation fails");
        	 System.out.println("Employee is not added");
         }	
		
	}
	
	public void ModifyEmployee()
	{
		System.out.println("enter employeeid you want ot modify");
		
		
	}
	public void RemoveEmployee()
	{
		System.out.println("Enter employeeid you want to remove:");
		employeeid=in.nextInt();
		System.out.println("Conform to Remove employee");
	}
	public void SearchEmployee()
	{
		
	System.out.println("1.search using Kinid");
		System.out.println("2.search using name");
		System.out.println("3.search using Mailid");
		System.out.println("4.search using Kinid and name");
		System.out.println("5.search using Kinid and Mailid");
		System.out.println("6.search using name and Mailid");
		System.out.println("7.search using Kinid,name and Mailid");
		
		
		a=in.nextInt();
		switch(a)
		{
		case 1:
			System.out.println("enter kinid");
		 Kinid=in.next();
		 esi.SearchEmployee();
		 
			break;
		case 2:
			System.out.println("enter name");
			Name=in.next();
			 esi.SearchEmployee();
			break;
		case 3:
			System.out.println("enter Mailid");
			EMailid=in.next();
			 esi.SearchEmployee();
			break;
		case 4:
			System.out.println("enter Kinid and name");
			 Kinid=in.next();
			 Name=in.next();
			 esi.SearchEmployee();
			break;
		case 5:
			System.out.println("enter Kinid and Mailid");
			Kinid=in.next();
			EMailid=in.next();
			 esi.SearchEmployee();
			break;
		case 6:
			System.out.println("enter name and Mailid");
			EMailid=in.next();
			Name=in.next();
			 esi.SearchEmployee();
			break;
		case 7:
			System.out.println("enter Kinid,name and Mailid ");
			Kinid=in.next();
			EMailid=in.next();
			Name=in.next();
			 esi.SearchEmployee();
			break;
			
			
		}
		
		
		
	}
	public void getAllEmployee()
	{
      
      System.out.println("get employee details");
      esi.getAllEmployee();
	    
	} 
        
	}
	


