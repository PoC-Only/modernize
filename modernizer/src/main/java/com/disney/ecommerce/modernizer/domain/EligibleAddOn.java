package com.disney.ecommerce.modernizer.domain;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EligibleAddOn {
	@JsonProperty(value = "addon_code")
	private String addOnCode;
	@JsonProperty(value = "entity_code")
	private String entityCode;
	@JsonProperty(value = "formula_code")
	private String formulaCode;
	@JsonProperty(value = "label_date")
	private String labelDate;
	private String name;
	@JsonProperty(value = "short_description")
	private String shortDescription;
	@JsonProperty(value = "specific_information")
	private String specificInformation;
	@JsonProperty(value = "additional_information")
	private String additionalInformation;
	@JsonProperty(value = "addon_diplay_sequence")
	private String addonDisplaySequence;
	private Boolean eligibility;
	@JsonProperty(value = "non_eligibility_reason")
	private Integer nonEligibilityReason;
	@JsonProperty(value = "adult_price")
	private BigDecimal adultPrice;
	@JsonProperty(value = "child_prince")
	private BigDecimal childPrice;
	private String currency;

	public String getAddOnCode() {
		return addOnCode;
	}

	public void setAddOnCode(String addOnCode) {
		this.addOnCode = addOnCode;
	}

	public String getEntityCode() {
		return entityCode;
	}

	public void setEntityCode(String entityCode) {
		this.entityCode = entityCode;
	}

	public String getFormulaCode() {
		return formulaCode;
	}

	public void setFormulaCode(String formulaCode) {
		this.formulaCode = formulaCode;
	}

	public String getLabelDate() {
		return labelDate;
	}

	public void setLabelDate(String labelDate) {
		this.labelDate = labelDate;
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
