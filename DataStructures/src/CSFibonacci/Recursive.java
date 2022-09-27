/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSFibonacci;

/**
 *
 * @author JCSchneider
 */
public class Recursive {
    public static long fibonacci(long n){
        if(n==0){
            return 0L;
        }else if(n==1){
            return 1L;            
        }else{
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
    
    /**
     * Recursive method length2.
     * @param str
     * @return The length of the string
     */
    public static int length2(String str){
        if(str==null || str.isEmpty()){
            return 0;
        }else{
            return 1 + length2(str.substring(1));
        }        
    }
    
    public static void printChars(String str){
        if(str==null||str.isEmpty()){
            return;            
        }else{
            System.out.println(str.charAt(0));
            printChars(str.substring(1));
        }
    }
    
    public static void revPrintChars(String str){
        if(str==null||str.isEmpty()){
            return;            
        }else{
            revPrintChars(str.substring(1));
            System.out.println(str.charAt(0));
        }
    }
    
    
    public static void main(String[] args) {
        for (int runCount = 0; runCount <= 35; runCount++) {
            System.out.print(String.format("Value of %dth number in fibonacci series -> ", runCount));
            long startTime, endTime;
            double duration;
            startTime = System.nanoTime();
            System.out.print(fibonacci(runCount) + "\t");
            endTime = System.nanoTime();
            duration = (endTime - startTime) / 1000000.0;
            System.out.println(" Duration: " + duration);
        }
        String name = "Jeff Schneider";
            System.out.println(length2(name));
            printChars(name);
            revPrintChars(name);

    }
}
