package com.in28minutes.microservices.ZipkinServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import zipkin2.server.internal.EnableZipkinServer;



@SpringBootApplication
@EnableZipkinServer
@EnableDiscoveryClient
public class ZipkinServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZipkinServerApplication.class, args);
	}

}
