package YoutubeSubscribe2;

public class Subscriber {
    private String name;
    protected Channel channel;
    public void update(){
        System.out.println("Hey "+ name +"" +channel.getTitle()+  " Video uploaded" );
    }

    public Subscriber(String name){
       this.name=name;
    }
    public void subscribeChannel(Channel ch){
        channel=ch;
    }
}
