package com.masai.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.masai.bean.Engineer;
import com.masai.dao.HODDao;
import com.masai.exceptions.EngineerException;
import com.masai.exceptions.HodException;
import com.masai.utility.DBUtil;

public class HODDaoImpl implements HODDao{
	
	@Override
	public boolean LoginHOD(String name ,String username, String password) throws HodException {
		
		
		try(Connection conn = DBUtil.provideConnection()) {
			
		PreparedStatement ps = conn.prepareStatement("select * from LoginHOD where name = ? AND username = ? AND password = ?");
		
		ps.setString(1, name);
		ps.setString(2, username);
		ps.setString(3, password);
		
			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				System.out.println("Login Succesfull !");
				return true;
			} else {
				throw new HodException("Invalid Credentials");
	
			}
			
		} catch (SQLException e) {
			
			throw new HodException(e.getMessage());
			
		}

	}

	@Override
	public String registerEngineer(Engineer engineer) {
		
		String message = "Engineer Not Registered....";
		
		
		try(Connection conn =  DBUtil.provideConnection()) {
			
		PreparedStatement ps = conn.prepareStatement
								("insert into Register_Engineer(name,username,password,category) values(?,?,?,?)");
		
		ps.setString(1, engineer.getName());
		ps.setString(2, engineer.getUsername());
		ps.setString(3, engineer.getPassword());
		ps.setString(4, engineer.getCategory());
		
		int x = ps.executeUpdate();
		
		if(x > 0) {
			message = "Engineer Registered Sucessfully !";
		}
			
			
		} catch (SQLException e) {
			message = e.getMessage();
		}
		
		
		return message;
		
		
	}

	@Override
	public List<Engineer> getAllEngineerDetails() throws EngineerException {
		
		List<Engineer> list = new ArrayList<>();

		try (Connection conn = DBUtil.provideConnection()) {
			
			PreparedStatement ps = conn.prepareStatement("select * from Register_Engineer");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				int engid = rs.getInt("engid");
				String name = rs.getString("name");
				String username = rs.getString("username");
				String password = rs.getString("password");
				String category = rs.getString("category");
				list.add(new Engineer(engid,name, username, password, category));
			}
		} catch (SQLException se) {
			throw new EngineerException(se.getMessage());
		}
		if (list.size() == 0) {
			throw new EngineerException("No Engineer Found !!!!");
		}
		return list;
	}



}
