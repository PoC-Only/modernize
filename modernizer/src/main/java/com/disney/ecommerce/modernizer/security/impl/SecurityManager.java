package com.disney.ecommerce.modernizer.security.impl;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.disney.ecommerce.modernizer.domain.Token;
import com.disney.ecommerce.modernizer.security.ISecurityManager;
import com.disney.ecommerce.modernizer.security.JWTUtil;

/**
 * HotelService class
 *
 * @author Renino Niefes
 * @version 1.0
 * @since 2018-05-08
 */
@Service
public class SecurityManager implements ISecurityManager {
	@Autowired
	private Environment env;

	@Override
	public Boolean checkAuthentication(String auth, String auth2, String accountId, String myDLPHash, String expiration) {
		if (auth != null && auth.isEmpty() == false) {					
			String[] splitAuth = auth.split("\\s+");
			String token1 = splitAuth[1];
			
			if (splitAuth.length != 2)
				return false;

			if (token1.equals(env.getProperty("basic.hash.key"))==false) 
				return false;

			String[] splitAuth2 = null;
			String token2 = "";
			if (auth2 != null && auth2.isEmpty() == false) {
				splitAuth2 = auth2.split("\\s+");
				token2 = splitAuth2[1];
			}
			
			if (accountId==null)
				return true;
			
			//if accountId is provided, Hash and expiration date are required must be valid
			DateFormat dateFormat = new SimpleDateFormat(JWTUtil.ISO_8601_24H_FULL_FORMAT);
			Date exp = null;
			try {
				exp = dateFormat.parse(expiration);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if (myDLPHash==null || expiration==null || exp==null || exp.before(new Date()))
				return false;

			//compute the token and check with token2
			JWTUtil jwtUtil = new JWTUtil();
			Token token = jwtUtil.parseJWT(token2);

			if (token==null)
				return false;
			
			if (token.getAccountId().equals(accountId) 
					&& token.getMyDLPHash().equals(myDLPHash)
					&& token.getExpiration().equals(expiration))
				return true;		
		}
		return false;
	}
}
