package com.disney.ecommerce.modernizer.domain;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL;

import java.math.BigDecimal;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Domain class for AlternativePackage
 *
 * @author Carl de Jesus
 * @version 1.0
 * @since 2018-05-16
 */
@JsonInclude(NON_NULL)
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
	@JsonProperty(value = "hotel_category")
	private String hotelCategory;
	@JsonProperty(value = "party_mix_combination")
	private List<PartyMix> partyMixCombination;
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

	public String getHotelCategory() {
		return hotelCategory;
	}

	public void setHotelCategory(String hotelCategory) {
		this.hotelCategory = hotelCategory;
	}

	
	public List<PartyMix> getPartyMixCombination() {
		return partyMixCombination;
	}

	public void setPartyMixCombination(List<PartyMix> partyMixCombination) {
		this.partyMixCombination = partyMixCombination;
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

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AlternativePackage [roomPackageCode=");
		builder.append(roomPackageCode);
		builder.append(", packageDescription=");
		builder.append(packageDescription);
		builder.append(", firstBookingValidityDate=");
		builder.append(firstBookingValidityDate);
		builder.append(", lastBookingValidityDate=");
		builder.append(lastBookingValidityDate);
		builder.append(", change=");
		builder.append(change);
		builder.append(", hotelCode=");
		builder.append(hotelCode);
		builder.append(", hotelName=");
		builder.append(hotelName);
		builder.append(", hotelRating=");
		builder.append(hotelRating);
		builder.append(", hotelCategory=");
		builder.append(hotelCategory);
		builder.append(", partyMixCombination=");
		builder.append(partyMixCombination);
		builder.append(", numberParkDays=");
		builder.append(numberParkDays);
		builder.append(", priceDefaultRoom=");
		builder.append(priceDefaultRoom);
		builder.append(", currency=");
		builder.append(currency);
		builder.append(", deltaPrice=");
		builder.append(deltaPrice);
		builder.append(", rooms=");
		builder.append(rooms);
		builder.append(", assumptiveAddOns=");
		builder.append(assumptiveAddOns);
		builder.append(", getClass()=");
		builder.append(getClass());
		builder.append(", hashCode()=");
		builder.append(hashCode());
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

	
}
