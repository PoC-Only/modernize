package com.disney.ecommerce.modernizer.utils;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.disney.ecommerce.modernizer.domain.ErrorMessage;
import com.disney.ecommerce.modernizer.security.SecurityConstants;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Domain class for Response
 *
 * @author Renino Niefes
 * @version 1.0
 * @since 2018-05-18
 */
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

	public static ErrorMessage convertToErrorObject(String jsonString) {
		ObjectMapper mapper = new ObjectMapper();
		ErrorMessage error = null;

		try {
			error = mapper.readValue(jsonString, ErrorMessage.class);
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return error;
	}

	public static Object convertJSonTOObject(String jsonString, Object target) {
		ObjectMapper mapper = new ObjectMapper();

		try {
			if (target != null) {
				target = mapper.readValue(jsonString, target.getClass());
			}
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return target;
	}
}
