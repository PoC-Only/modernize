package com.disney.ecommerce.modernizer.domain;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(NON_NULL)
public class Hotel {

	@JsonProperty(value = "hotel_code")
	private String hotelCode;

	@JsonProperty(value = "group_of_offer")
	private String groupOfOffer;

	private Boolean eligibility;

	@JsonProperty(value = "non_eligibility_reason")
	private Integer nonEligibilityReason;

	@JsonProperty(value = "hotel_name")
	private String hotelName;

	@JsonProperty(value = "hotel_rating")
	private String hotelRating;

	@JsonProperty(value = "hotel_category")
	private String hotelCategory;

	@JsonProperty(value = "check_in_start_date")
	private String checkInStartDate;

	@JsonProperty(value = "check_in_end_date")
	private String checkInEndDate;

	@JsonProperty(value = "check_in_day_of_week")
	private String checkInDayOfWeek;

	@JsonProperty(value = "btl_before_switch")
	private Integer btlBeforeSwitch;

	@JsonProperty(value = "btl_after_switch")
	private String btlAfterSwitch;

	@JsonProperty(value = "max_party_mix")
	private Integer maxPartyMix;

	@JsonProperty(value = "max_infants")
	private Integer maxInfants;

	@JsonProperty(value = "min_los")
	private Integer minLos;

	@JsonProperty(value = "max_los")
	private Integer maxLos;

	@JsonProperty(value = "special_request")
	private List<SpecialRequest> specialRequest;

	public String getHotelCode() {
		return hotelCode;
	}

	public void setHotelCode(String hotelCode) {
		this.hotelCode = hotelCode;
	}

	public String getGroupOfOffer() {
		return groupOfOffer;
	}

	public void setGroupOfOffer(String groupOfOffer) {
		this.groupOfOffer = groupOfOffer;
	}

	public Boolean getEligibility() {
		return eligibility;
	}

	public void setEligibility(Boolean eligibility) {
		this.eligibility = eligibility;
	}

	public Integer getNonEligibilityReason() {
		return nonEligibilityReason;
	}

	public void setNonEligibilityReason(Integer nonEligibilityReason) {
		this.nonEligibilityReason = nonEligibilityReason;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public String getHotelRating() {
		return hotelRating;
	}

	public void setHotelRating(String hotelRating) {
		this.hotelRating = hotelRating;
	}

	public String getHotelCategory() {
		return hotelCategory;
	}

	public void setHotelCategory(String hotelCategory) {
		this.hotelCategory = hotelCategory;
	}

	public String getCheckInStartDate() {
		return checkInStartDate;
	}

	public void setCheckInStartDate(String checkInStartDate) {
		this.checkInStartDate = checkInStartDate;
	}

	public String getCheckInEndDate() {
		return checkInEndDate;
	}

	public void setCheckInEndDate(String checkInEndDate) {
		this.checkInEndDate = checkInEndDate;
	}

	public String getCheckInDayOfWeek() {
		return checkInDayOfWeek;
	}

	public void setCheckInDayOfWeek(String checkInDayOfWeek) {
		this.checkInDayOfWeek = checkInDayOfWeek;
	}

	public Integer getBtlBeforeSwitch() {
		return btlBeforeSwitch;
	}

	public void setBtlBeforeSwitch(Integer btlBeforeSwitch) {
		this.btlBeforeSwitch = btlBeforeSwitch;
	}

	public String getBtlAfterSwitch() {
		return btlAfterSwitch;
	}

	public void setBtlAfterSwitch(String btlAfterSwitch) {
		this.btlAfterSwitch = btlAfterSwitch;
	}

	public Integer getMaxPartyMix() {
		return maxPartyMix;
	}

	public void setMaxPartyMix(Integer maxPartyMix) {
		this.maxPartyMix = maxPartyMix;
	}

	public Integer getMaxInfants() {
		return maxInfants;
	}

	public void setMaxInfants(Integer maxInfants) {
		this.maxInfants = maxInfants;
	}

	public Integer getMinLos() {
		return minLos;
	}

	public void setMinLos(Integer minLos) {
		this.minLos = minLos;
	}

	public Integer getMaxLos() {
		return maxLos;
	}

	public void setMaxLos(Integer maxLos) {
		this.maxLos = maxLos;
	}

	public List<SpecialRequest> getSpecialRequest() {
		return specialRequest;
	}

	public void setSpecialRequest(List<SpecialRequest> specialRequest) {
		this.specialRequest = specialRequest;
	}

}
