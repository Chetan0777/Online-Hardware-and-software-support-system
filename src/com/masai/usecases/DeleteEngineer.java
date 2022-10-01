package com.masai.usecases;

import java.util.Scanner;

import com.masai.dao.HODDao;
import com.masai.daoImpl.HODDaoImpl;
import com.masai.exceptions.ComplainException;
import com.masai.exceptions.EmployeeException;
import com.masai.exceptions.EngineerException;
import com.masai.exceptions.MyException;

public class DeleteEngineer {

	public static void main(String[] args) throws EmployeeException, MyException, ComplainException {
		
		  Scanner sc=new Scanner(System.in);
		  System.out.println("Enter Engineer Id To Delete :");
		  int eid = sc.nextInt();
		  HODDao hd = new HODDaoImpl();
		  
		  
		  try {	
			  String del = hd.DeleteEngineer(eid);
			  System.out.println(del);
			  HODDriver.main(args);
			  
			}catch(EngineerException se) {
				se.printStackTrace();
			}

	}

}
