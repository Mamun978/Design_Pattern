package Meta;

public class Facebook extends Observer {
    
  
    public void subscribeToMeta(Meta m){
        this.meta=m;
    }

    @Override
    public void notification() {
        System.out.println("Feature "+meta.feature+" has been uploaded for Facebook");
        
    }


}
