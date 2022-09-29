package com.masai.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.masai.bean.Engineer;
import com.masai.utility.DBUtil;

public class EngineerDaoImpl implements EngineerDao{

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
	public Engineer getEngineerById(int engid) {
		
		Engineer engineer = null;
		
		
		try(Connection conn = DBUtil.provideConnection()) {
			
			PreparedStatement ps = conn.prepareStatement("select * from Register_Engineer where engid = ?");
			ps.setInt(1, engid);
			
			ResultSet rs =  ps.executeQuery();
			
			if(rs.next()) {
				int eid = rs.getInt("engid");
				String name = rs.getString("name");
				String username = rs.getString("username");
				String password = rs.getString("password");
				String category = rs.getString("category");
				
				
				engineer = new Engineer(eid,name,username,password,category);
				
			}
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			
		}
		
		
		
		
		
		return engineer;
		
	}

}
