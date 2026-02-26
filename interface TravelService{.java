 interface TravelService{
        double CalculatePrice();
        String getServiceDetails();
    }
    interface Bookable {
        void confirmBOOKING;();
    }
    
    //abstract classes
    abstract class Trip {
        private String tripID; //encapsuation
        public Trip(String tripID) {
             this.tripID = tripID;
             }
    
    public String getTripID() {
         return tripID;
         }
    public abstract void displayItinerary()
    }

// Concrete classes 
class FlightTrip extends Trip implements TravelService {
    public FlightTrip(String id) { 
        super(id);
     }
    public void displayItinerary() { 
        System.out.println("Flight Itinerary for " + getTripID());
     }
    public double calculatePrice() { 
        return 100;
     }
    public string getServiceDetails() {
         return "Flight Trip";
         }
}
// THE MAIN CLASS
public class Main {
    public static void main(String[] args) {
        System.out.println("Running Travel Agency System...");
        FlightTrip trip = new FlightTrip ("FT111") ;

        trip.displayItinerary ();
        System.out.println ("Price" + trip.CalculatePrice());
        System.out.println(trip.getServiceDetails());
    }
    } 

