
package com.github.yunusmete.stf.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Display {

   @SerializedName("density")
   @Expose
   private double  density;
   @SerializedName("fps")
   @Expose
   private double  fps;
   @SerializedName("height")
   @Expose
   private int     height;
   @SerializedName("id")
   @Expose
   private int     id;
   @SerializedName("rotation")
   @Expose
   private int     rotation;
   @SerializedName("secure")
   @Expose
   private boolean secure;
   @SerializedName("size")
   @Expose
   private double  size;
   @SerializedName("url")
   @Expose
   private String  url;
   @SerializedName("width")
   @Expose
   private int     width;
   @SerializedName("xdpi")
   @Expose
   private double  xdpi;
   @SerializedName("ydpi")
   @Expose
   private double  ydpi;

   /**
    * @return The density
    */
   public double getDensity() {
      return density;
   }

   /**
    * @param density
    *           The density
    */
   public void setDensity(double density) {
      this.density = density;
   }

   /**
    * @return The fps
    */
   public double getFps() {
      return fps;
   }

   /**
    * @param fps
    *           The fps
    */
   public void setFps(double fps) {
      this.fps = fps;
   }

   /**
    * @return The height
    */
   public int getHeight() {
      return height;
   }

   /**
    * @param height
    *           The height
    */
   public void setHeight(int height) {
      this.height = height;
   }

   /**
    * @return The id
    */
   public int getId() {
      return id;
   }

   /**
    * @param id
    *           The id
    */
   public void setId(int id) {
      this.id = id;
   }

   /**
    * @return The rotation
    */
   public int getRotation() {
      return rotation;
   }

   /**
    * @param rotation
    *           The rotation
    */
   public void setRotation(int rotation) {
      this.rotation = rotation;
   }

   /**
    * @return The secure
    */
   public boolean isSecure() {
      return secure;
   }

   /**
    * @param secure
    *           The secure
    */
   public void setSecure(boolean secure) {
      this.secure = secure;
   }

   /**
    * @return The size
    */
   public double getSize() {
      return size;
   }

   /**
    * @param size
    *           The size
    */
   public void setSize(double size) {
      this.size = size;
   }

   /**
    * @return The url
    */
   public String getUrl() {
      return url;
   }

   /**
    * @param url
    *           The url
    */
   public void setUrl(String url) {
      this.url = url;
   }

   /**
    * @return The width
    */
   public int getWidth() {
      return width;
   }

   /**
    * @param width
    *           The width
    */
   public void setWidth(int width) {
      this.width = width;
   }

   /**
    * @return The xdpi
    */
   public double getXdpi() {
      return xdpi;
   }

   /**
    * @param xdpi
    *           The xdpi
    */
   public void setXdpi(double xdpi) {
      this.xdpi = xdpi;
   }

   /**
    * @return The ydpi
    */
   public double getYdpi() {
      return ydpi;
   }

   /**
    * @param ydpi
    *           The ydpi
    */
   public void setYdpi(double ydpi) {
      this.ydpi = ydpi;
   }

   @Override
   public String toString() {
      return "Display{" + "density=" + density + ", fps=" + fps + ", height=" + height + ", id=" + id + ", rotation=" + rotation + ", secure=" + secure + ", size=" + size + ", url='" + url + '\'' + ", width=" + width + ", xdpi=" + xdpi + ", ydpi=" + ydpi + '}';
   }
}
