package AbstractFactory;

public class TruckFactory implements AbstractFactory {

    @Override
    public Vehicle getVehicles(String vehicleName) {
        Vehicle vehicle=null;
        if(vehicleName.equalsIgnoreCase("Landstar")){
            vehicle =  new Landstar();
        }

        if(vehicleName.equalsIgnoreCase("Maverick")){
            vehicle =  new Maverick();
        }

        return vehicle;

    }
}
