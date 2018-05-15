package com.disney.ecommerce.modernizer.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Vendor {
	@JsonProperty(value = "vendor_code")
	private String vendorCode;

	private List<Category> category;

	public String getVendorCode() {
		return vendorCode;
	}

	public void setVendorCode(String vendorCode) {
		this.vendorCode = vendorCode;
	}

	public List<Category> getCategory() {
		return category;
	}

	public void setCategory(List<Category> category) {
		this.category = category;
	}

}
