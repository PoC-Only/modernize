package com.disney.ecommerce.modernizer.domain;

import java.math.BigDecimal;

public class Entity {
	private String entityCode;
	private String entityPicutre;
	private String entityName;
	private String entityShortDescription;
	private String description;
	private Integer displaySequence;
	private String carWashImageId;
	private BigDecimal entityChildPrice;
	private BigDecimal entityAdultPrice;
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
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
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
	
}
