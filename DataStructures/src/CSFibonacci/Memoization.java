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
public class Memoization {

   public static long fibArray[] = new long[200];

    public static long fibonacci(int n) {
        long fibValue = 0L;
        if (n == 0) {
            return 0L;
        } else if (n == 1) {
            return 1L;
        } else if (fibArray[ n] != 0L) {
            return fibArray[n];
        } else {
            fibValue = (fibonacci(n - 1) + fibonacci(n - 2));
            fibArray[n] = fibValue;
            return fibValue;
        }
    }

    public static void main(String[] args) {
        fibArray[0] = 1;
        fibArray[1] = 1;        

        for (int runCount = 0; runCount <= 87; runCount++) {
            System.out.print(String.format("Value of %dth number in fibonacci series -> ", runCount));
            long startTime, endTime;
            double duration;
            startTime = System.nanoTime();
            System.out.print(" " + fibonacci(runCount) + "\t");
            endTime = System.nanoTime();
            duration = (endTime - startTime) / 1000000.0;
            System.out.println(" Duration: " + duration);
            
        }
            }
    
    
}
