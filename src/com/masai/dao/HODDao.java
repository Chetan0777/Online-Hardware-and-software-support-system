package com.masai.dao;

import java.util.List;

import com.masai.bean.Complain;
import com.masai.bean.Engineer;
import com.masai.exceptions.ComplainException;
import com.masai.exceptions.EngineerException;
import com.masai.exceptions.HodException;

public interface HODDao {
	
	public boolean LoginHOD(String name ,String username, String password) throws HodException;
	
	public String registerEngineer(Engineer engineer); 
	
	public List<Engineer> getAllEngineerDetails()throws EngineerException;
	
	public String DeleteEngineer(int engId);
	
	public List<Complain> getAllComplain()throws ComplainException;
	
	public String assignedComplain(int engid,String name,String category,int id,String status);
	
	
}
