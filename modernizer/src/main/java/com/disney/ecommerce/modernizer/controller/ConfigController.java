package com.disney.ecommerce.modernizer.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
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
			@RequestHeader(value = "Authorization2", required = false) String auth2) {
		if (securityManager.checkAuthentication(auth, auth2)) {
			// TODO put implementations here

			return new ResponseEntity<String>("{}", HttpStatus.OK);
		} else {
			return new ResponseEntity<ErrorMessage>(securityManager.get401Error(), HttpStatus.UNAUTHORIZED);
		}
	}
}
