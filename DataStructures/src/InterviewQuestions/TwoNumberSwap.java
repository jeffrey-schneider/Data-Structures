/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
https://www.digitalocean.com/community/tutorials/java-programming-interview-questions
 */
package InterviewQuestions;

/**
 *
 * @author JCSchneider
 */
public class TwoNumberSwap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        TwoNumberSwap(a, b);
        
        
        
        //b = b + a; //b sum of both numbers
        //a = b - a; // b - a = (b + a) - a = b (a is swapped)
        //b = b - a;// (b + a) - b = a (b is swapped)
        //System.out.printf("a = %d b = %d", a, b);
        //System.out.println("");
    }

    public static void TwoNumberSwap(int a, int b) {
        b = b + a; //b sum of both numbers
        a = b - a; // b - a = (b + a) - a = b (a is swapped)
        b = b - a;// (b + a) - b = a (b is swapped)
        System.out.printf("a = %d b = %d", a, b);
        System.out.println("");
    }
        
    
}
