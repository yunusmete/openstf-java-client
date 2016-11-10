
package com.mete.yunus.stf;

import java.util.List;

import com.mete.yunus.stf.model.DeviceBody;
import com.mete.yunus.stf.api.STFService;
import com.mete.yunus.stf.api.ServiceGenerator;
import com.mete.yunus.stf.model.Device;
import com.mete.yunus.stf.rest.DeviceResponse;

/**
 * Created by yunusm on 07.11.2016.
 */
public class STF {

   private static final String ACCESS_TOKEN = "8793d72c0a05404ea9c08d9c1c265218b14f2a34e95e48a89ea1117b8cc95daa";

   public static void main(String[] args) {
      STFService service = ServiceGenerator.createService(STFService.class, "http://10.254.17.109:7100/api/v1", ACCESS_TOKEN);
      DeviceResponse devices = service.getDevices();
      List<Device> deviceList = devices.getDevices();
      for (Device device : deviceList) {
         if (device.isPresent()) {
            String url = "http://10.254.18.17:7100/#!/control/";
            // if (device.getOwner() == null)
            service.addDeviceToUser(new DeviceBody(device.getSerial(), 900000));
            // try {
            // Desktop.getDesktop().browse(new URI(url + device.getSerial()));
            // }
            // catch (IOException e) {
            // e.printStackTrace();
            // }
            // catch (URISyntaxException e) {
            // e.printStackTrace();
            // }
            // AppiumTest test = new AppiumTest();
            // test.startTest(device.getSerial());
            // manager.deleteDeviceFromUser(device.getSerial());
         }
      }
   }
}
