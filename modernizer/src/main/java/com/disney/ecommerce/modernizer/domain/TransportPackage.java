package com.disney.ecommerce.modernizer.domain;

import java.math.BigDecimal;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TransportPackage {
	@JsonProperty(value="item_no")
	private Integer itemNo;
	@JsonProperty(value="package_code")
	private String packageCode;
	@JsonProperty(value="transport_mode")
	private String transportMode;
	private BigDecimal price;
	private List<Transport> outbound;
	private List<Transport> inbound;
	@JsonProperty(value="guest_ids")
	private List<Integer> guestIds;
	@JsonProperty(value="add_ons")
	private List<AddOn> addOns;
	
	public Integer getItemNo() {
		return itemNo;
	}
	public void setItemNo(Integer itemNo) {
		this.itemNo = itemNo;
	}
	public String getPackageCode() {
		return packageCode;
	}
	public void setPackageCode(String packageCode) {
		this.packageCode = packageCode;
	}
	public String getTransportMode() {
		return transportMode;
	}
	public void setTransportMode(String transportMode) {
		this.transportMode = transportMode;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public List<Transport> getOutbound() {
		return outbound;
	}
	public void setOutbound(List<Transport> outbound) {
		this.outbound = outbound;
	}
	public List<Transport> getInbound() {
		return inbound;
	}
	public void setInbound(List<Transport> inbound) {
		this.inbound = inbound;
	}
	public List<Integer> getGuestIds() {
		return guestIds;
	}
	public void setGuestIds(List<Integer> guestIds) {
		this.guestIds = guestIds;
	}
	public List<AddOn> getAddOns() {
		return addOns;
	}
	public void setAddOns(List<AddOn> addOns) {
		this.addOns = addOns;
	}
	
	
}
