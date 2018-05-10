package com.disney.ecommerce.modernizer.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.disney.ecommerce.modernizer.security.ISecurityManager;

/**
 * TransportController contains all the RESTFul APIs for Transport Management.
 *
 * @author Renino Niefes
 * @version 1.0
 * @since 2018-05-10
 */
@RestController
public class TransportController {
	private static final Logger LOGGER = LoggerFactory.getLogger(TransportController.class);
	
	@Autowired
	private ISecurityManager securityManager;

}
