package com.disney.ecommerce.modernizer.domain;

import java.math.BigDecimal;

public class Room {
	private String roomName;
	private String roomType;
	private String roomTypeCategory;
	private BigDecimal roomPrice;
	private String currency;
	private Boolean eligibleSellOnline;
	
	public String getRoomName() {
		return roomName;
	}
	
	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}
	
	public String getRoomType() {
		return roomType;
	}
	
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	
	public String getRoomTypeCategory() {
		return roomTypeCategory;
	}
	
	public void setRoomTypeCategory(String roomTypeCategory) {
		this.roomTypeCategory = roomTypeCategory;
	}
	
	public BigDecimal getRoomPrice() {
		return roomPrice;
	}
	
	public void setRoomPrice(BigDecimal roomPrice) {
		this.roomPrice = roomPrice;
	}
	
	public String getCurrency() {
		return currency;
	}
	
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	
	public Boolean getEligibleSellOnline() {
		return eligibleSellOnline;
	}
	
	public void setEligibleSellOnline(Boolean eligibleSellOnline) {
		this.eligibleSellOnline = eligibleSellOnline;
	}
}
