package com.mangment.test;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;




@org.springframework.stereotype.Controller
public class Controller {
	
	@RequestMapping("/helloWorld")
	public String test(Model model){
		model.addAttribute("message","MVC success");
		return "Message";
	}

}
