package com.htc.doctor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@SpringBootApplication
@EnableWebMvc
@EnableEurekaServer
public class ClinicmanagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClinicmanagementApplication.class, args);
	}

}
