package com.service;

import com.bean.Employee;
import com.controller.ConnectDb;
import com.DAO.*;
public class EmployeeService {
	EmployeeDAO d=new EmployeeDAO();
	public void addEmployee(Employee e)
	{
		 d.addEmployee(e);
	}
}
