/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSLectureTesting;
/**
 *
 * @author JCSchneider
 */
public class MyClass {    
    public int x;
    public int y;
    
    public int multiply(int x, int y){
        return x * y;
    }
    
    public boolean greaterThan(int x, int y){
        return x > y;
    }
    
    public boolean lessThan(int x, int y){
        return x < y;
    }
    
    public String returnNull(){
        return null;
    }
    
    @Override
    public String toString() {
        return "X = " + x + " Y= " + y;
    }
    
     public static int searchAt(int[] x, int target, int index){
        if(x[index]==target){
            return index; //target found at 0
        }
        return -1;
    }
     
     public static int search(int[] x, int target){
         for (int i = 0; i < x.length; i++) {
             if (x[i] == target) {
                 return i;
             }
         }
         return -1;
     }

    public static int addition(int x, int y) {
        return x + y;        
    }
     
    public static int subtraction(int x, int y){
        return x - y;
    }
}
