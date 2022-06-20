package Meta;

public class Main {
    
   public static void main(String []args){

    Meta meta1=new Meta();

    WhatsApp wt=new WhatsApp();
    wt.subscribeToMeta(meta1);
    meta1.addObserver(wt);
    meta1.uploadFeature("Post");

     Meta meta2=new Meta();
    
    Facebook fb=new Facebook();
    fb.subscribeToMeta(meta2);
    meta2.addObserver(fb);
    meta2.uploadFeature("Angry React");

    Meta meta3=new Meta();
    
    Instagram insta=new Instagram(meta3);
   // insta.subscribeToMeta(meta1);
    meta3.addObserver(insta);
    meta3.uploadFeature("Video call");
    
      
    // Observer observer1=new Facebook(meta);
    // observer1.meta.setFeature("Angry React");
    // observer1.notification();


    
    
    // Observer observer2=new Instagram(meta);
    // observer2.meta.setFeature("Video Chat");
    // observer2.notification();

 
    
   }


    


}
