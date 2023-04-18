package AbstractFactory;

public class Maverick implements Vehicle{


    @Override
    public void vehicleType() {
        System.out.println("Vehicle type is : Truck ");
    }

    @Override
    public void vehicleDetails() {
        System.out.println("Maverick is a Truck company");
    }
}

