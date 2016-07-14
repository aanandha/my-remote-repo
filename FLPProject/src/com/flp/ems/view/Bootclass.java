package com.flp.ems.view;
import java.util.Scanner;

public class Bootclass {
public static void main(String[] args) {
	Bootclass b=new Bootclass();
	b.menuselection();
	
}
public void menuselection()
{
	
	while(true)
	{
	System.out.println("1.AddEmployee... ");
	System.out.println("2.ModifyEmployee... ");
	System.out.println("3.RemoveEmployee... ");
	System.out.println("4.SearchEmployee... ");
	System.out.println("5.getAllEmployee... ");
	System.out.println("6.Exit");
	
	System.out.println("Enter menu option: ");
	Scanner in =new Scanner(System.in);
	int option=in.nextInt();
	UserInteraction ui=new UserInteraction();
	switch(option)
	{
	case 1:
		ui.AddEmployee();
		
		break;
	case 2:
		ui.ModifyEmployee();
		break;
	case 3:
		ui.RemoveEmployee();
		break;
	case 4:
		ui.SearchEmployee();
		break;
	case 5:
		
		ui.getAllEmployee();
        break;
	case 6:
	
		System.out.println("Exit from Application");
		System.exit(0);
		
	
		
	}
	}
	
}	
}
