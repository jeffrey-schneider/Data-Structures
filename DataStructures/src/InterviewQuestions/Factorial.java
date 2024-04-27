/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InterviewQuestions;

import java.math.BigInteger;

/**
 *
 * @author JCSchneider
 */
public class Factorial {
    public static void main(String[] args) {
        
        int i = 1;
        while(i <= 100){
            System.out.printf("\nFactorial of %d %,d", i, factorial(i));
            System.out.println("");
            System.out.printf("Chessboard: or %d, %,d", i,  chessBoard(i));
            System.out.println("");
            i++;
        }
        
        System.out.println("");
        
        
    }

    private static BigInteger factorial(int n) {
            BigInteger retVal = BigInteger.ONE;
            for(int i = 1; i <= n; i++){
                retVal = retVal.multiply(BigInteger.valueOf(i));
            }
            return retVal;
    }

    private static BigInteger chessBoard(int n) {
        BigInteger retVal = BigInteger.ONE;
        BigInteger BIG_TWO = BigInteger.valueOf(2L);
        
        for (int counter = 2; counter <= n; counter++) {
            retVal = retVal.add(retVal.modPow(BIG_TWO, BigInteger.valueOf(counter)));
        }
        return retVal;
    }
}
