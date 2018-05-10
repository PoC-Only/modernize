package com.disney.ecommerce.modernizer.domain;

import java.util.List;

public class Package {
	private String recommendedPackage;
	private String packageDescription;
	private String firstBookingValidityDate;
	private String lastBookingValidityDate;
	private Boolean availabilityForStayDate;
	private Integer stayLength;
	private Integer numberParkDays;
	private String offerCode;
	private Integer priceDefaultRoom;
	private String currency;
	private List<Room> rooms;
	private List<AddOn> assumptiveAddOns;
	
	public String getRecommendedPackage() {
		return recommendedPackage;
	}
	
	public void setRecommendedPackage(String recommendedPackage) {
		this.recommendedPackage = recommendedPackage;
	}
	
	public String getPackageDescription() {
		return packageDescription;
	}
	
	public void setPackageDescription(String packageDescription) {
		this.packageDescription = packageDescription;
	}
	
	public String getFirstBookingValidityDate() {
		return firstBookingValidityDate;
	}
	
	public void setFirstBookingValidityDate(String firstBookingValidityDate) {
		this.firstBookingValidityDate = firstBookingValidityDate;
	}
	
	public String getLastBookingValidityDate() {
		return lastBookingValidityDate;
	}
	
	public void setLastBookingValidityDate(String lastBookingValidityDate) {
		this.lastBookingValidityDate = lastBookingValidityDate;
	}
	
	public Boolean getAvailabilityForStayDate() {
		return availabilityForStayDate;
	}
	
	public void setAvailabilityForStayDate(Boolean availabilityForStayDate) {
		this.availabilityForStayDate = availabilityForStayDate;
	}
	
	public Integer getStayLength() {
		return stayLength;
	}
	
	public void setStayLength(Integer stayLength) {
		this.stayLength = stayLength;
	}
	
	public Integer getNumberParkDays() {
		return numberParkDays;
	}
	
	public void setNumberParkDays(Integer numberParkDays) {
		this.numberParkDays = numberParkDays;
	}
	
	public String getOfferCode() {
		return offerCode;
	}
	
	public void setOfferCode(String offerCode) {
		this.offerCode = offerCode;
	}
	
	public Integer getPriceDefaultRoom() {
		return priceDefaultRoom;
	}
	
	public void setPriceDefaultRoom(Integer priceDefaultRoom) {
		this.priceDefaultRoom = priceDefaultRoom;
	}
	
	public String getCurrency() {
		return currency;
	}
	
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	
	public List<Room> getRooms() {
		return rooms;
	}
	
	public void setRooms(List<Room> rooms) {
		this.rooms = rooms;
	}
	
	public List<AddOn> getAssumptiveAddOns() {
		return assumptiveAddOns;
	}
	
	public void setAssumptiveAddOns(List<AddOn> assumptiveAddOns) {
		this.assumptiveAddOns = assumptiveAddOns;
	}
}
