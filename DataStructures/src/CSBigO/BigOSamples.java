/**
 * Notes taken from: https://medium.com/@onurkaraoglan/big-o-notation-with-code-examples-302f999dec40 
 * downloaded 10/22/2021
 *
 */
package CSBigO;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import CSSorting.BubbleSort;
import CSSorting.MergeSort;
import CSSorting.QuickSort;

/**
 *
 * @author JeffreySchneider
 */
public class BigOSamples {
    public static void main(String[] args) {
        ArrayList<Integer> tempBuffer = new ArrayList<>();
        
        int x = 1000;
        int y = 175;
        int z = addition(x,y);
        z = 5000;
        
        System.out.println("Addition: " + z);
        
        int logarithmicExample = logarithmicExample(z);
        System.out.println("Logarithmic time: " + logarithmicExample);
        for (int i = 0; i < 100; i++) {
            tempBuffer.add(i);
        }
        ArrayList<Integer> randomList = new ArrayList<>();
            int min = 10;
            int max = 10000;
            int numberOfNumbers = 500000;
            while (numberOfNumbers >= 0) {
                randomList.add((int)Math.floor(Math.random()*(max - min +1)+min));
                numberOfNumbers--;
            }
        
            
            //O(n) Linear example
        boolean foundMe = false;
        int lookFor = 5;
        foundMe = Contains(randomList, lookFor);        
        System.out.println("Is " + lookFor + " in the list? " + foundMe); 
        
        
        // O(n log n) - Linearithmic(Log Linear) example
        //Integer[] randomArray = (Integer[]) randomList.toArray();
        Integer[] randomArray = new Integer[randomList.size()];
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = randomList.get(i);
        }
        System.out.println("Before Quick Sort first 10 numbers:");
        for (int i = 0; i < 10; i++) {
            System.out.println(randomArray[i]);
        }
        
        //QuickSort.sort(randomArray);
        MergeSort.sort(randomArray);
        
        System.out.println("After Quick Sorted first 10 numbers:");
        for (int i = 0; i < 10; i++) {
            System.out.println(randomArray[i]);
        }
          
        System.out.println("O(NLogN)" + NLogN(z));
        System.out.println("O(n^P)" + PolynomialTime(z));
        System.out.println("O(2^n)" + ExponentialTime(19));
        System.out.println("O(3^n)" + CubicTime(19));
        
        System.out.println("");
        System.out.println("See https://www.youtube.com/watch?v=Q_1M2JaijjQ");
        
        //Start n at 20 and increment by 20 up to 100, notice how different the passes_through variable is 
        // between Bob and Alice's solutions.
        boolean detail = false ;
        int n = 60;
        System.out.println("Bob's List");
        Bobs_Solution(n, detail);
        System.out.println("Alice's List");
        Alices_Solution(n, detail);
    }
    

    /**
     * Addition - Constant time
     *  Program always executes in the same time regardless 
     *  of the size of the input data set.
     * O(1) 
     * @param x
     * @param y
     * @return integer
     */
    private static int addition(int x, int y) {
        // O(1)
        return x + y;
    }

    
    /**
     * Algorithms with an order of log n generally reduce the problem size
     *  with each operation. The most common attributes of these algorithms
     *  is:
     *  - The choice of the next element on which to perform some action is
     *      one of several possibilities and
     *  - Only one of these possibilities will need to be chosen.
     * 
     * A good example of logarithmic time algorithm is the binary search algorithm.
     * 
     * @param n
     * @return integer
     * O(log n) - Logarithmic
     */
    private static int logarithmicExample(int n) {
        //O(log n)
        while (n > 1) {
            n = n / 2;            
        }
        return n;
    }
    
    /**
     * O(n)  Linear time 
     * Describes an algorithm whose performance will grow linearly
     * and in direct proportion to the size of the input data set.
     * 
     * Other examples of linear algorithms are:
     *  - Finding the min/max element in a list
     *  - Iteratively finding the nth Fibonacci number (Without memoization).
     * @param elements
     * @param value
     * @return 
     */
    private static boolean Contains(ArrayList<Integer> elements, int value){
        for (int i = 0; i < elements.size(); i++) {
            if(elements.get(i) == value)
                return true;
        }
        return false;
    }
    
    /**
     * N Log N time
     * The running time grows in proportion to n log n of the input
    *    n log n is the next class of algorithms. The running time grows in proportion to n log n of the input:
    * 
    * //For example, if the n is 8, then this algorithm will run 8 * log(8) = 8 * 3 = 24 times. 
        Whether we have strict inequality or not in the for loop is irrelevant for the sake 
    * of a Big O Notation.

*/
public static int NLogN(int n){
    int retVal = 0;
for (int i = 1; i <= n; i++){
    for(int j = 1; j < n; j = j * 2) {
//        System.out.println("Hey - I'm busy looking at: " + i + " and " + j);
        retVal++;
    }
}
return retVal;
}

/**
 * 
 * @param n 
 * Next up we've got polynomial time algorithms. These algorithms are even slower than n log n algorithms.
 * The term polynomial is a general term which contains quadratic (n2), cubic (n3), 
    * quartic (n4), etc. functions. What's important to know is that O(n2) is faster 
    * than O(n3) which is faster than O(n4), etc.
    * 
    * Let's have a look at a simple example of a quadratic time algorithm:
    * This algorithm will run 8^2 = 64 times. Note, if we were to nest another 
    * for loop, this would become an O(n3) algorithm.
 */
public static int PolynomialTime(int n){
    int retVal = 0;
    for (int i = 1; i <= n; i++) {
        for(int j = 1; j <= n; j++) {
            //System.out.println("Hey - I'm busy looking at: " + i + " and " + j);
            retVal++;
        }
    }
    return retVal;
    
}

public static int ExponentialTime(int n){
    /**
     * Let's have a look at a simple example of an O(2n) time algorithm:
     * For example, O(2n) algorithms double with every additional input. 
     * So, if n = 2, these algorithms will run four times; if n = 3, 
     * they will run eight times (kind of like the opposite of logarithmic 
     * time algorithms).
     * O(3^n) algorithms triple with every additional input, 
     * O(k^n) algorithms will get k times bigger with every additional input.
     * This algorithm will run 28 = 256 times.
     */
    int retVal = 0;
for (int i = 1; i <= Math.pow(2, n); i++){
    //System.out.println("Hey - I'm busy looking at: " + i);
    retVal++;
}
return retVal;     
}

public static int CubicTime(int n){
    int retVal = 0;
    for (int i = 0; i <= Math.pow(3,n); i++) {
        retVal++;
    }
    return retVal;
}


/**Big O Notation:
 * https://www.youtube.com/watch?v=Q_1M2JaijjQ
 * @param n 
 */
public static void Bobs_Solution(int n, boolean detail){
    //Try all combinations of (a, b, c) 
    //a + b + c = n
    //  Bob's count is equal to n^3 + 3n^2 + 3n + 1
    // What happens when n is very large?
    //  (We can ignore this part 3n^2 + 3n + 1 because it has little effect on the comparison)
    //  Big O(n^3)
    int passes_through = 0;
    int matches = 0;
    for (int a = 0; a <= n; a++){
        for (int b = 0; b <= n; b++){
            for(int c = 0; c <= n; c++){               
                passes_through++;
                if ( a + b + c == n){
                    matches++;
                    if(detail)
                        System.out.println(a + " " + b + " " + c );
                }
            }
        }
    }
    System.out.println("Counter: " + passes_through);
    System.out.println("Matches: " + matches);
}

public static void Alices_Solution(int n, boolean detail){
    //Alice's count is equal to n^2 + 2n + 1
    //  (We can ignore this part 2n + 1 because it has little effect on the comparison)
    // Big O(n^2)
    int passes_through = 0;
    int matches = 0;
    for (int a = 0; a <= n; a++) {
        for (int b = 0; b <= n; b++) {
            passes_through++;
            int c = n - (a + b);
            if(c >= 0){
                matches++;
                if(detail)
                    System.out.println(a + " " + b + " " + c );
            }
        }
    }
    System.out.println("Counter: " + passes_through);
    System.out.println("Matches: " + matches);
}
}


