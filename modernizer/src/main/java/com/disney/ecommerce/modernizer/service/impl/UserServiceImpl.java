package com.disney.ecommerce.modernizer.service.impl;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.disney.ecommerce.modernizer.domain.ErrorMessage;
import com.disney.ecommerce.modernizer.domain.Token;
import com.disney.ecommerce.modernizer.domain.Login;
import com.disney.ecommerce.modernizer.domain.Response;
import com.disney.ecommerce.modernizer.security.JWTUtil;
import com.disney.ecommerce.modernizer.security.SecurityConstants;
import com.disney.ecommerce.modernizer.service.IUserService;
import com.disney.ecommerce.modernizer.utils.Utils;

/**
 * UserServiceImpl interface
 *
 * @author Renino Niefes
 * @version 1.0
 * @since 2018-05-11
 */
@Service
public class UserServiceImpl implements IUserService {
	public Response login(Login user) {
		// TODO connect to Service Layer here
		Response resp = new Response();
		Token token = null;
		
		
		
		
		// use the password as boolean flag
		if (user.getPassword().equals("password")) {
			// Test data only assuming status Code is 200 and token is provided by the
			// service layer
			String jsonString ="{\r\n" + 
					"  \"myDLPHash\": \"ajsdfklsdgjkld\",\r\n" + 
					"  \"account_id\": \"12345\"\r\n" + 
					"}"; 
			resp.setStatusCode(HttpStatus.OK);
			token = new Token();
			token = (Token) Utils.convertJSonTOObject(jsonString, token);
			resp.setBody(token);			
		} else {
			// Test data only assuming status Code is not 200 and an error details have been
			// provided by the service layer
			resp.setStatusCode(HttpStatus.UNAUTHORIZED);
			resp.setBody("{\"error_code\":\"hello\", \"error_description\": \"world\"}");
		}

		
		
		
		
		
		if (resp.getStatusCode().equals(HttpStatus.OK)) {
			DateFormat dateFormat = new SimpleDateFormat(SecurityConstants.ISO_8601_24H_FULL_FORMAT);
			long nowMillis = System.currentTimeMillis();
			Date exp = new Date(nowMillis + SecurityConstants.EXPIRATION_TIME);
			token = JWTUtil.createJWT(token.getAccountId(), token.getMyDLPHash(), dateFormat.format(exp));
			resp.setBody(token);
		} else {
			resp.getBody().toString();
			String jsonString = resp.getBody().toString();
			ErrorMessage error = Utils.convertToErrorObject(jsonString);
			resp.setBody(error);
		}

		return resp;
	}
}
