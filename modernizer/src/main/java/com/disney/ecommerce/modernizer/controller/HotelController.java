package com.disney.ecommerce.modernizer.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.disney.ecommerce.modernizer.domain.*;
import com.disney.ecommerce.modernizer.security.ISecurityManager;
import com.disney.ecommerce.modernizer.service.IHotelService;

import io.swagger.annotations.ApiParam;

/**
 * HotelController contains all the RESTFul APIs for Hotel Management.
 *
 * @author Renino Niefes
 * @version 1.0
 * @since 2018-04-17
 */
@RestController
public class HotelController {
	private static final Logger LOGGER = LoggerFactory.getLogger(HotelController.class);

	@Autowired
	private IHotelService hotelService;

	@Autowired
	private ISecurityManager securityManager;

	@GetMapping("hotel")
	public ResponseEntity<?> getAllHotels(@RequestHeader(value = "Authorization") String auth,
			@RequestHeader(value = "Authorization2", required = false) String auth2, 
			@RequestParam String sales_channel,
			@RequestParam(defaultValue = "FR", required = false) String country_code,
			@RequestParam(defaultValue = "fr", required = false) String language,
			@RequestParam(required = false) String market, @RequestParam(required = false) String check_in_date,
			@RequestParam(required = false) String check_out_date, @RequestParam(required = false) String number_adults,
			@RequestParam(required = false) String number_children,
			@RequestParam(required = false) String number_infants,
			@RequestParam(required = false) List<String> date_birth_child,
			@RequestParam(required = false) List<String> date_birth_infant,
			@RequestParam(required = false) String offer_code, @RequestParam(required = false) String package_code,
			@RequestParam(required = false) String transport_compatible) {

		if (securityManager.checkAuthentication(auth, auth2)) {
			// TODO put implementations here
			Token token = securityManager.getPayload(auth2);
			if (token != null) {
				LOGGER.info("account_id:" + token.getAccountId());
				LOGGER.info("myDLPHash:" + token.getMyDLPHash());
				LOGGER.info("expiration:" + token.getExpiration());
			}

			Category cat = new Category();
			cat.setMaxAge(5);
			cat.setMinAge(null);
			cat.setPaxType("Child");
			
			return new ResponseEntity<Category>(cat, HttpStatus.OK);
		} else {
			return new ResponseEntity<ErrorMessage>(securityManager.get401Error(), HttpStatus.UNAUTHORIZED);
		}
	}

	@GetMapping("hotel/package")
	public ResponseEntity<?> getHotelPackage(@RequestHeader(value = "Authorization") String auth,
			@RequestHeader(value = "Authorization2", required = false) String auth2) {
		
		
		if (securityManager.checkAuthentication(auth, auth2)) {
			// TODO put implementations here

			return new ResponseEntity<String>("{}", HttpStatus.OK);
		} else {
			return new ResponseEntity<ErrorMessage>(securityManager.get401Error(), HttpStatus.UNAUTHORIZED);
		}
	}

	@GetMapping("hotel/{hotel_code}")
	public ResponseEntity<?> getHotelDetails(
			@ApiParam(required = true) @PathVariable("hotel_code") String hotelCode,
			@RequestHeader(value = "Authorization") String auth,
			@RequestHeader(value = "Authorization2", required = false) String auth2) {
		if (securityManager.checkAuthentication(auth, auth2)) {
			// TODO put implementations here

			return new ResponseEntity<String>("{}", HttpStatus.OK);
		} else {
			return new ResponseEntity<ErrorMessage>(securityManager.get401Error(), HttpStatus.UNAUTHORIZED);
		}
	}
}
