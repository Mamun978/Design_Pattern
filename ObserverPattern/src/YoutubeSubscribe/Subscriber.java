package YoutubeSubscribe;

public class Subscriber {
   private String name;
   private Channel channel;

   public Subscriber(String name){
      this.name=name;
   }
   public void update(){
      System.out.println("Hey "+name +" "+ channel.title +" "+"Video Uploaded");
   }
   public void subscribeChannel(Channel ch){
     channel=ch;
   //   ch.addSubscriber(this);

   }
}
