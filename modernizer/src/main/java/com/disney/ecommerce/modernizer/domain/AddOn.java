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
		return "AddOn [addonCode=" + addonCode + ", addonDescription=" + addonDescription + ", addonPrice=" + addonPrice
				+ ", addonCurrency=" + addonCurrency + "]";
	}
	
}
