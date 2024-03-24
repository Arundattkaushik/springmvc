package com.spring.mvc.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

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
	public String handleRegistration(
			@RequestParam("firstname")
			String fname,
			@RequestParam("middlename")
			String middlename
			) {
		System.out.println(fname);
		return "";
	}
}
