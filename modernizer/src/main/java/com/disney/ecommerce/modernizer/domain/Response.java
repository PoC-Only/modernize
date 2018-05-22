package com.disney.ecommerce.modernizer.domain;

import org.springframework.http.HttpStatus;

/**
 * Domain class for Response
 *
 * @author Renino Niefes
 * @version 1.0
 * @since 2018-05-18
 */
public class Response {
	private HttpStatus statusCode;
	private Object body;

	public HttpStatus getStatusCode() {
		if (statusCode==null)
			statusCode = HttpStatus.BAD_REQUEST;
		return statusCode;
	}

	public void setStatusCode(HttpStatus statusCode) {
		this.statusCode = statusCode;
	}

	public Object getBody() {
		return body;
	}

	public void setBody(Object body) {
		this.body = body;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Response [statusCode=");
		builder.append(statusCode);
		builder.append(", body=");
		builder.append(body);
		builder.append("]");
		return builder.toString();
	}

	
}
