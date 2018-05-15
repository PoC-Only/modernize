package com.disney.ecommerce.modernizer.domain;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(NON_NULL)
public class PartyMix {
	@JsonProperty(value = "max_party_mix")
	private Integer maxPartyMix;
	@JsonProperty(value = "max_infants")
	private Integer maxInfants;

	public Integer getMaxPartyMix() {
		return maxPartyMix;
	}

	public void setMaxPartyMix(Integer maxPartyMix) {
		this.maxPartyMix = maxPartyMix;
	}

	public Integer getMaxInfants() {
		return maxInfants;
	}

	public void setMaxInfants(Integer maxInfants) {
		this.maxInfants = maxInfants;
	}
}
