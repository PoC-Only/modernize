package com.disney.ecommerce.modernizer.domain;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Formula {
	@JsonProperty(value="formula_code")
	private String formulaCode;
	@JsonProperty(value="formula_name")
	private String formulaName;
	@JsonProperty(value="formula_picture")
	private String formulaPicture;
	@JsonProperty(value="formula_short_description")
	private String formulaShortDescription;
	@JsonProperty(value="formula_title_prim")
	private String formulaTitlePrim;
	@JsonProperty(value="formula_title_sec")
	private String formulaTitleSec;
	@JsonProperty(value="formula_spec_info_primary")
	private String formulaSpecInfoPrimary;
	@JsonProperty(value="formula_spec_info_secondary")
	private String formulaSpecInfoSecondary;
	@JsonProperty(value="formula_additional_info")
	private String formulaAdditionalInfo;
	@JsonProperty(value="formula_child_price")
	private BigDecimal formulaChildPrice;
	@JsonProperty(value="formula_adult_price")
	private BigDecimal formulaAdultPrice;
	private String currency;
	@JsonProperty(value="display_sequence")
	private Integer displaySequence;
	
	public String getFormulaCode() {
		return formulaCode;
	}
	public void setFormulaCode(String formulaCode) {
		this.formulaCode = formulaCode;
	}
	public String getFormulaName() {
		return formulaName;
	}
	public void setFormulaName(String formulaName) {
		this.formulaName = formulaName;
	}
	public String getFormulaPicture() {
		return formulaPicture;
	}
	public void setFormulaPicture(String formulaPicture) {
		this.formulaPicture = formulaPicture;
	}
	public String getFormulaShortDescription() {
		return formulaShortDescription;
	}
	public void setFormulaShortDescription(String formulaShortDescription) {
		this.formulaShortDescription = formulaShortDescription;
	}
	public String getFormulaTitlePrim() {
		return formulaTitlePrim;
	}
	public void setFormulaTitlePrim(String formulaTitlePrim) {
		this.formulaTitlePrim = formulaTitlePrim;
	}
	public String getFormulaTitleSec() {
		return formulaTitleSec;
	}
	public void setFormulaTitleSec(String formulaTitleSec) {
		this.formulaTitleSec = formulaTitleSec;
	}
	public String getFormulaSpecInfoPrimary() {
		return formulaSpecInfoPrimary;
	}
	public void setFormulaSpecInfoPrimary(String formulaSpecInfoPrimary) {
		this.formulaSpecInfoPrimary = formulaSpecInfoPrimary;
	}
	public String getFormulaSpecInfoSecondary() {
		return formulaSpecInfoSecondary;
	}
	public void setFormulaSpecInfoSecondary(String formulaSpecInfoSecondary) {
		this.formulaSpecInfoSecondary = formulaSpecInfoSecondary;
	}
	public String getFormulaAdditionalInfo() {
		return formulaAdditionalInfo;
	}
	public void setFormulaAdditionalInfo(String formulaAdditionalInfo) {
		this.formulaAdditionalInfo = formulaAdditionalInfo;
	}
	public BigDecimal getFormulaChildPrice() {
		return formulaChildPrice;
	}
	public void setFormulaChildPrice(BigDecimal formulaChildPrice) {
		this.formulaChildPrice = formulaChildPrice;
	}
	public BigDecimal getFormulaAdultPrice() {
		return formulaAdultPrice;
	}
	public void setFormulaAdultPrice(BigDecimal formulaAdultPrice) {
		this.formulaAdultPrice = formulaAdultPrice;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public Integer getDisplaySequence() {
		return displaySequence;
	}
	public void setDisplaySequence(Integer displaySequence) {
		this.displaySequence = displaySequence;
	}
	
	
	
}
