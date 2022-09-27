package CSLectureTesting;
import java.util.ArrayList;

/**
 *
 * @author JeffreySchneider
 */
public class SaturdayProgramming {
    /** 
     * Add two strings together 
     * https://www.youtube.com/watch?v=Q0ue-T0Z6Zs
     * 
     * Allow the Integer.parseInt() to fail. We are testing to see the error thrown.
     */
    public int add(String s1, String s2){
        int int1 = Integer.parseInt(s1);
        int int2 = Integer.parseInt(s2);
        return int1 + int2;
    }
    
    public int CelsiusToFarenheit(int celsius){
        return celsius * 9/5 + 32;
    }
    
    public boolean isPrime(int theNumber){
        int theCounter = 2;
        for (int i = 2; i < Math.sqrt(theNumber) + 1; i++) {
            if(theNumber % i == 0){
                return false;
            }
        }
        return true;
    }
    
    //public static long fibArray[] = new long[200];
    
    //Using memoization!!
    public static long getFibonacci(int n) {        
        long fibArray[] = new long[200];
        long fibValue = 0L;
        if (n == 0L) {
            return 0L;
        } else if (n == 1L) {
            return 1L;
        } else if (fibArray[n] != 0L) {
            return fibArray[n];
        } else {
            fibValue = (getFibonacci(n - 1) + getFibonacci(n - 2));
            fibArray[n] = fibValue;
            return fibValue;
        }
    }
    
    
    public Integer[] getJugglers(int theNumber){
        //int[] retVal = { 9,27,140,11,36,6,2,1};
        //started with arraylist of Integer and converted to int[] 'cause its easier and
        //  assertArrayEquals DOES NOT HANDLE ArrayLists.
        //
        ArrayList<Integer> retList = new ArrayList<>();
        int counter = theNumber;
        float fctr;
        retList.add(theNumber);
        while (counter > 1) {
            if(counter % 2 == 0){
                fctr = .5f;
            }else{
                fctr = 1.5f;
            }
            counter = (int) Math.floor(Math.pow((double) counter, fctr));
            retList.add(counter);
       //     System.out.print(counter + " " );
        }
        //https://codeahoy.com/java/How-To-Convery-ArrayList-To-Array/
        Integer[] retVal = retList.stream().toArray( n -> new Integer[n]);                   
        return retVal;
    }
    
    public Integer[] getCollatz(int theNumber){
        ArrayList<Integer> retList = new ArrayList<>();
        retList.add(theNumber);
        int counter = theNumber;
        while (counter > 1) {
            if (counter % 2 == 0) {
                counter /= 2;
            }else{
                counter = 3 * counter + 1;
            }
            retList.add(counter);
        }
        Integer[] retVal = retList.stream().toArray(n->new Integer[n]);
        return retVal;
    }
}
