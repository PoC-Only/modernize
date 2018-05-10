package com.disney.ecommerce.modernizer.domain;

import java.util.List;

public class EligibleCategories {
	private String categoryCode;
	private String name;
	private Integer displaySequence;
	private Boolean isDisplayed;
	private List<EligibleAddOn> addOns;
	private List<Entity> entity;
	private List<Formula> formula;
	public String getCategoryCode() {
		return categoryCode;
	}
	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getDisplaySequence() {
		return displaySequence;
	}
	public void setDisplaySequence(Integer displaySequence) {
		this.displaySequence = displaySequence;
	}
	public Boolean getIsDisplayed() {
		return isDisplayed;
	}
	public void setIsDisplayed(Boolean isDisplayed) {
		this.isDisplayed = isDisplayed;
	}
	public List<EligibleAddOn> getAddOns() {
		return addOns;
	}
	public void setAddOns(List<EligibleAddOn> addOns) {
		this.addOns = addOns;
	}
	public List<Entity> getEntity() {
		return entity;
	}
	public void setEntity(List<Entity> entity) {
		this.entity = entity;
	}
	public List<Formula> getFormula() {
		return formula;
	}
	public void setFormula(List<Formula> formula) {
		this.formula = formula;
	}
	
	
}
