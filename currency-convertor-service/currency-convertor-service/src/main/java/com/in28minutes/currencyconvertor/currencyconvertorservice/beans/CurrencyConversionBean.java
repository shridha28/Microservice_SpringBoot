package com.in28minutes.currencyconvertor.currencyconvertorservice.beans;

import java.math.BigDecimal;

public class CurrencyConversionBean {
	
	private long id;
	private String fromC;
	private String to;
	private BigDecimal conversion;
	private BigDecimal quantity;
	private BigDecimal totalAmount;
	private int port;
	
	
	public CurrencyConversionBean() {}
	
	
	public CurrencyConversionBean(long id, String fromC, String to, BigDecimal conversionMultiple, BigDecimal quantity,
			BigDecimal totalAmount, int port) {
		super();
		this.id = id;
		this.fromC = fromC;
		this.to = to;
		this.conversion= conversionMultiple;
		this.quantity = quantity;
		this.totalAmount = totalAmount;
		this.port = port;
	}
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}
	/**
	 * @return the fromC
	 */
	public String getfromC() {
		return fromC;
	}
	/**
	 * @param fromC the fromC to set
	 */
	public void setfromC(String fromC) {
		this.fromC = fromC;
	}
	/**
	 * @return the to
	 */
	public String getTo() {
		return to;
	}
	/**
	 * @param to the to to set
	 */
	public void setTo(String to) {
		this.to = to;
	}
	/**
	 * @return the conversionMultiple
	 */
	public BigDecimal getConversionMultiple() {
		return conversion;
	}
	/**
	 * @param conversionMultiple the conversionMultiple to set
	 */
	public void setConversion(BigDecimal conversion) {
		this.conversion = conversion;
	}
	/**
	 * @return the quanity
	 */
	public BigDecimal getQuantity() {
		return quantity;
	}
	/**
	 * @param quanity the quanity to set
	 */
	public void setQuanity(BigDecimal quantity) {
		this.quantity = quantity;
	}
	/**
	 * @return the totalAmount
	 */
	public BigDecimal getTotalAmount() {
		return totalAmount;
	}
	/**
	 * @param totalAmount the totalAmount to set
	 */
	public void setTotalAmount(BigDecimal totalAmount) {
		this.totalAmount = totalAmount;
	}
	/**
	 * @return the port
	 */
	public int getPort() {
		return port;
	}
	/**
	 * @param port the port to set
	 */
	public void setPort(int port) {
		this.port = port;
	}
	
	
	
	

}
