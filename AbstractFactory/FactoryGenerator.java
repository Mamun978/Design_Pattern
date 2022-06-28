public class FactoryGenerator {
    public static AbstractDeviceFactory getFactory(FactoryType factoryType){
        if(factoryType.equals(FactoryType.LaptopFactory)){
            return new LaptopFactory();
        }
        else{
            return new MobileFactory();
        }
    }
}
