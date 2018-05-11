package com.disney.ecommerce.modernizer.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class HotelPackage extends Hotel{
	
	@JsonProperty(value="recommended_package")
	private List<Package> recommmendedPackage;

	public List<Package> getRecommmendedPackage() {
		return recommmendedPackage;
	}

	public void setRecommmendedPackage(List<Package> recommmendedPackage) {
		this.recommmendedPackage = recommmendedPackage;
	}
	
	
}
