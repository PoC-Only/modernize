package com.disney.ecommerce.modernizer.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Category {
	@JsonProperty(value = "pax_type")
	private String paxType;
	@JsonProperty(value = "min_age")
	private Integer minAge;
	@JsonProperty(value = "max_age")
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
