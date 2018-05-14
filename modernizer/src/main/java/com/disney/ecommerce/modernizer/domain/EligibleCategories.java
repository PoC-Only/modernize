package com.disney.ecommerce.modernizer.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EligibleCategories {
	@JsonProperty(value="category_code")
	private String categoryCode;
	private String name;
	@JsonProperty(value="diplay_sequence")
	private Integer displaySequence;
	@JsonProperty(value="add_ons")
	private List<EligibleAddOn> addOns;
	private List<Entity> entity;
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
	
	
}
