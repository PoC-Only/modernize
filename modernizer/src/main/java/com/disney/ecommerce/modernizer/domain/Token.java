package com.disney.ecommerce.modernizer.domain;

public class Token {
	private String token;
	private String accountId;
	private String myDLPHash;
	private String expiration;

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getMyDLPHash() {
		if (myDLPHash == null)
			myDLPHash = "";
		return myDLPHash;
	}

	public void setMyDLPHash(String myDLPHash) {
		this.myDLPHash = myDLPHash;
	}

	public String getExpiration() {
		return expiration;
	}

	public void setExpiration(String expiration) {
		this.expiration = expiration;
	}
}
