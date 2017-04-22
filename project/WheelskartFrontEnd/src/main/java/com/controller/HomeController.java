package com.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.SocketUtils;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	//http://localhost:8080/wheelsportal/
	public HomeController()
	{
		System.out.println("in home controller");
		
	}
	@RequestMapping("/")
	public  String goToHome(Model model)
	
	{
		System.out.println("In goToHOme method");
		model.addAttribute("message", "Thank you for visiting Shopping Cart");
		return "Home";
		
	}
	
	
	@RequestMapping("/LoginPage")
	public String loginPage(Model model)
	{
		model.addAttribute("isUserClickedLogin", "true");
	
		return "Login";
	}
	
	@RequestMapping("/RegistrationPage")
	public String registrationPage(Model model)
	{
		model.addAttribute("isUserClickedRegister", "true");
		
		return "Registration";
	}


}
