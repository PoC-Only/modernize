package com.disney.ecommerce.modernizer.domain;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL;

import java.math.BigDecimal;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Domain class for RoomPackage
 *
 * @author Carl de Jesus
 * @version 1.0
 * @since 2018-05-16
 */
@JsonInclude(NON_NULL)
public class RoomPackage {
	@JsonProperty(value = "item_no")
	private Integer itemNo;
	@JsonProperty(value = "package_code")
	private String packageCode;
	@JsonProperty(value = "package_name")
	private String packageName;
	@JsonProperty(value = "number_park_days")
	private Integer numberParkDays;
	@JsonProperty(value = "check_in_date")
	private String checkInDate;
	@JsonProperty(value = "check_out_date")
	private String checkOutDate;
	@JsonProperty(value = "hotel_code")
	private String hotelCode;
	@JsonProperty(value = "hotel_name")
	private String hotelName;
	@JsonProperty(value = "first_booking_validity_date")
	private String firstBookingValidityDate;
	@JsonProperty(value = "last_booking_validity_date")
	private String lastBookingValidityDate;
	@JsonProperty(value = "room_type")
	private String roomType;
	private BigDecimal price;
	@JsonProperty(value = "special_request")
	private List<SpecialRequest> specialRequest;
	@JsonProperty(value = "guest_ids")
	private List<Integer> guestId;
	@JsonProperty(value = "add_ons")
	private List<AddOn2> addOns;

	public Integer getItemNo() {
		return itemNo;
	}

	public void setItemNo(Integer itemNo) {
		this.itemNo = itemNo;
	}

	public String getPackageCode() {
		return packageCode;
	}

	public void setPackageCode(String packageCode) {
		this.packageCode = packageCode;
	}

	public String getPackageName() {
		return packageName;
	}

	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	public Integer getNumberParkDays() {
		return numberParkDays;
	}

	public void setNumberParkDays(Integer numberParkDays) {
		this.numberParkDays = numberParkDays;
	}

	public String getCheckInDate() {
		return checkInDate;
	}

	public void setCheckInDate(String checkInDate) {
		this.checkInDate = checkInDate;
	}

	public String getCheckOutDate() {
		return checkOutDate;
	}

	public void setCheckOutDate(String checkOutDate) {
		this.checkOutDate = checkOutDate;
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

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public List<SpecialRequest> getSpecialRequest() {
		return specialRequest;
	}

	public void setSpecialRequest(List<SpecialRequest> specialRequest) {
		this.specialRequest = specialRequest;
	}

	public List<Integer> getGuestId() {
		return guestId;
	}

	public void setGuestId(List<Integer> guestId) {
		this.guestId = guestId;
	}

	public List<AddOn2> getAddOns() {
		return addOns;
	}

	public void setAddOns(List<AddOn2> addOns) {
		this.addOns = addOns;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("RoomPackage [itemNo=");
		builder.append(itemNo);
		builder.append(", packageCode=");
		builder.append(packageCode);
		builder.append(", packageName=");
		builder.append(packageName);
		builder.append(", numberParkDays=");
		builder.append(numberParkDays);
		builder.append(", checkInDate=");
		builder.append(checkInDate);
		builder.append(", checkOutDate=");
		builder.append(checkOutDate);
		builder.append(", hotelCode=");
		builder.append(hotelCode);
		builder.append(", hotelName=");
		builder.append(hotelName);
		builder.append(", firstBookingValidityDate=");
		builder.append(firstBookingValidityDate);
		builder.append(", lastBookingValidityDate=");
		builder.append(lastBookingValidityDate);
		builder.append(", roomType=");
		builder.append(roomType);
		builder.append(", price=");
		builder.append(price);
		builder.append(", specialRequest=");
		builder.append(specialRequest);
		builder.append(", guestId=");
		builder.append(guestId);
		builder.append(", addOns=");
		builder.append(addOns);
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
