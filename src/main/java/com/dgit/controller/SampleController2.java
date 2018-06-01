package com.dgit.controller;

import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dgit.domain.ProductVO;





@Controller
public class SampleController2 {
	private static final Logger logger = LoggerFactory.getLogger(SampleController2.class);
	
	@RequestMapping(value="doD", method=RequestMethod.GET)
	public String doD(Model model){
		logger.info("------- doD GET -------");
		
		ProductVO vo = new ProductVO();
		vo.setName("새우깡");
		vo.setPrice(1000);
		
		model.addAttribute("product", vo);
		
		return "result";
	}
	
	@RequestMapping(value="doE", method=RequestMethod.GET)
	public String doE(Model model){
		logger.info("-------- doE GET --------");
		ArrayList<ProductVO> list = new ArrayList<>();
		
		ProductVO vo1 = new ProductVO();
		vo1.setName("꿀꽈배기");
		vo1.setPrice(1200);
		list.add(vo1);
		
		ProductVO vo2 = new ProductVO();
		vo2.setName("브라보콘");
		vo2.setPrice(1500);
		list.add(vo2);
		
		model.addAttribute("list",list);
		return "resultList";
	}
	
	@RequestMapping(value="doF", method=RequestMethod.GET)
	public String forwardTest(){
		logger.info("-------- doF GET --------");
		
		return "forward:doD";
	}
	@RequestMapping(value="doG", method=RequestMethod.GET)
	public String redirectTest(){
		logger.info("-------- doG GET --------");
		
		return "redirect:doE";
	}
	
	@ResponseBody
	@RequestMapping(value="doJson", method=RequestMethod.GET)
	public ProductVO doJSON(){  //화면에 {"name":"고래밥","price":760.0} 나옴
		logger.info("------- doJSON -------");
		
		ProductVO vo = new ProductVO();
		vo.setName("고래밥");
		vo.setPrice(760);
		
		return vo;
	}
}






