package com.disney.ecommerce.modernizer.domain;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Domain class for EligibleAddOn
 *
 * @author Carl de Jesus
 * @version 1.0
 * @since 2018-05-16
 */
@JsonInclude(NON_NULL)
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
	@JsonProperty(value = "dex_eligible")
	private Boolean dexEligible;
	@JsonProperty(value = "outbound_vea_required")
	private Boolean outboundVeaRequired;
	@JsonProperty(value = "inbound_vea_required")
	private Boolean inboundVeaRequired;
	@JsonProperty(value = "outbound_vea_eligible")
	private Boolean outboundVeaEligible;
	@JsonProperty(value = "inbound_vea_eligible")
	private Boolean inboundVeaEligible;

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

	public String getAddonDisplaySequence() {
		return addonDisplaySequence;
	}

	public void setAddonDisplaySequence(String addonDisplaySequence) {
		this.addonDisplaySequence = addonDisplaySequence;
	}

	public Boolean getDexEligible() {
		return dexEligible;
	}

	public void setDexEligible(Boolean dexEligible) {
		this.dexEligible = dexEligible;
	}

	public Boolean getOutboundVeaRequired() {
		return outboundVeaRequired;
	}

	public void setOutboundVeaRequired(Boolean outboundVeaRequired) {
		this.outboundVeaRequired = outboundVeaRequired;
	}

	public Boolean getInboundVeaRequired() {
		return inboundVeaRequired;
	}

	public void setInboundVeaRequired(Boolean inboundVeaRequired) {
		this.inboundVeaRequired = inboundVeaRequired;
	}

	public Boolean getOutboundVeaEligible() {
		return outboundVeaEligible;
	}

	public void setOutboundVeaEligible(Boolean outboundVeaEligible) {
		this.outboundVeaEligible = outboundVeaEligible;
	}

	public Boolean getInboundVeaEligible() {
		return inboundVeaEligible;
	}

	public void setInboundVeaEligible(Boolean inboundVeaEligible) {
		this.inboundVeaEligible = inboundVeaEligible;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("EligibleAddOn [addOnCode=");
		builder.append(addOnCode);
		builder.append(", entityCode=");
		builder.append(entityCode);
		builder.append(", formulaCode=");
		builder.append(formulaCode);
		builder.append(", labelDate=");
		builder.append(labelDate);
		builder.append(", name=");
		builder.append(name);
		builder.append(", shortDescription=");
		builder.append(shortDescription);
		builder.append(", specificInformation=");
		builder.append(specificInformation);
		builder.append(", additionalInformation=");
		builder.append(additionalInformation);
		builder.append(", addonDisplaySequence=");
		builder.append(addonDisplaySequence);
		builder.append(", eligibility=");
		builder.append(eligibility);
		builder.append(", nonEligibilityReason=");
		builder.append(nonEligibilityReason);
		builder.append(", adultPrice=");
		builder.append(adultPrice);
		builder.append(", childPrice=");
		builder.append(childPrice);
		builder.append(", currency=");
		builder.append(currency);
		builder.append(", dexEligible=");
		builder.append(dexEligible);
		builder.append(", outboundVeaRequired=");
		builder.append(outboundVeaRequired);
		builder.append(", inboundVeaRequired=");
		builder.append(inboundVeaRequired);
		builder.append(", outboundVeaEligible=");
		builder.append(outboundVeaEligible);
		builder.append(", inboundVeaEligible=");
		builder.append(inboundVeaEligible);
		builder.append("]");
		return builder.toString();
	}
	
	
}
