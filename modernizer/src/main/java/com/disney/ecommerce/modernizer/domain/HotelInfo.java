package com.disney.ecommerce.modernizer.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

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
