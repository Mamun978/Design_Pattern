package YoutubeSubscribe2;

public class test {
    public static void main(String[] args) {

        Channel tsports=new Channel();
        Subscriber s1=new Subscriber("Mamun");
        Subscriber s2=new Subscriber("A");
        Subscriber s3=new Subscriber("B");
        Subscriber s4=new Subscriber("C");

        tsports.addSubscriber(s1);
        tsports.addSubscriber(s2);
        tsports.addSubscriber(s3);
        tsports.addSubscriber(s4);
        s1.subscribeChannel(tsports);
        s2.subscribeChannel(tsports);
        s3.subscribeChannel(tsports);
        s4.subscribeChannel(tsports);

        tsports.upload("Implement Spring Security with jSON web token");
    }
}
