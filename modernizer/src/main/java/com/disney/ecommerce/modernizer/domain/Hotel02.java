package com.disney.ecommerce.modernizer.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Hotel02 extends Hotel{
	
	@JsonProperty(value="group_of_offer")
	private String groupOfOffer;

	public String getGroupOfOffer() {
		return groupOfOffer;
	}

	public void setGroupOfOffer(String groupOfOffer) {
		this.groupOfOffer = groupOfOffer;
	}
	
}
