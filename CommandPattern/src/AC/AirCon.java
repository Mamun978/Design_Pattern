package AC;

public class AirCon {
    private boolean on;
    private int temp;

    public  AirCon(){
        this.on=false;
        this.temp=18;
    }
    public void toggleSwitch(){
        this.on=!this.on;

    }

    public  void increaseTemp(){
        if(this.temp==30)
            return;
     else
        this.temp=this.temp+1;
    }

    public void decreaseTemp(){
        if(this.temp==10)
            return;
        else
        this.temp=this.temp-1;
    }
    public String toString(){
        return "Power Status: "+this.on +" Temperature: "+this.temp;
    }

}
