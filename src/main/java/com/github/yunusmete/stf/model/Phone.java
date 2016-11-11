
package com.github.yunusmete.stf.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Phone {

   @SerializedName("iccid")
   @Expose
   private String iccid;
   @SerializedName("imei")
   @Expose
   private String imei;
   @SerializedName("network")
   @Expose
   private String network;
   @SerializedName("phoneNumber")
   @Expose
   private Object phoneNumber;

   /**
    * @return The iccid
    */
   public String getIccid() {
      return iccid;
   }

   /**
    * @param iccid
    *           The iccid
    */
   public void setIccid(String iccid) {
      this.iccid = iccid;
   }

   /**
    * @return The imei
    */
   public String getImei() {
      return imei;
   }

   /**
    * @param imei
    *           The imei
    */
   public void setImei(String imei) {
      this.imei = imei;
   }

   /**
    * @return The network
    */
   public String getNetwork() {
      return network;
   }

   /**
    * @param network
    *           The network
    */
   public void setNetwork(String network) {
      this.network = network;
   }

   /**
    * @return The phoneNumber
    */
   public Object getPhoneNumber() {
      return phoneNumber;
   }

   /**
    * @param phoneNumber
    *           The phoneNumber
    */
   public void setPhoneNumber(Object phoneNumber) {
      this.phoneNumber = phoneNumber;
   }

   @Override
   public String toString() {
      return "Phone{" + "iccid='" + iccid + '\'' + ", imei='" + imei + '\'' + ", network='" + network + '\'' + ", phoneNumber=" + phoneNumber + '}';
   }
}
