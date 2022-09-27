/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSArrayList;

/**
 *
 * @author jeffrey.schneider
 */
public class CSArrayListTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CSArrayList list = new CSArrayList();
        System.out.println("Is empty: " + list.isEmpty());
        int counter = 0;
        
        long startTime = System.nanoTime();
        
        while(counter < 10){
            list.add(counter);
            counter++;
        }
        
         System.out.println("Is empty: " + list.isEmpty());
//        
        long elapsedTime = (System.nanoTime() - startTime);
        double printElapsed = (double)elapsedTime * 0.000000001;
        System.out.println("Elapsed Time: " + printElapsed);
        
        System.out.println(list.get(5));
        list.add(5,999);
        System.out.println(list.get(5));
        System.out.println(list.remove(4));
        System.out.println("Contains 999: " + list.contains((Integer)999));
        System.out.println("Contains 998: " + list.contains((Integer)998));
//        
        list.printAll();
//         
        System.out.println("size: " + list.length());
//        
        for (Object object : list) {
            System.out.println(object);
        }
        
        CSArrayList names = new CSArrayList();
        names.add("Jeff");
        names.add("Penni");
        names.add("Jeffrey");
        names.add("Dawn");
        names.add("Jeremy");
        for (Object name : names) {
            System.out.println(name);
        }
    }
}
