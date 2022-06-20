package YoutubeSubscribe;

import java.util.ArrayList;
import java.util.List;

public class Channel {

    List<Subscriber> subscribers=new ArrayList<>();


    public String title;


    public void setTitle(String title) {
        this.title = title;
    }

    public void addSubscriber(Subscriber subscriber){
        subscribers.add(subscriber);
    }

    public void removeSubscriber(Subscriber subscriber){
        subscribers.remove(subscriber);
    }

    public void notfyAllSubscriber(){
        for(Subscriber subscriber : subscribers){
            subscriber.update();
        }
    }

    public  void upload(String title){
        this.title=title;
        notfyAllSubscriber();
    }
}
