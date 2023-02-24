/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSQueue;

//import static FlightApplication.BaseFlight.FuelComparator;
import CSFlightApplication.AltitudeComparator;
import CSFlightApplication.CommercialFlight;
import CSFlightApplication.FuelComparator;
//import static FlightApplication.CommercialFlight.PassengerComparator;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 *
 * @author JCSchneider
 */
public class PriorityQueueTest {

    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();
        pq.add(50);
        pq.add(75);
        pq.add(1);
        pq.add(25);

        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }

//        FuelComparator comparator = new FuelComparator();
        AltitudeComparator comparator = new AltitudeComparator();
        PriorityQueue<CommercialFlight> flights = new PriorityQueue<CommercialFlight>(comparator);
        CommercialFlight comm1 = new CommercialFlight(25, 250, "AA123", "XYZ",
                "DTW", 52, 450, 35.66, -135, "737", 35000, 90, 3000);
        flights.add(comm1);
        flights.add(new CommercialFlight(5, 350, "AAA568", "QQQ", "DTX", 52, 350, 35.75, -130, "767", 25000, 2700, 20000));
        flights.add(new CommercialFlight(15, 250, "Plane3", "RRR", "DTX", 50, 250, 35.00, -130.45, "777", 15000, 300, 10000));

        while (!flights.isEmpty()) {
            System.out.println(flights.poll());
        }
    }
}
