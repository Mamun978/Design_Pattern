package ProxyAndFactory;

public class DarazRealServiceImpl implements DarazService {
    @Override
    public Float buyProducts(String[] products, float [] prices) {

        float totalBill=0;

        for(float p:prices) {
            totalBill=totalBill+p;
        }
        return totalBill;

    }


}
