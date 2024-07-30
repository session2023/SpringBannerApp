package com.telusko.SpringBootBannerApp;

import org.springframework.boot.Banner.Mode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootBannerAppApplication {

	public static void main(String[] args) {
		
		SpringApplication app = new SpringApplication();
		app.setBannerMode(Mode.OFF);
		
		
		app.run(SpringBootBannerAppApplication.class, args);
	}

}
