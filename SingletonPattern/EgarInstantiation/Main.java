package EgarInstantiation;

public class Main {
    
    public static void main(String[] args) {
        
        SingleTon s1=SingleTon.getSingletonObject();

        SingleTon s2= SingleTon.getSingletonObject();

        if(s1==s2){
            System.out.println("same");
        }
        else{
            System.out.println("not same");
        }
    }
}
