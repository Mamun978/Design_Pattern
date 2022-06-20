package AC;

public class TogglePower implements Command {
   public AirCon airCon;

   TogglePower(AirCon ac){
       this.airCon=ac;
   }
    @Override
    public void executeCommand() {
        this.airCon.toggleSwitch();
    }
}
