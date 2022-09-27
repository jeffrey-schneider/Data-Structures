/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSSorting;

import java.util.Arrays;

/**
 *
 * @author jeffrey.schneider
 */
//public static <T extends Comparable<T>> T sort(T[] nums, int max_value){   
//public class BucketSort02 <T>{
public class BucketSort02<T extends Comparable<T>>{ 
    public static Integer[] sort(Integer[] nums, Integer max_value) {
    //public static <T extends Comparable<T>> void sort(T[] table){    
        // Bucket Sort
        Integer[] Bucket = new Integer[max_value + 1];
        Integer[] sorted_nums = new Integer[nums.length];
         for (int i = 0; i < nums.length; i++)
          Bucket[nums[i]]++;
          int outPos = 0;
         for (int i = 0; i < Bucket.length; i++)
              for (int j = 0; j < Bucket[i]; j++)
                  sorted_nums[outPos++] = i;
          return sorted_nums;
      }

        
        
       
    }
 
