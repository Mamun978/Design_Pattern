package AC;

public class DecreaseTemp implements Command {
    public AirCon ac;

    public DecreaseTemp(AirCon ac){
        this.ac=ac;

    }
     @Override
    public void executeCommand() {
      ac.decreaseTemp();
    }


}
