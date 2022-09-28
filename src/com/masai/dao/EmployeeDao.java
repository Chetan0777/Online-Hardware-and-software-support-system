package com.masai.dao;

import com.masai.bean.Employee;

public interface EmployeeDao {
	
	
	public String registerEmployee(String name, String username, String password);

	public String registerEmployee2(Employee employee);
	
}
