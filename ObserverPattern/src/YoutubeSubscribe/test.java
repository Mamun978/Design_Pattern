package YoutubeSubscribe;

public class test {
    public static void main(String[] args) {
        Channel Tsports=new Channel();
        Subscriber s1=new Subscriber("Mamun");
        Subscriber s2=new Subscriber("Rokon");
        Subscriber s3=new Subscriber("X");
        Subscriber s4=new Subscriber("Y");
        Subscriber s5=new Subscriber("Z");

        Tsports.addSubscriber(s1);
        Tsports.addSubscriber(s2);
        Tsports.addSubscriber(s3);
        Tsports.addSubscriber(s4);
        Tsports.addSubscriber(s5);

        Tsports.removeSubscriber(s3);

        s1.subscribeChannel(Tsports);
        s2.subscribeChannel(Tsports);
        s3.subscribeChannel(Tsports);
        s4.subscribeChannel(Tsports);
        s5.subscribeChannel(Tsports);

        Tsports.upload("Learn Observer design pattern in java ");

    }
}
