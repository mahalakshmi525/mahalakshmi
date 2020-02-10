package com.cts.training.sring.web.controller;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


import com.cts.training.web.model.Student;

@Controller
@RequestMapping("/student")
public class StudentController {
	 @RequestMapping("/dashboard")
	public String home() {
		return "student-home";
	}
	
	@RequestMapping("/profile")
	public String profile() {
		return "student-profile";
	}
	@RequestMapping("/save") 
	
	public ModelAndView saveData(Student student) {
		System.out.println("\nName : " + student.getUname());
		System.out.println("Email : " + student.getEmail());
		
		
		student.setUname(student.getUname().toUpperCase());
		student.setEmail(student.getEmail().toUpperCase());
		
		ModelAndView mv = new ModelAndView("student-confirm");
		
		mv.addObject("stud", student);
		
		
		return mv;
	}
	
	
	
	
	
	@RequestMapping() 
	public String defaultMethod() {
		return "student-home";
	}
	
	
	@RequestMapping("*") 
	public String fallbackMethod() {
		return "student-error";
	}
	
}
