package com.masai.usecases;

import java.util.List;

import com.masai.bean.Engineer;
import com.masai.dao.HODDao;
import com.masai.daoImpl.HODDaoImpl;
import com.masai.exceptions.EngineerException;

public class GetAllEngineerUseCase {

	public static void main(String[] args) {
		
		HODDao h = new HODDaoImpl();
		try {
			List<Engineer> list = h.getAllEngineerDetails();
			list.forEach(s-> {
					System.out.println("-----------------------------------------");
					System.out.println("Engineer I.D :- "+ s.getEngid());
					System.out.println("Engineer Name :- "+ s.getUsername());
					System.out.println("Engineer Username :- "+ s.getUsername());
					System.out.println("Engineer Password :- "+ s.getPassword());
					System.out.println("Engineer Category :- "+ s.getCategory());
					System.out.println("-----------------------------------------");
			});
		}catch(EngineerException e) {
			System.out.println(e.getMessage());
		}

	}

}
