import java.util.List;

import com.mete.yunus.stf.api.STFService;
import com.mete.yunus.stf.api.ServiceGenerator;
import com.mete.yunus.stf.model.Device;
import com.mete.yunus.stf.model.DeviceBody;
import com.mete.yunus.stf.rest.DeviceResponse;

/**
 * Created by yunusm on 07.11.2016.
 */
public class STF {

   private static final String ACCESS_TOKEN = "YOUR_STF_ACCESS_TOKEN";

   public static void main(String[] args) {
      STFService service = ServiceGenerator.createService(STFService.class, "http://YOUR_STF_URL/api/v1", ACCESS_TOKEN);
      DeviceResponse devices = service.getDevices();
      List<Device> deviceList = devices.getDevices();
      for (Device device : deviceList) {
         if (device.isPresent()) {
            if (device.getOwner() == null)
               service.addDeviceToUser(new DeviceBody(device.getSerial(), 900000));
            AppiumTest test = new AppiumTest();
            test.startTest(device.getSerial());
            service.deleteDeviceBySerial(device.getSerial());
         }
      }
   }
}
