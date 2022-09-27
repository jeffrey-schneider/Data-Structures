/*
 * Copyright (C) 2021 JeffreySchneider
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */
package CSSorting;

import java.util.Arrays;

/**
 *
 * @author JeffreySchneider
 */
public class RadixSort {
//https://www.geeksforgeeks.org/radix-sort/
    static int getMax(Integer[] a, int n) {
        int max = a[0];
        for (int i = 1; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max; //maximum element from the array
    }

     
    
    // A function to do counting sort of arr[] according to
    // the digit represented by exp.
    static void countSort(Integer[] arr, int n, int exp)
    {
        int output[] = new int[n]; // output array
        int i;
        int count[] = new int[10];        
        Arrays.fill(count, 0);
 
        // Store count of occurrences in count[]
        for (i = 0; i < n; i++)
            count[(arr[i] / exp) % 10]++;
 
        // Change count[i] so that count[i] now contains
        // actual position of this digit in output[]
        for (i = 1; i < 10; i++)
            count[i] += count[i - 1];
 
        // Build the output array
        for (i = n - 1; i >= 0; i--) {
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }
 
        // Copy the output array to arr[], so that arr[] now
        // contains sorted numbers according to current
        // digit
        for (i = 0; i < n; i++)
            arr[i] = output[i];
    }
    
    /*
    static int getMax(int arr[], int n){
        int mx = arr[0];
        for (int i = 1; i<n; i++)
            if(arr[i]>mx)
                mx=arr[i];
        return mx;
    }
    */
    
    
    
    static void radixSort(Integer[] arr,  int n){
        //Find the maximum number to know the number of digits
        int m = getMax(arr, n);
        //Do counting sort for every digit
        for(int exp = 1; m /exp> 0; exp *=10)
            countSort(arr, n, exp);
    }
    
}
  