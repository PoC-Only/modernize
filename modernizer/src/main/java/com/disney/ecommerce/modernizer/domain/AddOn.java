package com.disney.ecommerce.modernizer.domain;

import java.math.BigDecimal;

public class AddOn {

	private String addonCode;
	private String addonDescription;
	private BigDecimal addonPrice;
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
