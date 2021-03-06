package com.disney.ecommerce.modernizer.domain;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Domain class for ChannelMarket
 *
 * @author Carl de Jesus
 * @version 1.0
 * @since 2018-05-15
 */
@JsonInclude(NON_NULL)
public class ChannelMarket {
	@JsonProperty(value = "channel_market")
	private String channelMarket;
	@JsonProperty(value = "culture_code")
	private String cultureCode;

	public String getChannelMarket() {
		return channelMarket;
	}

	public void setChannelMarket(String channelMarket) {
		this.channelMarket = channelMarket;
	}

	public String getCultureCode() {
		return cultureCode;
	}

	public void setCultureCode(String cultureCode) {
		this.cultureCode = cultureCode;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ChannelMarket [channelMarket=");
		builder.append(channelMarket);
		builder.append(", cultureCode=");
		builder.append(cultureCode);
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
