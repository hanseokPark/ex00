package com.dgit.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class NumberController {
	private static final Logger logger = LoggerFactory.getLogger(NumberController.class);

	@RequestMapping(value="Number", method=RequestMethod.GET)
	public String NumberForm(){
		logger.info("-------- number from --------");
		
		return "numberForm";
	}
	@RequestMapping(value="Number", method=RequestMethod.POST)
	public String NumberResult(double num1, double num2, Model model){
		logger.info("-------- number result --------");
		
		logger.info("num1 : " + num1);
		logger.info("num2 : " + num2);
		
		model.addAttribute("num1",num1);
		model.addAttribute("num2",num2);
		
		return "numberResult";
	}
}
