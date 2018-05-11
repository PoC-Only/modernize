package com.disney.ecommerce.modernizer.domain;

import java.math.BigDecimal;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Cart {
	
	@JsonProperty(value="cart_id")
	private Integer cartId;
	@JsonProperty(value="creation_date")
	private String creationDate;
	@JsonProperty(value="cart_status")
	private Boolean cartStatus;
	@JsonProperty(value="sales_channel")
	private String[] salesChannel;
	private String[] market;
	@JsonProperty(value="gross_total_amount")
	private BigDecimal grossTotalAmount;
	private String[] currency;
	@JsonProperty(value="guest_information")
	private List<Guest> guestInformation;
	@JsonProperty(value="room_package")
	private List<RoomPackage> roomPackage;
	@JsonProperty(value="transport_package")
	private List<TransportPackage> transportPackage;
	@JsonProperty(value="add_ons")
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
