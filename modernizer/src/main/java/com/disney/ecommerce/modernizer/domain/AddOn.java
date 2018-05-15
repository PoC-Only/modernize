package com.disney.ecommerce.modernizer.domain;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonProperty;

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

}
