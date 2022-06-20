public class Mobile implements Item {

    private String brandName;
    private int price;
    private String brandModel;
    private int quantity;

    public Mobile(String brandName, int price, String brandModel) {
        this.brandName = brandName;
        this.price = price;
        this.brandModel = brandModel;
    }

    public Mobile(String brandName, int price, String brandModel, int quantity) {
        this.brandName = brandName;
        this.price = price;
        this.brandModel = brandModel;
        this.quantity = quantity;
    }
    

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBrandModel() {
        return brandModel;
    }

    public void setBrandModel(String brandModel) {
        this.brandModel = brandModel;
    }

    @Override
    public int accept(ShoppingCartVisitor shoppingCartVisitor) {

        return shoppingCartVisitor.visit(this);
    }

}
