package org.crce.interns.service;
import org.crce.interns.dao.*;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("loginService")
public class LoginServiceImpl implements LoginService {

	 @Autowired
	 private LoginDAO loginDAO;

	   public void setLoginDAO(LoginDAO loginDAO) {
              this.loginDAO = loginDAO;
       }
      
	   public String checkLogin(String userName, String userPassword){
           
		   System.out.println("In Service class...Check Login");
           
		   return loginDAO.checkLogin(userName, userPassword);
	   }
	}