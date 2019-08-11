package com.niit.DaoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.niit.Dao.RegisterDao;
import com.niit.DataBaseConfig.DataBaseConfig;

public class RegisterDaoImpl implements RegisterDao{

	
	
	@Override
	public void adduser(String name, String password, String emailId, String customerName) {
		
	Connection con=DataBaseConfig.getConnection();
	String sql="insert into User values (?,?,?,?)";
	PreparedStatement pt;
	try {
		pt = con.prepareStatement(sql);
		pt.setString(1, name);
		pt.setString(2, password);
		pt.setString(3, emailId);
		pt.setString(4, customerName);
		pt.execute();
		System.out.println(" register to database");
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
	}

	@Override
	public String getUserOnNamePassword(String userName) {
		Connection con=DataBaseConfig.getConnection();
		String pass=null;
		try {
			Statement st=con.createStatement();
			ResultSet rt=st.executeQuery("select password from User where userName = ?");
			while(rt.next())
			{
				pass=rt.getString(2);
			}
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return pass;
	}

}
