package com.disney.ecommerce.modernizer.domain;

import java.math.BigDecimal;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BookingDetailsAddOn {
	private String category;
	@JsonProperty(value = "addon_code")
	private String addonCode;
	private String name;
	private BigDecimal price;
	private List<Inventory> inventory;

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getAddonCode() {
		return addonCode;
	}

	public void setAddonCode(String addonCode) {
		this.addonCode = addonCode;
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

	public List<Inventory> getInventory() {
		return inventory;
	}

	public void setInventory(List<Inventory> inventory) {
		this.inventory = inventory;
	}

}
