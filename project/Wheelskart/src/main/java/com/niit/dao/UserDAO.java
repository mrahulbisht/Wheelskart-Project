package com.niit.dao;

import java.util.List;

import com.niit.domain.User;



public interface UserDAO {
		
	//declare the methodss
	//what type of operations you are going to do for user.
	//operations
	//1) create /register  - save
	//2) update the user details - update
	//3) validate the credentials - validate
	//4) ger all users - list
	
	//declare the methods whit proper signature 
	//access_specifier return_type methodname ( Parameter_list) throws exception_list
	
	
	//create/register -save
	public boolean save(User user);
	//update the user details - update
	
	public boolean update(User user);
	//validate the credentials - validate
	
	public boolean validate(String id, String password);
	
	
	//get all users - list
	
	public List<User>   list();
	
	//get user details based on userID00
	public User get(String id);

}
