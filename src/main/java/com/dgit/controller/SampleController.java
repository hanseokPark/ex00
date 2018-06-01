package com.dgit.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SampleController {
	private static final Logger logger = LoggerFactory.getLogger(SampleController.class);
	
	@RequestMapping(value="doB", method=RequestMethod.GET)
	public String doB(){
		logger.info("------- doB GET -------");
		
		return "doB";
	}
	
	@RequestMapping(value="doC", method=RequestMethod.GET)
	public String doC(String aa, String bb, Model model){ //aa=test
		logger.info("------- doC Get -------");
		logger.info("aa : " + aa);
		logger.info("bb : " + bb);
		model.addAttribute("msg1", aa);
		model.addAttribute("msg2", bb);
		return "doC";
	}
	
	@RequestMapping(value="doC2", method=RequestMethod.GET)
	public String doC2(@ModelAttribute("msg1") String msg1, @ModelAttribute("msg2") String msg2){
		logger.info("------- doC2 Get -------");
		
		return "doC";
	}
	
	@RequestMapping(value="doC3", method=RequestMethod.GET)
	public String doC3(int msg1, Model model){ //doC3?msg1=11  숫자로 바꿔줌
		logger.info("------- doC3 Get -------");
		model.addAttribute("msg1", msg1);
		return "doC";
	}
	@RequestMapping(value="doC4", method=RequestMethod.GET)
	public String doC4(@ModelAttribute("msg1") double msg1){ //doC4?msg1=11.11
		logger.info("------- doC4 Get -------");
		
		return "doC";
	}
}








