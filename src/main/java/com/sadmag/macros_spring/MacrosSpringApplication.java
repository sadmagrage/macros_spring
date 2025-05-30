package com.sadmag.macros_spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication
@EnableAutoConfiguration( exclude = {
		SecurityAutoConfiguration.class
})
public class MacrosSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(MacrosSpringApplication.class, args);
	}

}
