package prac;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
    List<Momento> momentoList=new ArrayList<Momento>();
    public void addMomento(Momento m){
        momentoList.add(m);
    }

    // public String getMomento(){
    //     int index=momentoList.size()-1;
    //     return momentoList.get(index).getState();
    // }
    public void previousMomento(){

        for(Momento m : momentoList)
        {
            System.out.println(m.getState());
        }
    }

}
