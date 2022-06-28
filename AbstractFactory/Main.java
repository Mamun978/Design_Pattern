

public class Main {
    
public static void main(String[] args) {
    
    Device lenevo=FactoryGenerator.getFactory(FactoryType.LaptopFactory).getGadget(DeviceType.Lenevo);
    
    System.out.println(lenevo.getDetails());
}
}
