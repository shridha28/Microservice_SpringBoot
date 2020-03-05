package com.in28minutes.currencyconvertor.currencyconvertorservice;


import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.in28minutes.currencyconvertor.currencyconvertorservice.beans.CurrencyConversionBean;


@RibbonClient(name="currency-exchange-service")
//@FeignClient(name="currency-exchange-service")
@FeignClient(name="netflix-zuul-service")

public interface CurrencyInterface {
	
	//@GetMapping("/currency-exchange/from/{from}/to/{to}")
	@GetMapping("currency-exchange-service/currency-exchange/from/{from}/to/{to}")
	public CurrencyConversionBean retriveExchangeValue(@PathVariable String from,
			@PathVariable String to);

}
