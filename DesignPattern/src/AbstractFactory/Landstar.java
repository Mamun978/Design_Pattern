package AbstractFactory;

public class Landstar implements Vehicle{
    @Override
    public void vehicleType() {
        System.out.println("Vehicle type is : Truck ");
    }

    @Override
    public void vehicleDetails() {
        System.out.println("Landstar is a Truck company");
    }


//    @Override
//    public void vehicleType() {
//        System.out.println("Vehicle type is : Truck ");
//    }
//
//    @Override
//    public void vehicleDetails() {
//        System.out.println("Landstar is a Truck company");
//    }
}
