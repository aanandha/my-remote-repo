package com.flp.ems.service;
import java.util.HashMap;


import com.flp.ems.dao.EmployeeDaoImplForList;
import  com.flp.ems.domain.Employee;



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
		 edi.AddEmployee(emp);
		 
		 
	 }
	 public void ModifyEmployee()
	 {
		 
	 }
	public void RemoveEmployee()
	{
		
	}
    public void SearchEmployee()
    { 

    	
    }
    public void getAllEmployee()
    {
    	edi.getAllEmployee();
    }
    
}
