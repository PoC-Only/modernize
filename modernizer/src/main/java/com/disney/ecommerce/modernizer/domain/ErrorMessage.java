package com.disney.ecommerce.modernizer.domain;

/**
 * Domain class for ErrorMessage
 *
 * @author Carl de Jesus
 * @version 1.0
 * @since 2018-05-16
 */
public class ErrorMessage {
	private String error_code;
	private String error_description;

	public String getError_code() {
		return error_code;
	}

	public void setError_code(String error_code) {
		this.error_code = error_code;
	}

	public String getError_description() {
		return error_description;
	}

	public void setError_description(String error_description) {
		this.error_description = error_description;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ErrorMessage [error_code=");
		builder.append(error_code);
		builder.append(", error_description=");
		builder.append(error_description);
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
