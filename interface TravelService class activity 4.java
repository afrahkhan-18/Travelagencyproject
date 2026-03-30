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
import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayList<FlightTrip> trips = new ArrayList<>();

        // Add trips
        trips.add(new FlightTrip("FT001"));
        trips.add(new FlightTrip("FT002"));

        
        for (FlightTrip t : trips) {
            t.displayItinerary();
        }

        // save to file
        saveTrips(trips);

        // load
        ArrayList<FlightTrip> loadedTrips = loadTrips();

        System.out.println("\nLoaded Trips:");
        for (FlightTrip t : loadedTrips) {
            System.out.println(t.getTripID());
        }
    }

    // save
    public static void saveTrips(ArrayList<FlightTrip> trips) {
        try {
            java.io.FileWriter writer = new java.io.FileWriter("trips.txt");

            for (FlightTrip t : trips) {
                writer.write(t.getTripID() + "\n");
            }

            writer.close();
            System.out.println("Trips saved!");
        } catch (Exception e) {
            System.out.println("Error saving file.");
        }
    }

    public static ArrayList<FlightTrip> loadTrips() {
        ArrayList<FlightTrip> trips = new ArrayList<>();

        try {
            java.io.File file = new java.io.File("trips.txt");
            Scanner reader = new Scanner(file);

            while (reader.hasNextLine()) {
                String id = reader.nextLine();
                trips.add(new FlightTrip(id));
            }

            reader.close();
        } catch (Exception e) {
            System.out.println("No file found.");
        }

        return trips;
    }
}

