package com.flp.ems.domain;

public class Employee {
	private static int employeeid=71900;
	private int deptid,Roleid,Projectid;
	private String Name,Address,EMailid,Kinid,Department,Role,PhoneNo,Projectname;
	private String DOB,DOJ;
	public int getemployeeid()
	{
		return employeeid;
	}
	public void setemployeeid(int  empid)
	
	{
		employeeid= empid;
	}
	public String getName()
	{
		return Name;
	}
	public void setName(String n)
	{
		Name=n;
	
	}
	public String getKinid()
	{
		return Kinid;
	}
	public void setKinid(String kid)
	{
		Kinid=kid;
	
	}
	public String getEMailid()
	{
		return EMailid;
	}
	public void setEMailid(String eid)
	{
		EMailid=eid;
	
	}
	public String getPhoneNo()
	{
		return PhoneNo;
	}
	public void setPhoneNo(String ph)
	{
		PhoneNo=ph;
	
	}
	public String getDOB()
	{
		return DOB;
	}
	public void setDOB(String db)
	{
		DOB=db;
	
	}
	public String getDOJ()
	{
		return DOJ;
	}
	public void setDOJ(String dj)
	{
		DOJ=dj;
	
	}
	public String getAddress()
	{
		return Address;
	}
	public void setAddress(String add)
	{
		Address=add;
	
	}
	public String getDepartment()
	{
		return Department;
	}
	public void setDepartment(String dept)
	{
		Department=dept;
	
	}
	public int getdeptid()
	{
		return deptid;
	}
	public void setdeptid(int departmentid)
	{
		deptid=departmentid;
	
	}
	public String getProjectname()
	{
		return Projectname;
	}
	public void setProjectname(String pn)
	{
		Projectname=pn;
	
	}
	public int getProjectid()
	{
		return Projectid;
	}
	public void setProjectid(int pi)
	{
	Projectid=pi;
	
	}
	public String getRole()
	{
		return Role;
	}
	public void setRole(String role)
	{
		Role=role;
	
	}
	public int getRoleid()
	{
		return Roleid;
	}
	public void setRoleid(int roleid)
	{
		Roleid=roleid;
	
	}
	 public String toString(){ 
		  return employeeid+" "+Name+" "+Kinid+" "+EMailid+" "+PhoneNo+" "+DOB+" "+DOJ+" "+Address+" "+Department+" "+deptid+" "+Projectname+" "+Projectid+" "+Role+" "+Roleid;  
		 }  
	public boolean equals(Object obj){
		if((this==(Employee)obj)&&((Kinid==((Employee)obj).Kinid)||(this.EMailid==((Employee)obj).EMailid)||(employeeid==((Employee)obj).employeeid)))
		{
			if((Department==((Employee)obj).getDepartment())&&(this.Projectname==((Employee)obj).getProjectname()))
				return true;
		}
		return false;
	}

	
}
