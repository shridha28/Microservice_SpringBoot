package com.in28minutes.microservices.currencyexchangeservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.microservices.currencyexchangeservice.beans.ExchangeValue;

@RestController

public class CurrencyExchangeController {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	Environment environment ;
	
	@Autowired
	private ExchangeValueRepository exchangeRepo; 
	
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public ExchangeValue retriveExchangeValue(@PathVariable String from,
			@PathVariable String to) {
		
		/*
		 * ExchangeValue eV = new ExchangeValue(56L, "USD", "INR", new BigDecimal(56));
		 * eV.setPort(Integer.parseInt(environment.getProperty("local.server.port")));
		 */
	
	ExchangeValue value = exchangeRepo.findByFromCAndTo(from, to);
	value.setPort(Integer.parseInt(environment.getProperty("local.server.port")));
	
	logger.info("{}", value);
	
	return value;
	//return eV;
		
	}
	
	
	
	

}
