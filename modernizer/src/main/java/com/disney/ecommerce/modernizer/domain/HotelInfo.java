package com.disney.ecommerce.modernizer.domain;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Domain class for HotelInfo
 *
 * @author Carl de Jesus
 * @version 1.0
 * @since 2018-05-16
 */
@JsonInclude(NON_NULL)
public class HotelInfo extends Hotel {
	@JsonProperty(value = "recommended_package")
	private List<Package> recommendedPackage;
	@JsonProperty(value = "alternative_package")
	private List<AlternativePackage> alternativePackage;

	public List<Package> getRecommendedPackage() {
		return recommendedPackage;
	}

	public void setRecommendedPackage(List<Package> recommendedPackage) {
		this.recommendedPackage = recommendedPackage;
	}

	public List<AlternativePackage> getAlternativePackage() {
		return alternativePackage;
	}

	public void setAlternativePackage(List<AlternativePackage> alternativePackage) {
		this.alternativePackage = alternativePackage;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("HotelInfo [recommendedPackage=");
		builder.append(recommendedPackage);
		builder.append(", alternativePackage=");
		builder.append(alternativePackage);
		builder.append(", getHotelCode()=");
		builder.append(getHotelCode());
		builder.append(", getGroupOfOffer()=");
		builder.append(getGroupOfOffer());
		builder.append(", getEligibility()=");
		builder.append(getEligibility());
		builder.append(", getNonEligibilityReason()=");
		builder.append(getNonEligibilityReason());
		builder.append(", getHotelName()=");
		builder.append(getHotelName());
		builder.append(", getHotelRating()=");
		builder.append(getHotelRating());
		builder.append(", getHotelCategory()=");
		builder.append(getHotelCategory());
		builder.append(", getBtlBeforeSwitch()=");
		builder.append(getBtlBeforeSwitch());
		builder.append(", getBtlAfterSwitch()=");
		builder.append(getBtlAfterSwitch());
		builder.append(", getMaxPartyMix()=");
		builder.append(getMaxPartyMix());
		builder.append(", getMaxInfants()=");
		builder.append(getMaxInfants());
		builder.append(", getMinLos()=");
		builder.append(getMinLos());
		builder.append(", getMaxLos()=");
		builder.append(getMaxLos());
		builder.append(", getSpecialRequest()=");
		builder.append(getSpecialRequest());
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append(", getClass()=");
		builder.append(getClass());
		builder.append(", hashCode()=");
		builder.append(hashCode());
		builder.append("]");
		return builder.toString();
	}



}
