package com.disney.ecommerce.modernizer.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.disney.ecommerce.modernizer.domain.Token;
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
	public ResponseEntity<?> login(@RequestParam String username, @RequestParam String password) {
		LOGGER.info("MODERNIZER: Endpoint:/user/guest Method:Post username:" + username);
		
		DateFormat dateFormat = new SimpleDateFormat(SecurityConstants.ISO_8601_24H_FULL_FORMAT);
		long nowMillis = System.currentTimeMillis();
		Date exp = new Date(nowMillis + SecurityConstants.EXPIRATION_TIME);
		
		Token token = JWTUtil.createJWT(username, password, dateFormat.format(exp));
		
		LOGGER.info("POST /user/guest :user name=" + username + " token=" + token);
		return new ResponseEntity<Token>(token, HttpStatus.OK);
	}
}
