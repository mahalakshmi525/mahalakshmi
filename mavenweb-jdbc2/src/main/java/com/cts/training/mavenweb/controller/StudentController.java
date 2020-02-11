package com.cts.training.mavenweb.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cts.training.mavenweb.dao.IStudentDao;
import com.cts.training.mavenweb.entity.Student;
import com.cts.training.mavenweb.services.IStudentService;

@Controller
@RequestMapping("/student")
public class StudentController {

	// dependency
	@Autowired
	private IStudentDao studentDao;
	private Object studentService;
	
	@RequestMapping("/all")
	public String showAll(Model model) {
		// get data from DAO layer
		List<Student> students = this.studentDao.findAll();
		
		// add to model object
		model.addAttribute("students", students);
		
		// return the view page
		return "student-list";
	}
	@RequestMapping("/entry")
	public String entry(Model model) {
		Student student=new Student();
model.addAttribute("student", student);
		
		return "student-entry";
	}
	@RequestMapping("/save")
	public String save(@ModelAttribute Student student) {
		
		this.studentService.addStudent(student);
	
		return "redirect:/student/all";
	}
	@RequestMapping("/update")
	public String update(@RequestParam Integer id, Model model) {
		
		
		Student student = this.studentService.findStudentById(id);
		
		
		model.addAttribute("student", student);
		
		return "student-update";
	
	
}
	
}
