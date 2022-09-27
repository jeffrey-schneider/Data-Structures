/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSLinkedList;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author JCSchneider
 */
public class ListHomework {

    public static void main(String[] args) throws IOException {
        
        SingleLinkedList<Integer> MyList = new SingleLinkedList<>();
        
        //Path source = Paths.get("H:\\ChattState\\Courses\\SharedFiles\\IntegerLists\\1Kints.txt");
        Path source = Paths.get("C:\\Users\\jcschneider\\Downloads\\1Kints.txt");
        //Using scanner to read a file
        try( Scanner scanner = new Scanner(source)){
            scanner.useDelimiter("\n");
            while(scanner.hasNext()){
                MyList.add(Integer.parseInt(scanner.next().trim()));
            }         
            scanner.close();
        }
      
        //Another way to read the file:
//       File file = new File("F:\\ChattState\\Courses\\SharedFiles\\IntegerLists\\1Kints.txt");
//       BufferedReader br = new BufferedReader(new FileReader(file));
//        String st;        
//        try {
//            while ((st = br.readLine()) != null) {
//                //System.out.println(st);
//                try {                    
//                     //replaceAll removes the spaces from the file
//                     //parseInt() 10 means decimal
//                    MyList.add(Integer.parseInt(st.replaceAll("\\s", ""), 10 ));                                                   
//                } catch (Exception ex) {
//                    System.err.printf(st, args);
//                }                
//            }
//        } catch (IOException ex) {
//            System.err.println(ex);
//        }

        
        
        
        System.out.println("Size: " + MyList.getSize());
        System.out.println("Is number 3716 in the object? " + MyList.searchFor(3716));
        System.out.println("Is number 324110 in the object? " + MyList.searchFor(324110));
        System.out.println("Is number 5 in the object? " + MyList.searchFor(5));
        System.out.println("Is number 998473 in the object? " + MyList.searchFor(998473));
        
        ElementsStatistics(MyList);
    }

    private static void ElementsStatistics(SingleLinkedList<Integer> MyList) {
        SingleLinkedList<Integer> evenList = new SingleLinkedList<Integer>();
        SingleLinkedList<Integer> oddList = new SingleLinkedList<Integer>();        
        
        int bothTemp;
        int evenTally = 0;
        int oddTally = 0;
        int grandTotal = 0;
        int maxEven = Integer.MIN_VALUE;
        int minEven = Integer.MAX_VALUE;
        
        int maxOdd = Integer.MIN_VALUE;
        int minOdd = Integer.MAX_VALUE;
        
        int maxAll = Integer.MIN_VALUE;
        int minAll = Integer.MAX_VALUE;
        
            System.out.println("Even");            
            for (int i = 0; i < MyList.getSize(); i++) {
                bothTemp = MyList.get(i);
                grandTotal += bothTemp;
                 
                if (bothTemp %2 == 0) {
                    evenList.add(bothTemp);  
                    evenTally += bothTemp;
                    if(bothTemp > maxEven)
                        maxEven = bothTemp;
                    if(bothTemp < minEven)
                        minEven = bothTemp;
                }else{
                    oddList.add(bothTemp);
                    oddTally += bothTemp;
                    if(bothTemp > maxOdd)
                        maxOdd = bothTemp;
                    if(bothTemp < minOdd)
                        minOdd = bothTemp;
                }
                
                if(bothTemp > maxAll){
                    maxAll = bothTemp;
                }
                if(bothTemp < minAll){
                    minAll = bothTemp;
                }
            }
                      
            System.out.println("Even Max: " + maxEven);
            System.out.println("Even Min: " + minEven);
            System.out.println("Even Average: " + evenTally/evenList.size());
            
            System.out.println("Odd Max: " + maxOdd);
            System.out.println("Odd Min: " + minOdd);
            System.out.println("Odd Average: " + oddTally/oddList.size());
            
            System.out.println("Overall Max: " + maxAll);
            System.out.println("Overall Min: " + minAll);
            System.out.println("Overall Average: "  + grandTotal/MyList.size());

    }
}
