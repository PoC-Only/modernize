package com.disney.ecommerce.modernizer.domain;

import java.math.BigDecimal;
import java.util.List;

public class TransportPackage02 {
	
	private Integer itemNo;
	private String packageCode;
	private String transportMode;
	private BigDecimal price;
	private List<Transport> outbound;
	private List<Transport> inbound;
	private List<Integer> guestIds;
	private List<AddOn> assumptiveAddOns;
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
	public List<AddOn> getAssumptiveAddOns() {
		return assumptiveAddOns;
	}
	public void setAssumptiveAddOns(List<AddOn> assumptiveAddOns) {
		this.assumptiveAddOns = assumptiveAddOns;
	}
	
	

}
