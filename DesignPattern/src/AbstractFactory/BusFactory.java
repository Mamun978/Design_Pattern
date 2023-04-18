package AbstractFactory;

public class BusFactory implements AbstractFactory {
    @Override
    public Vehicle getVehicles(String vehicleName) {
        Vehicle vehicle=null;
                if(vehicleName.equalsIgnoreCase("Scania")){
                    vehicle=  new Scania();
                }

                if(vehicleName.equalsIgnoreCase("Man")){
                    vehicle=  new Man();
                }


                return vehicle;

    }

//            public Vehicle getVehicles(String vehicleName){
//                Vehicle vehicle=null;
//                if(vehicleName.equalsIgnoreCase("Scania")){
//                    vehicle=  new Scania();
//                }
//
//                if(vehicleName.equalsIgnoreCase("Man")){
//                    vehicle=  new Man();
//                }
//                else{
//                    System.out.println("Enter valid bus name");
//                }
//
//                return vehicle;
//
//            }


}
