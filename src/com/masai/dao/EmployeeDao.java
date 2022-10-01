package com.masai.dao;

import java.util.List;

import com.masai.bean.Complain;
import com.masai.bean.Employee;
import com.masai.bean.EngineerComplain;
import com.masai.exceptions.ComplainException;
import com.masai.exceptions.EmployeeException;

public interface EmployeeDao {
	
	
	public String registerEmployee(String name, String username, String password);

	public String registerEmployee2(Employee employee);
	
	public String loginEmployee(String username, String password)throws EmployeeException;
	
	public String registerComplain(String complainname,String category)throws ComplainException;
	
	public List<EngineerComplain> ComplainStatus(int EcomplainId)throws ComplainException;
	
	public List<Complain> getComplainHistory(int empid)throws EmployeeException;
	
	public String changePassword(String password,int empid)throws EmployeeException;
	
	
}
