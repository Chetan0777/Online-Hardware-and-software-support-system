package com.masai.usecases;

import java.util.Scanner;

import com.masai.dao.EmployeeDaoImpl;

public class RegisterEmployeeUseCase1 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter Employee Name :- ");
		String name  = s.next();
		
		System.out.println("Enter Employee Username :- ");
		String username  = s.next();
		
		System.out.println("Enter Employee Password :- ");
		String password  = s.next();

		EmployeeDaoImpl dao = new EmployeeDaoImpl();
		
		String reasult = dao.registerEmployee(name, username, password);
		
		System.out.println(reasult);
		
	}

}
