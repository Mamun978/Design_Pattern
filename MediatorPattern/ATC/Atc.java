import java.util.ArrayList;
import java.util.List;

public class Atc implements IAtc {

    List<Flight> flights=new ArrayList<>();
    List<Runway> runways=new ArrayList<>();
    public Boolean available;

    @Override
    public void registerFlight(Flight f) {
       
        flights.add(f);
    }

    @Override
    public void registerRunway(Runway r) {
        runways.add(r);
        
    }

    @Override
    public void setAvailability(Boolean status) {
        this.available=status;
        
    }

    @Override
    public Boolean isAvailable() {
        
        return available;
    }
    
}
