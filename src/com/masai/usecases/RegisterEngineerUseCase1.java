package com.masai.usecases;

import java.util.Scanner;

import com.masai.bean.Engineer;
import com.masai.dao.HODDao;
import com.masai.daoImpl.HODDaoImpl;
import com.masai.exceptions.ComplainException;
import com.masai.exceptions.EmployeeException;
import com.masai.exceptions.EngineerException;
import com.masai.exceptions.MyException;

public class RegisterEngineerUseCase1 {

	public static void main(String[] args) throws EngineerException, EmployeeException, MyException, ComplainException {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter Engineer Name :- ");
		String name  = s.next();
		
		System.out.println("Enter Engineer Username :- ");
		String username  = s.next();
		
		System.out.println("Enter Engineer Password :- ");
		String password  = s.next();
		
		System.out.println("Enter Engineer Category (Hardware/Software) :- ");
		String category  = s.next();

		HODDao dao = new HODDaoImpl();
		
		
		Engineer engineer = new Engineer();
		engineer.setName(name);
		engineer.setUsername(username);
		engineer.setPassword(password);
		engineer.setCategory(category);
		
		
		
		try {
			String reasult = dao.registerEngineer(engineer);	
			System.out.println(reasult);
			HODDriver.main(args);
		} catch (EngineerException e) {
			e.printStackTrace();
		}

	}

}




