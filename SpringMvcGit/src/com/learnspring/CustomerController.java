package com.learnspring;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	@InitBinder
	public void initBinder(WebDataBinder dataBinder)
	{
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class,stringTrimmerEditor);
	}
	
	@RequestMapping("/showForm")
	public String showform(Model theModel)
	{
		theModel.addAttribute("customer",new Customer());
		return "customerInput";
	}
	
	@RequestMapping("processForm")
	public String procesForm(@Valid @ModelAttribute("customer")Customer newCustomer, BindingResult theBindingResult)
	{
		
		if(theBindingResult.hasErrors())
		{
			return "customerInput";
		}
		else return "customerOutput";
	}
}
