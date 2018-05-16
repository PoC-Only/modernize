package com.disney.ecommerce.modernizer.domain;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL;

import java.math.BigDecimal;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Domain class for BookingDetails
 *
 * @author Carl de Jesus
 * @version 1.0
 * @since 2018-05-16
 */
@JsonInclude(NON_NULL)
public class BookingDetails {
	@JsonProperty(value = "booking_number")
	private String bookingNumber;
	@JsonProperty(value = "booking_date")
	private String bookingDate;
	@JsonProperty(value = "booking_status")
	private Boolean bookingStatus;
	@JsonProperty(value = "document_delivery_description")
	private String documentDeliveryDescription;
	@JsonProperty(value = "minimum_depost")
	private BigDecimal mininumDeposit;
	@JsonProperty(value = "gross_total_amount")
	private BigDecimal grossTotalAmount;
	@JsonProperty(value = "net_amount_paid")
	private BigDecimal netAmount;
	@JsonProperty(value = "amount_due")
	private String amountDue;
	@JsonProperty(value = "guarantee_amount")
	private String guaranteeAmount;
	private String currency;
	@JsonProperty(value = "balance_due_date")
	private String balanceDueDate;
	@JsonProperty(value = "card_holder_name")
	private String cardHolderName;
	@JsonProperty(value = "card_number")
	private String cardNumber;
	@JsonProperty(value = "authorization_number")
	private String authorizationNmber;
	@JsonProperty(value = "guest_information")
	private List<Guest> guestInformation;
	@JsonProperty(value = "room_package")
	private List<RoomPackage> roomPackage;
	@JsonProperty(value = "transport_package")
	private List<TransportPackage02> transportPackage;
	@JsonProperty(value = "add_ons")
	private List<BookingDetailsAddOn> addOns;

	public String getBookingNumber() {
		return bookingNumber;
	}

	public void setBookingNumber(String bookingNumber) {
		this.bookingNumber = bookingNumber;
	}

	public String getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(String bookingDate) {
		this.bookingDate = bookingDate;
	}

	public Boolean getBookingStatus() {
		return bookingStatus;
	}

	public void setBookingStatus(Boolean bookingStatus) {
		this.bookingStatus = bookingStatus;
	}

	public String getDocumentDeliveryDescription() {
		return documentDeliveryDescription;
	}

	public void setDocumentDeliveryDescription(String documentDeliveryDescription) {
		this.documentDeliveryDescription = documentDeliveryDescription;
	}

	public BigDecimal getMininumDeposit() {
		return mininumDeposit;
	}

	public void setMininumDeposit(BigDecimal mininumDeposit) {
		this.mininumDeposit = mininumDeposit;
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

	public String getAmountDue() {
		return amountDue;
	}

	public void setAmountDue(String amountDue) {
		this.amountDue = amountDue;
	}

	public String getGuaranteeAmount() {
		return guaranteeAmount;
	}

	public void setGuaranteeAmount(String guaranteeAmount) {
		this.guaranteeAmount = guaranteeAmount;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getBalanceDueDate() {
		return balanceDueDate;
	}

	public void setBalanceDueDate(String balanceDueDate) {
		this.balanceDueDate = balanceDueDate;
	}
	
	public String getCardHolderName() {
		return cardHolderName;
	}

	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getAuthorizationNmber() {
		return authorizationNmber;
	}

	public void setAuthorizationNmber(String authorizationNmber) {
		this.authorizationNmber = authorizationNmber;
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

	public List<TransportPackage02> getTransportPackage() {
		return transportPackage;
	}

	public void setTransportPackage(List<TransportPackage02> transportPackage) {
		this.transportPackage = transportPackage;
	}

	public List<BookingDetailsAddOn> getAddOns() {
		return addOns;
	}

	public void setAddOns(List<BookingDetailsAddOn> addOns) {
		this.addOns = addOns;
	}

	@Override
	public String toString() {
		return "BookingDetails [bookingNumber=" + bookingNumber + ", bookingDate=" + bookingDate + ", bookingStatus="
				+ bookingStatus + ", documentDeliveryDescription=" + documentDeliveryDescription + ", mininumDeposit="
				+ mininumDeposit + ", grossTotalAmount=" + grossTotalAmount + ", netAmount=" + netAmount
				+ ", amountDue=" + amountDue + ", guaranteeAmount=" + guaranteeAmount + ", currency=" + currency
				+ ", balanceDueDate=" + balanceDueDate + ", cardHolderName=" + cardHolderName + ", cardNumber="
				+ cardNumber + ", authorizationNmber=" + authorizationNmber + ", guestInformation=" + guestInformation
				+ ", roomPackage=" + roomPackage + ", transportPackage=" + transportPackage + ", addOns=" + addOns
				+ "]";
	}

	
}
