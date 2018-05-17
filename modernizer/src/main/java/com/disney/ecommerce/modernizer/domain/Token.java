package com.disney.ecommerce.modernizer.domain;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Domain class for Token
 *
 * @author Carl de Jesus
 * @version 1.0
 * @since 2018-05-16
 */
@JsonInclude(NON_NULL)
public class Token {
	@JsonProperty(value = "token_2")
	private String token;
	@JsonProperty(value = "account_id")
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

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Token [token=");
		builder.append(token);
		builder.append(", accountId=");
		builder.append(accountId);
		builder.append(", myDLPHash=");
		builder.append(myDLPHash);
		builder.append(", expiration=");
		builder.append(expiration);
		builder.append(", getClass()=");
		builder.append(getClass());
		builder.append(", hashCode()=");
		builder.append(hashCode());
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
}
