
package com.github.yunusmete.stf.model;

/**
 * Created by yunusm on 10.11.2016.
 */
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Settings {

   @SerializedName("lastUsedDevice")
   @Expose
   private String lastUsedDevice;
   @SerializedName("platform")
   @Expose
   private String platform;

   /**
    * @return The lastUsedDevice
    */
   public String getLastUsedDevice() {
      return lastUsedDevice;
   }

   /**
    * @param lastUsedDevice
    *           The lastUsedDevice
    */
   public void setLastUsedDevice(String lastUsedDevice) {
      this.lastUsedDevice = lastUsedDevice;
   }

   /**
    * @return The platform
    */
   public String getPlatform() {
      return platform;
   }

   /**
    * @param platform
    *           The platform
    */
   public void setPlatform(String platform) {
      this.platform = platform;
   }

}
