/*
 * Hidden Switch Spellsource API
 * The Spellsource API for matchmaking, user accounts, collections management and more.  To get started, create a user account and make sure to include the entirety of the returned login token as the X-Auth-Token header. You can reuse this token, or login for a new one.  ClientToServerMessage and ServerToClientMessage are used for the realtime game state and actions two-way websocket interface for actually playing a game. Envelope is used for the realtime API services.  For the routes that correspond to the paths in this file, visit the Gateway.java file in the Spellsource-Server GitHub repository located in this definition file. 
 *
 * OpenAPI spec version: 4.0.1
 * Contact: ben@hiddenswitch.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.hiddenswitch.spellsource.client.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Adds two users to each other&#39;s friends list. 
 */
@ApiModel(description = "Adds two users to each other's friends list. ")
@JsonInclude(JsonInclude.Include.NON_DEFAULT)

public class FriendPutRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("usernameWithToken")
  private String usernameWithToken = null;

  @JsonProperty("friendId")
  private String friendId = null;

  public FriendPutRequest usernameWithToken(String usernameWithToken) {
    this.usernameWithToken = usernameWithToken;
    return this;
  }

   /**
   * The username with the privacy token, like \&quot;username#1234\&quot;. 
   * @return usernameWithToken
  **/
  @ApiModelProperty(value = "The username with the privacy token, like \"username#1234\". ")
  public String getUsernameWithToken() {
    return usernameWithToken;
  }

  public void setUsernameWithToken(String usernameWithToken) {
    this.usernameWithToken = usernameWithToken;
  }

  public FriendPutRequest friendId(String friendId) {
    this.friendId = friendId;
    return this;
  }

   /**
   * Not supported. Throws an error if this is specified on the client. 
   * @return friendId
  **/
  @ApiModelProperty(required = true, value = "Not supported. Throws an error if this is specified on the client. ")
  public String getFriendId() {
    return friendId;
  }

  public void setFriendId(String friendId) {
    this.friendId = friendId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FriendPutRequest friendPutRequest = (FriendPutRequest) o;
    return Objects.equals(this.usernameWithToken, friendPutRequest.usernameWithToken) &&
        Objects.equals(this.friendId, friendPutRequest.friendId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(usernameWithToken, friendId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FriendPutRequest {\n");
    
    sb.append("    usernameWithToken: ").append(toIndentedString(usernameWithToken)).append("\n");
    sb.append("    friendId: ").append(toIndentedString(friendId)).append("\n");
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

