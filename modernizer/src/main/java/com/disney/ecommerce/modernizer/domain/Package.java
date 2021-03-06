package com.disney.ecommerce.modernizer.domain;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Domain class for Package
 *
 * @author Carl de Jesus
 * @version 1.0
 * @since 2018-05-16
 */
@JsonInclude(NON_NULL)
public class Package {
	@JsonProperty(value = "room_package_code")
	private String roomPackageCode;
	@JsonProperty(value = "package_description")
	private String packageDescription;
	@JsonProperty(value = "first_booking_validity_date")
	private String firstBookingValidityDate;
	@JsonProperty(value = "last_booking_validity_date")
	private String lastBookingValidityDate;
	@JsonProperty(value = "availability_for_stay_date")
	private Boolean availabilityForStayDate;
	@JsonProperty(value = "stay_length")
	private Integer stayLength;
	@JsonProperty(value = "number_park_days")
	private Integer numberParkDays;
	@JsonProperty(value = "offer_code")
	private String offerCode;
	@JsonProperty(value = "price_default_room")
	private Integer priceDefaultRoom;
	private String currency;
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

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Package [roomPackageCode=");
		builder.append(roomPackageCode);
		builder.append(", packageDescription=");
		builder.append(packageDescription);
		builder.append(", firstBookingValidityDate=");
		builder.append(firstBookingValidityDate);
		builder.append(", lastBookingValidityDate=");
		builder.append(lastBookingValidityDate);
		builder.append(", availabilityForStayDate=");
		builder.append(availabilityForStayDate);
		builder.append(", stayLength=");
		builder.append(stayLength);
		builder.append(", numberParkDays=");
		builder.append(numberParkDays);
		builder.append(", offerCode=");
		builder.append(offerCode);
		builder.append(", priceDefaultRoom=");
		builder.append(priceDefaultRoom);
		builder.append(", currency=");
		builder.append(currency);
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
