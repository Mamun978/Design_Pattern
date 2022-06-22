public class Nokia extends Device {
    
    public String ram;
    public String processor;
    

    public Nokia(String ram, String processor){
        this.ram=ram;
        this.processor=processor;
       

    }



    @Override
    public String getDetails() {
        
        return "Nokia configuration ram size is: "+this.ram+ "Processor type is : "+this.processor;
    }



    @Override
    public String toString() {
        return "Nokia [processor=" + processor + ", ram=" + ram + "]";
    }
}
