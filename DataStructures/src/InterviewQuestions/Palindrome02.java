/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InterviewQuestions;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 *
 * @author JCSchneider
 */
public class Palindrome02 {
    public static void main(String[] args) {
        //String sample = "Red roses run no risk, sir, on Nurse’s order. "; 
        //String sample = "A man, a plan, a canal, Panama!";
        String sample ="Dennis and Edna sinned.";
        sample = sample.replaceAll("[^a-zA-Z0-9]", ""); 
        System.out.println(isPalindrome(sample));
    }
    
    private static Deque<Character> fillStack(String inputString){
        Deque<Character> charStack = new ArrayDeque<>();
        for (int i = 0; i < inputString.length(); i++) {
            charStack.push(inputString.charAt(i));
        }
        return charStack;
    }
    
    /**
     * @post the stack is empty
     * @param inputString
     * @return the string containing the characters in the stack
     * 
     */
    private static String buildReverse(String inputString){
        Deque<Character> charStack = fillStack(inputString);
        StringBuilder result = new StringBuilder();
        while (!charStack.isEmpty()) {
            //Remove top item from stack and append it to result
            result.append(charStack.pop());
        }
        return result.toString();
    }
    
    public  static boolean isPalindrome(String inputString){
        System.out.println(inputString);
        System.out.println(buildReverse(inputString));
        return inputString.equalsIgnoreCase((buildReverse(inputString)));
    }
    
    
}
