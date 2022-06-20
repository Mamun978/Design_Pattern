package Meta;

import java.util.ArrayList;
import java.util.List;

public class Meta {
    protected String feature;

    List<Observer> observers = new ArrayList<>();

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;

    }

    public void addObserver(Observer ob) {
        this.observers.add(ob);
    }

    public void removeObserver(Observer ob) {
        this.observers.remove(ob);
    }

    public void notifyAllObserver() {

        for (Observer observer : observers) {
            observer.notification();
        }
    }

    public void uploadFeature(String feature) {
        this.feature = feature;
        notifyAllObserver();
    }

}
