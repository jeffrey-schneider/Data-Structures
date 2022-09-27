package CSQueue;

//import FlightApplication.CommercialFlight;
import CHFlightApplication.CommercialFlight;
import java.util.ArrayList;

/**
 *
 * @author JCSchneider
 */
public class LinkedQueueTest {

    public static void main(String[] args) {
        LinkedQueue queue = new LinkedQueue();

        for (int i = 0; i < 10; i++) {
            queue.enqueue(i);
        }
        
        System.out.println(queue.toString() + "\n");

        while (!queue.isEmpty()) {
            System.out.println("Peeking: " + queue.peek());
            System.out.println(queue.toString() + "\n");
            queue.dequeue();
        }
//
        LinkedQueue<CommercialFlight> flights = new LinkedQueue<CommercialFlight>();

        ArrayList<String> crew = new ArrayList<String>();
        crew.add("Bob");
        crew.add("Ted");
        crew.add("Carole");
        crew.add("Alice");

        CommercialFlight airplane1 = new CommercialFlight(25, 250, "AA123", "XYZ",
                "DTW", 52, 450, 35.66, -135, "737", 35000, 90, 30000);
        flights.enqueue(airplane1);

        flights.enqueue(new CommercialFlight(25, 250, "ZZ987", "CHA",
                "DTW", 99, 450, 35.56, -135.01, "747", 25000, 190, 20000));

        while (!flights.isEmpty()) {
            System.out.println(flights);
            flights.dequeue();
        }
        System.out.println("Done");

    }

}
