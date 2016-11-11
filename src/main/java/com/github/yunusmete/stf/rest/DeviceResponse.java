
package com.github.yunusmete.stf.rest;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.github.yunusmete.stf.model.Device;

/**
 * Created by yunusm on 08.11.2016.
 */
public class DeviceResponse {

   @SerializedName("success")
   @Expose
   private boolean      success;
   @SerializedName("devices")
   @Expose
   private List<Device> devices = new ArrayList<Device>();

   /**
    * @return The success
    */
   public boolean isSuccess() {
      return success;
   }

   /**
    * @param success
    *           The success
    */
   public void setSuccess(boolean success) {
      this.success = success;
   }

   /**
    * @return The devices
    */
   public List<Device> getDevices() {
      return devices;
   }

   /**
    * @param devices
    *           The devices
    */
   public void setDevices(List<Device> devices) {
      this.devices = devices;
   }

   @Override
   public String toString() {
      return "DeviceResponse{" + "success=" + success + ", devices=" + devices + '}';
   }
}
