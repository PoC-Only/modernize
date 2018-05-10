package com.disney.ecommerce.modernizer.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.disney.ecommerce.modernizer.domain.ErrorMessage;
import com.disney.ecommerce.modernizer.security.ISecurityManager;

import io.swagger.annotations.ApiParam;

/**
 * BookingController contains all the RESTFul APIs for Booking Management.
 *
 * @author Renino Niefes
 * @version 1.0
 * @since 2018-05-10
 */
@RestController
public class BookingController {
	private static final Logger LOGGER = LoggerFactory.getLogger(BookingController.class);
	
	@Autowired
	private ISecurityManager securityManager;

	@GetMapping("booking")
	public ResponseEntity<?> getBooking(@RequestHeader(value = "Authorization") String auth,
			@RequestHeader(value = "Authorization2", required = false) String auth2) {
		if (securityManager.checkAuthentication(auth, auth2)) {
			// TODO put implementations here

			return new ResponseEntity<String>("{}", HttpStatus.OK);
		} else {
			return new ResponseEntity<ErrorMessage>(securityManager.get401Error(), HttpStatus.UNAUTHORIZED);
		}
	}

	@GetMapping("booking/{booking_number}")
	public ResponseEntity<?> getBookingDetails(
			@ApiParam(required = true) @PathVariable("booking_number") String bookingNumber,
			@RequestHeader(value = "Authorization") String auth,
			@RequestHeader(value = "Authorization2", required = false) String auth2) {
		if (securityManager.checkAuthentication(auth, auth2)) {
			// TODO put implementations here

			return new ResponseEntity<String>("{}", HttpStatus.OK);
		} else {
			return new ResponseEntity<ErrorMessage>(securityManager.get401Error(),HttpStatus.UNAUTHORIZED);
		}
	}
}
