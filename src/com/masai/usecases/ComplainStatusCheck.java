package com.masai.usecases;

import java.util.List;
import java.util.Scanner;

import com.masai.bean.EngineerComplain;
import com.masai.dao.EmployeeDao;
import com.masai.daoImpl.EmployeeDaoImpl;
import com.masai.exceptions.ComplainException;
import com.masai.exceptions.EmployeeException;
import com.masai.exceptions.EngineerException;
import com.masai.exceptions.HodException;
import com.masai.exceptions.MyException;

public class ComplainStatusCheck {

	public static void main(String[] args) throws EmployeeException, MyException, EngineerException, HodException {
		
		Scanner sc = new Scanner(System.in);
		EmployeeDao hd = new EmployeeDaoImpl();
		
		System.out.println("Enter Complain Id :");
		 int name = sc.nextInt();
		 List<EngineerComplain> s;
		try {
			s = hd.ComplainStatus(name);
			s.forEach(se -> System.out.println(se));
			 EmployeeDriver.main(null);
		} catch (ComplainException e1) {
			e1.printStackTrace();
		}
		 
//		 EmployeeDriver.main(null);

	}

}
