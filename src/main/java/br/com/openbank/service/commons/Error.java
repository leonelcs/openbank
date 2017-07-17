package br.com.openbank.service.commons;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;
/**
 * Error
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-04-25T16:27:56.841Z")

public class Error   {
  @JsonProperty("error")
  private String error = null;

  @JsonProperty("exception")
  private String exception = null;

  @JsonProperty("message")
  private String message = null;

  @JsonProperty("path")
  private String path = null;

  @JsonProperty("status")
  private Integer status = null;

  @JsonProperty("timestamp")
  private Long timestamp = null;

  public Error error(String error) {
    this.error = error;
    return this;
  }

   /**
   * Description of the status
   * @return error
  **/
  @ApiModelProperty(example = "Bad Request", value = "Description of the status")
  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }

  public Error exception(String exception) {
    this.exception = exception;
    return this;
  }

   /**
   * Name of the internal exception
   * @return exception
  **/
  @ApiModelProperty(example = "com.bns.pm.exceptions.LocationException", value = "Name of the internal exception")
  public String getException() {
    return exception;
  }

  public void setException(String exception) {
    this.exception = exception;
  }

  public Error message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Description of the exception
   * @return message
  **/
  @ApiModelProperty(example = "Something is not right", value = "Description of the exception")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public Error path(String path) {
    this.path = path;
    return this;
  }

   /**
   * Path of the problematic service call
   * @return path
  **/
  @ApiModelProperty(example = "/v1/regions", value = "Path of the problematic service call")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public Error status(Integer status) {
    this.status = status;
    return this;
  }

   /**
   * HTTP status code
   * @return status
  **/
  @ApiModelProperty(example = "400", value = "HTTP status code")
  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public Error timestamp(Long timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Timestamp of the error
   * @return timestamp
  **/
  @ApiModelProperty(example = "1482253855188", value = "Timestamp of the error")
  public Long getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Long timestamp) {
    this.timestamp = timestamp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Error error = (Error) o;
    return Objects.equals(this.error, error.error) &&
        Objects.equals(this.exception, error.exception) &&
        Objects.equals(this.message, error.message) &&
        Objects.equals(this.path, error.path) &&
        Objects.equals(this.status, error.status) &&
        Objects.equals(this.timestamp, error.timestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error, exception, message, path, status, timestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Error {\n");
    
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    exception: ").append(toIndentedString(exception)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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

