package com.dgit.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dgit.domain.BMICalculator;
import com.dgit.domain.MyInfo;

@Controller
public class BmiController {
	private static final Logger logger = LoggerFactory.getLogger(BmiController.class);
	
	@Autowired
	BMICalculator bmiCalulator;
	
	
	@RequestMapping(value="Bmi", method=RequestMethod.GET)
	public String BmiForm(){
		logger.info("-------- Bmi from --------");
		
		return "bmiForm";
	}
	/*@RequestMapping(value="Bmi",  method=RequestMethod.POST)
	public String BmiResult(String name, double height, double weight, String Hobby1, String Hobby2, String Hobby3, Model model){
		double h = height * 0.01;
		double bmi = weight / (h * h);
		String result;
		
		if(bmi > 30){
			result = "비만 입니다.";
		}else if(bmi > 25){
			result = "과체중 입니다.";
		}else if(bmi > 23){
			result = "정상 입니다.";
		}else{
			result = "저체중 입니다.";
		}
		
		logger.info("-------- Bmi from --------");
		logger.info("name",name);
		logger.info("height",height);
		logger.info("weight",weight);
		logger.info("Hobby1",Hobby1);
		logger.info("Hobby2",Hobby2);
		logger.info("Hobby3",Hobby3);
		logger.info("result",result);
		
		model.addAttribute("name",name);
		model.addAttribute("height",height);
		model.addAttribute("weight",weight);
		model.addAttribute("Hobby1",Hobby1);
		model.addAttribute("Hobby2",Hobby2);
		model.addAttribute("Hobby3",Hobby3);
		model.addAttribute("result",result);
		
		return "bmiResult";
	}*/
	@RequestMapping(value="Bmi",  method=RequestMethod.POST)
	public String BmiResult(MyInfo info, Model model){
		logger.info("-------- Bmi Result --------");
		
		info.setBmiCalculator(bmiCalulator);
		
		model.addAttribute("info", info);
		
		return "bmiResult";
	}
}
