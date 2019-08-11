package com.niit.DataBaseConfig;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConfig {
	
	
	public static Connection getConnection()
	
	{
		Connection con=null;
		try {
			Class.forName("org.h2.Driver");
	        con=DriverManager.getConnection("jdbc:h2:tcp://localhost/~/db","sa","sa");
	        System.out.println(" connection to database ");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		return con;
		
	}
	

}
