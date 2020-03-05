package com.in28minutes.microservices.springcloudconfigserver;

import java.util.function.Predicate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class SpringCloudConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConfigServerApplication.class, args);
		
		
		Predicate<String> testAge = s -> {
			if (s.equals("Shridha")) return true;
		else 
			return false;
		};
		
		System.out.println(testAge.test("Neeraja"));
	}

	
	
}
