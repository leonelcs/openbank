package br.com.openbank.commons.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;
/**
 * Location
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-04-25T16:27:56.841Z")

public class Transaction   {
	  @JsonProperty("status")
	  private String status;
	  
	  @JsonProperty("type")
	  private String type;
	  
	  @JsonProperty("authorizationDate")
	  private Date authorizationDate;
	  
	  @JsonProperty("applyDate")
	  private Money applyDate;
	  
	  @JsonProperty("amount")
	  private Money amount;
	  
	  @JsonProperty("authorizationNumber")
	  private Integer authorizationNumber;
	  
	  @JsonProperty("description")
	  private String descriptiont;

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the authorizationDate
	 */
	public Date getAuthorizationDate() {
		return authorizationDate;
	}

	/**
	 * @param authorizationDate the authorizationDate to set
	 */
	public void setAuthorizationDate(Date authorizationDate) {
		this.authorizationDate = authorizationDate;
	}

	/**
	 * @return the applyDate
	 */
	public Money getApplyDate() {
		return applyDate;
	}

	/**
	 * @param applyDate the applyDate to set
	 */
	public void setApplyDate(Money applyDate) {
		this.applyDate = applyDate;
	}

	/**
	 * @return the amount
	 */
	public Money getAmount() {
		return amount;
	}

	/**
	 * @param amount the amount to set
	 */
	public void setAmount(Money amount) {
		this.amount = amount;
	}

	/**
	 * @return the authorizationNumber
	 */
	public Integer getAuthorizationNumber() {
		return authorizationNumber;
	}

	/**
	 * @param authorizationNumber the authorizationNumber to set
	 */
	public void setAuthorizationNumber(Integer authorizationNumber) {
		this.authorizationNumber = authorizationNumber;
	}

	/**
	 * @return the descriptiont
	 */
	public String getDescriptiont() {
		return descriptiont;
	}

	/**
	 * @param descriptiont the descriptiont to set
	 */
	public void setDescriptiont(String descriptiont) {
		this.descriptiont = descriptiont;
	}
	  
	  
}

