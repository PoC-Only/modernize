package com.disney.ecommerce.modernizer.domain;

import java.math.BigDecimal;
import java.util.List;

public class AlternativePackage {
	private String alternativePackage;
	private String packageDescription;
	private String firstBookingValidityDate;
	private String lastBookingValidityDate;
	private Integer change;
	private String hotelCode;
	private String hotelName;
	private String hotelRating;
	private String hotelStatus;
	private String hotelImage;
	private String hotelCategory;
	private String checkInStartDate;
	private String checkInEndDate;
	private String checkInDayOfWeek;
	private Integer btlBeforeSwitch;
	private String btlSwitchHour;
	private Integer btlAfterSwitch;
	private List<PartyMix> partyMixCombination;
	private Integer minLos;
	private Integer maxLos;
	private Boolean availabilityForStayDate;
	private Integer numberParkDays;
	private BigDecimal priceDefaultRoom;
	private String currency;
	private BigDecimal deltaPrice;
	private List<Room> rooms;
	private List<AddOn> assumptiveAddOns;
	public String getAlternativePackage() {
		return alternativePackage;
	}
	public void setAlternativePackage(String alternativePackage) {
		this.alternativePackage = alternativePackage;
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
	public Integer getChange() {
		return change;
	}
	public void setChange(Integer change) {
		this.change = change;
	}
	public String getHotelCode() {
		return hotelCode;
	}
	public void setHotelCode(String hotelCode) {
		this.hotelCode = hotelCode;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public String getHotelRating() {
		return hotelRating;
	}
	public void setHotelRating(String hotelRating) {
		this.hotelRating = hotelRating;
	}
	public String getHotelStatus() {
		return hotelStatus;
	}
	public void setHotelStatus(String hotelStatus) {
		this.hotelStatus = hotelStatus;
	}
	public String getHotelImage() {
		return hotelImage;
	}
	public void setHotelImage(String hotelImage) {
		this.hotelImage = hotelImage;
	}
	public String getHotelCategory() {
		return hotelCategory;
	}
	public void setHotelCategory(String hotelCategory) {
		this.hotelCategory = hotelCategory;
	}
	public String getCheckInStartDate() {
		return checkInStartDate;
	}
	public void setCheckInStartDate(String checkInStartDate) {
		this.checkInStartDate = checkInStartDate;
	}
	public String getCheckInEndDate() {
		return checkInEndDate;
	}
	public void setCheckInEndDate(String checkInEndDate) {
		this.checkInEndDate = checkInEndDate;
	}
	public String getCheckInDayOfWeek() {
		return checkInDayOfWeek;
	}
	public void setCheckInDayOfWeek(String checkInDayOfWeek) {
		this.checkInDayOfWeek = checkInDayOfWeek;
	}
	public Integer getBtlBeforeSwitch() {
		return btlBeforeSwitch;
	}
	public void setBtlBeforeSwitch(Integer btlBeforeSwitch) {
		this.btlBeforeSwitch = btlBeforeSwitch;
	}
	public String getBtlSwitchHour() {
		return btlSwitchHour;
	}
	public void setBtlSwitchHour(String btlSwitchHour) {
		this.btlSwitchHour = btlSwitchHour;
	}
	public Integer getBtlAfterSwitch() {
		return btlAfterSwitch;
	}
	public void setBtlAfterSwitch(Integer btlAfterSwitch) {
		this.btlAfterSwitch = btlAfterSwitch;
	}
	public List<PartyMix> getPartyMixCombination() {
		return partyMixCombination;
	}
	public void setPartyMixCombination(List<PartyMix> partyMixCombination) {
		this.partyMixCombination = partyMixCombination;
	}
	public Integer getMinLos() {
		return minLos;
	}
	public void setMinLos(Integer minLos) {
		this.minLos = minLos;
	}
	public Integer getMaxLos() {
		return maxLos;
	}
	public void setMaxLos(Integer maxLos) {
		this.maxLos = maxLos;
	}
	public Boolean getAvailabilityForStayDate() {
		return availabilityForStayDate;
	}
	public void setAvailabilityForStayDate(Boolean availabilityForStayDate) {
		this.availabilityForStayDate = availabilityForStayDate;
	}
	public Integer getNumberParkDays() {
		return numberParkDays;
	}
	public void setNumberParkDays(Integer numberParkDays) {
		this.numberParkDays = numberParkDays;
	}
	public BigDecimal getPriceDefaultRoom() {
		return priceDefaultRoom;
	}
	public void setPriceDefaultRoom(BigDecimal priceDefaultRoom) {
		this.priceDefaultRoom = priceDefaultRoom;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public BigDecimal getDeltaPrice() {
		return deltaPrice;
	}
	public void setDeltaPrice(BigDecimal deltaPrice) {
		this.deltaPrice = deltaPrice;
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
