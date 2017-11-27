package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@Value("${mytest1}")
	String mytest1;
	
	@Value("${mytest2}")
	String mytest2;
	
	@RequestMapping(value="/values", method=RequestMethod.GET)
	public String myTestMethod(){
		return mytest1+" "+mytest2;
	}
}
