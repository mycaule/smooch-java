/*
 * Smooch
 * The Smooch API is a unified interface for powering messaging in your customer experiences across every channel. Our API speeds access to new markets, reduces time to ship, eliminates complexity, and helps you build the best experiences for your customers. For more information, visit our [official documentation](https://docs.smooch.io).
 *
 * OpenAPI spec version: 1.8
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
 * Integration
 */

public class Integration {
  @SerializedName("_id")
  private String id = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("pageAccessToken")
  private String pageAccessToken = null;

  @SerializedName("appId")
  private String appId = null;

  @SerializedName("appSecret")
  private String appSecret = null;

  @SerializedName("webhookSecret")
  private String webhookSecret = null;

  @SerializedName("pageId")
  private String pageId = null;

  @SerializedName("accountSid")
  private String accountSid = null;

  @SerializedName("authToken")
  private String authToken = null;

  @SerializedName("phoneNumberSid")
  private String phoneNumberSid = null;

  @SerializedName("phoneNumber")
  private String phoneNumber = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("token")
  private String token = null;

  @SerializedName("uri")
  private String uri = null;

  @SerializedName("channelAccessToken")
  private String channelAccessToken = null;

  @SerializedName("botName")
  private String botName = null;

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

  @SerializedName("production")
  private Boolean production = null;

  @SerializedName("serverKey")
  private String serverKey = null;

  @SerializedName("senderId")
  private String senderId = null;

  @SerializedName("consumerKey")
  private String consumerKey = null;

  @SerializedName("consumerSecret")
  private String consumerSecret = null;

  @SerializedName("accessTokenKey")
  private String accessTokenKey = null;

  @SerializedName("accessTokenSecret")
  private String accessTokenSecret = null;

  @SerializedName("userId")
  private String userId = null;

  @SerializedName("username")
  private String username = null;

  @SerializedName("apiKey")
  private String apiKey = null;

  @SerializedName("domain")
  private String domain = null;

  @SerializedName("incomingAddress")
  private String incomingAddress = null;

  @SerializedName("accessKey")
  private String accessKey = null;

  @SerializedName("originator")
  private String originator = null;

  public Integration id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The integration ID, generated automatically.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "The integration ID, generated automatically.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Integration type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The integration type.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "The integration type.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Integration pageAccessToken(String pageAccessToken) {
    this.pageAccessToken = pageAccessToken;
    return this;
  }

   /**
   * Facebook Page Access Token. Required for *messenger* integrations. 
   * @return pageAccessToken
  **/
  @ApiModelProperty(value = "Facebook Page Access Token. Required for *messenger* integrations. ")
  public String getPageAccessToken() {
    return pageAccessToken;
  }

  public void setPageAccessToken(String pageAccessToken) {
    this.pageAccessToken = pageAccessToken;
  }

  public Integration appId(String appId) {
    this.appId = appId;
    return this;
  }

   /**
   * Facebook App ID OR WeChat App ID. Required for *messenger* and *wechat* integrations. 
   * @return appId
  **/
  @ApiModelProperty(value = "Facebook App ID OR WeChat App ID. Required for *messenger* and *wechat* integrations. ")
  public String getAppId() {
    return appId;
  }

  public void setAppId(String appId) {
    this.appId = appId;
  }

  public Integration appSecret(String appSecret) {
    this.appSecret = appSecret;
    return this;
  }

   /**
   * Facebook Page App Secret OR WeChat App Secret. Required for *messenger* and *wechat* integrations. 
   * @return appSecret
  **/
  @ApiModelProperty(value = "Facebook Page App Secret OR WeChat App Secret. Required for *messenger* and *wechat* integrations. ")
  public String getAppSecret() {
    return appSecret;
  }

  public void setAppSecret(String appSecret) {
    this.appSecret = appSecret;
  }

  public Integration webhookSecret(String webhookSecret) {
    this.webhookSecret = webhookSecret;
    return this;
  }

   /**
   * Secret to verify webhooks. Returned on successful *wechat* and *messagebird* integrations. 
   * @return webhookSecret
  **/
  @ApiModelProperty(value = "Secret to verify webhooks. Returned on successful *wechat* and *messagebird* integrations. ")
  public String getWebhookSecret() {
    return webhookSecret;
  }

  public void setWebhookSecret(String webhookSecret) {
    this.webhookSecret = webhookSecret;
  }

  public Integration pageId(String pageId) {
    this.pageId = pageId;
    return this;
  }

   /**
   * Facebook Page App ID. Returned on successful *messenger* integrations. 
   * @return pageId
  **/
  @ApiModelProperty(value = "Facebook Page App ID. Returned on successful *messenger* integrations. ")
  public String getPageId() {
    return pageId;
  }

  public void setPageId(String pageId) {
    this.pageId = pageId;
  }

  public Integration accountSid(String accountSid) {
    this.accountSid = accountSid;
    return this;
  }

   /**
   * Twilio Account SID. Required for *twilio* integrations. 
   * @return accountSid
  **/
  @ApiModelProperty(value = "Twilio Account SID. Required for *twilio* integrations. ")
  public String getAccountSid() {
    return accountSid;
  }

  public void setAccountSid(String accountSid) {
    this.accountSid = accountSid;
  }

  public Integration authToken(String authToken) {
    this.authToken = authToken;
    return this;
  }

   /**
   * Twilio Auth Token. Required for *twilio* integrations. 
   * @return authToken
  **/
  @ApiModelProperty(value = "Twilio Auth Token. Required for *twilio* integrations. ")
  public String getAuthToken() {
    return authToken;
  }

  public void setAuthToken(String authToken) {
    this.authToken = authToken;
  }

  public Integration phoneNumberSid(String phoneNumberSid) {
    this.phoneNumberSid = phoneNumberSid;
    return this;
  }

   /**
   * SID for specific phone number. Required for *twilio* integrations. 
   * @return phoneNumberSid
  **/
  @ApiModelProperty(value = "SID for specific phone number. Required for *twilio* integrations. ")
  public String getPhoneNumberSid() {
    return phoneNumberSid;
  }

  public void setPhoneNumberSid(String phoneNumberSid) {
    this.phoneNumberSid = phoneNumberSid;
  }

  public Integration phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * Smooch will receive all messages sent to this phone number. Returned on successful *twilio* integrations. 
   * @return phoneNumber
  **/
  @ApiModelProperty(value = "Smooch will receive all messages sent to this phone number. Returned on successful *twilio* integrations. ")
  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public Integration name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name on the account. Returned on successful *twilio* integrations. 
   * @return name
  **/
  @ApiModelProperty(value = "Name on the account. Returned on successful *twilio* integrations. ")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integration token(String token) {
    this.token = token;
    return this;
  }

   /**
   * Telegram Bot Token OR Viber Public Account token. Required for *twilio* and *viber* integrations. 
   * @return token
  **/
  @ApiModelProperty(value = "Telegram Bot Token OR Viber Public Account token. Required for *twilio* and *viber* integrations. ")
  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public Integration uri(String uri) {
    this.uri = uri;
    return this;
  }

   /**
   * The viber URI to find the account. Returned on successful *viber* integrations. 
   * @return uri
  **/
  @ApiModelProperty(value = "The viber URI to find the account. Returned on successful *viber* integrations. ")
  public String getUri() {
    return uri;
  }

  public void setUri(String uri) {
    this.uri = uri;
  }

  public Integration channelAccessToken(String channelAccessToken) {
    this.channelAccessToken = channelAccessToken;
    return this;
  }

   /**
   * LINE Channel Access Token. Required for *line* integrations. 
   * @return channelAccessToken
  **/
  @ApiModelProperty(value = "LINE Channel Access Token. Required for *line* integrations. ")
  public String getChannelAccessToken() {
    return channelAccessToken;
  }

  public void setChannelAccessToken(String channelAccessToken) {
    this.channelAccessToken = channelAccessToken;
  }

  public Integration botName(String botName) {
    this.botName = botName;
    return this;
  }

   /**
   * The bot's name. Returned on successful *line* integrations. 
   * @return botName
  **/
  @ApiModelProperty(value = "The bot's name. Returned on successful *line* integrations. ")
  public String getBotName() {
    return botName;
  }

  public void setBotName(String botName) {
    this.botName = botName;
  }

  public Integration encodingAesKey(String encodingAesKey) {
    this.encodingAesKey = encodingAesKey;
    return this;
  }

   /**
   * AES Encoding Key. (Optional) Used for *wechat* integrations. 
   * @return encodingAesKey
  **/
  @ApiModelProperty(value = "AES Encoding Key. (Optional) Used for *wechat* integrations. ")
  public String getEncodingAesKey() {
    return encodingAesKey;
  }

  public void setEncodingAesKey(String encodingAesKey) {
    this.encodingAesKey = encodingAesKey;
  }

  public Integration fromAddress(String fromAddress) {
    this.fromAddress = fromAddress;
    return this;
  }

   /**
   * Email will display as coming from this address. (Optional) Used for *frontendEmail* integrations. 
   * @return fromAddress
  **/
  @ApiModelProperty(value = "Email will display as coming from this address. (Optional) Used for *frontendEmail* integrations. ")
  public String getFromAddress() {
    return fromAddress;
  }

  public void setFromAddress(String fromAddress) {
    this.fromAddress = fromAddress;
  }

  public Integration certificate(String certificate) {
    this.certificate = certificate;
    return this;
  }

   /**
   * The binary of your APN certificate base64 encoded. Required for *apn* integrations. 
   * @return certificate
  **/
  @ApiModelProperty(value = "The binary of your APN certificate base64 encoded. Required for *apn* integrations. ")
  public String getCertificate() {
    return certificate;
  }

  public void setCertificate(String certificate) {
    this.certificate = certificate;
  }

  public Integration password(String password) {
    this.password = password;
    return this;
  }

   /**
   * The password for your APN certificate. (Optional) Used for *apn* integrations. 
   * @return password
  **/
  @ApiModelProperty(value = "The password for your APN certificate. (Optional) Used for *apn* integrations. ")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public Integration autoUpdateBadge(Boolean autoUpdateBadge) {
    this.autoUpdateBadge = autoUpdateBadge;
    return this;
  }

   /**
   * Use the unread count of the conversation as the application badge. (Optional) Used for *apn* integrations. 
   * @return autoUpdateBadge
  **/
  @ApiModelProperty(value = "Use the unread count of the conversation as the application badge. (Optional) Used for *apn* integrations. ")
  public Boolean getAutoUpdateBadge() {
    return autoUpdateBadge;
  }

  public void setAutoUpdateBadge(Boolean autoUpdateBadge) {
    this.autoUpdateBadge = autoUpdateBadge;
  }

  public Integration production(Boolean production) {
    this.production = production;
    return this;
  }

   /**
   * Flag specifying whether the certificate is production. Returned on successful *apn* integrations. 
   * @return production
  **/
  @ApiModelProperty(value = "Flag specifying whether the certificate is production. Returned on successful *apn* integrations. ")
  public Boolean getProduction() {
    return production;
  }

  public void setProduction(Boolean production) {
    this.production = production;
  }

  public Integration serverKey(String serverKey) {
    this.serverKey = serverKey;
    return this;
  }

   /**
   * Your server key from the fcm console. Required for *fcm* integrations. 
   * @return serverKey
  **/
  @ApiModelProperty(value = "Your server key from the fcm console. Required for *fcm* integrations. ")
  public String getServerKey() {
    return serverKey;
  }

  public void setServerKey(String serverKey) {
    this.serverKey = serverKey;
  }

  public Integration senderId(String senderId) {
    this.senderId = senderId;
    return this;
  }

   /**
   * Your sender id from the fcm console. Required for *fcm* integrations. 
   * @return senderId
  **/
  @ApiModelProperty(value = "Your sender id from the fcm console. Required for *fcm* integrations. ")
  public String getSenderId() {
    return senderId;
  }

  public void setSenderId(String senderId) {
    this.senderId = senderId;
  }

  public Integration consumerKey(String consumerKey) {
    this.consumerKey = consumerKey;
    return this;
  }

   /**
   * The consumer key for your Twitter app. Required for *twitter* integrations. 
   * @return consumerKey
  **/
  @ApiModelProperty(value = "The consumer key for your Twitter app. Required for *twitter* integrations. ")
  public String getConsumerKey() {
    return consumerKey;
  }

  public void setConsumerKey(String consumerKey) {
    this.consumerKey = consumerKey;
  }

  public Integration consumerSecret(String consumerSecret) {
    this.consumerSecret = consumerSecret;
    return this;
  }

   /**
   * The consumer secret for your Twitter app. Required for *twitter* integrations. 
   * @return consumerSecret
  **/
  @ApiModelProperty(value = "The consumer secret for your Twitter app. Required for *twitter* integrations. ")
  public String getConsumerSecret() {
    return consumerSecret;
  }

  public void setConsumerSecret(String consumerSecret) {
    this.consumerSecret = consumerSecret;
  }

  public Integration accessTokenKey(String accessTokenKey) {
    this.accessTokenKey = accessTokenKey;
    return this;
  }

   /**
   * The access token key obtained from your user via oauth. Required for *twitter* integrations. 
   * @return accessTokenKey
  **/
  @ApiModelProperty(value = "The access token key obtained from your user via oauth. Required for *twitter* integrations. ")
  public String getAccessTokenKey() {
    return accessTokenKey;
  }

  public void setAccessTokenKey(String accessTokenKey) {
    this.accessTokenKey = accessTokenKey;
  }

  public Integration accessTokenSecret(String accessTokenSecret) {
    this.accessTokenSecret = accessTokenSecret;
    return this;
  }

   /**
   * The access token secret obtained from your user via oauth. Required for *twitter* integrations. 
   * @return accessTokenSecret
  **/
  @ApiModelProperty(value = "The access token secret obtained from your user via oauth. Required for *twitter* integrations. ")
  public String getAccessTokenSecret() {
    return accessTokenSecret;
  }

  public void setAccessTokenSecret(String accessTokenSecret) {
    this.accessTokenSecret = accessTokenSecret;
  }

  public Integration userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * The twitter userId. Returned on successful *twitter* integrations. 
   * @return userId
  **/
  @ApiModelProperty(value = "The twitter userId. Returned on successful *twitter* integrations. ")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public Integration username(String username) {
    this.username = username;
    return this;
  }

   /**
   * The username for the account. Returned on successful *twitter* and *telegram* integrations. 
   * @return username
  **/
  @ApiModelProperty(value = "The username for the account. Returned on successful *twitter* and *telegram* integrations. ")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public Integration apiKey(String apiKey) {
    this.apiKey = apiKey;
    return this;
  }

   /**
   * The public API key of your Mailgun account. Required for *mailgun* integrations. 
   * @return apiKey
  **/
  @ApiModelProperty(value = "The public API key of your Mailgun account. Required for *mailgun* integrations. ")
  public String getApiKey() {
    return apiKey;
  }

  public void setApiKey(String apiKey) {
    this.apiKey = apiKey;
  }

  public Integration domain(String domain) {
    this.domain = domain;
    return this;
  }

   /**
   * The domain used to relay email. Required for *mailgun* integrations. 
   * @return domain
  **/
  @ApiModelProperty(value = "The domain used to relay email. Required for *mailgun* integrations. ")
  public String getDomain() {
    return domain;
  }

  public void setDomain(String domain) {
    this.domain = domain;
  }

  public Integration incomingAddress(String incomingAddress) {
    this.incomingAddress = incomingAddress;
    return this;
  }

   /**
   * Smooch will receive all emails sent to this address. Required for *mailgun* integrations. 
   * @return incomingAddress
  **/
  @ApiModelProperty(value = "Smooch will receive all emails sent to this address. Required for *mailgun* integrations. ")
  public String getIncomingAddress() {
    return incomingAddress;
  }

  public void setIncomingAddress(String incomingAddress) {
    this.incomingAddress = incomingAddress;
  }

  public Integration accessKey(String accessKey) {
    this.accessKey = accessKey;
    return this;
  }

   /**
   * The public API key of your MessageBird account. Required for *messagebird* integrations. 
   * @return accessKey
  **/
  @ApiModelProperty(value = "The public API key of your MessageBird account. Required for *messagebird* integrations. ")
  public String getAccessKey() {
    return accessKey;
  }

  public void setAccessKey(String accessKey) {
    this.accessKey = accessKey;
  }

  public Integration originator(String originator) {
    this.originator = originator;
    return this;
  }

   /**
   * Smooch will receive all messages sent to this phone number. Required for *messagebird* integrations. 
   * @return originator
  **/
  @ApiModelProperty(value = "Smooch will receive all messages sent to this phone number. Required for *messagebird* integrations. ")
  public String getOriginator() {
    return originator;
  }

  public void setOriginator(String originator) {
    this.originator = originator;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Integration integration = (Integration) o;
    return Objects.equals(this.id, integration.id) &&
        Objects.equals(this.type, integration.type) &&
        Objects.equals(this.pageAccessToken, integration.pageAccessToken) &&
        Objects.equals(this.appId, integration.appId) &&
        Objects.equals(this.appSecret, integration.appSecret) &&
        Objects.equals(this.webhookSecret, integration.webhookSecret) &&
        Objects.equals(this.pageId, integration.pageId) &&
        Objects.equals(this.accountSid, integration.accountSid) &&
        Objects.equals(this.authToken, integration.authToken) &&
        Objects.equals(this.phoneNumberSid, integration.phoneNumberSid) &&
        Objects.equals(this.phoneNumber, integration.phoneNumber) &&
        Objects.equals(this.name, integration.name) &&
        Objects.equals(this.token, integration.token) &&
        Objects.equals(this.uri, integration.uri) &&
        Objects.equals(this.channelAccessToken, integration.channelAccessToken) &&
        Objects.equals(this.botName, integration.botName) &&
        Objects.equals(this.encodingAesKey, integration.encodingAesKey) &&
        Objects.equals(this.fromAddress, integration.fromAddress) &&
        Objects.equals(this.certificate, integration.certificate) &&
        Objects.equals(this.password, integration.password) &&
        Objects.equals(this.autoUpdateBadge, integration.autoUpdateBadge) &&
        Objects.equals(this.production, integration.production) &&
        Objects.equals(this.serverKey, integration.serverKey) &&
        Objects.equals(this.senderId, integration.senderId) &&
        Objects.equals(this.consumerKey, integration.consumerKey) &&
        Objects.equals(this.consumerSecret, integration.consumerSecret) &&
        Objects.equals(this.accessTokenKey, integration.accessTokenKey) &&
        Objects.equals(this.accessTokenSecret, integration.accessTokenSecret) &&
        Objects.equals(this.userId, integration.userId) &&
        Objects.equals(this.username, integration.username) &&
        Objects.equals(this.apiKey, integration.apiKey) &&
        Objects.equals(this.domain, integration.domain) &&
        Objects.equals(this.incomingAddress, integration.incomingAddress) &&
        Objects.equals(this.accessKey, integration.accessKey) &&
        Objects.equals(this.originator, integration.originator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, pageAccessToken, appId, appSecret, webhookSecret, pageId, accountSid, authToken, phoneNumberSid, phoneNumber, name, token, uri, channelAccessToken, botName, encodingAesKey, fromAddress, certificate, password, autoUpdateBadge, production, serverKey, senderId, consumerKey, consumerSecret, accessTokenKey, accessTokenSecret, userId, username, apiKey, domain, incomingAddress, accessKey, originator);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Integration {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    pageAccessToken: ").append(toIndentedString(pageAccessToken)).append("\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    appSecret: ").append(toIndentedString(appSecret)).append("\n");
    sb.append("    webhookSecret: ").append(toIndentedString(webhookSecret)).append("\n");
    sb.append("    pageId: ").append(toIndentedString(pageId)).append("\n");
    sb.append("    accountSid: ").append(toIndentedString(accountSid)).append("\n");
    sb.append("    authToken: ").append(toIndentedString(authToken)).append("\n");
    sb.append("    phoneNumberSid: ").append(toIndentedString(phoneNumberSid)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    channelAccessToken: ").append(toIndentedString(channelAccessToken)).append("\n");
    sb.append("    botName: ").append(toIndentedString(botName)).append("\n");
    sb.append("    encodingAesKey: ").append(toIndentedString(encodingAesKey)).append("\n");
    sb.append("    fromAddress: ").append(toIndentedString(fromAddress)).append("\n");
    sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    autoUpdateBadge: ").append(toIndentedString(autoUpdateBadge)).append("\n");
    sb.append("    production: ").append(toIndentedString(production)).append("\n");
    sb.append("    serverKey: ").append(toIndentedString(serverKey)).append("\n");
    sb.append("    senderId: ").append(toIndentedString(senderId)).append("\n");
    sb.append("    consumerKey: ").append(toIndentedString(consumerKey)).append("\n");
    sb.append("    consumerSecret: ").append(toIndentedString(consumerSecret)).append("\n");
    sb.append("    accessTokenKey: ").append(toIndentedString(accessTokenKey)).append("\n");
    sb.append("    accessTokenSecret: ").append(toIndentedString(accessTokenSecret)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    apiKey: ").append(toIndentedString(apiKey)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    incomingAddress: ").append(toIndentedString(incomingAddress)).append("\n");
    sb.append("    accessKey: ").append(toIndentedString(accessKey)).append("\n");
    sb.append("    originator: ").append(toIndentedString(originator)).append("\n");
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

