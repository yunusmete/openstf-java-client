
package com.mete.yunus.stf.model;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Battery {

   @SerializedName("health")
   @Expose
   private String health;
   @SerializedName("level")
   @Expose
   private int    level;
   @SerializedName("scale")
   @Expose
   private int    scale;
   @SerializedName("source")
   @Expose
   private String source;
   @SerializedName("status")
   @Expose
   private String status;
   @SerializedName("temp")
   @Expose
   private double temp;
   @SerializedName("voltage")
   @Expose
   private double voltage;

   /**
    * @return The health
    */
   public String getHealth() {
      return health;
   }

   /**
    * @param health
    *           The health
    */
   public void setHealth(String health) {
      this.health = health;
   }

   /**
    * @return The level
    */
   public int getLevel() {
      return level;
   }

   /**
    * @param level
    *           The level
    */
   public void setLevel(int level) {
      this.level = level;
   }

   /**
    * @return The scale
    */
   public int getScale() {
      return scale;
   }

   /**
    * @param scale
    *           The scale
    */
   public void setScale(int scale) {
      this.scale = scale;
   }

   /**
    * @return The source
    */
   public String getSource() {
      return source;
   }

   /**
    * @param source
    *           The source
    */
   public void setSource(String source) {
      this.source = source;
   }

   /**
    * @return The status
    */
   public String getStatus() {
      return status;
   }

   /**
    * @param status
    *           The status
    */
   public void setStatus(String status) {
      this.status = status;
   }

   /**
    * @return The temp
    */
   public double getTemp() {
      return temp;
   }

   /**
    * @param temp
    *           The temp
    */
   public void setTemp(double temp) {
      this.temp = temp;
   }

   /**
    * @return The voltage
    */
   public double getVoltage() {
      return voltage;
   }

   /**
    * @param voltage
    *           The voltage
    */
   public void setVoltage(double voltage) {
      this.voltage = voltage;
   }

   @Override
   public String toString() {
      return "Battery{" + "health='" + health + '\'' + ", level=" + level + ", scale=" + scale + ", source='" + source + '\'' + ", status='" + status + '\'' + ", temp=" + temp + ", voltage=" + voltage + '}';
   }
}
