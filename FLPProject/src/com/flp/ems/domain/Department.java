package com.flp.ems.domain;


	import java.util.ArrayList;
	import java.util.List;
	
	public class Department {
		private int dept;
		public Department()
		{
			
		List<String> listStrings = new ArrayList<String>();
		listStrings.add("1.ADM Cloud");
		listStrings.add("2.Devops");
		listStrings.add("3.ADM Java");
		listStrings.add("4.Mainframe");
		 
		System.out.println(listStrings);
		
		}

		public int getdept()
		{
			return dept;
		}
		public void setdept(int Department)
		{
			dept=Department;
		}
		
		

	}

