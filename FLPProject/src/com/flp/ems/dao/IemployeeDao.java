package com.flp.ems.dao;

import com.flp.ems.domain.Employee;

public interface IemployeeDao {
	public void AddEmployee(Employee emp);
    public void ModifyEmployee(String Kinid);
    public void RemoveEmployee(int employeeid);
    public void SearchEmployee(String Kinid);
    public void getAllEmployee();
    

}
