package com.disney.ecommerce.modernizer.domain;

public class SpecialRequest {
	private String requestCode;
	private String requestDescription;
	private String adjoiningRoomNumber;
	private String adjoiningRoomGuest;
	public String getRequestCode() {
		return requestCode;
	}
	public void setRequestCode(String requestCode) {
		this.requestCode = requestCode;
	}
	public String getRequestDescription() {
		return requestDescription;
	}
	public void setRequestDescription(String requestDescription) {
		this.requestDescription = requestDescription;
	}
	public String getAdjoiningRoomNumber() {
		return adjoiningRoomNumber;
	}
	public void setAdjoiningRoomNumber(String adjoiningRoomNumber) {
		this.adjoiningRoomNumber = adjoiningRoomNumber;
	}
	public String getAdjoiningRoomGuest() {
		return adjoiningRoomGuest;
	}
	public void setAdjoiningRoomGuest(String adjoiningRoomGuest) {
		this.adjoiningRoomGuest = adjoiningRoomGuest;
	}
	
}
