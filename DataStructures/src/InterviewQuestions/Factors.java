/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InterviewQuestions;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author JCSchneider
 */
public class Factors {
    
    public static void main(String[] args) {
        System.out.println(getFactors(60));        
        System.out.println(getFactors(600));        
        System.out.println(getFactors(6000));        
        System.out.println(getFactors(3600));        
        
        
    }

    private static List<Integer> getFactors(int aNumber) {
        List<Integer> retVal = new LinkedList<>();
        for(int i = 1; i < aNumber; i++){
            if(aNumber % i == 0){
                retVal.add(i);
            }            
        }
        retVal.add(aNumber);
        
        return retVal;
        
    }
    
}
