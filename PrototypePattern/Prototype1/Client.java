package Prototype1;

import java.util.List;

public class Client {

    public static void main(String[] args) throws CloneNotSupportedException  {
        Flight flight=new Flight();

        flight.loadDefaultFlight();

        Flight morningFlights= flight.clone();

        List<String> morningflightList= morningFlights.getDefaultFlightList();
        morningflightList.add("Emiret");

        Flight nightFlights=(Flight) flight.clone();
        List<String> nightFlightList=nightFlights.getDefaultFlightList();
        nightFlightList.remove("Bangladesh Airline");

        System.out.println("Default Flight list:"+flight.getDefaultFlightList());
        System.out.println("Morning flights: "+morningFlights.getDefaultFlightList());
        System.out.println("Night flight list: "+nightFlights.getDefaultFlightList());
        System.out.println("Default Flight list:"+flight.getDefaultFlightList());
    }
}
