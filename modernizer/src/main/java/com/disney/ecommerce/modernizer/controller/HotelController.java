package com.disney.ecommerce.modernizer.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.disney.ecommerce.modernizer.domain.*;
import com.disney.ecommerce.modernizer.service.IHotelService;

import io.swagger.annotations.ApiParam;


/**
* HotelController contains all the RESTFul APIs for Hotel Management.
*
* @author  Renino Niefes
* @version 1.0
* @since   2018-04-17 
*/
@RestController
public class HotelController {
	private static final Logger LOGGER = LoggerFactory.getLogger(HotelController.class);
	
	@Autowired
	private IHotelService hotelService;	
	
	@PostMapping("hotel")
	public ResponseEntity<List<HotelSummary>> getAllHotels(@RequestHeader(value="Authorization") String auth, @RequestBody HotelSearch input) {
		LOGGER.info("POST /hotel :" + auth.replace("Bearer ", ""));
		List<HotelSummary> list = hotelService.getAllHotels(input);
		return new ResponseEntity<List<HotelSummary>>(list, HttpStatus.OK);
	}
	
	@PostMapping("hotel/{hotel_code}")
	public ResponseEntity<HotelSummary> getHotelDetails(
			@ApiParam(value = "${HotelController.getHotelDetails.hotel_code}", required = true) @PathVariable("hotel_code") Integer id,
			@RequestHeader(value="Authorization") String auth, @RequestBody HotelSearch input) {
		LOGGER.info("POST /hotel/" + id + " :" + auth.replace("Bearer ", ""));
		return new ResponseEntity<HotelSummary>(hotelService.getHotelDetails(input), HttpStatus.OK);
	}

	
}
