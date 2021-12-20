
package com.github.yunusmete.stf.api;

import com.github.yunusmete.stf.model.DeviceBody;
import com.github.yunusmete.stf.rest.ClaimResponse;
import com.github.yunusmete.stf.rest.DeviceResponse;
import com.github.yunusmete.stf.rest.RemoteConnectResponse;
import com.github.yunusmete.stf.rest.UserResponse;
import retrofit.http.*;

/**
 * Created by yunusm on 07.11.2016.
 */
public interface STFService {

   // DEVICE API

   /**
    * Get list of devices
    * 
    * @return list of devices
    */
   @GET("/devices")
   DeviceResponse getDevices();

   @GET("/devices/{serial}")
   DeviceResponse getDeviceBySerial(@Path("serial") String serial);

   // USER API
   @GET("/user")
   UserResponse getUser();

   @GET("/user/devices")
   DeviceResponse getUserDevices();

   @POST("/user/devices")
   ClaimResponse addDeviceToUser(@Body DeviceBody body);

   @DELETE("/user/devices/{serial}")
   ClaimResponse deleteDeviceBySerial(@Path("serial") String serial);

   @POST("/user/devices/{serial}/remoteConnect")
   RemoteConnectResponse remoteConnectDeviceBySerial(@Path("serial") String serial, @Body DeviceBody body);

   @DELETE("/user/devices/{serial}/remoteConnect")
   RemoteConnectResponse remoteDisconnectDeviceBySerial(@Path("serial") String serial);

   @GET("/user/accessTokens")
   DeviceResponse getAccessTokens();

}
