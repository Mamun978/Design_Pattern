public class main {

    public static void main(String[] args) {
        
        Atc atcMediator=new Atc();
         Flight f1=new Flight(atcMediator, "111");

         Flight f2=new Flight(atcMediator, "222");

         Runway r1=new Runway(atcMediator, "abc");

         Runway r2=new Runway(atcMediator,  "xyz");

         atcMediator.registerFlight(f1);
         atcMediator.registerFlight(f2);

         atcMediator.registerRunway(r1);
         atcMediator.registerRunway(r2);

         f1.readyToLand();
         r1.land();
         f1.land();
        //  f1.parked();
         f2.land();


    }
}
