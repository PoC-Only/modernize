package com.disney.ecommerce.modernizer.domain;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(NON_NULL)
public class AddOn2 {
	private String category;
	@JsonProperty(value = "addon_code")
	private String addOnCode;
	private String name;
	private BigDecimal price;

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getAddOnCode() {
		return addOnCode;
	}

	public void setAddOnCode(String addOnCode) {
		this.addOnCode = addOnCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

}
