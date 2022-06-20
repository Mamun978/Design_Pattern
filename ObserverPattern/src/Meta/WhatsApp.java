package Meta;

public class WhatsApp extends Observer {

    

    public void subscribeToMeta(Meta m){
        this.meta=m;
    }

    @Override
    public void notification() {
        System.out.println("Feature "+meta.feature+" has been uploaded for WhatsApp");
        
    }

 
    
}
