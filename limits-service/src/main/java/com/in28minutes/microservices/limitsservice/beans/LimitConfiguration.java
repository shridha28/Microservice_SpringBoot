package com.in28minutes.microservices.limitsservice.beans;

public class LimitConfiguration {
	
	private int maximum;
	public int getMaximum() {
		return maximum;
	}
	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}
	public int getMinimum() {
		return minimum;
	}
	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}
	private int minimum;

	
	protected LimitConfiguration() {}
	
	public LimitConfiguration(int min,int max) {
		this.maximum = max;
		this.minimum = min;
	}
}
