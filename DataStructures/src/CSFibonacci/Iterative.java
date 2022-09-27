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
public class Iterative {
    
    public static void main(String[] args) {
        int length = 50;
        IterativeStyle(length);
    }
    
    public static void IterativeStyle(int length){
        long a = -1L;
        long b = 1L;
        long c = 0L;
        for (int i = 0; i < length; i++) {
            c = a+b;
            System.out.println(c + ", ");
            a = b;
            b = c;            
        }
    }
    
}
