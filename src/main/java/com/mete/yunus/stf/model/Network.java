
package com.mete.yunus.stf.model;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Network {

   @SerializedName("connected")
   @Expose
   private boolean connected;
   @SerializedName("failover")
   @Expose
   private boolean failover;
   @SerializedName("roaming")
   @Expose
   private boolean roaming;
   @SerializedName("subtype")
   @Expose
   private String  subtype;
   @SerializedName("type")
   @Expose
   private String  type;

   /**
    * @return The connected
    */
   public boolean isConnected() {
      return connected;
   }

   /**
    * @param connected
    *           The connected
    */
   public void setConnected(boolean connected) {
      this.connected = connected;
   }

   /**
    * @return The failover
    */
   public boolean isFailover() {
      return failover;
   }

   /**
    * @param failover
    *           The failover
    */
   public void setFailover(boolean failover) {
      this.failover = failover;
   }

   /**
    * @return The roaming
    */
   public boolean isRoaming() {
      return roaming;
   }

   /**
    * @param roaming
    *           The roaming
    */
   public void setRoaming(boolean roaming) {
      this.roaming = roaming;
   }

   /**
    * @return The subtype
    */
   public String getSubtype() {
      return subtype;
   }

   /**
    * @param subtype
    *           The subtype
    */
   public void setSubtype(String subtype) {
      this.subtype = subtype;
   }

   /**
    * @return The type
    */
   public String getType() {
      return type;
   }

   /**
    * @param type
    *           The type
    */
   public void setType(String type) {
      this.type = type;
   }

   @Override
   public String toString() {
      return "Network{" + "connected=" + connected + ", failover=" + failover + ", roaming=" + roaming + ", subtype='" + subtype + '\'' + ", type='" + type + '\'' + '}';
   }
}
