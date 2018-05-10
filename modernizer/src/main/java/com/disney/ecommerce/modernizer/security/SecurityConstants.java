package com.disney.ecommerce.modernizer.security;

import com.disney.ecommerce.modernizer.domain.ErrorMessage;

public class SecurityConstants {
	    public static final String SECRET = "SecretKeyToGenJWTs";
	    public static final long EXPIRATION_TIME = 864_000_000; // 10 days
	    public static final String TOKEN_PREFIX = "Bearer ";
	    public static final String HEADER_STRING = "Authorization";
	    public static final String SIGN_IN_URL = "/login";
	    	   
	    public static final String JWT_ID = "0123";
	    public static final String JWT_SUBJECT = "ANY SUBJECT HERE";
	    public static final String JWT_ISSUER = "DLP";
	    
	    public static final String ISO_8601_24H_FULL_FORMAT = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX";
	    
	    public static final String INVALID_AUTH = "Invalid Authorization format";
	    public static final String INVALID_TOKEN = "Token_1 does not match the API Key";
	    public static final String MISSING_TOKEN1= "Token_1 is missing";
	    public static final String MISSING_TOKEN2= "Token_2 is missing";
	    public static final String INVALID_JWT = "Token_2 is not a valid JSON Web Token";
	    public static final String MISSING_ACCOUNT_ID = "Account ID is missing from the JWT payload";
	    public static final String EXPIRED_TOKEN = "Token_2 is expired";
	    
	    public static final String VALID_TOKEN1 = "Token_1 is valid";
	    public static final String VALID_TOKEN2 = "Token_2 is valid"; 
	    public static final String VALID_NO_TOKEN = "Token_2 is not provided";
	  
}
