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
    import java.util.Scanner; // for dynamic input

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("--- Travel Agency System ---");

      
        try {
            System.out.print("Enter your Trip ID: ");
            String id = scanner.nextLine(); // DYNAMIC INPUT 
            FlightTrip trip = new FlightTrip(id);

            System.out.println("\n--- Trip Details ---");
            trip.displayItinerary();
            System.out.println("Price: " + trip.calculatePrice());
            System.out.println("Service: " + trip.getServiceDetails());

        } catch (Exception e) {
           
            System.out.println("Error: Something went wrong with your input.");
        } finally {
    
            scanner.close();
            System.out.println("Thank you for using our system.");
        }
    }
}
interface TravelService {
    double calculatePrice();
    String getServiceDetails();
}

abstract class Trip {
    private String tripID;
    public Trip(String tripID) { this.tripID = tripID; }
    public String getTripID() { return tripID; }
    public abstract void displayItinerary();
}

class FlightTrip extends Trip implements TravelService {
    public FlightTrip(String id) { super(id); }
    public void displayItinerary() { 
        System.out.println("Flight Itinerary for " + getTripID()); 
    }
    public double calculatePrice() { return 100.0; }
    public String getServiceDetails() { return "Flight Trip"; }
}

