package com.disney.ecommerce.modernizer.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Hotel01 extends Hotel {
	
	@JsonProperty(value="group_of_offer")
	private String groupOfOffer;
	@JsonProperty(value="hotel_image")
	private String hotelImage;
	
	public String getGroupOfOffer() {
		return groupOfOffer;
	}
	
	public void setGroupOfOffer(String groupOfOffer) {
		this.groupOfOffer = groupOfOffer;
	}
	
	public String getHotelImage() {
		return hotelImage;
	}
	
	public void setHotelImage(String hotelImage) {
		this.hotelImage = hotelImage;
	}
	
}
