
package com.github.yunusmete.stf.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Provider {

   @SerializedName("channel")
   @Expose
   private String channel;
   @SerializedName("name")
   @Expose
   private String name;

   /**
    * @return The channel
    */
   public String getChannel() {
      return channel;
   }

   /**
    * @param channel
    *           The channel
    */
   public void setChannel(String channel) {
      this.channel = channel;
   }

   /**
    * @return The name
    */
   public String getName() {
      return name;
   }

   /**
    * @param name
    *           The name
    */
   public void setName(String name) {
      this.name = name;
   }

   @Override
   public String toString() {
      return "Provider{" + "channel='" + channel + '\'' + ", name='" + name + '\'' + '}';
   }
}
