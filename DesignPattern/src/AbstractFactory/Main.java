package AbstractFactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        FactoryProducer factoryProducer=new FactoryProducer();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Factory Type: ");
        String factoryType=sc.next();
      AbstractFactory factory=  factoryProducer.getFactory(factoryType);
        System.out.println("Enter vehicle name: ");
        String vehicleName=sc.next();
       Vehicle vehicle= factory.getVehicles(vehicleName);
      vehicle.vehicleType();
      vehicle.vehicleDetails();




    }
}
