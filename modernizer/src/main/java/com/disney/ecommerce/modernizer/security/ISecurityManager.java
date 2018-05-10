package com.disney.ecommerce.modernizer.security;


import com.disney.ecommerce.modernizer.domain.ErrorMessage;
import com.disney.ecommerce.modernizer.domain.Token;

public interface ISecurityManager {
	public Boolean checkAuthentication(String auth, String auth2);
	public Token getPayload(String auth2);
	public ErrorMessage get401Error();
}
