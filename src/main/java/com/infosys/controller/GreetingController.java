package com.infosys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/c2")
public class GreetingController {
	@GetMapping("/Greeting")
	public ModelAndView getGreeting() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("wish", "Good Morning");
		mav.setViewName("Greet");
		return mav;
	}
	@GetMapping("/welcome")
	public ModelAndView getUser() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("id", "101");
		mav.addObject("name", "Bikki");
		mav.addObject("role", "SSE");
		mav.setViewName("Greet");
		return mav;
	}
}


