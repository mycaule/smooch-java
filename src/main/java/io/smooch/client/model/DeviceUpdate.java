/*
 * Smooch
 * The Smooch API is a unified interface for powering messaging in your customer experiences across every channel. Our API speeds access to new markets, reduces time to ship, eliminates complexity, and helps you build the best experiences for your customers. For more information, visit our [official documentation](https://docs.smooch.io).
 *
 * OpenAPI spec version: 1.4
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.smooch.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.smooch.client.model.ClientInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * DeviceUpdate
 */

public class DeviceUpdate {
  @SerializedName("pushNotificationToken")
  private String pushNotificationToken = null;

  @SerializedName("appVersion")
  private String appVersion = null;

  @SerializedName("info")
  private ClientInfo info = null;

  public DeviceUpdate pushNotificationToken(String pushNotificationToken) {
    this.pushNotificationToken = pushNotificationToken;
    return this;
  }

   /**
   * The GCM or APN token to be used for sending push notifications to the device. Applies to only *android* and *ios* clients. 
   * @return pushNotificationToken
  **/
  @ApiModelProperty(value = "The GCM or APN token to be used for sending push notifications to the device. Applies to only *android* and *ios* clients. ")
  public String getPushNotificationToken() {
    return pushNotificationToken;
  }

  public void setPushNotificationToken(String pushNotificationToken) {
    this.pushNotificationToken = pushNotificationToken;
  }

  public DeviceUpdate appVersion(String appVersion) {
    this.appVersion = appVersion;
    return this;
  }

   /**
   * A reserved string field for reporting the app version running on the device.
   * @return appVersion
  **/
  @ApiModelProperty(value = "A reserved string field for reporting the app version running on the device.")
  public String getAppVersion() {
    return appVersion;
  }

  public void setAppVersion(String appVersion) {
    this.appVersion = appVersion;
  }

  public DeviceUpdate info(ClientInfo info) {
    this.info = info;
    return this;
  }

   /**
   * Get info
   * @return info
  **/
  @ApiModelProperty(value = "")
  public ClientInfo getInfo() {
    return info;
  }

  public void setInfo(ClientInfo info) {
    this.info = info;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeviceUpdate deviceUpdate = (DeviceUpdate) o;
    return Objects.equals(this.pushNotificationToken, deviceUpdate.pushNotificationToken) &&
        Objects.equals(this.appVersion, deviceUpdate.appVersion) &&
        Objects.equals(this.info, deviceUpdate.info);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pushNotificationToken, appVersion, info);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceUpdate {\n");
    
    sb.append("    pushNotificationToken: ").append(toIndentedString(pushNotificationToken)).append("\n");
    sb.append("    appVersion: ").append(toIndentedString(appVersion)).append("\n");
    sb.append("    info: ").append(toIndentedString(info)).append("\n");
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

