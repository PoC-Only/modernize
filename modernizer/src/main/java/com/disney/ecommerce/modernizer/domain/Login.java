package com.disney.ecommerce.modernizer.domain;

/**
 * Domain class for Login
 *
 * @author Renino Niefes
 * @version 1.0
 * @since 2018-05-18
 */
public class Login {
	private String user_name;
	private String password;

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("User [user_name=");
		builder.append(user_name);
		builder.append(", password=");
		builder.append(password);
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
