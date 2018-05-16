package com.disney.ecommerce.modernizer.domain;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL;

import java.math.BigDecimal;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Domain class for CartAddOn
 *
 * @author Carl de Jesus
 * @version 1.0
 * @since 2018-05-16
 */
@JsonInclude(NON_NULL)
public class CartAddOn {
	@JsonProperty(value = "item_no")
	private Integer itemNo;
	private String category;
	@JsonProperty(value = "addon_code")
	private String addonCode;
	private String name;
	private BigDecimal price;
	@JsonProperty(value = "label_date")
	private String labelDate;
	private List<Inventory> inventory;
	@JsonProperty(value = "guest_ids")
	private List<Integer> guestIds;

	public Integer getItemNo() {
		return itemNo;
	}

	public void setItemNo(Integer itemNo) {
		this.itemNo = itemNo;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getAddonCode() {
		return addonCode;
	}

	public void setAddonCode(String addonCode) {
		this.addonCode = addonCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public String getLabelDate() {
		return labelDate;
	}

	public void setLabelDate(String labelDate) {
		this.labelDate = labelDate;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public List<Inventory> getInventory() {
		return inventory;
	}

	public void setInventory(List<Inventory> inventory) {
		this.inventory = inventory;
	}

	public List<Integer> getGuestIds() {
		return guestIds;
	}

	public void setGuestIds(List<Integer> guestIds) {
		this.guestIds = guestIds;
	}

}
