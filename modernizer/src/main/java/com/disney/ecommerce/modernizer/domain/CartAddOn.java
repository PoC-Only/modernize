package com.disney.ecommerce.modernizer.domain;

import java.math.BigDecimal;
import java.util.List;

public class CartAddOn {
	private Integer itemNo;
	private String category;
	private String AddonCode;
	private String name;
	private BigDecimal price;
	private List<Inventory> inventory;
	private List<Integer> guestIds;
	public Integer getItemNo() {
		return itemNo;
	}
	public void setItemNo(Integer itemNo) {
		this.itemNo = itemNo;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getAddonCode() {
		return AddonCode;
	}
	public void setAddonCode(String addonCode) {
		AddonCode = addonCode;
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
	public List<Integer> getGuestIds() {
		return guestIds;
	}
	public void setGuestIds(List<Integer> guestIds) {
		this.guestIds = guestIds;
	}
	
	
}
