package com.disney.ecommerce.modernizer.domain;

import java.math.BigDecimal;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AlternativePackage {
	@JsonProperty(value = "room_package_code")
	private String roomPackageCode;
	@JsonProperty(value = "package_description")
	private String packageDescription;
	@JsonProperty(value = "first_booking_validity_date")
	private String firstBookingValidityDate;
	@JsonProperty(value = "last_booking_validity_date")
	private String lastBookingValidityDate;
	private Integer change;
	@JsonProperty(value = "hotel_code")
	private String hotelCode;
	@JsonProperty(value = "hotel_name")
	private String hotelName;
	@JsonProperty(value = "hotel_rating")
	private String hotelRating;
	@JsonProperty(value = "hotel_status")
	private String hotelStatus;
	@JsonProperty(value = "hotel_category")
	private String hotelCategory;
	@JsonProperty(value = "check_in_start_date")
	private String checkInStartDate;
	@JsonProperty(value = "check_in_end_date")
	private String checkInEndDate;
	@JsonProperty(value = "check_in_day_of_week")
	private String checkInDayOfWeek;
	@JsonProperty(value = "btl_before_switch")
	private Integer btlBeforeSwitch;
	@JsonProperty(value = "btl_switch_hour")
	private String btlSwitchHour;
	@JsonProperty(value = "btl_after_switch")
	private Integer btlAfterSwitch;
	@JsonProperty(value = "party_mix_combination")
	private List<PartyMix> partyMixCombination;
	@JsonProperty(value = "min_los")
	private Integer minLos;
	@JsonProperty(value = "max_los")
	private Integer maxLos;
	@JsonProperty(value = "availability_for_stay_date")
	private Boolean availabilityForStayDate;
	@JsonProperty(value = "number_park_days")
	private Integer numberParkDays;
	@JsonProperty(value = "price_default_room")
	private BigDecimal priceDefaultRoom;
	private String currency;
	@JsonProperty(value = "delta_price")
	private BigDecimal deltaPrice;
	private List<Room> rooms;
	@JsonProperty(value = "assumptive_add_ons")
	private List<AddOn> assumptiveAddOns;

	public String getRoomPackageCode() {
		return roomPackageCode;
	}

	public void setRoomPackageCode(String roomPackageCode) {
		this.roomPackageCode = roomPackageCode;
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
