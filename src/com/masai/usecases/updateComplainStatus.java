package com.masai.usecases;

import java.util.Scanner;

import com.masai.dao.EngineerDao;
import com.masai.daoImpl.EngineerDaoImpl;
import com.masai.exceptions.ComplainException;
import com.masai.exceptions.EmployeeException;
import com.masai.exceptions.HodException;
import com.masai.exceptions.MyException;

public class updateComplainStatus {

	public static void main(String u) throws EmployeeException, MyException, HodException, ComplainException {
		 
		Scanner sc = new Scanner(System.in);
		EngineerDao hd = new EngineerDaoImpl();
		
		 System.out.println("Enter Engineer Id To Update Problem Status :");
		 int num = sc.nextInt();
		 String s = hd.updateStatus(num);
		 System.out.println(s);
		 EngineerDriver.main(u);

	}

	

}
