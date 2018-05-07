package com.disney.ecommerce.modernizer.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.disney.ecommerce.modernizer.domain.Quote;
import com.disney.ecommerce.modernizer.service.ISampleService;

@Service
public class SampleServiceImpl implements ISampleService{
	
	public Quote getSampleQuote() {
		RestTemplate restTemplate = new RestTemplate();
		return restTemplate.getForObject("http://gturnquist-quoters.cfapps.io/api/random", Quote.class);
	}
}
