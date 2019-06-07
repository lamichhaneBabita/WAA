package com.students.contoller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.students.domain.Student;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.awt.im.InputMethodRequests;

@Controller
@RequestMapping("/")
public class StudentController {

	@RequestMapping(value="/registration",method=RequestMethod.GET)
	public String showForm(@ModelAttribute("student") Student student, Model model){

		return "registration";
	}



	@RequestMapping(value="/add",method=RequestMethod.POST)
	public String processForm(@Valid @ModelAttribute("student") Student student,
							  Model model, RedirectAttributes redirectAttributes, BindingResult result){



		if(result.hasErrors())
			return "registration";
		else
			redirectAttributes.addFlashAttribute(student);
			return "redirect:/success";



	}

	@RequestMapping(value = "/success", method = RequestMethod.GET)
	public String details(){
		return "success";
	}


	}

	

