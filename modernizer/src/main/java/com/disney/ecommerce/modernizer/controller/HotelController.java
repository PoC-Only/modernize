package com.disney.ecommerce.modernizer.controller;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	public ResponseEntity<?> getAllHotels(
			@RequestHeader(value="Authorization") String auth,
			@RequestHeader(value="Authorization2", required=false) String auth2,
			@RequestHeader(value="Account_id", required=false) String accountId,
			@RequestHeader(value="myDLPHash", required=false) String myDLPHash,
			@RequestHeader(value="Expiration", required=false) String expiration,
			@RequestParam String sales_channel,
			@RequestParam(defaultValue = "FR", required=false) String country_code,
			@RequestParam(defaultValue = "fr", required=false) String language,
			@RequestParam(required=false) String market,
			@RequestParam(required=false) String check_in_date,
			@RequestParam(required=false) String check_out_date,
			@RequestParam(required=false) String number_adults,
			@RequestParam(required=false) String number_children,
			@RequestParam(required=false) String number_infants,			
			@RequestParam(required=false) List<String> date_birth_child,
			@RequestParam(required=false) List<String> date_birth_infant,			
			@RequestParam(required=false) String offer_code,
			@RequestParam(required=false) String package_code,
			@RequestParam(required=false) String transport_compatible
			) {
			LOGGER.info("Authorization:" + auth);
			LOGGER.info("Authorization2:" + auth2);
			LOGGER.info("Account_id:" + accountId);
			LOGGER.info("myDLPHash:" + myDLPHash);
			LOGGER.info("Expiration:" + expiration);
			
			LOGGER.info("sales_channel:" + sales_channel);
			LOGGER.info("country_code:" + country_code);
			LOGGER.info("language:" + language);
			LOGGER.info("market:" + market);
			LOGGER.info("check_in_date:" + check_in_date);
			LOGGER.info("check_out_date:" + check_out_date);
			LOGGER.info("number_adults:" + number_adults);
			LOGGER.info("number_children:" + number_children);
			LOGGER.info("number_infants:" + number_infants);
			LOGGER.info("offer_code:" + offer_code);
			LOGGER.info("date_birth_child:" + date_birth_child);
			LOGGER.info("package_code:" + package_code);
			LOGGER.info("transport_compatible:" + transport_compatible);
			
			if (date_birth_child!=null) 
				for(String item : date_birth_child) {
					LOGGER.info("date_birth_child:" + item);
				}
			
			if (date_birth_infant!=null)
				for(String item : date_birth_infant) {
					LOGGER.info("date_birth_infant:" + item);
				}
			
			
			
			if (securityManager.checkAuthentication(auth, auth2, accountId, myDLPHash, expiration)) {
				//HotelSearch input = new HotelSearch();
				return new ResponseEntity<String>("{}", HttpStatus.OK);
			} else {
				ErrorMessage error = new ErrorMessage();
				error.setError_code("LoginFailed");
				error.setError_description("[2005] Access denied. Please contact your TA representative.");
				return new ResponseEntity<ErrorMessage>(error,HttpStatus.UNAUTHORIZED);
			}
	}

//	@PostMapping("hotel/{hotel_code}")
//	public ResponseEntity<HotelSummary> getHotelDetails(
//			@ApiParam(value = "${HotelController.getHotelDetails.hotel_code}", required = true) @PathVariable("hotel_code") Integer id,
//			@RequestHeader(value = "Authorization") String auth, @RequestBody HotelSearch input) {
//		return new ResponseEntity<HotelSummary>(hotelService.getHotelDetails(input), HttpStatus.OK);
//	}

}
