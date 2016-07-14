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
	public boolean equals(Object obj){
		if(this == obj)
		return true;
		if((obj == null) || (obj.getClass() != this.getClass()))
			return false;

	    Employee other = (Employee) obj;
	    if(this.Kinid != other.Kinid)      return false;
	    if(! this.EMailid.equals(other.EMailid)) return false;
//	    if(! this.lastName.equals(other.lastName))   return false;

	    return true;
	  }
	
}
