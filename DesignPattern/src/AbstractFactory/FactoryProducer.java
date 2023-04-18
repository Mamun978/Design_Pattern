package AbstractFactory;

public class FactoryProducer {

    AbstractFactory getFactory(String factoryType){
        AbstractFactory abstractFactory=null;
        if(factoryType.equalsIgnoreCase("BusFactory")){
            abstractFactory=new BusFactory();
        }
        if(factoryType.equalsIgnoreCase("TruckFactory")){
            abstractFactory=new TruckFactory();
        }

        return  abstractFactory;
    }
}
