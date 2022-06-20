package AC;

public class IncreaseTemp implements Command {
    public AirCon ac;
   public IncreaseTemp(AirCon ac){
       this.ac=ac;
   }
    @Override
    public void executeCommand() {
        ac.increaseTemp();
    }

}
