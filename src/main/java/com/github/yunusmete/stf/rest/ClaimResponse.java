
package com.github.yunusmete.stf.rest;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by yunusm on 08.11.2016.
 */
public class ClaimResponse {

   @SerializedName("success")
   @Expose
   private boolean success;
   @SerializedName("description")
   @Expose
   private String  description;

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
    * @return The description
    */
   public String getDescription() {
      return description;
   }

   /**
    * @param description
    *           The description
    */
   public void setDescription(String description) {
      this.description = description;
   }

   @Override
   public String toString() {
      return "ClaimResponse{" + "success=" + success + ", description='" + description + '\'' + '}';
   }
}
