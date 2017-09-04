package com.devops;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.devops.model.Credential;
import com.devops.repository.CredentialRepository;

@SpringBootApplication
public class DevopsSpringbootApplication {
	
	private static final Logger logger = LoggerFactory.getLogger(DevopsSpringbootApplication.class);


	public static void main(String[] args) {
		SpringApplication.run(DevopsSpringbootApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner setup(CredentialRepository credentialRepository) {
		return (args) -> {

			// Dummy data for credential
			credentialRepository.save(new Credential("devops@photon.com", "1234"));
			
			logger.info("The sample data has been generated");

		};
	}
}
