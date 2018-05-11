package com.disney.ecommerce.modernizer.domain;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EligibleAddOn {
	@JsonProperty(value="addon_code")
	private String addOnCode;
	private String name;
	@JsonProperty(value="short_description")
	private String shortDescription;
	@JsonProperty(value="specific_description")
	private String specificInformation;
	@JsonProperty(value="additional_information")
	private String additionalInformation;
	@JsonProperty(value="picture_name")
	private String pictureName;
	@JsonProperty(value="category_display_sequence")
	private String categoryDisplaySequence;
	private Boolean eligibility;
	@JsonProperty(value="non_eligibility_reason")
	private Integer nonEligibilityReason;
	@JsonProperty(value="adult_price")
	private BigDecimal adultPrice;
	@JsonProperty(value="child_prince")
	private BigDecimal childPrice;
	private String currency;
	
	public String getAddOnCode() {
		return addOnCode;
	}
	
	public void setAddOnCode(String addOnCode) {
		this.addOnCode = addOnCode;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getShortDescription() {
		return shortDescription;
	}
	
	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}
	
	public String getSpecificInformation() {
		return specificInformation;
	}
	
	public void setSpecificInformation(String specificInformation) {
		this.specificInformation = specificInformation;
	}
	
	public String getAdditionalInformation() {
		return additionalInformation;
	}
	
	public void setAdditionalInformation(String additionalInformation) {
		this.additionalInformation = additionalInformation;
	}
	
	public String getPictureName() {
		return pictureName;
	}
	
	public void setPictureName(String pictureName) {
		this.pictureName = pictureName;
	}
	
	public String getCategoryDisplaySequence() {
		return categoryDisplaySequence;
	}
	
	public void setCategoryDisplaySequence(String categoryDisplaySequence) {
		this.categoryDisplaySequence = categoryDisplaySequence;
	}
	
	public Boolean getEligibility() {
		return eligibility;
	}
	
	public void setEligibility(Boolean eligibility) {
		this.eligibility = eligibility;
	}
	
	public Integer getNonEligibilityReason() {
		return nonEligibilityReason;
	}
	
	public void setNonEligibilityReason(Integer nonEligibilityReason) {
		this.nonEligibilityReason = nonEligibilityReason;
	}
	
	public BigDecimal getAdultPrice() {
		return adultPrice;
	}
	
	public void setAdultPrice(BigDecimal adultPrice) {
		this.adultPrice = adultPrice;
	}
	
	public BigDecimal getChildPrice() {
		return childPrice;
	}
	
	public void setChildPrice(BigDecimal childPrice) {
		this.childPrice = childPrice;
	}
	
	public String getCurrency() {
		return currency;
	}
	
	public void setCurrency(String currency) {
		this.currency = currency;
	}
}
