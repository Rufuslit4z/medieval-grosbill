package com.medievalgrosbill;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.medievalgrosbill.security.services.PreLaunchService;

@SpringBootApplication
public class MedievalgrosbillApplication {

public static void main(String[] args) {
		SpringApplication.run(MedievalgrosbillApplication.class, args);
	}

	@Autowired
	PreLaunchService service;
	
	@Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return new CommandLineRunner() {
			public void run(String... args) throws Exception {
				service.createFirstAdmin();
				service.addUserRoleDatabase();
				service.insertSessionDatabaseItems();
			}
		};
    }
}
