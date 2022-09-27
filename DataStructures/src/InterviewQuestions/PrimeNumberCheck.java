/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
https://www.digitalocean.com/community/tutorials/java-programming-interview-questions;'
 */
package InterviewQuestions;

/**
 *
 * @author JCSchneider
 */
public class PrimeNumberCheck {
    public static void main(String[] args) {
        System.out.println(isPrime(19)); //true
        System.out.println(isPrime(49)); //false
    }

    private static boolean isPrime(int n) {
        if(n==0 || n == 1){
            return false;            
        }
        if(n==2){
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n)+1; i++) {
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
    
    
}
