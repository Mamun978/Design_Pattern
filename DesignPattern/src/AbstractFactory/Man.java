package AbstractFactory;

public class Man implements Vehicle{


    @Override
    public void vehicleType() {
        System.out.println("Vehicle type is : Bus ");
    }

    @Override
    public void vehicleDetails() {
        System.out.println("Man is a German bus company.");
    }
}
