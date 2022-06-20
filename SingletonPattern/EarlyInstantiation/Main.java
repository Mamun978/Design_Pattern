package EarlyInstantiation;

public class Main {
    public static void main(String[] args) {
        
        Singleton s=Singleton.getSingletonObject();

        Singleton s2=Singleton.getSingletonObject();

        if(s==s2){
            System.out.println("Object are same");
            //Object are same that means we could not creat a 2nd object
        }
        else{
            System.out.println("Not same");
        }
        //s.show();

    }
}
