package com.masai.usecases;

import java.util.List;

import com.masai.bean.Complain;
import com.masai.dao.HODDao;
import com.masai.daoImpl.HODDaoImpl;
import com.masai.exceptions.ComplainException;
import com.masai.exceptions.EmployeeException;
import com.masai.exceptions.EngineerException;
import com.masai.exceptions.MyException;

public class GetAllComplaintsUseCase {

	public static void main(String[] args) throws EmployeeException, MyException, EngineerException, ComplainException {
		HODDao hd = new HODDaoImpl();
		try {
			List<Complain> clist = hd.getAllComplain();
			clist.forEach(e -> System.out.println(e));
		} catch (ComplainException e) {
			e.printStackTrace();
		}
		  HODDriver.main(args);
	}

}
