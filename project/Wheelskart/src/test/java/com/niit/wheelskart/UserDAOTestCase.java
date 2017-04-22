package com.niit.wheelskart;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.dao.UserDAO;
import com.niit.domain.User;

import junit.framework.TestCase;

public class UserDAOTestCase 
{

	@Autowired  static AnnotationConfigApplicationContext Context;
	
@Autowired  static UserDAO  userDAO;
	
	@Autowired  static User user;

	private static AnnotationConfigApplicationContext context;
	
	
	//The above objects need to initialize
	/**
	 * This method is going execute before calling any one of test case
	 * and will execute only once
	 */
	@BeforeClass
	public static void initialize()
	{
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
		
		//get the userDAO from context
		userDAO =  (UserDAO) context.getBean("userDAO");
		
		//get the user from context
		
		user = (User)context.getBean("user");
		
	}
	
	@Test
	public void createUserTestCase()
	{
		user.setId("suveen");
		user.setName("Suveen Kumar");
		user.setPassword("suveen");
		user.setRole("ROLE_USER");
		user.setContact("DilshukNagar");
		boolean flag =  userDAO.save(user);
		System.out.println("");
		
	

		//error - if there is in runtime errors  -  Red mark
		//success  - if expected and actual is same  - green mark
		//fail  - if expected and actual is different  -  blue mark
		assertEquals("createUserTestCase",true,flag);
		
	}
	
	
	
	
}
