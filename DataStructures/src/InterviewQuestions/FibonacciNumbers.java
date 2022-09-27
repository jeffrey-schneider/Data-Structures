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
public class FibonacciNumbers {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(fibonacci(n));
    }

    private static int fibonacci(int n) {
        if(n<=1)
            return n;
        return fibonacci(n -1) + fibonacci(n-2);
    }
}
