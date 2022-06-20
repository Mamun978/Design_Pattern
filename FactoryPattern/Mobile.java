public abstract class Mobile {
    

    public abstract String getCompanyName();

    public abstract double getPrice();


    public String toString(){
        return "Company: "+this.getCompanyName()+ " Price: "+this.getPrice();
    }
}
