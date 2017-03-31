/*
 * Smooch
 * The Smooch API is a unified interface for powering messaging in your customer experiences across every channel. Our API speeds access to new markets, reduces time to ship, eliminates complexity, and helps you build the best experiences for your customers. For more information, visit our [official documentation](https://docs.smooch.io).
 *
 * OpenAPI spec version: 1.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.smooch.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * IntegrationCreate
 */

public class IntegrationCreate {
  @SerializedName("type")
  private String type = null;

  @SerializedName("pageAccessToken")
  private String pageAccessToken = null;

  @SerializedName("appId")
  private String appId = null;

  @SerializedName("appSecret")
  private String appSecret = null;

  @SerializedName("accountSid")
  private String accountSid = null;

  @SerializedName("authToken")
  private String authToken = null;

  @SerializedName("phoneNumberSid")
  private String phoneNumberSid = null;

  @SerializedName("token")
  private String token = null;

  @SerializedName("channelAccessToken")
  private String channelAccessToken = null;

  @SerializedName("encodingAesKey")
  private String encodingAesKey = null;

  @SerializedName("fromAddress")
  private String fromAddress = null;

  @SerializedName("certificate")
  private String certificate = null;

  @SerializedName("password")
  private String password = null;

  @SerializedName("autoUpdateBadge")
  private Boolean autoUpdateBadge = null;

  @SerializedName("serverKey")
  private String serverKey = null;

  @SerializedName("senderId")
  private String senderId = null;

  public IntegrationCreate type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The integration type.
   * @return type
  **/
  @ApiModelProperty(example = "null", required = true, value = "The integration type.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public IntegrationCreate pageAccessToken(String pageAccessToken) {
    this.pageAccessToken = pageAccessToken;
    return this;
  }

   /**
   * Facebook Page Access Token. Required for *messenger* integrations. 
   * @return pageAccessToken
  **/
  @ApiModelProperty(example = "null", value = "Facebook Page Access Token. Required for *messenger* integrations. ")
  public String getPageAccessToken() {
    return pageAccessToken;
  }

  public void setPageAccessToken(String pageAccessToken) {
    this.pageAccessToken = pageAccessToken;
  }

  public IntegrationCreate appId(String appId) {
    this.appId = appId;
    return this;
  }

   /**
   * Facebook App ID OR WeChat App ID. Required for *messenger* and *wechat* integrations. 
   * @return appId
  **/
  @ApiModelProperty(example = "null", value = "Facebook App ID OR WeChat App ID. Required for *messenger* and *wechat* integrations. ")
  public String getAppId() {
    return appId;
  }

  public void setAppId(String appId) {
    this.appId = appId;
  }

  public IntegrationCreate appSecret(String appSecret) {
    this.appSecret = appSecret;
    return this;
  }

   /**
   * Facebook Page App Secret OR WeChat App Secret. Required for *messenger* and *wechat* integrations. 
   * @return appSecret
  **/
  @ApiModelProperty(example = "null", value = "Facebook Page App Secret OR WeChat App Secret. Required for *messenger* and *wechat* integrations. ")
  public String getAppSecret() {
    return appSecret;
  }

  public void setAppSecret(String appSecret) {
    this.appSecret = appSecret;
  }

  public IntegrationCreate accountSid(String accountSid) {
    this.accountSid = accountSid;
    return this;
  }

   /**
   * Twilio Account SID. Required for *twilio* integrations. 
   * @return accountSid
  **/
  @ApiModelProperty(example = "null", value = "Twilio Account SID. Required for *twilio* integrations. ")
  public String getAccountSid() {
    return accountSid;
  }

  public void setAccountSid(String accountSid) {
    this.accountSid = accountSid;
  }

  public IntegrationCreate authToken(String authToken) {
    this.authToken = authToken;
    return this;
  }

   /**
   * Twilio Auth Token. Required for *twilio* integrations. 
   * @return authToken
  **/
  @ApiModelProperty(example = "null", value = "Twilio Auth Token. Required for *twilio* integrations. ")
  public String getAuthToken() {
    return authToken;
  }

  public void setAuthToken(String authToken) {
    this.authToken = authToken;
  }

  public IntegrationCreate phoneNumberSid(String phoneNumberSid) {
    this.phoneNumberSid = phoneNumberSid;
    return this;
  }

   /**
   * SID for specific phone number. Required for *twilio* integrations. 
   * @return phoneNumberSid
  **/
  @ApiModelProperty(example = "null", value = "SID for specific phone number. Required for *twilio* integrations. ")
  public String getPhoneNumberSid() {
    return phoneNumberSid;
  }

  public void setPhoneNumberSid(String phoneNumberSid) {
    this.phoneNumberSid = phoneNumberSid;
  }

  public IntegrationCreate token(String token) {
    this.token = token;
    return this;
  }

   /**
   * Telegram Bot Token OR Viber Public Account token. Required for *twilio* and *viber* integrations. 
   * @return token
  **/
  @ApiModelProperty(example = "null", value = "Telegram Bot Token OR Viber Public Account token. Required for *twilio* and *viber* integrations. ")
  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public IntegrationCreate channelAccessToken(String channelAccessToken) {
    this.channelAccessToken = channelAccessToken;
    return this;
  }

   /**
   * LINE Channel Access Token. Required for *line* integrations. 
   * @return channelAccessToken
  **/
  @ApiModelProperty(example = "null", value = "LINE Channel Access Token. Required for *line* integrations. ")
  public String getChannelAccessToken() {
    return channelAccessToken;
  }

  public void setChannelAccessToken(String channelAccessToken) {
    this.channelAccessToken = channelAccessToken;
  }

  public IntegrationCreate encodingAesKey(String encodingAesKey) {
    this.encodingAesKey = encodingAesKey;
    return this;
  }

   /**
   * AES Encoding Key. (Optional) Used for *wechat* integrations. 
   * @return encodingAesKey
  **/
  @ApiModelProperty(example = "null", value = "AES Encoding Key. (Optional) Used for *wechat* integrations. ")
  public String getEncodingAesKey() {
    return encodingAesKey;
  }

  public void setEncodingAesKey(String encodingAesKey) {
    this.encodingAesKey = encodingAesKey;
  }

  public IntegrationCreate fromAddress(String fromAddress) {
    this.fromAddress = fromAddress;
    return this;
  }

   /**
   * Email will display as coming from this address. (Optional) Used for *frontendEmail* integrations. 
   * @return fromAddress
  **/
  @ApiModelProperty(example = "null", value = "Email will display as coming from this address. (Optional) Used for *frontendEmail* integrations. ")
  public String getFromAddress() {
    return fromAddress;
  }

  public void setFromAddress(String fromAddress) {
    this.fromAddress = fromAddress;
  }

  public IntegrationCreate certificate(String certificate) {
    this.certificate = certificate;
    return this;
  }

   /**
   * The binary of your APN certificate base64 encoded. Required for *apn* integrations. 
   * @return certificate
  **/
  @ApiModelProperty(example = "null", value = "The binary of your APN certificate base64 encoded. Required for *apn* integrations. ")
  public String getCertificate() {
    return certificate;
  }

  public void setCertificate(String certificate) {
    this.certificate = certificate;
  }

  public IntegrationCreate password(String password) {
    this.password = password;
    return this;
  }

   /**
   * The password for your APN certificate. (Optional) Used for *apn* integrations. 
   * @return password
  **/
  @ApiModelProperty(example = "null", value = "The password for your APN certificate. (Optional) Used for *apn* integrations. ")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public IntegrationCreate autoUpdateBadge(Boolean autoUpdateBadge) {
    this.autoUpdateBadge = autoUpdateBadge;
    return this;
  }

   /**
   * Use the unread count of the conversation as the application badge. (Optional) Used for *apn* integrations. 
   * @return autoUpdateBadge
  **/
  @ApiModelProperty(example = "null", value = "Use the unread count of the conversation as the application badge. (Optional) Used for *apn* integrations. ")
  public Boolean getAutoUpdateBadge() {
    return autoUpdateBadge;
  }

  public void setAutoUpdateBadge(Boolean autoUpdateBadge) {
    this.autoUpdateBadge = autoUpdateBadge;
  }

  public IntegrationCreate serverKey(String serverKey) {
    this.serverKey = serverKey;
    return this;
  }

   /**
   * Your server key from the fcm console. Required for *fcm* integrations. 
   * @return serverKey
  **/
  @ApiModelProperty(example = "null", value = "Your server key from the fcm console. Required for *fcm* integrations. ")
  public String getServerKey() {
    return serverKey;
  }

  public void setServerKey(String serverKey) {
    this.serverKey = serverKey;
  }

  public IntegrationCreate senderId(String senderId) {
    this.senderId = senderId;
    return this;
  }

   /**
   * Your sender id from the fcm console. Required for *fcm* integrations. 
   * @return senderId
  **/
  @ApiModelProperty(example = "null", value = "Your sender id from the fcm console. Required for *fcm* integrations. ")
  public String getSenderId() {
    return senderId;
  }

  public void setSenderId(String senderId) {
    this.senderId = senderId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntegrationCreate integrationCreate = (IntegrationCreate) o;
    return Objects.equals(this.type, integrationCreate.type) &&
        Objects.equals(this.pageAccessToken, integrationCreate.pageAccessToken) &&
        Objects.equals(this.appId, integrationCreate.appId) &&
        Objects.equals(this.appSecret, integrationCreate.appSecret) &&
        Objects.equals(this.accountSid, integrationCreate.accountSid) &&
        Objects.equals(this.authToken, integrationCreate.authToken) &&
        Objects.equals(this.phoneNumberSid, integrationCreate.phoneNumberSid) &&
        Objects.equals(this.token, integrationCreate.token) &&
        Objects.equals(this.channelAccessToken, integrationCreate.channelAccessToken) &&
        Objects.equals(this.encodingAesKey, integrationCreate.encodingAesKey) &&
        Objects.equals(this.fromAddress, integrationCreate.fromAddress) &&
        Objects.equals(this.certificate, integrationCreate.certificate) &&
        Objects.equals(this.password, integrationCreate.password) &&
        Objects.equals(this.autoUpdateBadge, integrationCreate.autoUpdateBadge) &&
        Objects.equals(this.serverKey, integrationCreate.serverKey) &&
        Objects.equals(this.senderId, integrationCreate.senderId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, pageAccessToken, appId, appSecret, accountSid, authToken, phoneNumberSid, token, channelAccessToken, encodingAesKey, fromAddress, certificate, password, autoUpdateBadge, serverKey, senderId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntegrationCreate {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    pageAccessToken: ").append(toIndentedString(pageAccessToken)).append("\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    appSecret: ").append(toIndentedString(appSecret)).append("\n");
    sb.append("    accountSid: ").append(toIndentedString(accountSid)).append("\n");
    sb.append("    authToken: ").append(toIndentedString(authToken)).append("\n");
    sb.append("    phoneNumberSid: ").append(toIndentedString(phoneNumberSid)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    channelAccessToken: ").append(toIndentedString(channelAccessToken)).append("\n");
    sb.append("    encodingAesKey: ").append(toIndentedString(encodingAesKey)).append("\n");
    sb.append("    fromAddress: ").append(toIndentedString(fromAddress)).append("\n");
    sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    autoUpdateBadge: ").append(toIndentedString(autoUpdateBadge)).append("\n");
    sb.append("    serverKey: ").append(toIndentedString(serverKey)).append("\n");
    sb.append("    senderId: ").append(toIndentedString(senderId)).append("\n");
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

