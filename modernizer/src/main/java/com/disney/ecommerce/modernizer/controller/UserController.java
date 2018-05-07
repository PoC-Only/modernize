package com.disney.ecommerce.modernizer.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.disney.ecommerce.modernizer.domain.ApplicationUser;
import com.disney.ecommerce.modernizer.security.JWTUtil;
import com.disney.ecommerce.modernizer.security.SecurityConstants;

/**
* UserController contains all the RESTFul APIs for User Management
*
* @author  Renino Niefes
* @version 1.0
* @since   2018-04-19 
*/
@RestController
public class UserController {	
	private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);
	
	@PostMapping("user/guest")	
	public ResponseEntity<String> login(@RequestBody ApplicationUser input) {
		LOGGER.info("MODERNIZER: Endpoint:/user/guest Method:Post username:" + input.getUsername());
		JWTUtil jwtUtil = new JWTUtil();
		String token = jwtUtil.createJWT(input.getUsername(), "disney", "modernizer", SecurityConstants.EXPIRATION_TIME);
		LOGGER.info("POST /user/guest :user name=" + input.getUsername() + " token=" + token);
		return new ResponseEntity<String>(token, HttpStatus.OK);
	}
	
	@GetMapping("user/register")
	public ResponseEntity<String> register() {
		return new ResponseEntity<String>("Hello World", HttpStatus.OK);
	}
}
