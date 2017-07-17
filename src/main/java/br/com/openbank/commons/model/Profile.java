package br.com.openbank.commons.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;
/**
 * Region
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-04-25T16:27:56.841Z")

public class Profile   {
  
  @JsonProperty("profileId")
  private String profileId;

  @JsonProperty("name")
  private String name;

  @JsonProperty("lastName")
  private String lastName;

  @JsonProperty("secondLastName")
  private String secondLastName;
 
  @JsonProperty("birthDay")
  private Date birthDay;

/**
 * @return the profileId
 */
public String getProfileId() {
	return profileId;
}

/**
 * @param profileId the profileId to set
 */
public void setProfileId(String profileId) {
	this.profileId = profileId;
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
 * @return the lastName
 */
public String getLastName() {
	return lastName;
}

/**
 * @param lastName the lastName to set
 */
public void setLastName(String lastName) {
	this.lastName = lastName;
}

/**
 * @return the secondLastName
 */
public String getSecondLastName() {
	return secondLastName;
}

/**
 * @param secondLastName the secondLastName to set
 */
public void setSecondLastName(String secondLastName) {
	this.secondLastName = secondLastName;
}

/**
 * @return the birthDay
 */
public Date getBirthDay() {
	return birthDay;
}

/**
 * @param birthDay the birthDay to set
 */
public void setBirthDay(Date birthDay) {
	this.birthDay = birthDay;
}
  
  
}

