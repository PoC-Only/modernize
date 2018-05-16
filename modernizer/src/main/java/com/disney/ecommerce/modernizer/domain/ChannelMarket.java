package com.disney.ecommerce.modernizer.domain;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Domain class for ChannelMarket
 *
 * @author Carl de Jesus
 * @version 1.0
 * @since 2018-05-16
 */
@JsonInclude(NON_NULL)
public class ChannelMarket {
	@JsonProperty(value = "channel_market")
	private String channelMarket;

	public String getChannelMarket() {
		return channelMarket;
	}

	public void setChannelMarket(String channelMarket) {
		this.channelMarket = channelMarket;
	}

}
