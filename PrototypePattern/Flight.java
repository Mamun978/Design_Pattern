package PrototypePattern;

import java.util.ArrayList;
import java.util.List;

public class Flight implements  Cloneable {

    List<String> defaultFlightList;

    public Flight(){
        defaultFlightList=new ArrayList<String>();
    }

    public Flight(List<String> list){
        defaultFlightList=list;
    }

    public void loadDefaultFlight(){
        defaultFlightList.add("Qatar Airways");
        defaultFlightList.add("Bangladesh Airline");
        defaultFlightList.add("Indian Airline");
    }

    public  List<String> getDefaultFlightList(){
        return defaultFlightList;
    }


    @Override
    public Flight clone() {

        List<String> temp=new ArrayList<String>();

        for(String s: defaultFlightList){
            temp.add(s);
        }

        return new Flight(temp);
    }
}
