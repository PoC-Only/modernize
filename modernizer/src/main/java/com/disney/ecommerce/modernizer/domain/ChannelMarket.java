package com.disney.ecommerce.modernizer.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ChannelMarket {
	
	@JsonProperty(value="channel_market") 
	private String channelMarket;

	public String getChannelMarket() {
		return channelMarket;
	}

	public void setChannelMarket(String channelMarket) {
		this.channelMarket = channelMarket;
	}
	
	
}
