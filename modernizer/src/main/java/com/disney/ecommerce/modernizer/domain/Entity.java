package com.disney.ecommerce.modernizer.domain;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Domain class for Entity
 *
 * @author Carl de Jesus
 * @version 1.0
 * @since 2018-05-16
 */
@JsonInclude(NON_NULL)
public class Entity {
	@JsonProperty(value = "entity_code")
	private String entityCode;
	@JsonProperty(value = "entity_picture")
	private String entityPicutre;
	@JsonProperty(value = "entity_name")
	private String entityName;
	@JsonProperty(value = "entity_short_description")
	private String entityShortDescription;
	@JsonProperty(value = "entity_description")
	private String entityDescription;
	@JsonProperty(value = "display_sequence")
	private Integer displaySequence;
	@JsonProperty(value = "car_wash_image_id")
	private String carWashImageId;
	@JsonProperty(value = "entity_child_price")
	private BigDecimal entityChildPrice;
	@JsonProperty(value = "entity_adult_price")
	private BigDecimal entityAdultPrice;
	@JsonProperty(value = "unique_price")
	private BigDecimal uniquePrice;
	private String currency;

	public String getEntityCode() {
		return entityCode;
	}

	public void setEntityCode(String entityCode) {
		this.entityCode = entityCode;
	}

	public String getEntityPicutre() {
		return entityPicutre;
	}

	public void setEntityPicutre(String entityPicutre) {
		this.entityPicutre = entityPicutre;
	}

	public String getEntityName() {
		return entityName;
	}

	public void setEntityName(String entityName) {
		this.entityName = entityName;
	}

	public String getEntityShortDescription() {
		return entityShortDescription;
	}

	public void setEntityShortDescription(String entityShortDescription) {
		this.entityShortDescription = entityShortDescription;
	}

	public String getEntityDescription() {
		return entityDescription;
	}

	public void setDescription(String entityDescription) {
		this.entityDescription = entityDescription;
	}

	public Integer getDisplaySequence() {
		return displaySequence;
	}

	public void setDisplaySequence(Integer displaySequence) {
		this.displaySequence = displaySequence;
	}

	public String getCarWashImageId() {
		return carWashImageId;
	}

	public void setCarWashImageId(String carWashImageId) {
		this.carWashImageId = carWashImageId;
	}

	public BigDecimal getEntityChildPrice() {
		return entityChildPrice;
	}

	public void setEntityChildPrice(BigDecimal entityChildPrice) {
		this.entityChildPrice = entityChildPrice;
	}

	public BigDecimal getEntityAdultPrice() {
		return entityAdultPrice;
	}

	public void setEntityAdultPrice(BigDecimal entityAdultPrice) {
		this.entityAdultPrice = entityAdultPrice;
	}

	public BigDecimal getUniquePrice() {
		return uniquePrice;
	}

	public void setUniquePrice(BigDecimal uniquePrice) {
		this.uniquePrice = uniquePrice;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	@Override
	public String toString() {
		return "Entity [entityCode=" + entityCode + ", entityPicutre=" + entityPicutre + ", entityName=" + entityName
				+ ", entityShortDescription=" + entityShortDescription + ", entityDescription=" + entityDescription
				+ ", displaySequence=" + displaySequence + ", carWashImageId=" + carWashImageId + ", entityChildPrice="
				+ entityChildPrice + ", entityAdultPrice=" + entityAdultPrice + ", uniquePrice=" + uniquePrice
				+ ", currency=" + currency + "]";
	}

}
