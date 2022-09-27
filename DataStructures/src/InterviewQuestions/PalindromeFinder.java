/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterviewQuestions;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 *
 * @author JCSchneider
 */
public class PalindromeFinder {
    /**
     * Class with methods to see if a string is a palindrome.
     * @param inputString   string to be checked
     * @return a stack of characters in inputString
     */
    private  Deque<Character> fillStack(String inputString){
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
    private  String buildReverse(String inputString){
        Deque<Character> charStack = fillStack(inputString);
        StringBuilder result = new StringBuilder();
        while (!charStack.isEmpty()) {
            //Remove top item from stack and append it to result
            result.append(charStack.pop());
        }
        return result.toString();
    }
    
    public  boolean isPalindrome(String inputString){
        return inputString.equalsIgnoreCase((buildReverse(inputString)));
    }
}
