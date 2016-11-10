
package com.mete.yunus.stf.api;

import retrofit.http.*;

import com.mete.yunus.stf.model.DeviceBody;
import com.mete.yunus.stf.rest.ClaimResponse;
import com.mete.yunus.stf.rest.DeviceResponse;
import com.mete.yunus.stf.rest.RemoteConnectResponse;
import com.mete.yunus.stf.rest.UserResponse;

/**
 * Created by yunusm on 07.11.2016.
 */
public interface STFService {

   // DEVICE API
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
   RemoteConnectResponse remoteConnectDeviceBySerial(@Path("serial") String serial);

   @DELETE("/user/devices/{serial}/remoteConnect")
   RemoteConnectResponse remoteDisconnectDeviceBySerial(@Path("serial") String serial);

   @GET("/user/accessTokens")
   DeviceResponse getAccessTokens();

}
