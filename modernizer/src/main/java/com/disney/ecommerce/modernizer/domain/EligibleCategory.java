package com.disney.ecommerce.modernizer.domain;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Domain class for EligibleCategory
 *
 * @author Carl de Jesus
 * @version 1.0
 * @since 2018-05-16
 */
@JsonInclude(NON_NULL)
public class EligibleCategory {
	@JsonProperty(value = "category_code")
	private String categoryCode;
	private String name;
	@JsonProperty(value = "diplay_sequence")
	private Integer displaySequence;
	@JsonProperty(value = "add_ons")
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

	@Override
	public String toString() {
		return "EligibleCategory [categoryCode=" + categoryCode + ", name=" + name + ", displaySequence="
				+ displaySequence + ", addOns=" + addOns + ", entity=" + entity + "]";
	}

}
