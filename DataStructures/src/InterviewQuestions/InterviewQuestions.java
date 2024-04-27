/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InterviewQuestions;

import java.math.BigInteger;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author JCSchneider
 */
public class InterviewQuestions {

    public static void main(String[] args) {

        String sample = "Red roses run no risk, sir, on Nurse’s order. ";
        //String sample = "A man, a plan, a canal, Panama!";
        //String sample ="Dennis and Edna sinned.";

        System.out.println("Is " + sample + " a palindrome? " + isPalindrome(sample));
        System.out.println(isPalindrome(sample));

        int n = 10;

        System.out.println("Factorial " + factorial(n));
        for (int i = 0; i < 10; i++) {
            System.out.println("ChessBoard(" + i + ") " + chessBoard(i));
        }
        int i = 31;
        System.out.printf("ChessBoard(%d) %,d\n", i, chessBoard(i));
        i = 63;
        System.out.printf("ChessBoard(%d) %,d\n", i, chessBoard(i));        

        //System.out.println("getFactors(3600) " + getFactors(3600));
        //System.out.println("fibonacci(10) " + fibonacci(10));
        for (int a = 5; a < 20; a += 3) {
            System.out.println("Is " + a + " prime? " + isPrime(a));
        }
        System.out.println(stringContainsVowels("MVP"));
        System.out.println(stringContainsVowels("I am having a great day!"));
    }

    private static BigInteger factorial(int n) {
        BigInteger retVal = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            retVal = retVal.multiply(BigInteger.valueOf(i));
        }
        return retVal;
    }

    private static BigInteger chessBoard(int n) {
        BigInteger retVal = BigInteger.ZERO;
        //BigInteger buffer = BigInteger.TWO;
        BigInteger buffer = BigInteger.valueOf(2L);
        //int retVal = 0;
        for (int counter = 0; counter <= n; counter++) {
            retVal = retVal.add(buffer.pow(counter));
        }
        return retVal;
    }

    private static List<Integer> getFactors(int aNumber) {
        List<Integer> retVal = new LinkedList<>();
        for (int i = 1; i < aNumber; i++) {
            if (aNumber % i == 0) {
                retVal.add(i);
            }
        }
        retVal.add(aNumber);
        return retVal;
    }

    private static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    private static Deque<Character> fillStack(String inputString) {
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
    private static String buildReverse(String inputString) {
        Deque<Character> charStack = fillStack(inputString);
        StringBuilder result = new StringBuilder();
        while (!charStack.isEmpty()) {
            //Remove top item from stack and append it to result
            result.append(charStack.pop());
        }
        return result.toString();
    }

    public static boolean isPalindrome(String inputString) {
        inputString = inputString.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(inputString);
        System.out.println(buildReverse(inputString));
        return inputString.equalsIgnoreCase((buildReverse(inputString)));
    }

    private static boolean isPrime(int n) {
        if (n == 0 || n == 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n) + 1; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static boolean stringContainsVowels(String str) {
        return str.toLowerCase().matches(".*[aeiou].*");
    }

    /**
     * private static String reverse(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Null is not a valid entry.");
        }
        StringBuilder out = new StringBuilder();
        char[] chars = str.toCharArray();
        for (int i = chars.length - 1; i >= 0; i--) {
            out.append(chars[i]);
        }
        return out.toString();
    }
    *
     * @param a
     * @param b */
    public static void TwoNumberSwap(int a, int b) {
        b = b + a; //b sum of both numbers
        a = b - a; // b - a = (b + a) - a = b (a is swapped)
        b = b - a;// (b + a) - b = a (b is swapped)
        System.out.printf("a = %d b = %d", a, b);
        System.out.println("");
    }
}
