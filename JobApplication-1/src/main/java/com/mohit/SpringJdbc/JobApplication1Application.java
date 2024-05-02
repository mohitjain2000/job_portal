package com.mohit.SpringJdbc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.mohit.SpringJdbc.Repo")
public class JobApplication1Application {

	public static void main(String[] args) {
		  //System.setProperty("logging.level.org.hibernate.SQL", "ERROR");
		SpringApplication.run(JobApplication1Application.class, args);
	}

}
