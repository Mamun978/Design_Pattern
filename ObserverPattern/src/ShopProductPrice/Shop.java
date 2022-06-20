package ShopProductPrice;

public class Shop {

    private  String shopName;
    private Company company;

    Shop(String shopName){
        this.shopName=shopName;
    }
     
    public void priceUpdate() {
        System.out.println(company.getProductName() + " Price updated to " + company.setPrice("10")+" in shop "+shopName);
    }

    public void subscribeCompany(Company com) {
        company = com;
    }
}
