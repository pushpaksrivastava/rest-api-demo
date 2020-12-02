package com.example.springBoot.REST.Restapidemo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.springBoot.REST.Restapidemo.service.WelcomeService;

@RestController
public class WelcomeController {

	@Autowired
	WelcomeService service;

	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public String welcome() {
		return service.retrieveWelcomeMessage();
	}
}
