/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSStack;


import java.util.ArrayList;             //Needed for popAll().
import java.util.Iterator;
import java.util.List;

import CSFlightApplication.CommercialFlight;

/**
 *
 * @author JCSchneider
 */
public class LinkedStackTest {

    public static void main(String[] args) {

        LinkedStack stack = new LinkedStack();
        for (int i = 0; i < 10; i++) {
            stack.push(i);
        }

        
        System.out.println("Before isEmpty()? "+ stack.isEmpty());
        System.out.println("Let's popAll02()");        
        System.out.println(stack.popAll02());
        System.out.println("After isEmpty()? "+ stack.isEmpty());
        
        
        for (int i = 0; i < 10; i++) {
            stack.push(i);
        }
        System.out.println("Peek: " + stack.peek());

        while (!stack.isEmpty()) {
            System.out.println("Pop: " + stack.pop());
        }

        LinkedStack<CommercialFlight> flights = new LinkedStack<>();
        ArrayList<String> crew = new ArrayList<String>();
        crew.add("Bob");
        crew.add("Ted");
        crew.add("Carole");
        crew.add("Alice");

        CommercialFlight airplane1 = new CommercialFlight(25, 250, "AA123", "XYZ",
                "DTW", 52, 450, 35.66, -135, "737", 35000, 90, 30000);

        flights.push(airplane1);

        flights.push(new CommercialFlight(25, 250, "ZZ987", "CHA",
                "DTW", 99, 450, 35.56, -135.01, "747", 25000, 190, 20000));

        while (!flights.isEmpty()) {
            System.out.println(flights.pop());
        }
        
        LinkedStack<Integer> theStack = new LinkedStack<>();
        for (int i = 0; i < 10; i++) {
			theStack.push(i);			
		}

        System.out.println("Test of popAll()");
        List<Integer> theList = theStack.popAll();
        for (Integer integer : theList) {
			System.out.println(integer);
		}

    }

}
