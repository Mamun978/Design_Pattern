public class Samsung extends Device {
    public String ram;
    public String processor;
    

    public Samsung(String ram, String processor){
        this.ram=ram;
        this.processor=processor;
       

    }



    @Override
    public String getDetails() {
        
        return "Samsung configuration ram size is: "+this.ram+ "Processor type is : "+this.processor;
    }



    @Override
    public String toString() {
        return "Samsung [processor=" + processor + ", ram=" + ram + "]";
    }

}
