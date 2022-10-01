package com.masai.usecases;

import java.util.List;
import java.util.Scanner;

import com.masai.bean.EngineerComplain;
import com.masai.dao.EngineerDao;
import com.masai.daoImpl.EngineerDaoImpl;
import com.masai.exceptions.ComplainException;
import com.masai.exceptions.EmployeeException;
import com.masai.exceptions.HodException;
import com.masai.exceptions.MyException;

public class AssignedComplaintsUseCase {

	public static void main(String u) throws EmployeeException, MyException, HodException, ComplainException {
		Scanner sc = new Scanner(System.in);
		EngineerDao hd = new EngineerDaoImpl();
		System.out.println("Enter Engineer Id : ");
		int n = sc.nextInt();
		try {
			List<EngineerComplain> list = hd.ComplainAssignedByHod(n);
			list.forEach(e -> System.out.println(e));
		} catch (ComplainException e) {
			e.printStackTrace();
		}
		EngineerDriver.main(u);

	}


}
