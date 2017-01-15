package com.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

//orignally i labelled project as SpringMVCRESTfulService


@Controller
public class SpringMVCController {
	
	private static final Logger logger = Logger.getLogger(SpringMVCController.class);
	
	@RequestMapping(value = "/firstPage")
	public String firstPage(ModelMap model) {
		
		logger.info("Log4j info is working");
        logger.warn("Log4j warn is working");       
        logger.debug("Log4j debug is working");
        logger.error("Log4j error is working");
        System.out.println("System out is working");
		model.addAttribute("message", "Spring MVC RESTFul Service");
		
		return "index";		
	}
	
	@RequestMapping(value = "/springMVCRESTFulService", method=RequestMethod.POST)
	public @ResponseBody String springMVCRESTFulService(@RequestBody String requestBody) {
		
		//If request contains multiple line and form submitted split data using 
		//New Line Code "%0D%0A"
		String value[] = requestBody.split("&");
		String name[] = value[0].split("=");
		
		System.out.println("Name: "+name[1].replace('+', ' '));
		
		String textAreaValue[] = value[1].split("=");		
		
		//New Line Code "%0D%0A"
		String val3[] = textAreaValue[1].replace('+', ' ').split("%0D%0A");
		if (val3.length != 0  && val3.length == 1) {
			val3 = textAreaValue[1].replace('+', ' ').split("\n");
		}
		StringBuffer finalValue = new StringBuffer();
		for (String string : val3) {
			System.out.println(string);
			finalValue.append(string+" ");
			
		}
		return "entered value --> Name = "+name[1].replace('+', ' ')+" Text Area value =  "+finalValue.toString();
	}
	
	@RequestMapping(value = "/springMVCRESTFulService2", method=RequestMethod.POST)
	public @ResponseBody String angularServicePostCall2(@RequestParam String name, @RequestParam String stringValue) {
		
		//Split data if its multiple line
		String value[] = stringValue.split("\r\n");
		StringBuffer finalValue = new StringBuffer();
		for (String string : value) {
			System.out.println("Value entered in text area: "+string);
			finalValue.append(string+" ");
		}
		
		return "You entered value --> Name = "+name+" Text Area value =  "+finalValue.toString();		
	}
	

}
