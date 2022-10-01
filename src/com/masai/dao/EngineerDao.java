package com.masai.dao;

import java.util.List;

import com.masai.bean.EngineerComplain;
import com.masai.exceptions.ComplainException;
import com.masai.exceptions.EngineerException;

public interface EngineerDao {
	
	public String loginEngineer(String usersname, String password)throws EngineerException;

	public List<EngineerComplain> ComplainAssignedByHod(int engid)throws ComplainException;
	
	public String updateStatus(int engId)throws ComplainException;
	
	public List<EngineerComplain> AttendedComplain(int engid)throws ComplainException;
	
	public String changePassword(String password,int engid)throws EngineerException;
	
}
