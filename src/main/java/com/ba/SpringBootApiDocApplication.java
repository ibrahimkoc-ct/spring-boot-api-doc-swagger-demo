package com.ba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages="com.ba")	
public class SpringBootApiDocApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootApiDocApplication.class, args);
	}

}
