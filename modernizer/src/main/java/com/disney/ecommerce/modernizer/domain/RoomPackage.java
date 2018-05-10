package com.disney.ecommerce.modernizer.domain;

import java.util.List;

public class RoomPackage {
	private Integer itemNo;
	private String packageCode;
	private String checkInDate;
	private String checkOutDate;
	private String roomType;
	private List<Integer> guestId;
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
	public String getCheckInDate() {
		return checkInDate;
	}
	public void setCheckInDate(String checkInDate) {
		this.checkInDate = checkInDate;
	}
	public String getCheckOutDate() {
		return checkOutDate;
	}
	public void setCheckOutDate(String checkOutDate) {
		this.checkOutDate = checkOutDate;
	}
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	public List<Integer> getGuestId() {
		return guestId;
	}
	public void setGuestId(List<Integer> guestId) {
		this.guestId = guestId;
	}
	public List<AddOn> getAddOns() {
		return addOns;
	}
	public void setAddOns(List<AddOn> addOns) {
		this.addOns = addOns;
	}
	
	
}