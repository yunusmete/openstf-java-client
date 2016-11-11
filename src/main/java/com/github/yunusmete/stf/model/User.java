
package com.github.yunusmete.stf.model;

/**
 * Created by yunusm on 10.11.2016.
 */
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Generated;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class User {

   @SerializedName("createdAt")
   @Expose
   private String       createdAt;
   @SerializedName("email")
   @Expose
   private String       email;
   @SerializedName("forwards")
   @Expose
   private List<Object> forwards = new ArrayList<Object>();
   @SerializedName("group")
   @Expose
   private String       group;
   @SerializedName("ip")
   @Expose
   private String       ip;
   @SerializedName("lastLoggedInAt")
   @Expose
   private String       lastLoggedInAt;
   @SerializedName("name")
   @Expose
   private String       name;
   @SerializedName("settings")
   @Expose
   private Settings     settings;

   /**
    * @return The createdAt
    */
   public String getCreatedAt() {
      return createdAt;
   }

   /**
    * @param createdAt
    *           The createdAt
    */
   public void setCreatedAt(String createdAt) {
      this.createdAt = createdAt;
   }

   /**
    * @return The email
    */
   public String getEmail() {
      return email;
   }

   /**
    * @param email
    *           The email
    */
   public void setEmail(String email) {
      this.email = email;
   }

   /**
    * @return The forwards
    */
   public List<Object> getForwards() {
      return forwards;
   }

   /**
    * @param forwards
    *           The forwards
    */
   public void setForwards(List<Object> forwards) {
      this.forwards = forwards;
   }

   /**
    * @return The group
    */
   public String getGroup() {
      return group;
   }

   /**
    * @param group
    *           The group
    */
   public void setGroup(String group) {
      this.group = group;
   }

   /**
    * @return The ip
    */
   public String getIp() {
      return ip;
   }

   /**
    * @param ip
    *           The ip
    */
   public void setIp(String ip) {
      this.ip = ip;
   }

   /**
    * @return The lastLoggedInAt
    */
   public String getLastLoggedInAt() {
      return lastLoggedInAt;
   }

   /**
    * @param lastLoggedInAt
    *           The lastLoggedInAt
    */
   public void setLastLoggedInAt(String lastLoggedInAt) {
      this.lastLoggedInAt = lastLoggedInAt;
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

   /**
    * @return The settings
    */
   public Settings getSettings() {
      return settings;
   }

   /**
    * @param settings
    *           The settings
    */
   public void setSettings(Settings settings) {
      this.settings = settings;
   }

}