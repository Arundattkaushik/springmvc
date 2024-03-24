package com.spring.mvc.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.spring.mvc.models.Login;
import com.spring.mvc.models.Student;

@Controller
public class HomeController {

	@RequestMapping("/home")
	public String home(Model model) {
		model.addAttribute("name", "Arun");
		List<String> list = new ArrayList();
		list.add("hello");
		list.add("i");
		list.add("am");
		list.add("a");
		list.add("java");
		list.add("developer");
		model.addAttribute("l",list);
		return "index";
	}
	
	@RequestMapping("/about")
	public ModelAndView about(ModelAndView modelAndView) {
		modelAndView.addObject("name", "Arun");
		modelAndView.setViewName("about");
		return modelAndView;
	}
	
	@RequestMapping("/help")
	public ModelAndView help() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("help","This is help");
		modelAndView.setViewName("help");
		return modelAndView;
	}
	
	@RequestMapping("/registration")
	public ModelAndView register() {
		ModelAndView modelAndView = new ModelAndView();
		
		modelAndView.setViewName("registration");
		return modelAndView;
	}
	
	
	@RequestMapping(path = "/registration", method = RequestMethod.POST)
	public ModelAndView handleRegistration(
			@RequestParam("firstname")
			String fname,
			@RequestParam("middlename")
			String middlename,
			ModelAndView modelAndView
			) {
		System.out.println(fname);
		modelAndView.addObject("fname", fname);
		modelAndView.setViewName("success");
		return modelAndView;
	}
	
	@RequestMapping(path = "/login")
	public ModelAndView login()	{
		ModelAndView andView = new ModelAndView();
		
		andView.setViewName("login");
		return andView;
	}
	
	
	//With the help of model attribute
	@RequestMapping(path = "/loginProcessor", method = RequestMethod.POST)
	public ModelAndView loginHandler
	(
			Model model, 
			@ModelAttribute Login login,
			ModelAndView andView
	) 
	{
		model.addAttribute("login",login);
		andView.setViewName("success");
		return andView;
	}
}
