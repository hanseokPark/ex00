package com.dgit.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dgit.domain.Report;
import com.dgit.domain.StudentInfo;

@Controller
public class StudentController {
	private static final Logger logger = LoggerFactory.getLogger(StudentController.class);
	
	@Autowired
	Report report;
	
	@RequestMapping(value="student", method=RequestMethod.GET)
	public String studentForm(){
		logger.info("-------------- std get -------------");
		
		return "StudentForm";
	}
	
	@RequestMapping(value="student", method=RequestMethod.POST)
	public String studentResult(StudentInfo info, Model model){
		logger.info("-------- std post -------");
		
		info.setReport(report);
		model.addAttribute("info",info);
		return "StudentResult";
	}
}
