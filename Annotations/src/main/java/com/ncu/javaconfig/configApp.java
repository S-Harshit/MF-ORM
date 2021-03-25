package com.ncu.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.ncu.javaconfig")
public class configApp {
	
	@Bean
	public Coach cricketCoach() {
		return new CricketCoach();
	}
	@Bean 
	
	public Fortune fortune() {
		return new Fortune();
	}
	
	@Bean
	public CricketCoach coach() {
		return new CricketCoach(fortune());
	}
	
	
}
