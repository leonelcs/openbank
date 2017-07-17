package br.com.openbank.commons.model;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Money {

	@JsonProperty("currency")
	private String currency;
	
	@JsonProperty("amount")
	private BigDecimal amount;
}
