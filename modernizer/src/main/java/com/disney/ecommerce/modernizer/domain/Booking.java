package com.disney.ecommerce.modernizer.domain;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(NON_NULL)
public class Booking {
	@JsonProperty(value = "sales_channel")
	private String salesChannel;
	private String market;
	@JsonProperty(value = "booking_number")
	private String bookingNumber;
	@JsonProperty(value = "booking_date")
	private String bookingDate;
	@JsonProperty(value = "checkin_date")
	private String checkinDate;
	@JsonProperty(value = "checkout_date")
	private String checkoutDate;
	@JsonProperty(value = "contact_name")
	private String contactName;
	@JsonProperty(value = "total_party_mix")
	private Integer totalPartyMix;
	@JsonProperty(value = "booking_status")
	private String bookingStatus;
	@JsonProperty(value = "past_checkin_date_flag")
	private Boolean pastCheckinDateFlag;

	public String getSalesChannel() {
		return salesChannel;
	}

	public void setSalesChannel(String salesChannel) {
		this.salesChannel = salesChannel;
	}

	public String getMarket() {
		return market;
	}

	public void setMarket(String market) {
		this.market = market;
	}

	public String getBookingNumber() {
		return bookingNumber;
	}

	public void setBookingNumber(String bookingNumber) {
		this.bookingNumber = bookingNumber;
	}

	public String getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(String bookingDate) {
		this.bookingDate = bookingDate;
	}

	public String getCheckinDate() {
		return checkinDate;
	}

	public void setCheckinDate(String checkinDate) {
		this.checkinDate = checkinDate;
	}

	public String getCheckoutDate() {
		return checkoutDate;
	}

	public void setCheckoutDate(String checkoutDate) {
		this.checkoutDate = checkoutDate;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public Integer getTotalPartyMix() {
		return totalPartyMix;
	}

	public void setTotalPartyMix(Integer totalPartyMix) {
		this.totalPartyMix = totalPartyMix;
	}

	public String getBookingStatus() {
		return bookingStatus;
	}

	public void setBookingStatus(String bookingStatus) {
		this.bookingStatus = bookingStatus;
	}

	public Boolean getPastCheckinDateFlag() {
		return pastCheckinDateFlag;
	}

	public void setPastCheckinDateFlag(Boolean pastCheckinDateFlag) {
		this.pastCheckinDateFlag = pastCheckinDateFlag;
	}

}
