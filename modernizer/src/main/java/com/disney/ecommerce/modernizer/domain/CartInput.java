package com.disney.ecommerce.modernizer.domain;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(NON_NULL)
public class CartInput {

	@JsonProperty(value = "guest_information")
	private List<Guest> guestInformation;
	@JsonProperty(value = "room_package")
	private List<RoomPackage> roomPackage;
	@JsonProperty(value = "transport_package")
	private List<TransportPackage> transportPackage;
	@JsonProperty(value = "add_ons")
	private List<CartAddOn> addOns;

	public List<Guest> getGuestInformation() {
		return guestInformation;
	}

	public void setGuestInformation(List<Guest> guestInformation) {
		this.guestInformation = guestInformation;
	}

	public List<RoomPackage> getRoomPackage() {
		return roomPackage;
	}

	public void setRoomPackage(List<RoomPackage> roomPackage) {
		this.roomPackage = roomPackage;
	}

	public List<TransportPackage> getTransportPackage() {
		return transportPackage;
	}

	public void setTransportPackage(List<TransportPackage> transportPackage) {
		this.transportPackage = transportPackage;
	}

	public List<CartAddOn> getAddOns() {
		return addOns;
	}

	public void setAddOns(List<CartAddOn> addOns) {
		this.addOns = addOns;
	}

}
