package com.in28minutes.microservices.currencyexchangeservice.beans;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class ExchangeValue {
	
	@Id
	private Long id;
	private String fromC;
	private String to;
	private BigDecimal  conversion;
	private int port;
	
	
	
	public ExchangeValue() {
		super();
	}
	public ExchangeValue(Long id, String fromC, String to, BigDecimal conversion) {
		super();
		this.id = id;
		this.fromC = fromC;
		this.to = to;
		this.conversion = conversion;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public BigDecimal getConversion() {
		return conversion;
	}
	public void setConversion(BigDecimal conversion) {
		this.conversion = conversion;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	public String getFromC() {
		return fromC;
	}
	public void setFromC(String fromC) {
		this.fromC = fromC;
	}

}
