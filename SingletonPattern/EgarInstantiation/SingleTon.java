package EgarInstantiation;

public class SingleTon {
    
    private static SingleTon instance;

    private SingleTon(){

    }
    
    public static SingleTon getSingletonObject(){
          
        if(instance==null){
            instance=new SingleTon();
        }

       return instance;

    }

}
