package br.com.openbank.commons.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;
/**
 * Location
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-04-25T16:27:56.841Z")

public class Account   {
	  @JsonProperty("accountId")
	  private String accountId;
	  
	  @JsonProperty("CLABE")
	  private String CABLE;
	  
	  @JsonProperty("cardNumber")
	  private String cardNumber;
	  
	  @JsonProperty("balance")
	  private Money balance;
	  
	  @JsonProperty("Status")
	  private Date validUntil;


	/**
	 * @return the accountId
	 */
	public String getAccountId() {
		return accountId;
	}

	/**
	 * @param accountId the accountId to set
	 */
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	/**
	 * @return the cABLE
	 */
	public String getCABLE() {
		return CABLE;
	}

	/**
	 * @param cABLE the cABLE to set
	 */
	public void setCABLE(String cABLE) {
		CABLE = cABLE;
	}

	/**
	 * @return the cardNumber
	 */
	public String getCardNumber() {
		return cardNumber;
	}

	/**
	 * @param cardNumber the cardNumber to set
	 */
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	/**
	 * @return the balance
	 */
	public Money getBalance() {
		return balance;
	}

	/**
	 * @param balance the balance to set
	 */
	public void setBalance(Money balance) {
		this.balance = balance;
	}

	/**
	 * @return the validUntil
	 */
	public Date getValidUntil() {
		return validUntil;
	}

	/**
	 * @param validUntil the validUntil to set
	 */
	public void setValidUntil(Date validUntil) {
		this.validUntil = validUntil;
	}

}

