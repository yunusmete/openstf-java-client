
package com.github.yunusmete.stf.model;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Device {

   @SerializedName("abi")
   @Expose
   private String       abi;
   @SerializedName("airplaneMode")
   @Expose
   private boolean      airplaneMode;
   @SerializedName("battery")
   @Expose
   private Battery      battery;
   @SerializedName("browser")
   @Expose
   private Browser      browser;
   @SerializedName("channel")
   @Expose
   private String       channel;
   @SerializedName("createdAt")
   @Expose
   private String       createdAt;
   @SerializedName("display")
   @Expose
   private Display      display;
   @SerializedName("manufacturer")
   @Expose
   private String       manufacturer;
   @SerializedName("model")
   @Expose
   private String       model;
   @SerializedName("network")
   @Expose
   private Network      network;
   @SerializedName("operator")
   @Expose
   private String       operator;
   @SerializedName("owner")
   @Expose
   private Object       owner;
   @SerializedName("phone")
   @Expose
   private Phone        phone;
   @SerializedName("platform")
   @Expose
   private String       platform;
   @SerializedName("presenceChangedAt")
   @Expose
   private String       presenceChangedAt;
   @SerializedName("present")
   @Expose
   private boolean      present;
   @SerializedName("product")
   @Expose
   private String       product;
   @SerializedName("provider")
   @Expose
   private Provider     provider;
   @SerializedName("ready")
   @Expose
   private boolean      ready;
   @SerializedName("remoteConnect")
   @Expose
   private boolean      remoteConnect;
   @SerializedName("remoteConnectUrl")
   @Expose
   private Object       remoteConnectUrl;
   @SerializedName("reverseForwards")
   @Expose
   private List<Object> reverseForwards = new ArrayList<Object>();
   @SerializedName("sdk")
   @Expose
   private String       sdk;
   @SerializedName("serial")
   @Expose
   private String       serial;
   @SerializedName("status")
   @Expose
   private int          status;
   @SerializedName("statusChangedAt")
   @Expose
   private String       statusChangedAt;
   @SerializedName("version")
   @Expose
   private String       version;
   @SerializedName("using")
   @Expose
   private boolean      using;

   /**
    * @return The abi
    */
   public String getAbi() {
      return abi;
   }

   /**
    * @param abi
    *           The abi
    */
   public void setAbi(String abi) {
      this.abi = abi;
   }

   /**
    * @return The airplaneMode
    */
   public boolean isAirplaneMode() {
      return airplaneMode;
   }

   /**
    * @param airplaneMode
    *           The airplaneMode
    */
   public void setAirplaneMode(boolean airplaneMode) {
      this.airplaneMode = airplaneMode;
   }

   /**
    * @return The battery
    */
   public Battery getBattery() {
      return battery;
   }

   /**
    * @param battery
    *           The battery
    */
   public void setBattery(Battery battery) {
      this.battery = battery;
   }

   /**
    * @return The browser
    */
   public Browser getBrowser() {
      return browser;
   }

   /**
    * @param browser
    *           The browser
    */
   public void setBrowser(Browser browser) {
      this.browser = browser;
   }

   /**
    * @return The channel
    */
   public String getChannel() {
      return channel;
   }

   /**
    * @param channel
    *           The channel
    */
   public void setChannel(String channel) {
      this.channel = channel;
   }

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
    * @return The display
    */
   public Display getDisplay() {
      return display;
   }

   /**
    * @param display
    *           The display
    */
   public void setDisplay(Display display) {
      this.display = display;
   }

   /**
    * @return The manufacturer
    */
   public String getManufacturer() {
      return manufacturer;
   }

   /**
    * @param manufacturer
    *           The manufacturer
    */
   public void setManufacturer(String manufacturer) {
      this.manufacturer = manufacturer;
   }

   /**
    * @return The model
    */
   public String getModel() {
      return model;
   }

   /**
    * @param model
    *           The model
    */
   public void setModel(String model) {
      this.model = model;
   }

   /**
    * @return The network
    */
   public Network getNetwork() {
      return network;
   }

   /**
    * @param network
    *           The network
    */
   public void setNetwork(Network network) {
      this.network = network;
   }

   /**
    * @return The operator
    */
   public String getOperator() {
      return operator;
   }

   /**
    * @param operator
    *           The operator
    */
   public void setOperator(String operator) {
      this.operator = operator;
   }

   /**
    * @return The owner
    */
   public Object getOwner() {
      return owner;
   }

   /**
    * @param owner
    *           The owner
    */
   public void setOwner(Object owner) {
      this.owner = owner;
   }

   /**
    * @return The phone
    */
   public Phone getPhone() {
      return phone;
   }

   /**
    * @param phone
    *           The phone
    */
   public void setPhone(Phone phone) {
      this.phone = phone;
   }

   /**
    * @return The platform
    */
   public String getPlatform() {
      return platform;
   }

   /**
    * @param platform
    *           The platform
    */
   public void setPlatform(String platform) {
      this.platform = platform;
   }

   /**
    * @return The presenceChangedAt
    */
   public String getPresenceChangedAt() {
      return presenceChangedAt;
   }

   /**
    * @param presenceChangedAt
    *           The presenceChangedAt
    */
   public void setPresenceChangedAt(String presenceChangedAt) {
      this.presenceChangedAt = presenceChangedAt;
   }

   /**
    * @return The present
    */
   public boolean isPresent() {
      return present;
   }

   /**
    * @param present
    *           The present
    */
   public void setPresent(boolean present) {
      this.present = present;
   }

   /**
    * @return The product
    */
   public String getProduct() {
      return product;
   }

   /**
    * @param product
    *           The product
    */
   public void setProduct(String product) {
      this.product = product;
   }

   /**
    * @return The provider
    */
   public Provider getProvider() {
      return provider;
   }

   /**
    * @param provider
    *           The provider
    */
   public void setProvider(Provider provider) {
      this.provider = provider;
   }

   /**
    * @return The ready
    */
   public boolean isReady() {
      return ready;
   }

   /**
    * @param ready
    *           The ready
    */
   public void setReady(boolean ready) {
      this.ready = ready;
   }

   /**
    * @return The remoteConnect
    */
   public boolean isRemoteConnect() {
      return remoteConnect;
   }

   /**
    * @param remoteConnect
    *           The remoteConnect
    */
   public void setRemoteConnect(boolean remoteConnect) {
      this.remoteConnect = remoteConnect;
   }

   /**
    * @return The remoteConnectUrl
    */
   public Object getRemoteConnectUrl() {
      return remoteConnectUrl;
   }

   /**
    * @param remoteConnectUrl
    *           The remoteConnectUrl
    */
   public void setRemoteConnectUrl(Object remoteConnectUrl) {
      this.remoteConnectUrl = remoteConnectUrl;
   }

   /**
    * @return The reverseForwards
    */
   public List<Object> getReverseForwards() {
      return reverseForwards;
   }

   /**
    * @param reverseForwards
    *           The reverseForwards
    */
   public void setReverseForwards(List<Object> reverseForwards) {
      this.reverseForwards = reverseForwards;
   }

   /**
    * @return The sdk
    */
   public String getSdk() {
      return sdk;
   }

   /**
    * @param sdk
    *           The sdk
    */
   public void setSdk(String sdk) {
      this.sdk = sdk;
   }

   /**
    * @return The serial
    */
   public String getSerial() {
      return serial;
   }

   /**
    * @param serial
    *           The serial
    */
   public void setSerial(String serial) {
      this.serial = serial;
   }

   /**
    * @return The status
    */
   public int getStatus() {
      return status;
   }

   /**
    * @param status
    *           The status
    */
   public void setStatus(int status) {
      this.status = status;
   }

   /**
    * @return The statusChangedAt
    */
   public String getStatusChangedAt() {
      return statusChangedAt;
   }

   /**
    * @param statusChangedAt
    *           The statusChangedAt
    */
   public void setStatusChangedAt(String statusChangedAt) {
      this.statusChangedAt = statusChangedAt;
   }

   /**
    * @return The version
    */
   public String getVersion() {
      return version;
   }

   /**
    * @param version
    *           The version
    */
   public void setVersion(String version) {
      this.version = version;
   }

   /**
    * @return The using
    */
   public boolean isUsing() {
      return using;
   }

   /**
    * @param using
    *           The using
    */
   public void setUsing(boolean using) {
      this.using = using;
   }

   @Override
   public String toString() {
      return "Device{" + "abi='" + abi + '\'' + ", airplaneMode=" + airplaneMode + ", battery=" + battery + ", browser=" + browser + ", channel='" + channel + '\'' + ", createdAt='" + createdAt + '\'' + ", display=" + display + ", manufacturer='" + manufacturer + '\'' + ", model='" + model + '\'' + ", network=" + network + ", operator='" + operator + '\'' + ", owner=" + owner + ", phone=" + phone + ", platform='" + platform + '\'' + ", presenceChangedAt='" + presenceChangedAt + '\'' + ", present=" + present + ", product='" + product + '\'' + ", provider=" + provider + ", ready=" + ready + ", remoteConnect=" + remoteConnect + ", remoteConnectUrl=" + remoteConnectUrl + ", reverseForwards=" + reverseForwards + ", sdk='" + sdk + '\'' + ", serial='" + serial + '\'' + ", status=" + status + ", statusChangedAt='" + statusChangedAt + '\'' + ", version='" + version + '\'' + ", using=" + using + '}';
   }
}
