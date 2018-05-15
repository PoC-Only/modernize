package com.disney.ecommerce.modernizer.domain;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(NON_NULL)
public class SpecialRequest {

	@JsonProperty(value = "request_code")
	private String requestCode;
	@JsonProperty(value = "request_description")
	private String requestDescription;
	@JsonProperty(value = "adjoining_room_number")
	private String adjoiningRoomNumber;
	@JsonProperty(value = "adjoining_room_guest_name")
	private String adjoiningRoomGuestName;

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

	public String getAdjoiningRoomGuestName() {
		return adjoiningRoomGuestName;
	}

	public void setAdjoiningRoomGuestName(String adjoiningRoomGuestName) {
		this.adjoiningRoomGuestName = adjoiningRoomGuestName;
	}

}
