
package com.example.springBoot.REST.Restapidemo.service;

import org.springframework.stereotype.Component;

@Component
public class WelcomeService {
	public String retrieveWelcomeMessage() {
		return "This is great! I see something on screen 123";
	}
}
