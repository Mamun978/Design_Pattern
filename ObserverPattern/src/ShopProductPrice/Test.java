package ShopProductPrice;

public class Test {
    public static void main(String[] args) {
        Company SquarePhrama=new Company();
        Shop s1=new Shop("Noakhali Square Pharma");
        Shop s2=new Shop("Dhaka Square Pharma");
        Shop s3=new Shop("Rangpur Square Pharma");
        Shop s4=new Shop("Rajshahi Square Pharma");

        SquarePhrama.addShop(s1);
        SquarePhrama.addShop(s2);
        SquarePhrama.addShop(s3);
        SquarePhrama.addShop(s4);

        s1.subscribeCompany(SquarePhrama);
        s2.subscribeCompany(SquarePhrama);
        s3.subscribeCompany(SquarePhrama);
        s4.subscribeCompany(SquarePhrama);

        SquarePhrama.uploadProduct("Napa");
    }
}
