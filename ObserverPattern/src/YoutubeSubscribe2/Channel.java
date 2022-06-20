package YoutubeSubscribe2;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Notification{

    List<Subscriber> subscribers=new ArrayList<>();
    private String title;

    public String getTitle() {
        return title;
    }


    @Override
    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void unSubscribe(Subscriber subscriber) {
   subscribers.remove(subscriber);
    }

    @Override
    public void notifyAllSubscriber() {
        for(Subscriber subscriber : subscribers){
            subscriber.update();
        }
    }
    public  void upload(String title){
        this.title=title;
        notifyAllSubscriber();
    }
}
