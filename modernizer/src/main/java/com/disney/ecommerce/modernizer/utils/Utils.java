package com.disney.ecommerce.modernizer.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.disney.ecommerce.modernizer.security.SecurityConstants;


public class Utils {
	private static final Logger LOGGER = LoggerFactory.getLogger(Utils.class);
	
	public static Date convertStringDate(String dateString) {
		DateFormat dateFormat = new SimpleDateFormat(SecurityConstants.ISO_8601_24H_FULL_FORMAT);
		Date exp = null;
		try {
			if (dateString != null && !dateString.isEmpty()) {
				exp = dateFormat.parse(dateString);
			}
		} catch (Exception e) {
			LOGGER.error(e.getMessage());
		}
		return exp;
	}
}
