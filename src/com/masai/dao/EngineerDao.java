package com.masai.dao;

import com.masai.bean.Engineer;

public interface EngineerDao {
	
	public String registerEngineer(Engineer engineer); 

	public Engineer getEngineerById(int engid);
	
}
