package com.disney.ecommerce.modernizer.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Guest {
	@JsonProperty(value = "guest_id")
	private Integer guestId;
	
	private String title;
	
	private String gender;
	
	@JsonProperty(value = "first_name")
	private String firstname;
	
	@JsonProperty(value = "last_name")
	private String lastname;
	
	@JsonProperty(value = "date_birth")
	private String dateBirth;
	
	@JsonProperty(value = "type_of_document")
	private String typeOfDocument;
	
	@JsonProperty(value = "document_expirity_date")
	private String documentExpirityDate;
	
	@JsonProperty(value = "country_delivering_document")
	private String country_delivery_document;

	@JsonProperty(value = "document_number")
	private String documentNumber;
	
	@JsonProperty(value = "address_line_1")
	private String addressLine1;
	
	@JsonProperty(value = "address_line_2")
	private String addressLine2;
	
	@JsonProperty(value = "city_name")
	private String cityName;
	
	private String zip;
	
	private String country;
	
	@JsonProperty(value = "phone_number")
	private String phoneNumber;
	
	private String mail;
	
	@JsonProperty(value = "optin")
	private Boolean optin;

	public Integer getGuestId() {
		return guestId;
	}

	public void setGuestId(Integer guestId) {
		this.guestId = guestId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getDateBirth() {
		return dateBirth;
	}

	public void setDateBirth(String dateBirth) {
		this.dateBirth = dateBirth;
	}

	public String getTypeOfDocument() {
		return typeOfDocument;
	}

	public void setTypeOfDocument(String typeOfDocument) {
		this.typeOfDocument = typeOfDocument;
	}

	public String getDocumentExpirityDate() {
		return documentExpirityDate;
	}

	public void setDocumentExpirityDate(String documentExpirityDate) {
		this.documentExpirityDate = documentExpirityDate;
	}

	public String getCountry_delivery_document() {
		return country_delivery_document;
	}

	public void setCountry_delivery_document(String country_delivery_document) {
		this.country_delivery_document = country_delivery_document;
	}

	public String getDocumentNumber() {
		return documentNumber;
	}

	public void setDocumentNumber(String documentNumber) {
		this.documentNumber = documentNumber;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public Boolean getOptin() {
		return optin;
	}

	public void setOptin(Boolean optin) {
		this.optin = optin;
	}

}
