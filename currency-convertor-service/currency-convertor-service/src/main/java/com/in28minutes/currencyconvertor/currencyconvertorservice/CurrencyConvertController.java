package com.in28minutes.currencyconvertor.currencyconvertorservice;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.in28minutes.currencyconvertor.currencyconvertorservice.beans.CurrencyConversionBean;

@RestController
public class CurrencyConvertController {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	Environment environment;

	
	  @Autowired 
	  private CurrencyInterface currencyExcProxy;
	  
	 
	@GetMapping("/currency-converter/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversionBean convertCurrency(@PathVariable String from, @PathVariable String to,
			@PathVariable BigDecimal quantity) {

		Map<String, String> uriVariables = new HashMap<>();
		uriVariables.put("from", from);
		uriVariables.put("to", to);
		/*
		 * return new CurrencyConversionBean(2000L, "USD","INR",new BigDecimal(456),new
		 * BigDecimal(100),new BigDecimal(123456), 900);
		 */
		ResponseEntity<CurrencyConversionBean> responseEntity = new RestTemplate().getForEntity(
				"http://localhost:8000/currency-exchange/from/{from}/to/{to}", CurrencyConversionBean.class,
				uriVariables);
		CurrencyConversionBean response = responseEntity.getBody();

		logger.info("{}",response);
		
		return new CurrencyConversionBean(response.getId(), from, to, response.getConversionMultiple(), quantity,
				quantity.multiply(response.getConversionMultiple()), 900);
				
	}

	@GetMapping("/currency-converter-feign/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversionBean convertCurrencyFeign(@PathVariable String from,
			@PathVariable String to,
			@PathVariable BigDecimal quantity){

		CurrencyConversionBean response  =  currencyExcProxy.retriveExchangeValue(from, to);
		
		logger.info("{}",response);
		  return new CurrencyConversionBean(response.getId(),from,to,response.getConversionMultiple(),
					quantity,quantity.multiply(response.getConversionMultiple()), response.getPort());

	}
	

}
