package com.disney.ecommerce.modernizer.domain;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Domain class for AddOn
 *
 * @author Carl de Jesus
 * @version 1.0
 * @since 2018-05-16
 */
@JsonInclude(NON_NULL)
public class AddOn {
	@JsonProperty(value = "addon_code")
	private String addonCode;
	@JsonProperty(value = "addon_description")
	private String addonDescription;
	@JsonProperty(value = "addon_price")
	private BigDecimal addonPrice;
	@JsonProperty(value = "addon_currency")
	private String addonCurrency;

	public String getAddonCode() {
		return addonCode;
	}

	public void setAddonCode(String addonCode) {
		this.addonCode = addonCode;
	}

	public String getAddonDescription() {
		return addonDescription;
	}

	public void setAddonDescription(String addonDescription) {
		this.addonDescription = addonDescription;
	}

	public BigDecimal getAddonPrice() {
		return addonPrice;
	}

	public void setAddonPrice(BigDecimal addonPrice) {
		this.addonPrice = addonPrice;
	}

	public String getAddonCurrency() {
		return addonCurrency;
	}

	public void setAddonCurrency(String addonCurrency) {
		this.addonCurrency = addonCurrency;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AddOn [addonCode=");
		builder.append(addonCode);
		builder.append(", addonDescription=");
		builder.append(addonDescription);
		builder.append(", addonPrice=");
		builder.append(addonPrice);
		builder.append(", addonCurrency=");
		builder.append(addonCurrency);
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
