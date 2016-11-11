
package com.github.yunusmete.stf.model;

/**
 * Created by yunusm on 08.11.2016.
 */
public class DeviceBody {

   private String serial;
   private int    timeout;

   public DeviceBody(String serial, int timeout) {
      this.serial = serial;
      this.timeout = timeout;
   }

   public String getSerial() {
      return serial;
   }

   public void setSerial(String serial) {
      this.serial = serial;
   }

   public int getTimeout() {
      return timeout;
   }

   public void setTimeout(int timeout) {
      this.timeout = timeout;
   }
}
