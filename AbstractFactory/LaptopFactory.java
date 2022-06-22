public class LaptopFactory extends AbstractDeviceFactory {

    @Override
    public Device getGadget(DeviceType deviceType) {
        
        if(deviceType.equals(DeviceType.Hp)){
            return new Hp("16gb", "Intel Core", "Nvidia");
        }

        // else if(deviceType.equals(DeviceType.Lenevo)) {
           
        // }
        
        else{
            return new Lenevo("8gb", "Intel Pentium", "AMD");
        }
    }
    
}
