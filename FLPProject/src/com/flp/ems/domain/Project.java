package com.flp.ems.domain;
import java.util.ArrayList;
import java.util.List;


public class Project  {

private int project;
       public void cp()
       {
    	   System.out.println("Select project:");
    	   List<String> ls = new ArrayList<String>();
    	   ls.add("1.Employee Management System");
    	   ls.add("2.Student Management System");
    	   System.out.println(ls);
       }
       public void dp()
       {
    	   System.out.println("Select project:");
    	   List<String> ls = new ArrayList<String>();
    	   ls.add("1.Banking Project");
    	   ls.add("2.EMS");
    	   System.out.println(ls);
       }
       public void jp()
       {
    	   System.out.println("Select project:");
    	   List<String> ls = new ArrayList<String>();
    	   ls.add("1.Android Project");
    	   ls.add("2.ERP system");
    	   System.out.println(ls);
       }
	public void mp()
	{
		System.out.println("Select project:");
 	   List<String> ls = new ArrayList<String>();
 	   ls.add("1.Telecom Billing Management System.");
 	   ls.add("2. Insurance management System Mainframe Application");
 	  System.out.println(ls);
	}
	public int getproject()
	{
		return project;
	}
	public void setproject(int pro)
	{
		project=pro;
	}

    

}
