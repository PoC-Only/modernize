package com.disney.ecommerce.modernizer.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.disney.ecommerce.modernizer.domain.ErrorMessage;
import com.disney.ecommerce.modernizer.domain.Token;
import com.disney.ecommerce.modernizer.domain.Login;
import com.disney.ecommerce.modernizer.domain.Response;
import com.disney.ecommerce.modernizer.service.IHotelService;
import com.disney.ecommerce.modernizer.service.IUserService;


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
	
	@Autowired
	private IUserService userService;
	
	@PostMapping("user/login")	
	public ResponseEntity<?> login(@RequestBody Login user) {
		LOGGER.info("MODERNIZER: Endpoint:/user/guest Method:Post username:" + user.getUser_name());
		
		Response resp = userService.login(user);
		
		LOGGER.info("POST /user/guest :" + resp.getBody());
		if (resp.getStatusCode().equals(HttpStatus.OK)) {
			return new ResponseEntity<Token>((Token)resp.getBody(), resp.getStatusCode());
		} else {
			return new ResponseEntity<ErrorMessage>((ErrorMessage)resp.getBody(), resp.getStatusCode());
		}		
	}
}
