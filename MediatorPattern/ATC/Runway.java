public class Runway implements Command {

    private Atc atcMediator;
     String runwayName;


    Runway(Atc atc, String runwayName){
        this.atcMediator=atc;
        this.runwayName=runwayName;
    }

    @Override
    public void land() {
       System.out.println(this.runwayName+" runway is available");
        atcMediator.setAvailability(true);
    }
    
}
