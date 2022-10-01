package com.masai.usecases;

import java.util.List;
import java.util.Scanner;

import com.masai.bean.Complain;
import com.masai.dao.EmployeeDao;
import com.masai.daoImpl.EmployeeDaoImpl;
import com.masai.exceptions.ComplainException;
import com.masai.exceptions.EmployeeException;
import com.masai.exceptions.EngineerException;
import com.masai.exceptions.HodException;
import com.masai.exceptions.MyException;

public class CompletedComplaint {

	public static void main(String[] args) throws MyException, EngineerException, HodException, ComplainException {
		
		Scanner sc = new Scanner(System.in);
		EmployeeDao hd = new EmployeeDaoImpl();
		  System.out.println("Enter Employee Id :-");
		  int id = sc.nextInt();
		  
			try {
				List<Complain> eclist = hd.getComplainHistory(id);
				eclist.forEach(e -> System.out.println(e));
				EmployeeDriver.main(null);
			} catch (EmployeeException e) {
				e.printStackTrace();
			}


	}

}
