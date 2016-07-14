package com.flp.ems.domain;


	import java.util.ArrayList;
	import java.util.List;

	public class Role {
		private int role;
		public Role()
		{
			
		List<String> listStrings = new ArrayList<String>();
		listStrings.add("1.HR");
		listStrings.add("2.Manager");
		listStrings.add("3.Consultant");
		listStrings.add("4.Software Engineer");
		 
		System.out.println(listStrings);
		}
		

		public int getrole()
		{
			return role;
		}
		public void setrole(int Role)
		{
			role=Role;
		}
		

	}


