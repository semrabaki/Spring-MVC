package com.techproed.springmvctutorial;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class resultController {
	
	//1.way
	
//	@RequestMapping("add") //the parameter should be the same as the action in the form
//	public String addNums1 (HttpServletRequest req) {
//		
//		int a=Integer.parseInt(req.getParameter("n1")); //This method return a string so we are converting
//		int b=Integer.parseInt(req.getParameter("n2"));
//		int sum=a+b;
//		
//		int product= a*b;
//		
//		HttpSession session= req.getSession();  //This is how you create a session
//		session.setAttribute("sumOfTwoIntegers", sum); //for every operation you need to set an attribute after you create a session
//		
//		session.setAttribute("productOfTwoIntegers", product);
//		
//		return "result.jsp";
//		
//	}
	
	
	//2.way
//	@RequestMapping("add")
//	public String addNums2(@RequestParam("n1") int a, @RequestParam("n2")int b, HttpSession session)
//	{
//		int sum= a+b;
//		int product= a*b;
//		session.setAttribute("sumOfTwoIntegers",sum);
//		session.setAttribute("productOfTwoIntegers", product);
//		
//		return "result.jsp";
//	}
	
	//3. way
	
//	@RequestMapping("add")
//	public ModelAndView addNums3(@RequestParam("n1") int a, @RequestParam("n2")int b)
//	{
//		ModelAndView mv= new ModelAndView(); //this is a class
//		mv.setViewName("result.jsp"); //this gives the page reference? where to show the result
//		int sum= a+b;
//		int product= a*b;
//		mv.addObject("sumOfTwoIntegers",sum);
//		mv.addObject("productOfTwoIntegers", product);
//		
//		return mv;
//	}
	
	//4.way //This is the most preferred way
//	@RequestMapping("add")
//	public ModelAndView addNums4(@RequestParam("n1") int a, @RequestParam("n2")int b)
//	{
//		ModelAndView mv= new ModelAndView("result.jsp"); //this gives the page reference? where to show the result we gave it as constructor parameter
//		int sum= a+b;
//		int product= a*b;
//		mv.addObject("sumOfTwoIntegers",sum);
//		mv.addObject("productOfTwoIntegers", product);
//		
//		return mv;
//	}
	
//	//5.way //This is showing the usage model interface
//	@RequestMapping("add") 
//	public String addNums4(@RequestParam("n1") int a, @RequestParam("n2")int b, Model m)
//	{
//		int sum= a+b;
//		int product= a*b;
//		//First usage of model interface
////		m.addAttribute("sumOfTwoIntegers",sum);
////		m.addAttribute("productOfTwoIntegers", product);
//
//		//Second usage:
//		m.addAttribute("sumOfTwoIntegers",sum).addAttribute("productOfTwoIntegers",product);
//		return "result.jsp";
//	}
	
//	//6.way Model Mapping
//	@RequestMapping("add")
//	public String addNums6(@RequestParam("n1") int a, @RequestParam("n2")int b, ModelMap mm)
//	{
//	
//		int sum= a+b;
//		int product= a*b;
//		//First Usage
//		mm.addAttribute("sumOfTwoIntegers",sum);
//		mm.addAttribute("productOfTwoIntegers", product);
//		
//		//Second Usage( chaining)
//		//mm.addAttribute("sumOfTwoIntegers",sum).addAttribute("productOfTwoIntegers", product);
//		
//		return "result";
//	}
	
	//*************************************************************************************
	
	//Student Method
	
	//1.way:
	
//	@RequestMapping("addStudent")
//	public String addStudent1(@RequestParam("id") int id, @RequestParam("name") String name, Model m)
//	{
//		//First Object Creation Way
////		Student student= new Student();
////		student.setId(id);
////		student.setName(name);      //This is using constructor without paramters
//		
//		//Second Object Creation Way
//		
//		Student student= new Student(id,name); //making params dynamic bcz the user will enter them
//		m.addAttribute("studentObject",student);
//		return "result";
//		
//	}
	
//	//2.way
//	
//	@RequestMapping("addStudent")
//	public String addStudent2(@ModelAttribute Student student, Model m) {
//		m.addAttribute("studentObject",student);
//		
//		return "result";
//	}

	//3.way
	
//		@RequestMapping("addStudent")
//		public String addStudent3(@ModelAttribute("studentObject") Student student) {
//			
//			return "result";
//		}
//		
//		//How to get a specific field from the object, you need to use ModelAttribute
//		
//		@ModelAttribute
//		public void greetStudent(Model m, Student student)
//		{
//			m.addAttribute("greetStudent",student.getName());
//			
//		}
//		
		//How to use POST method:
		//1.way
	    /*to use post method:
	     * 1)inside the methos paranthesis type methos=RequestMethos.POST
	     * 2)then go to index.jsp file and add methos= "post" inside the form tag
	     * 
	     */

//		@RequestMapping(value="addStudent",method=RequestMethod.POST)
//		public String addStudent4(@ModelAttribute("studentObject") Student student) {
//			
//			return "result";
//		}
//		
//		//How to get a specific field from the object, you need to use ModelAttribute
//		
//		@ModelAttribute
//		public void greetStudent(Model m, Student student)
//		{
//			m.addAttribute("greetStudent",student.getName());
//			
//		}
		
		//2.way:
	/*
	 To use post methos:
	 1)Use @PostMApping ("addStudent") with action name from the form tag
	 2)then go to index.jsp and add method="post" inside the from tag
	 */
	
//	@PostMapping("addStudent")
//	public String addStudent4(@ModelAttribute("studentObject") Student student) {
//		
//		return "result";
//	}
//	
//	//How to get a specific field from the object, you need to use ModelAttribute
//	
//	@ModelAttribute
//	public void greetStudent(Model m, Student student)
//	{
//		m.addAttribute("greetStudent",student.getName());
//		
//	}
	
	//How to use Get Method
	
	//1.way
	 /*
	     1) Inside the methos parantehsis type "methos=ReqeuestMethos.GET"
	     2)Go to index.jsp and add "methos=get"inside the form tag
	     3)Go to result.jsp file and type ==>${studentList}
	  */
//	@RequestMapping(value="getStudent", method=RequestMethod.GET)
//	public String getStudent(Model m) {
//		List <Student>students= new ArrayList<>();
//		students.add(new Student(101,"Ali Can"));
//		students.add(new Student(102,"Veli Can"));
//		students.add(new Student(103,"Mary Star"));
//		students.add(new Student(104,"Tom Hanks"));
//		students.add(new Student(105,"Angie Ocean"));
//		m.addAttribute("studentList", students);
//		return "result";
//	}
	//2.way
	
//	@GetMapping(value="getStudent")
//	public String getStudent(Model m) {
//		List <Student>students= new ArrayList<>();
//		students.add(new Student(101,"Ali Can"));
//		students.add(new Student(102,"Veli Can"));
//		students.add(new Student(103,"Mary Star"));
//		students.add(new Student(104,"Tom Hanks"));
//		students.add(new Student(105,"Angie Ocean"));
//		m.addAttribute("studentList", students);
//		return "result";
//	}
	
	//hot to get a specofoc student 
	
	
	@GetMapping(value="getStudentWithId")
	public String getSpecificStudent(@RequestParam("id") int id, Model m) {
		
		List <Student>students= new ArrayList<>();
		students.add(new Student(101,"Ali Can"));
		students.add(new Student(102,"Veli Can"));
		students.add(new Student(103,"Mary Star"));
		students.add(new Student(104,"Tom Hanks"));
		students.add(new Student(105,"Angie Ocean"));
		
		int idx=-1;//index value normally cannot be -, but if we put 0 its the 1st index->-1 is a false index
		for(Student w:students) {
			if(id==w.getId()) {
				idx=students.indexOf(w);
				
			}
		}
		if(idx==-1) //means there is not such id
			{m.addAttribute("specificStudent", "There is no such ID");}
		else
		{
			m.addAttribute("specificStudent",students.get(idx));
			}
		return "result";
	}
	
	
	
	
	
	
	
}
