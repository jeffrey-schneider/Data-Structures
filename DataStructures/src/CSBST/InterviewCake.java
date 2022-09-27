/*
 * Copyright (C) 2021 JCSchneider
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */
package CSBST;

import CSFibonacci.Memoization;
import CSFibonacci.Recursive;
/**
 *
 * @author JCSchneider
 * Works Referenced:
 * https://www.interviewcake.com/article/java/big-o-notation-time-and-space-complexity
 */
public class InterviewCake {
    public static void main(String[] args) {
        int x = 1000;
        int[] theArray = new int[x];
        for (int i = 0; i < x; i++) {
            theArray[i] = x - i;
        }
        
        //Constant Time
        long startTime;
        long endTime;
        double duration;
        
        startTime = System.nanoTime();
        constantTime(theArray);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000000.0;        
        System.out.println("Duration: " + duration);
        
        startTime = System.nanoTime();
        linearTime(theArray);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000000.0;        
        System.out.println("Duration: " + duration);
        
        
        
        startTime = System.nanoTime();
        O_N_Squared(theArray);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000000.0;        
        System.out.println("Duration: " + duration);
        
        startTime = System.nanoTime();
        O_N_Cubed(theArray);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000000.0;        
        System.out.println("Duration: " + duration);
        
        
//        for (int i = 0; i <= 45; i++) {        
//        startTime = System.nanoTime();
////        System.out.println("O(2^n)" + i + " "  + Recursive.fibonacci(i));
//        endTime = System.nanoTime();
//        duration = (endTime - startTime) / 1000000.0;        
//        System.out.println("Duration: " + duration);
//        }
//        
//        //Memoization
//        for (int i = 0; i <= 75; i++) {        
//        startTime = System.nanoTime();
////        System.out.println("Memoization " + i + " "  + Memoization.fibonacci(i));
//        endTime = System.nanoTime();
//        duration = (endTime - startTime) / 1000000.0;        
//        System.out.println("Duration: " + duration);
//        }
    }

    /**
     * O(1) time
     * @param theArray 
     */
    private static void constantTime(int[] theArray) {
        System.out.println("Constant time: " + theArray[0]);
    }

    /**
     * O(n)
     * @param theArray 
     */
    private static void linearTime(int[] theArray) {
        long retVal = 0L;
        for (int i = 0; i < theArray.length -1; i++) {
            retVal += theArray[i];
        }
        System.out.println("Linear Time: " + theArray.length + " " +  retVal);
    }

    /**
     * O(n^2) Time
     * @param theArray 
     */
    private static void O_N_Squared(int[] theArray) {
        long retVal = 0L;
        for (int firstItem : theArray) {
            for (int secondItem : theArray) {
                retVal += firstItem + secondItem;
            }
        }
        System.out.println("O(n^2) time: " + theArray.length + " " + retVal);
    }

    private static void O_N_Cubed(int[] theArray) {
        long retVal = 0L;
        for (int firstItem : theArray) {
            for (int secondItem : theArray) {
                for (int thirdItem : theArray) {
                    retVal += firstItem + secondItem + thirdItem;
                }
            }
        }
        System.out.println("O(n^3) time: " + theArray.length + " " + retVal);
    }
    
    private static int O_2_Nth(int num){
        if (num <= 1) {
            return num;
        }
        return O_2_Nth(num - 2) + O_2_Nth(num - 1);
    }
    
    
    
}
