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
 * DisplaySettings
 */

public class DisplaySettings {
  @SerializedName("imageAspectRatio")
  private String imageAspectRatio = null;

  public DisplaySettings imageAspectRatio(String imageAspectRatio) {
    this.imageAspectRatio = imageAspectRatio;
    return this;
  }

   /**
   * Specifies how to display all carousel images. Valid values are *horizontal* (default) and *square*.
   * @return imageAspectRatio
  **/
  @ApiModelProperty(value = "Specifies how to display all carousel images. Valid values are *horizontal* (default) and *square*.")
  public String getImageAspectRatio() {
    return imageAspectRatio;
  }

  public void setImageAspectRatio(String imageAspectRatio) {
    this.imageAspectRatio = imageAspectRatio;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DisplaySettings displaySettings = (DisplaySettings) o;
    return Objects.equals(this.imageAspectRatio, displaySettings.imageAspectRatio);
  }

  @Override
  public int hashCode() {
    return Objects.hash(imageAspectRatio);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DisplaySettings {\n");
    
    sb.append("    imageAspectRatio: ").append(toIndentedString(imageAspectRatio)).append("\n");
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

