package com.disney.ecommerce.modernizer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.disney.ecommerce.modernizer.domain.Quote;
import com.disney.ecommerce.modernizer.service.ISampleService;

@RestController
public class HomeController {	
	
	@Autowired
	private ISampleService sampleService;	
	
	@GetMapping("/")
    public ResponseEntity<Quote> getQuote() {
		return new ResponseEntity<Quote>(sampleService.getSampleQuote(), HttpStatus.OK);
    }
}
