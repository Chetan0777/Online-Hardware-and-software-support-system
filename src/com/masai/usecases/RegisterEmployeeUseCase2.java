package com.masai.usecases;

import java.util.Scanner;

import com.masai.Driver.Driver;
import com.masai.bean.Employee;
import com.masai.dao.EmployeeDao;
import com.masai.daoImpl.EmployeeDaoImpl;
import com.masai.exceptions.ComplainException;
import com.masai.exceptions.EmployeeException;
import com.masai.exceptions.EngineerException;
import com.masai.exceptions.HodException;
import com.masai.exceptions.MyException;


public class RegisterEmployeeUseCase2 {

	public static void main(String[] args) throws EmployeeException, MyException, EngineerException, HodException, ComplainException {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter Employee Name :- ");
		String name  = s.next();
		
		System.out.println("Enter Employee Username :- ");
		String username  = s.next();
		
		System.out.println("Enter Employee Password :- ");
		String password  = s.next();

		EmployeeDao dao = new EmployeeDaoImpl();
		
		
		Employee employee = new Employee();
		employee.setName(name);
		employee.setUsername(username);
		employee.setPassword(password);
		
		
		String reasult = dao.registerEmployee2(employee);	
		
		System.out.println(reasult);
		
		try {
			Driver.main(args);
		} catch (EmployeeException e) {
			e.printStackTrace();
		}
		
	}

}
