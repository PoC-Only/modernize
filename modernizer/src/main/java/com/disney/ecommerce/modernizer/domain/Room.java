package com.disney.ecommerce.modernizer.domain;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Domain class for Room
 *
 * @author Carl de Jesus
 * @version 1.0
 * @since 2018-05-16
 */
@JsonInclude(NON_NULL)
public class Room {
	@JsonProperty(value = "room_package")
	private String roomName;
	@JsonProperty(value = "room_type")
	private String roomType;
	@JsonProperty(value = "room_type_category")
	private String roomTypeCategory;
	@JsonProperty(value = "room_price")
	private BigDecimal roomPrice;
	private String currency;
	@JsonProperty(value = "eligible_sell_online")
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

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Room [roomName=");
		builder.append(roomName);
		builder.append(", roomType=");
		builder.append(roomType);
		builder.append(", roomTypeCategory=");
		builder.append(roomTypeCategory);
		builder.append(", roomPrice=");
		builder.append(roomPrice);
		builder.append(", currency=");
		builder.append(currency);
		builder.append(", eligibleSellOnline=");
		builder.append(eligibleSellOnline);
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
