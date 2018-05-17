package com.disney.ecommerce.modernizer.domain;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Domain class for Hotel
 *
 * @author Renino Niefes
 * @version 1.0
 * @since 2018-05-16
 */
@JsonInclude(NON_NULL)
public class CheckInDate {
	@JsonProperty(value = "check_in_start_date")
	private String checkInStartDate;
	@JsonProperty(value = "check_in_end_date")
	private String checkInEndDate;
	@JsonProperty(value = "check_in_day_of_week")
	private String checkInDayOfWeek;

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

	@Override
	public String toString() {
		return "CheckInDate [checkInStartDate=" + checkInStartDate + ", checkInEndDate=" + checkInEndDate
				+ ", checkInDayOfWeek=" + checkInDayOfWeek + "]";
	}

}
