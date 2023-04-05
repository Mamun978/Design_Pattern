package ProxyAndFactory;

public class DarazFactory {



       public static DarazService getBill(String coupon){

           if(coupon.equalsIgnoreCase("")){
               return new DarazRealServiceImpl();
           }
           else if(coupon.equalsIgnoreCase("xyz")){
               return  new DarazServiceProxyImpl(20);
           }
           else if(coupon.equalsIgnoreCase("abc")){
               return  new DarazServiceProxyImpl(10);
           }
           else {
               return new DarazRealServiceImpl();
           }
       }
}
