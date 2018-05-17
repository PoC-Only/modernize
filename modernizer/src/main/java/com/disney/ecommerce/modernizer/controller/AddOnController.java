package com.disney.ecommerce.modernizer.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.disney.ecommerce.modernizer.domain.ErrorMessage;
import com.disney.ecommerce.modernizer.security.ISecurityManager;
import com.disney.ecommerce.modernizer.service.IHotelService;

/**
 * AddOnController contains all the RESTFul APIs for AddOn Management.
 *
 * @author Renino Niefes
 * @version 1.0
 * @since 2018-05-10
 */
@RestController
public class AddOnController {
	private static final Logger LOGGER = LoggerFactory.getLogger(AddOnController.class);

	@Autowired
	private ISecurityManager securityManager;

	@GetMapping("addon")
	public ResponseEntity<?> getAddOn(@RequestHeader(value = "Authorization") String auth,
			@RequestHeader(value = "Authorization2", required = false) String auth2,
			@RequestParam(required = false) String sales_channel,
			@RequestParam(required = false) String country_code,
			@RequestParam(required = false) String language,
			@RequestParam(required = false) String channel_market,
			@RequestParam(required = false) String culture_code,
			@RequestParam String unique_id,
			@RequestParam String check_in_date,
			@RequestParam String check_out_date,
			@RequestParam(required = false) String flight_departure_date,
			@RequestParam(required = false) String flight_arrival_date,
			@RequestParam(required = false) String vendor_code,
			@RequestParam(required = false) String train_departure_date,
			@RequestParam(required = false) String train_arrival_date,
			@RequestParam(required = false) String train_destination_city,
			@RequestParam(required = false) String train_segment_direction,
			@RequestParam(required = false) List<String> transport_package_code,
			@RequestParam String hotel_code,
			@RequestParam(required = false) String room_package_code,
			@RequestParam(required = false) String room_type,
			@RequestParam(required = false) List<String> addon_code			
			) {
		if (securityManager.checkAuthentication(auth, auth2)) {
			// TODO put implementations here

			return new ResponseEntity<String>("{}", HttpStatus.OK);
		} else {
			return new ResponseEntity<ErrorMessage>(securityManager.get401Error(), HttpStatus.UNAUTHORIZED);
		}
	}
}
