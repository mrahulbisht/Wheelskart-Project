package com.controller;

import org.h2.engine.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.dao.UserDAO;

public class UserController {
	
	@Autowired UserDAO userDAO;
	@Autowired com.niit.domain.User user;
	
	//get the user id password from the login page
	//send these values to userDAO.validate
	//based on response , you can navigate to either login.jsp or home.jsp

	
	@RequestMapping("/validate")
	public ModelAndView login(@RequestParam("userName") String id,@RequestParam("password") String password)
{
	ModelAndView mv = new ModelAndView("/Home");
	if(userDAO.validate(id, password)==true)
	{
		user =userDAO.get(id);
		//&{message} - to display in the home.
		mv.addObject("message","WELCOME"+user.getName());
	}
	else
	{
		mv.addObject("message", "INvalid credentials....please try again");
	}
	return mv;
	
}
}

