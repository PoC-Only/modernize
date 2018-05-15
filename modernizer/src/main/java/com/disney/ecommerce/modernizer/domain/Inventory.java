package com.disney.ecommerce.modernizer.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Inventory {

	private String code;
	private String date;
	private String details;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

}
