public class Lenevo extends Device  {
    

    public String ram;
    public String processor;
    public String gpu;

    public Lenevo(String ram, String processor, String gpu){
        this.ram=ram;
        this.processor=processor;
        this.gpu=gpu;

    }



    @Override
    public String getDetails() {
        
        return "Lenevo configuration ram size is: "+this.ram+ "Processor type is : "+this.processor+ "gpu configuration: "+this.gpu;
    }



    @Override
    public String toString() {
        return "Lenevo [gpu=" + gpu + ", processor=" + processor + ", ram=" + ram + "]";
    }

}
