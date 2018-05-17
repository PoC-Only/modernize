package com.disney.ecommerce.modernizer.domain;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(NON_NULL)
public class HotelPackage extends Hotel {

	@JsonProperty(value = "recommended_package")
	private List<Package> recommmendedPackage;

	public List<Package> getRecommmendedPackage() {
		return recommmendedPackage;
	}

	public void setRecommmendedPackage(List<Package> recommmendedPackage) {
		this.recommmendedPackage = recommmendedPackage;
	}

}
