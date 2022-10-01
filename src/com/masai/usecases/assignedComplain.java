package com.masai.usecases;

import java.util.Scanner;

import com.masai.dao.HODDao;
import com.masai.daoImpl.HODDaoImpl;
import com.masai.exceptions.ComplainException;
import com.masai.exceptions.EmployeeException;
import com.masai.exceptions.EngineerException;
import com.masai.exceptions.MyException;

public class assignedComplain {

	public static void main(String[] args) throws EmployeeException, MyException, EngineerException, ComplainException {
		  
		
		  HODDao hd = new HODDaoImpl();
		  Scanner sc = new Scanner(System.in);
		
		  System.out.println("Enter Engineer Id :- ");
		  int engid = sc.nextInt();
		  System.out.println("Enter Engineer Name :- ");
		  String name = sc.next();
		  System.out.println("Enter Engineer Category (Software/Hardware) :- ");
		  String category = sc.next();
		  System.out.println("Enter Complain Id :- ");
		  int complainid = sc.nextInt();
		  System.out.println("Enter Complain Status :- ");
		  String status = sc.next();
		  String rs2 = hd.assignedComplain(engid,name,category,complainid,status);
		  System.out.println(rs2);
		  HODDriver.main(args);

	}

}
