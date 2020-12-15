package com.example.springBoot.REST.Restapidemo.jpa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UserCommandLineRunner implements CommandLineRunner {
	@Autowired
	private UserRepository repository;

	private static final Logger log = LoggerFactory.getLogger(UserCommandLineRunner.class);

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		repository.save(new User("Pushpak", "Developer"));
		repository.save(new User("Shikhar", "Admin"));
		repository.save(new User("Shubham", "Admin"));
		repository.save(new User("Milli", "Developer"));

		for (User user : repository.findAll()) {
			log.info(user.toString());
		}

		log.info("Admin users are .............");
		for (User user : repository.findByRole("Admin")) {
			log.info(user.toString());
		}
	}

}
