package com.niit.Dao;

public interface RegisterDao {

	
	public void  adduser(String name,String password,String emailId,String customerName);
	public String getUserOnNamePassword(String userName);
	
}
