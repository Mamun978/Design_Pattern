public class BkashStrategy implements PaymentStrategy {

    @Override
    public void pay(int money) {
       
        System.out.println("Taka "+money+ " has paid using Bkash");
       
    }
    
}
