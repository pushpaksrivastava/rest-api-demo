package com.example.springBoot.REST.Restapidemo.Controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.springBoot.REST.Restapidemo.configuration.BasicConfiguration;
import com.example.springBoot.REST.Restapidemo.service.WelcomeService;

@RestController
public class WelcomeController {

	@Autowired
	WelcomeService service;
	@Autowired
	private BasicConfiguration basicConfiguration;

	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public String welcome() {
		return service.retrieveWelcomeMessage();
	}

	@RequestMapping(value = "/dynamic-configuration", method = RequestMethod.GET)
	public Map dynamicConfiguration() {
		Map map = new HashMap();
		map.put("message", basicConfiguration.getMessage());
		map.put("number", basicConfiguration.getNumber());
		map.put("value", basicConfiguration.isValue());

		return map;
	}
}
