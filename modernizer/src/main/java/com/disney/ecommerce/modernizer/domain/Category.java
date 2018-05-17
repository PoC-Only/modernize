package com.disney.ecommerce.modernizer.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL;

/**
 * Domain class for Category
 *
 * @author Carl de Jesus
 * @version 1.0
 * @since 2018-05-16
 */
@JsonInclude(NON_NULL)
public class Category {
	@JsonProperty(value = "pax_type")
	private String paxType;
	@JsonProperty(value = "min_age")
	private Integer minAge;
	@JsonProperty(value = "max_age")
	private Integer maxAge;

	public String getPaxType() {
		return paxType;
	}

	public void setPaxType(String paxType) {
		this.paxType = paxType;
	}

	public Integer getMinAge() {
		return minAge;
	}

	public void setMinAge(Integer minAge) {
		this.minAge = minAge;
	}

	public Integer getMaxAge() {
		return maxAge;
	}

	public void setMaxAge(Integer maxAge) {
		this.maxAge = maxAge;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Category [paxType=");
		builder.append(paxType);
		builder.append(", minAge=");
		builder.append(minAge);
		builder.append(", maxAge=");
		builder.append(maxAge);
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
