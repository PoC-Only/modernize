package com.disney.ecommerce.modernizer.security;

import java.util.Date;

public interface ISecurityManager {
	public Boolean checkAuthentication(String auth, String auth2, String accountId, String myDLPHash, String expiration);
}
