package com.ecodeup.appmedicos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication // (exclude = DataSourceAutoConfiguration.class)
public class AppmedicosApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppmedicosApplication.class, args);
	}

}
