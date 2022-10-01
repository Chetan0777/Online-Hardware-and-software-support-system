package com.masai.usecases;

import java.util.Scanner;

import com.masai.dao.EngineerDao;
import com.masai.daoImpl.EngineerDaoImpl;
import com.masai.exceptions.ComplainException;
import com.masai.exceptions.EmployeeException;
import com.masai.exceptions.EngineerException;
import com.masai.exceptions.HodException;
import com.masai.exceptions.MyException;

public class LoginEmployeeUseCase {
	
	public static void main(String[] args) throws EmployeeException, MyException, HodException, ComplainException {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Username :-");
		String username = sc.next();
		
		System.out.println("Enter Your Password :-");
		String password = sc.next();
		
		EngineerDao d = new EngineerDaoImpl();
		
		String result;
		try {
			result = d.loginEngineer(username, password);
			System.out.println(result);
			EmployeeDriver.main(username);
		} catch (EngineerException e) {
			e.printStackTrace();
		}
		
		
	}
	

}
