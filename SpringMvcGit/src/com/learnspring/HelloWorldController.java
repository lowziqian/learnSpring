package com.learnspring;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {

	// show the initial form
	@RequestMapping("/showForm")
	public String showForm() {

		return "helloworld-form";
	}

	// controller method to process the form
	@RequestMapping("/processForm")
	public String processForm() {

		return "helloworld-print";
	}
	@RequestMapping("/home")
	public String showMainPage() {
		
		return "main-menu";
	}
	
	
	@RequestMapping("/processFormData")
	public String processFormData(HttpServletRequest request , Model model) {
		
		
		String name = request.getParameter("studentName");
		
		name = name.toUpperCase();
		
		model.addAttribute("name",name);
		
		return "helloworld-print";
	}
	
	//using RequestParam
	@RequestMapping("/processFormDataVersion2")
	public String processFormDataVersion2(@RequestParam("studentName") String theName , Model model) {
		
	
		model.addAttribute("name",theName.toUpperCase());
		
		return "helloworld-print";
	}
}
