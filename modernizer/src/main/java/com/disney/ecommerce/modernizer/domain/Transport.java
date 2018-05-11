package com.disney.ecommerce.modernizer.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Transport {
	@JsonProperty(value="transportation_offer_name")
	private String transportaionOfferName;
	@JsonProperty(value="carrier_code")
	private String carrierCode;
	@JsonProperty(value="carrier_name")
	private String carrierName;
	@JsonProperty(value="flight_train_number")
	private String flightTrainNumber;
	@JsonProperty(value="isDirect")
	private Boolean isDirect;
	@JsonProperty(value="transportation_offer_details")
	private String transportationOfferDetails;
	@JsonProperty(value="plane_train_type")
	private String planeTrainType;
	@JsonProperty(value="fare_class")
	private String fareClass;
	@JsonProperty(value="service_class")
	private String serviceClass;
	@JsonProperty(value="departure_place")
	private String departurePlace;
	@JsonProperty(value="arrival_place")
	private String arrivalPlace;
	@JsonProperty(value="departure_date")
	private String departureDate;
	@JsonProperty(value="departure_hour")
	private String departureHour;
	@JsonProperty(value="arrival_hour")
	private String arrivalHour;
	
	public String getTransportaionOfferName() {
		return transportaionOfferName;
	}
	public void setTransportaionOfferName(String transportaionOfferName) {
		this.transportaionOfferName = transportaionOfferName;
	}
	public String getCarrierCode() {
		return carrierCode;
	}
	public void setCarrierCode(String carrierCode) {
		this.carrierCode = carrierCode;
	}
	public String getCarrierName() {
		return carrierName;
	}
	public void setCarrierName(String carrierName) {
		this.carrierName = carrierName;
	}
	public String getFlightTrainNumber() {
		return flightTrainNumber;
	}
	public void setFlightTrainNumber(String flightTrainNumber) {
		this.flightTrainNumber = flightTrainNumber;
	}
	public Boolean getIsDirect() {
		return isDirect;
	}
	public void setIsDirect(Boolean isDirect) {
		this.isDirect = isDirect;
	}
	public String getTransportationOfferDetails() {
		return transportationOfferDetails;
	}
	public void setTransportationOfferDetails(String transportationOfferDetails) {
		this.transportationOfferDetails = transportationOfferDetails;
	}
	public String getPlaneTrainType() {
		return planeTrainType;
	}
	public void setPlaneTrainType(String planeTrainType) {
		this.planeTrainType = planeTrainType;
	}
	public String getFareClass() {
		return fareClass;
	}
	public void setFareClass(String fareClass) {
		this.fareClass = fareClass;
	}
	public String getServiceClass() {
		return serviceClass;
	}
	public void setServiceClass(String serviceClass) {
		this.serviceClass = serviceClass;
	}
	public String getDeparturePlace() {
		return departurePlace;
	}
	public void setDeparturePlace(String departurePlace) {
		this.departurePlace = departurePlace;
	}
	public String getArrivalPlace() {
		return arrivalPlace;
	}
	public void setArrivalPlace(String arrivalPlace) {
		this.arrivalPlace = arrivalPlace;
	}
	public String getDepartureDate() {
		return departureDate;
	}
	public void setDepartureDate(String departureDate) {
		this.departureDate = departureDate;
	}
	public String getDepartureHour() {
		return departureHour;
	}
	public void setDepartureHour(String departureHour) {
		this.departureHour = departureHour;
	}
	public String getArrivalHour() {
		return arrivalHour;
	}
	public void setArrivalHour(String arrivalHour) {
		this.arrivalHour = arrivalHour;
	}
	
	
	
}
