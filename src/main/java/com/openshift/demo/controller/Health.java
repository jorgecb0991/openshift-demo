package com.openshift.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Health {

	
	@RequestMapping(value="/salud", method=RequestMethod.GET)
	public String login() {
		
		return "Hola Mundo openshift!!";
	}
}
