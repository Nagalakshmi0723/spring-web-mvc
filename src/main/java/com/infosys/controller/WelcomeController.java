package com.infosys.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {
	
	public WelcomeController() {
		System.out.println("welcome constructor");
	}
		@GetMapping("/welcome")
		public ModelAndView getWelcomeMsg() {
			System.out.println("welcome method");
			ModelAndView mav=new ModelAndView();
			mav.addObject("msg1", "Welcome to Controller class");
			mav.addObject("msg", "welcome");
			mav.setViewName("index");
			return mav;
		} 
		@GetMapping("/date")
		public ModelAndView getDate() {
			System.out.println("welcome method");
			ModelAndView mav=new ModelAndView();
			mav.addObject("msg2", new Date());
			mav.setViewName("index");
			return mav;
		}
	}


