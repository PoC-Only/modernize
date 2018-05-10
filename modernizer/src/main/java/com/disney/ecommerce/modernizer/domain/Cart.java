package com.disney.ecommerce.modernizer.domain;

import java.math.BigDecimal;
import java.util.List;

public class Cart {
	private Integer cartId;
	private String creationDate;
	private Boolean cartStatus;
	private String[] salesChannel;
	private String[] market;
	private BigDecimal grossTotalAmount;
	private String[] currency;
	private List<Guest> guestInformation;
	private List<RoomPackage> roomPackage;
	private List<TransportPackage> transportPackage;
	private List<CartAddOn> addOns;
	public Integer getCartId() {
		return cartId;
	}
	public void setCartId(Integer cartId) {
		this.cartId = cartId;
	}
	public String getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}
	public Boolean getCartStatus() {
		return cartStatus;
	}
	public void setCartStatus(Boolean cartStatus) {
		this.cartStatus = cartStatus;
	}
	public String[] getSalesChannel() {
		return salesChannel;
	}
	public void setSalesChannel(String[] salesChannel) {
		this.salesChannel = salesChannel;
	}
	public String[] getMarket() {
		return market;
	}
	public void setMarket(String[] market) {
		this.market = market;
	}
	public BigDecimal getGrossTotalAmount() {
		return grossTotalAmount;
	}
	public void setGrossTotalAmount(BigDecimal grossTotalAmount) {
		this.grossTotalAmount = grossTotalAmount;
	}
	public String[] getCurrency() {
		return currency;
	}
	public void setCurrency(String[] currency) {
		this.currency = currency;
	}
	public List<Guest> getGuestInformation() {
		return guestInformation;
	}
	public void setGuestInformation(List<Guest> guestInformation) {
		this.guestInformation = guestInformation;
	}
	public List<RoomPackage> getRoomPackage() {
		return roomPackage;
	}
	public void setRoomPackage(List<RoomPackage> roomPackage) {
		this.roomPackage = roomPackage;
	}
	public List<TransportPackage> getTransportPackage() {
		return transportPackage;
	}
	public void setTransportPackage(List<TransportPackage> transportPackage) {
		this.transportPackage = transportPackage;
	}
	public List<CartAddOn> getAddOns() {
		return addOns;
	}
	public void setAddOns(List<CartAddOn> addOns) {
		this.addOns = addOns;
	}
	
	
}
