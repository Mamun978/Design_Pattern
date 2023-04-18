package AbstractFactory;

public class Scania implements Vehicle{




    @Override
    public void vehicleType() {
        System.out.println("Vehicle type is : Bus ");
    }

    @Override
    public void vehicleDetails() {
        System.out.println("Scania is a bus company.");
    }


}
