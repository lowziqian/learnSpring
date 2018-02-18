package com.learnspring;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

	
	@RequestMapping("/showForm")
	public String showForm(Model theModel)
	{
		
		theModel.addAttribute("student",new Student());	
		return "studentInput";
	}
	
	//get the values from student
	@RequestMapping("/processForm")
	public String processForm(@Valid @ModelAttribute("student")Student newStudent, BindingResult theBindingResult)
	{	
		System.out.println("Student Name is : "+newStudent.getName());
		if(theBindingResult.hasErrors())
		{
		
			return "studentInput";
		}
		else return "studentOutput";
		
	}
}
