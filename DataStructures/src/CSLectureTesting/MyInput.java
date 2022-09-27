/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSLectureTesting;

import java.util.Scanner;

/**
 *
 * @author JCSchneider
 */
public class MyInput {
    
    public static int readInt(String prompt, int minN, int maxN){
        if(minN > maxN){
            throw new IllegalArgumentException("In readInt, minN " + minN + " not <= maxN " +maxN);
        }
        //Arguments are valid, read a number
        boolean inRange = false; //assume no valid number read
        int n = 0;
        Scanner in = new Scanner(System.in);
        while (!inRange) {
            try {
                System.out.println(prompt + "\nEnter an integer between " + minN + " and "+ maxN);
                String line = in.nextLine();
                n=Integer.parseInt(line);
                inRange = (minN <= n && n <= maxN);
            }catch(NumberFormatException ex){
                System.out.println("Bad numeric string - Try again.");
            }            
        }
        return n;
    }
}
