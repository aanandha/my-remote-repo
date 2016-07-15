package com.flp.ems.service;
import java.util.HashMap;


import com.flp.ems.dao.EmployeeDaoImplForList;
import  com.flp.ems.domain.Employee;
import com.flp.ems.util.Validate;



//import com.flp.ems.domain.Employee;

public class EmployeeServiceImpl implements IEmployeeService{
	 Employee emp=new Employee();
	 EmployeeDaoImplForList edi=new EmployeeDaoImplForList ();
	 public void AddEmployee(HashMap hm)
	 {
		
		 emp.setemployeeid((int) hm.get("employeeid"));
		 emp.setName((String) hm.get("Name"));
		 emp.setKinid((String) hm.get("Kinid"));
		 emp.setEMailid((String) hm.get("EMailid"));
		 emp.setPhoneNo((String) hm.get("PhoneNo"));
		 emp.setDOB((String) hm.get("DOB"));
		 emp.setDOJ((String) hm.get("DOJ"));
		 emp.setAddress((String) hm.get("Address"));
		 emp.setDepartment((String) hm.get("Department"));
		 emp.setdeptid((int) hm.get("deptid"));
		 emp.setProjectname((String) hm.get("Projectname"));
		 emp.setProjectid((int) hm.get("Projectid"));
		 emp.setRole((String) hm.get("Role"));
		 emp.setRoleid((int) hm.get("Roleid"));
		 boolean F3,F4,F5;
		
		 F3= Validate.validateEmailAddress(emp.getEMailid());
	        F4=Validate.validatePhoneNumber(emp.getPhoneNo());
	        F5=Validate.validatename(emp.getName());
	        if(F3 && F4 && F5)
	        {
	        	System.out.println("EMailid,PhoneNo,Name validation success\n Employee added to list");
		 edi.AddEmployee(emp);
	        }
	        else
	        {
	        	System.out.println("EMailid,PhoneNo validation fails\n Employee not added to list");
	        }
		 
	 }
	 public void ModifyEmployee(String Kinid)
	 {
		edi.ModifyEmployee(Kinid);
	 }
	public void RemoveEmployee(int employeeid)
	{
		edi.RemoveEmployee(employeeid);
	}
    public void SearchEmployee(String Kinid,String EMailid,String Name)
    { 
    	if((!Kinid.equals("$"))&&(!Name.equals("$"))&&(!EMailid.equals("$"))){
			edi.SearchEmployee(Kinid);
		}
		else if((!Kinid.equals("$"))&&(!EMailid.equals("$"))){
			edi.SearchEmployee(Kinid);
		}
		else if((!Name.equals("$"))&&(!EMailid.equals("$"))){
			edi.SearchEmployee(EMailid);
		}
		else if((!Kinid.equals("$"))&&(!Name.equals("$"))){
			edi.SearchEmployee(Kinid);
		}
		else if((!Kinid.equals("$"))){
			edi.SearchEmployee(Kinid);
		}
		else if((!Name.equals("$"))){
			edi.SearchEmployee(Name);
		}
		else if((!EMailid.equals("$"))){
			edi.SearchEmployee(EMailid);
		}
	}

    
    public void getAllEmployee()
    {
    	edi.getAllEmployee();
    }
    
}
