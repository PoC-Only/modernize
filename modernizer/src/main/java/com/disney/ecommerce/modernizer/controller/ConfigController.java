package com.disney.ecommerce.modernizer.controller;

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

/**
 * ConfigController contains all the RESTFul APIs for Config Management.
 *
 * @author Renino Niefes
 * @version 1.0
 * @since 2018-05-10
 */
@RestController
public class ConfigController {
	private static final Logger LOGGER = LoggerFactory.getLogger(ConfigController.class);
	
	@Autowired
	private ISecurityManager securityManager;

	@GetMapping("config/partymix")
	public ResponseEntity<?> getPartyMix(@RequestHeader(value = "Authorization") String auth,
			@RequestHeader(value = "Authorization2", required = false) String auth2,
			@RequestParam(required = false)String sales_channel,
			@RequestParam(required = false)String country_code,
			@RequestParam(required = false)String language,
			@RequestParam(required = false)String channel_market,
			@RequestParam(required = false)String culture_code,
			@RequestParam String unique_id,
			@RequestParam(required = false) String vendor_code,
			@RequestParam(required = false) String checkin_date
			) {
		if (securityManager.checkAuthentication(auth, auth2)) {
			// TODO put implementations here

			return new ResponseEntity<String>("{}", HttpStatus.OK);
		} else {
			return new ResponseEntity<ErrorMessage>(securityManager.get401Error(), HttpStatus.UNAUTHORIZED);
		}
	}
	
	@GetMapping("config/channelmarket")
	public ResponseEntity<?> getChannelMarket(@RequestHeader(value = "Authorization") String auth,
			@RequestHeader(value = "Authorization2", required = false) String auth2,
			@RequestParam(defaultValue = "DIRECT") String sales_channel,
			@RequestParam(defaultValue = "FR") String country_code,
			@RequestParam(defaultValue = "fr") String language,
			@RequestParam String unique_id){
			if(securityManager.checkAuthentication(auth, auth2)) {
				
				return new ResponseEntity<String>("{}", HttpStatus.OK);
			}else {
				return new ResponseEntity<ErrorMessage>(securityManager.get401Error(), HttpStatus.UNAUTHORIZED);
			}
	}
}
