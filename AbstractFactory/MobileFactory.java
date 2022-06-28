public class MobileFactory extends AbstractDeviceFactory {
    
   

    @Override
    Device getGadget(DeviceType deviceType) {
        if(deviceType.equals(DeviceType.Nokia)){
            return new Nokia("3 gb", "Android 9.0 (Pie)")
        }
    //    else if(deviceType.equals(DeviceType.Samsung)){
            
    //     }

        else{
            return new Samsung("4gb", "Android 10");
    }

}
