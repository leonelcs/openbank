package br.com.openbank.service.commons;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;
/**
 * Warning
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-04-25T16:27:56.841Z")

public class Warning   {
  @JsonProperty("code")
  private String code = null;

  @JsonProperty("message")
  private String message = null;

  @JsonProperty("fields")
  private String fields = null;

  public Warning code(String code) {
    this.code = code;
    return this;
  }

   /**
   * the warning code
   * @return code
  **/
  @ApiModelProperty(example = "war0001", value = "the warning code")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public Warning message(String message) {
    this.message = message;
    return this;
  }

   /**
   * descriptive message
   * @return message
  **/
  @ApiModelProperty(example = "the region does not exist", value = "descriptive message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public Warning fields(String fields) {
    this.fields = fields;
    return this;
  }

   /**
   * the fields uses in the query
   * @return fields
  **/
  @ApiModelProperty(example = "regionID: 1 $ cityId: -1", value = "the fields uses in the query")
  public String getFields() {
    return fields;
  }

  public void setFields(String fields) {
    this.fields = fields;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Warning warning = (Warning) o;
    return Objects.equals(this.code, warning.code) &&
        Objects.equals(this.message, warning.message) &&
        Objects.equals(this.fields, warning.fields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message, fields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Warning {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

