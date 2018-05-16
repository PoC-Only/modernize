package com.disney.ecommerce.modernizer.domain;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL;

import java.math.BigDecimal;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Domain class for Cart
 *
 * @author Carl de Jesus
 * @version 1.0
 * @since 2018-05-16
 */
@JsonInclude(NON_NULL)
public class Cart {
	@JsonProperty(value = "cart_id")
	private Integer cartId;
	@JsonProperty(value = "creation_date")
	private String creationDate;
	@JsonProperty(value = "cart_status")
	private Boolean cartStatus;
	@JsonProperty(value = "cart_name")
	private Boolean cartName;
	@JsonProperty(value = "channel_market")
	private Boolean channelMarket;
	@JsonProperty(value = "country")
	private Boolean country;
	@JsonProperty(value = "gross_total_amount")
	private BigDecimal grossTotalAmount;
	@JsonProperty(value = "net_amount")
	private BigDecimal netAmount;
	@JsonProperty(value = "balance_amount")
	private BigDecimal balanceAmount;
	@JsonProperty(value = "deposit_amount")
	private BigDecimal depositAmount;
	private String[] currency;
	@JsonProperty(value = "guest_information")
	private List<Guest> guestInformation;
	@JsonProperty(value = "room_package")
	private List<RoomPackage> roomPackage;
	@JsonProperty(value = "transport_package")
	private List<TransportPackage> transportPackage;
	@JsonProperty(value = "add_ons")
	private List<CartAddOn> addOns;

	public Integer getCartId() {
		return cartId;
	}

	public void setCartId(Integer cartId) {
		this.cartId = cartId;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public Boolean getCartStatus() {
		return cartStatus;
	}

	public void setCartStatus(Boolean cartStatus) {
		this.cartStatus = cartStatus;
	}

	public Boolean getCartName() {
		return cartName;
	}

	public void setCartName(Boolean cartName) {
		this.cartName = cartName;
	}

	public Boolean getChannelMarket() {
		return channelMarket;
	}

	public void setChannelMarket(Boolean channelMarket) {
		this.channelMarket = channelMarket;
	}

	public Boolean getCountry() {
		return country;
	}

	public void setCountry(Boolean country) {
		this.country = country;
	}

	public BigDecimal getGrossTotalAmount() {
		return grossTotalAmount;
	}

	public void setGrossTotalAmount(BigDecimal grossTotalAmount) {
		this.grossTotalAmount = grossTotalAmount;
	}

	public BigDecimal getNetAmount() {
		return netAmount;
	}

	public void setNetAmount(BigDecimal netAmount) {
		this.netAmount = netAmount;
	}

	public BigDecimal getBalanceAmount() {
		return balanceAmount;
	}

	public void setBalanceAmount(BigDecimal balanceAmount) {
		this.balanceAmount = balanceAmount;
	}

	public BigDecimal getDepositAmount() {
		return depositAmount;
	}

	public void setDepositAmount(BigDecimal depositAmount) {
		this.depositAmount = depositAmount;
	}

	public String[] getCurrency() {
		return currency;
	}

	public void setCurrency(String[] currency) {
		this.currency = currency;
	}

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
