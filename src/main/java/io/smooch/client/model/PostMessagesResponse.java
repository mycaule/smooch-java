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
import io.smooch.client.model.Conversation;
import io.smooch.client.model.Message;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * PostMessagesResponse
 */

public class PostMessagesResponse {
  @SerializedName("conversation")
  private Conversation conversation = null;

  @SerializedName("messages")
  private List<Message> messages = null;

  public PostMessagesResponse conversation(Conversation conversation) {
    this.conversation = conversation;
    return this;
  }

   /**
   * The conversation.
   * @return conversation
  **/
  @ApiModelProperty(value = "The conversation.")
  public Conversation getConversation() {
    return conversation;
  }

  public void setConversation(Conversation conversation) {
    this.conversation = conversation;
  }

  public PostMessagesResponse messages(List<Message> messages) {
    this.messages = messages;
    return this;
  }

  public PostMessagesResponse addMessagesItem(Message messagesItem) {
    if (this.messages == null) {
      this.messages = new ArrayList<Message>();
    }
    this.messages.add(messagesItem);
    return this;
  }

   /**
   * The messages.
   * @return messages
  **/
  @ApiModelProperty(value = "The messages.")
  public List<Message> getMessages() {
    return messages;
  }

  public void setMessages(List<Message> messages) {
    this.messages = messages;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostMessagesResponse postMessagesResponse = (PostMessagesResponse) o;
    return Objects.equals(this.conversation, postMessagesResponse.conversation) &&
        Objects.equals(this.messages, postMessagesResponse.messages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conversation, messages);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostMessagesResponse {\n");
    
    sb.append("    conversation: ").append(toIndentedString(conversation)).append("\n");
    sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
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

