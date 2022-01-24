package com.techproed.springmvctutorial;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class resultController {
	
	//1.way
	
	@RequestMapping("add") //the parameter should be the same as the action in the form
	public String addNums1 (HttpServletRequest req) {
		
		int a=Integer.parseInt(req.getParameter("n1")); //This method returna a string so we are converting
		int b=Integer.parseInt(req.getParameter("n2"));
		int sum=a+b;
		
		HttpSession session= req.getSession();
		session.setAttribute("sumOfTwoIntegers", sum);
		
		return "result.jsp";
		
	}
	

}
