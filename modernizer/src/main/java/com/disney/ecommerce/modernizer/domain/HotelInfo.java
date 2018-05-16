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

}
