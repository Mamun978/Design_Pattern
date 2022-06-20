package YoutubeSubscribe2;




public interface Notification {
    public  void addSubscriber(Subscriber subscriber);
    public  void unSubscribe(Subscriber subscriber);
    public void notifyAllSubscriber();
}
