package com.disney.ecommerce.modernizer.security.impl;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.disney.ecommerce.modernizer.domain.ErrorMessage;
import com.disney.ecommerce.modernizer.domain.Token;
import com.disney.ecommerce.modernizer.security.ISecurityManager;
import com.disney.ecommerce.modernizer.security.JWTUtil;
import com.disney.ecommerce.modernizer.security.SecurityConstants;
import com.disney.ecommerce.modernizer.utils.Utils;

/**
 * HotelService class
 *
 * @author Renino Niefes
 * @version 1.0
 * @since 2018-05-08
 */
@Service
public class SecurityManager implements ISecurityManager {
	private static final Logger LOGGER = LoggerFactory.getLogger(SecurityManager.class);

	@Autowired
	private Environment env;

	@Override
	public Boolean checkAuthentication(String auth, String auth2) {
		if (auth != null && !auth.isEmpty()) {
			String token1 = splitAuthorization("Basic", auth);

			// check if token1 is empty
			if (token1 == null || token1.isEmpty()) {
				LOGGER.error(SecurityConstants.MISSING_TOKEN1);
				return false;
			}

			// check if token1 is valid
			if (token1.equals(env.getProperty("basic.hash.key")) == false) {
				LOGGER.error(SecurityConstants.INVALID_TOKEN);
				return false;
			}

			LOGGER.info(SecurityConstants.VALID_TOKEN1);

			// check if auth2 is empty. if yes, then return true
			if (auth2 == null || auth2.isEmpty()) {
				LOGGER.error(SecurityConstants.VALID_NO_TOKEN);
				return true;
			}

			// if auth2 is not empty, validate
			String token2 = splitAuthorization("Bearer", auth2);
			if (token2 == null || token2.isEmpty()) {
				LOGGER.error(SecurityConstants.MISSING_TOKEN2);
				return false;
			}

			// compute the token and check with token2
			Token token = JWTUtil.parseJWT(token2);

			// check if token is null
			if (token == null) {
				LOGGER.error(SecurityConstants.INVALID_JWT);
				return false;
			}

			LOGGER.info(SecurityConstants.VALID_TOKEN2);

			// check if there's an account id in the token. If none, return false.
			if (token.getAccountId() == null || token.getAccountId().isEmpty()) {
				LOGGER.error(SecurityConstants.MISSING_ACCOUNT_ID);
				return false;
			}

			// check if expired
			Date exp = Utils.convertStringDate(token.getExpiration());
			if (token.getExpiration() == null || exp == null || exp.before(new Date())) {
				LOGGER.error(SecurityConstants.EXPIRED_TOKEN);
				return false;
			} else {
				LOGGER.info(SecurityConstants.VALID_TOKEN2);
				return true;
			}
		}

		LOGGER.info(SecurityConstants.INVALID_AUTH);
		return false;
	}

	@Override
	public Token getPayload(String auth2) {
		String[] splitAuth2 = null;
		String token2 = "";

		if (auth2 != null && auth2.isEmpty() == false) {
			splitAuth2 = auth2.split("\\s+");

			if (splitAuth2.length != 2)
				return null;

			token2 = splitAuth2[1];
		}

		return JWTUtil.parseJWT(token2);
	}

	private String splitAuthorization(String authType, String auth) {
		String[] splitAuth = null;
		String token = "";

		if (auth != null && auth.isEmpty() == false) {
			splitAuth = auth.split("\\s+");

			if (splitAuth.length != 2)
				return null;

			if (!splitAuth[0].toLowerCase().equals(authType.toLowerCase())) {
				return null;
			}

			token = splitAuth[1];
		}
		return token;
	}

	@Override
	public ErrorMessage get401Error() {
		ErrorMessage error = new ErrorMessage();
		error.setError_code("LoginFailed");
		error.setError_description("[2005] Access denied. Please contact your TA representative.");
		return error;
	}
}
