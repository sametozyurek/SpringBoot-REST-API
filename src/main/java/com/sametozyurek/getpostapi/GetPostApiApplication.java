package com.sametozyurek.getpostapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

import javax.persistence.Entity;

@SpringBootApplication
@ComponentScan(basePackages = {"com.sametozyurek"})
@EntityScan(basePackages = {"com.sametozyurek.getpostapi.persistance.pojo"})
public class GetPostApiApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(GetPostApiApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder applicationBuilder){
		return applicationBuilder.sources(GetPostApiApplication.class);
	}

}
