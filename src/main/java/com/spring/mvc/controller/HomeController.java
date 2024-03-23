package com.spring.mvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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
}
