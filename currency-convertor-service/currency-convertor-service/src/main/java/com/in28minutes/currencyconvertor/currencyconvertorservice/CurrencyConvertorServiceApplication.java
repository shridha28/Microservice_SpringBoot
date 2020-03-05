package com.in28minutes.currencyconvertor.currencyconvertorservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import brave.sampler.Sampler;

@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients
@Component
public class CurrencyConvertorServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyConvertorServiceApplication.class, args);
	}
	
	@Bean
	public Sampler defaultSampler() {
		return Sampler.ALWAYS_SAMPLE;
	}

}
