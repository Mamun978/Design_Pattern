package University;

import java.util.ArrayList;
import java.util.List;

public class Notification {
    
    List<Observer> observers=new ArrayList<>();
    
    protected String state;
    
    public String getState() {
        return state;

    }
    
    // public void setState(String state) {
    //     this.state = state;
    //     notifyAllObserver();
    //}
    
    public void setState(String state) {
        this.state = state;
        notifyAllObserver();
        
    }


    

    public void addObserver(Observer observer){
        observers.add(observer);

    }
    // public void removeObserver(Observer observer){
    //     observers.remove(observer);

    // }

    public  void notifyAllObserver(){
        for(Observer observer : observers){
            observer.message();
        }
    }

    //  public void sentNotification(String state){
    //      this.state=state;
    //      notifyAllObserver();
    //  }

}
