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
public class StringContainsVowels {
    public static void main(String[] args) {
        System.out.println(stringContainsVowels("Hello"));
        System.out.println(stringContainsVowels("TV"));
        
        
    }

    private static boolean stringContainsVowels(String str) {
        return str.toLowerCase().matches(".*[aeiou].*");
    }
}
