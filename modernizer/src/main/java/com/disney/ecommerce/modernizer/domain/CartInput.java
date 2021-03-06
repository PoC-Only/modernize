package com.disney.ecommerce.modernizer.domain;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Domain class for CartInput
 *
 * @author Carl de Jesus
 * @version 1.0
 * @since 2018-05-16
 */
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

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CartInput [guestInformation=");
		builder.append(guestInformation);
		builder.append(", roomPackage=");
		builder.append(roomPackage);
		builder.append(", transportPackage=");
		builder.append(transportPackage);
		builder.append(", addOns=");
		builder.append(addOns);
		builder.append(", getClass()=");
		builder.append(getClass());
		builder.append(", hashCode()=");
		builder.append(hashCode());
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

}
