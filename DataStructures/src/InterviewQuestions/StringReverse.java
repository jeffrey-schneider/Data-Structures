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
public class StringReverse {

    public static void main(String[] args) {
        String str = "Jeff Schneider";
        System.out.println(reverse(str));
    }

    private static String reverse(String str) {
        if(str == null){
            throw new IllegalArgumentException("Null is not a valid entry.");            
        }
        StringBuilder out = new StringBuilder();
        char[] chars = str.toCharArray();
        for (int i = chars.length - 1; i >= 0; i--) {
            out.append(chars[i]);
        }
        return out.toString();
    }
    
}
