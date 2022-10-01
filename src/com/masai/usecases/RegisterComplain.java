package com.masai.usecases;

import java.util.Scanner;

import com.masai.dao.EmployeeDao;
import com.masai.daoImpl.EmployeeDaoImpl;
import com.masai.exceptions.ComplainException;
import com.masai.exceptions.EmployeeException;
import com.masai.exceptions.EngineerException;
import com.masai.exceptions.HodException;
import com.masai.exceptions.MyException;

public class RegisterComplain {

	public static void main(String[] args) throws EmployeeException, MyException, EngineerException, HodException, ComplainException {
		
		Scanner sc = new Scanner(System.in);
		EmployeeDao hd = new EmployeeDaoImpl();
		
		System.out.println("Enter Category (Hardware/Software) :- ");
		String com = sc.next();
		System.out.println("Enter Complain Name :- ");
		String cname = sc.next();
		
		String result;
		try {
			result =hd.registerComplain(cname,com);
			System.out.println(result);
			EmployeeDriver.main(result);
		} catch (ComplainException e) {
			e.printStackTrace();
		}

	}

}
