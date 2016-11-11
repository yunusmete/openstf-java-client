
package com.github.yunusmete.stf.rest;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.github.yunusmete.stf.model.User;

/**
 * Created by yunusm on 10.11.2016.
 */
public class UserResponse {

   @SerializedName("success")
   @Expose
   private boolean success;
   @SerializedName("user")
   @Expose
   private User    user;

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
    * @return The user
    */
   public User getUser() {
      return user;
   }

   /**
    * @param user
    *           The user
    */
   public void setUser(User user) {
      this.user = user;
   }

}
