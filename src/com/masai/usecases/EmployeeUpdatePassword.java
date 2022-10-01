package com.masai.usecases;

import java.util.Scanner;
import com.masai.dao.EmployeeDao;
import com.masai.daoImpl.EmployeeDaoImpl;
import com.masai.exceptions.ComplainException;
import com.masai.exceptions.EmployeeException;
import com.masai.exceptions.EngineerException;
import com.masai.exceptions.HodException;
import com.masai.exceptions.MyException;


public class EmployeeUpdatePassword {

	public static void main(String u) throws EmployeeException, MyException, EngineerException, HodException, ComplainException {
		
		  Scanner sc = new Scanner(System.in);
		  EmployeeDao hd = new EmployeeDaoImpl();
		  System.out.println("Enter Employee Id :");
		  int empid = sc.nextInt();
		  System.out.println("Enter New Password :");
		  String password = sc.next();
		  
		  
		  String result;
			try {
				result = hd.changePassword(password,empid);
				System.out.println(result);
				EmployeeDriver.main(result);
			} catch (EmployeeException e) {
				e.printStackTrace();
			}
		  
		  
			EmployeeDriver.main(u);

	}

}
