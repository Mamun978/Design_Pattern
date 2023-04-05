package ProxyAndFactory;

public class DarazServiceProxyImpl implements DarazService{

    private DarazService darazService;
    private float discount;
    float totalBillAfterDiscount;



    public DarazServiceProxyImpl(float discount){
        darazService=new DarazRealServiceImpl(); //using real object for proxy
        this.discount=discount;
    }

    @Override
    public Float buyProducts(String[] products, float [] prices) {
        float totalBill=0;

        for (float price:prices) {
           totalBill=totalBill+price;
        }


        return totalBillAfterDiscount=totalBill- totalBill*discount/100;
    }


}
