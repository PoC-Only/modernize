package com.disney.ecommerce.modernizer.domain;

import java.util.List;

public class CartInput {
	private List<Guest> guestInformation;
	private List<RoomPackage> roomPackage;
	private List<TransportPackage> transportPackage;
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
