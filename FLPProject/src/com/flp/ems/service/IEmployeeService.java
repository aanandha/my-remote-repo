package com.flp.ems.service;

import java.util.HashMap;

public interface IEmployeeService {
    public void AddEmployee(HashMap hm);
    public void ModifyEmployee(String Kinid);
    public void RemoveEmployee(int employeeid);
    public void SearchEmployee(String Kinid,String Name,String EMailid);
    public void getAllEmployee();
    

}
