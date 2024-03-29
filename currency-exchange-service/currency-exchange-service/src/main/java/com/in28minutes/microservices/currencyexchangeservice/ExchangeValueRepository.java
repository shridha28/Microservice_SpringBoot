package com.in28minutes.microservices.currencyexchangeservice;

import org.springframework.data.jpa.repository.JpaRepository;

import com.in28minutes.microservices.currencyexchangeservice.beans.ExchangeValue;

public interface ExchangeValueRepository 
		extends JpaRepository<ExchangeValue,Long>{
	
	ExchangeValue findByFromCAndTo(String from,String to);
}
