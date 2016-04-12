package org.crce.interns.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.validation.BindingResult;
import org.crce.interns.beans.LoginForm;
import org.crce.interns.service.*;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;

import java.util.Map;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

@Controller
public class LoginController extends HttpServlet{

	
	@Autowired
	public LoginService loginService;
	
	
	@RequestMapping("/")
	public ModelAndView welcome() {
		System.out.println("return model");
		return new ModelAndView("index");
	}
	
	/*@RequestMapping(value="/", method = RequestMethod.GET)
	public String index() {
		
		System.out.println("Inside Controller");
		
		//ModelAndView model=null;
		
		//model = new ModelAndView("index");
		System.out.println("return model");
		//return model;
		return "index";
		
	}*/

	@RequestMapping(value="/form" , method = RequestMethod.GET)  
  	public ModelAndView showForm(HttpServletRequest request, HttpServletResponse response) {
		
		System.out.println("Inside Controller");
		LoginForm loginForm = new LoginForm();
		ModelAndView model=null;
		//model = new ModelAndView("loginform");
		model = new ModelAndView("Login");
		model.addObject("loginForm", loginForm);
		//model.a
		/*HttpSession session = request.getSession();
		 request.getAttribute("userName");
		 
			String name = (String) session.getAttribute("userName");
			String Role = (String) session.getAttribute("role");
		*/
			
		return model;	
		
	}
	
	@RequestMapping(value="/logged" ,method = RequestMethod.POST)
	public ModelAndView processForm(HttpServletRequest request, HttpServletResponse response, @Valid LoginForm loginForm, BindingResult result) {

		System.out.println("Inside Controller");
		ModelAndView model=null;	
		/*if (result.hasErrors()) {
			return "loginform";
		}*/
		
		String role=loginService.checkLogin(loginForm.getUserName(),loginForm.getPassword());
			
		System.out.println("Role is:" +role);
		/*
		if(role.equals("Student")){
			model.put("loginForm", loginForm);
			return "Student";
		}
		else if(role.equals("StudentTPC"))
		{
			model.put("loginForm", loginForm);
			return "StudentTPC";
		}
		else if(role.equals("TPO"))
		{
			model.put("loginForm", loginForm);
			return "TPO";
		}
		else{
			result.rejectValue("userName","invaliduser");
			return "loginform";
		}
		*/
		
		
		
		if(role.equals("Student")){
			model = new ModelAndView("Student");
			HttpSession session=request.getSession();
			String name =  request.getParameter("userName");
		    System.out.println("UserName: " + name); // Here it prints the username properly
		    request.getSession(true).setAttribute("userName", name );
		    System.out.println("Logged in as what????: " + name);
			return model;
		}
		else if(role.equals("StudentTPC"))
		{
			model = new ModelAndView("StudentTPC");
			HttpSession session=request.getSession();
			String name =  request.getParameter("userName");
		    System.out.println("UserName: " + name); // Here it prints the username properly
		    request.getSession(true).setAttribute("userName", name );
		    System.out.println("Logged in as what????: " + name);
			return model;
		}
		else if(role.equals("TPO"))
		{
			model = new ModelAndView("TPO");
			HttpSession session=request.getSession();
			String name =  request.getParameter("userName");
		    System.out.println("UserName: " + name); // Here it prints the username properly
		    request.getSession(true).setAttribute("userName", name );
		    System.out.println("Logged in as what????: " + name);
			return model;
		}
		else{
			result.rejectValue("userName","invaliduser");
			model = new ModelAndView("loginform");
			return model;
		}
	}
	

}
