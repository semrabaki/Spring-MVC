package com.techproed.springmvctutorial;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


//@Controller annotation is used to indicate that this is a controller class for all methods
@Controller
public class HomeController {
	
	//@RqeuestMapping () is used to make the method work as a request and to accept request
	@RequestMapping("/")
	public String home() {
		
		return "index";  //it means this methods will return index.jsp which is home page
	}

}
