package com.web.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("stu")
public class SpringMVCController {

	
	//stu/food
	@GetMapping(value = "/food")
	public ModelAndView food() {
		
		return new ModelAndView("cupcake","eat","Eat sleep code repeat");
	}
	
}
