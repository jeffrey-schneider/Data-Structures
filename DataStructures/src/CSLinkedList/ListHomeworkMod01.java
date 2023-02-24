package CSLinkedList;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ListHomeworkMod01 {
	public static void main(String[] args) {
        SingleLinkedList<Integer> myList = new SingleLinkedList<>();        
        Path source = Paths.get("K:\\JCSCHNEIDER\\Courses\\SharedFiles\\IntegerLists\\16Kints.txt");
        //Using scanner to read file
        try(Scanner scanner = new Scanner(source)){
            scanner.useDelimiter("\n");
            while(scanner.hasNext()){
                myList.add(Integer.parseInt(scanner.next().trim()));
            }
            scanner.close();                       
        }
        catch(IOException ex){
            System.err.println(ex);
        }
        
        System.out.println("Size: " + myList.size());
        System.out.println("Is number 3716 in the object? " + myList.searchFor(3716));
        System.out.println("Is number 324110 in the object? " + myList.searchFor(324110));
        System.out.println("Is number 5 in the object? " + myList.searchFor(5));
        System.out.println("Is number 998473 in the object? " + myList.searchFor(998473));
        
        ElementStatistics(myList);
        
    }

    private static void ElementStatistics(SingleLinkedList<Integer> myList) {
        long startTime;
        long endTime;
        double duration;
        startTime = System.nanoTime();
        List<Integer> evenList = new LinkedList<>();
        List<Integer> oddList = new LinkedList<>();
        List<Integer> bothList = new LinkedList<>();        
        
        int evenSum = 0;
        int evenCounter = 0;
        int oddSum = 0;
        int oddCounter = 0;     
        int bothSum = 0;
        int bothCounter = 0;
        
        for(int i = 0; i < myList.size(); i++){
            bothSum += myList.get(i);
            bothCounter++;
            bothList.add(myList.get(i));
        }
       Collections.sort(bothList);
        
        int bothMin = bothList.get(0);
        int bothMax = bothList.get(bothList.size()-1);
        
        for(int i= 0; i < bothList.size(); i++){
            if(bothList.get(i) % 2 == 0){
                evenList.add(bothList.get(i));
                evenSum += bothList.get(i);                
            }else{
                oddList.add(bothList.get(i));
                oddSum += bothList.get(i);                
            }
        }
        
        int oddMin = oddList.get(0);
        int oddMax = oddList.get(oddList.size()-1);
        int oddAverage = oddSum / oddList.size();
        int evenMin = evenList.get(0);
        int evenMax = evenList.get(evenList.size()-1);
        int evenAverage = evenSum/ evenList.size();
        int bothAverage = bothSum/bothList.size()-1;
        
        System.out.printf("Odd:   %d   %d   %d\n", oddMin, oddMax, oddAverage);
        System.out.printf("Even:  %d   %d   %d\n", evenMin, evenMax, evenAverage);
        System.out.printf("All:   %d   %d   %d\n", bothMin, bothMax, bothAverage);
         endTime = System.nanoTime();
        duration = (endTime - startTime) / 1_000_000.0;  //microseconds
        System.out.println("Time to execute: " + duration);
    }
}
