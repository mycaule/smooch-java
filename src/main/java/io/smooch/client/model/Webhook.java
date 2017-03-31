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
import java.util.ArrayList;
import java.util.List;

/**
 * Webhook
 */

public class Webhook {
  @SerializedName("_id")
  private String id = null;

  @SerializedName("target")
  private String target = null;

  /**
   * Gets or Sets triggers
   */
  public enum TriggersEnum {
    @SerializedName("message")
    MESSAGE("message"),
    
    @SerializedName("message:appUser")
    MESSAGE_APPUSER("message:appUser"),
    
    @SerializedName("message:appMaker")
    MESSAGE_APPMAKER("message:appMaker"),
    
    @SerializedName("conversation:start")
    CONVERSATION_START("conversation:start"),
    
    @SerializedName("conversation:read")
    CONVERSATION_READ("conversation:read"),
    
    @SerializedName("postback")
    POSTBACK("postback"),
    
    @SerializedName("merge:appUser")
    MERGE_APPUSER("merge:appUser"),
    
    @SerializedName("delivery:success")
    DELIVERY_SUCCESS("delivery:success"),
    
    @SerializedName("delivery:failure")
    DELIVERY_FAILURE("delivery:failure"),
    
    @SerializedName("payment:success")
    PAYMENT_SUCCESS("payment:success"),
    
    @SerializedName("*")
    STAR("*");

    private String value;

    TriggersEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("triggers")
  private List<TriggersEnum> triggers = new ArrayList<TriggersEnum>();

  @SerializedName("secret")
  private String secret = null;

  public Webhook id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The webhook ID, generated automatically.
   * @return id
  **/
  @ApiModelProperty(example = "null", required = true, value = "The webhook ID, generated automatically.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Webhook target(String target) {
    this.target = target;
    return this;
  }

   /**
   * URL to be called when the webhook is triggered.
   * @return target
  **/
  @ApiModelProperty(example = "null", required = true, value = "URL to be called when the webhook is triggered.")
  public String getTarget() {
    return target;
  }

  public void setTarget(String target) {
    this.target = target;
  }

  public Webhook triggers(List<TriggersEnum> triggers) {
    this.triggers = triggers;
    return this;
  }

  public Webhook addTriggersItem(TriggersEnum triggersItem) {
    this.triggers.add(triggersItem);
    return this;
  }

   /**
   * An array of triggers you wish to have the webhook listen to. If unspecified the default trigger is *message*.
   * @return triggers
  **/
  @ApiModelProperty(example = "null", required = true, value = "An array of triggers you wish to have the webhook listen to. If unspecified the default trigger is *message*.")
  public List<TriggersEnum> getTriggers() {
    return triggers;
  }

  public void setTriggers(List<TriggersEnum> triggers) {
    this.triggers = triggers;
  }

  public Webhook secret(String secret) {
    this.secret = secret;
    return this;
  }

   /**
   * Secret which will be transmitted with each webhook invocation and can be used to verify the authenticity of the caller.
   * @return secret
  **/
  @ApiModelProperty(example = "null", required = true, value = "Secret which will be transmitted with each webhook invocation and can be used to verify the authenticity of the caller.")
  public String getSecret() {
    return secret;
  }

  public void setSecret(String secret) {
    this.secret = secret;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Webhook webhook = (Webhook) o;
    return Objects.equals(this.id, webhook.id) &&
        Objects.equals(this.target, webhook.target) &&
        Objects.equals(this.triggers, webhook.triggers) &&
        Objects.equals(this.secret, webhook.secret);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, target, triggers, secret);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Webhook {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    triggers: ").append(toIndentedString(triggers)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
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

