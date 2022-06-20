public class Flight implements Command {
 
    public String id;
    private Atc atcMediator;

    Flight(Atc atc, String id){
        this.atcMediator=atc;
        this.id=id;
    }

    @Override
    public void land() {
      
        if(atcMediator.isAvailable()){
            System.out.println(this.id+" Flight landed succesfully");
            atcMediator.setAvailability(false);//Runway is occupied
        }

        else{
            System.out.println("Runway is busy ");
        }
        
    }

    public void readyToLand(){
        System.out.println("Landing Initiated");
    }

    public void parked(){
        System.out.println(this.id+" is Parked");
        atcMediator.setAvailability(true);
    }
    
}
