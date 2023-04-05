package ProxyAndFactory;

public class Test {

    public static void main(String[] args) {


         String coupon="xyz";
        DarazService darazService= DarazFactory.getBill(coupon);
        System.out.println("real or proxy");
        System.out.println(darazService.getClass());
        float bill=    darazService.buyProducts(new String[]{"mobile", "laptop", "charger"}, new float[] {10000.0f,30000.0f,120.0f});


        System.out.println(bill);
        System.out.println("-------");


    }
}
