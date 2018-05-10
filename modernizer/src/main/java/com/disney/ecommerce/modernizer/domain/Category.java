package com.disney.ecommerce.modernizer.domain;

public class Category {
	
	private String paxType;
	private Integer minAge;
	private Integer maxAge;

	public String getPaxType() {
		return paxType;
	}
	
	public void setPaxType(String paxType) {
		this.paxType = paxType;
	}

	public Integer getMinAge() {
		return minAge;
	}

	public void setMinAge(Integer minAge) {
		this.minAge = minAge;
	}

	public Integer getMaxAge() {
		return maxAge;
	}

	public void setMaxAge(Integer maxAge) {
		this.maxAge = maxAge;
	}
		
}
