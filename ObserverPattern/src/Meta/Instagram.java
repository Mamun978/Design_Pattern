package Meta;

public class Instagram extends Observer {
    
    // public void subscribeToMeta(Meta m){
    //     this.meta=m;
    // }
    
    Instagram(Meta m){
        this.meta=m;
        
    }

    @Override
    public void notification() {
        System.out.println("Feature "+meta.feature+" has been uploaded for Instagram");
        
    }


   
}
