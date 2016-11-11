
package com.github.yunusmete.stf.rest;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by yunusm on 10.11.2016.
 */
public class RemoteConnectResponse {

   @SerializedName("success")
   @Expose
   private boolean success;
   @SerializedName("remoteConnectUrl")
   @Expose
   private String  remoteConnectUrl;

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
    * @return The remoteConnectUrl
    */
   public String getRemoteConnectUrl() {
      return remoteConnectUrl;
   }

   /**
    * @param remoteConnectUrl
    *           The remoteConnectUrl
    */
   public void setRemoteConnectUrl(String remoteConnectUrl) {
      this.remoteConnectUrl = remoteConnectUrl;
   }

}
