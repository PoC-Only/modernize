package com.disney.ecommerce.modernizer.domain;

import java.util.List;

public class HotelPackage extends Hotel{
	private List<Package> recommmendedPackage;

	public List<Package> getRecommmendedPackage() {
		return recommmendedPackage;
	}

	public void setRecommmendedPackage(List<Package> recommmendedPackage) {
		this.recommmendedPackage = recommmendedPackage;
	}
	
	
}
