package br.com.openbank.commons.model;

import com.fasterxml.jackson.annotation.JsonProperty;
/**
 * Campaign
 */

public class Campaign   {
	
  @JsonProperty("campaignId")
  private String campaignId;
  
  @JsonProperty("description")
  private String description;
  
  @JsonProperty("name")
  private String name;
  
  @JsonProperty("amount")
  private Money amount;
  
  @JsonProperty("validUntil")
  private String validUntil;

/**
 * @return the campaignId
 */
public String getCampaignId() {
	return campaignId;
}

/**
 * @param campaignId the campaignId to set
 */
public void setCampaignId(String campaignId) {
	this.campaignId = campaignId;
}

/**
 * @return the description
 */
public String getDescription() {
	return description;
}

/**
 * @param description the description to set
 */
public void setDescription(String description) {
	this.description = description;
}

/**
 * @return the name
 */
public String getName() {
	return name;
}

/**
 * @param name the name to set
 */
public void setName(String name) {
	this.name = name;
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
 * @return the validUntil
 */
public String getValidUntil() {
	return validUntil;
}

/**
 * @param validUntil the validUntil to set
 */
public void setValidUntil(String validUntil) {
	this.validUntil = validUntil;
}
 
  
}

