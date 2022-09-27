/*
 * Copyright (C) 2021 JCSchneider
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

https://www.javacodex.com/Sorting/Cocktail-Sort
 */
package CSSorting;

import java.util.Arrays;

/**
 *
 * @author JCSchneider
 */
public class CocktailSort {
    public static void main(String[] args) {
        Integer[] array = {5,3,0,2,4,1,0,7,2,9,1,4};
        System.out.println("Before: " + Arrays.toString(array));
        sort(array);
        System.out.println("After: " + Arrays.toString(array));
    }
    
    public static void sort(Integer[] array){
        boolean swapped;
        do{
            swapped = false;
            for (int i = 0; i < array.length - 2; i++) {
                if (array[i] > array[i+1]) {
                    //test whether the two elements are in the wrong order
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    swapped = true;                    
                }                
            }
            if(!swapped){
                //we can exit here if no swaps occurred.
                break;
            }
            swapped = false;
            for (int i = array.length - 2; i >= 0; i--) {
                if(array[i] > array[i+1]){
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    swapped = true;                            
                }
            }
            // if no elements have been swapped, then the list is sorted.
        }while (swapped);            
        }
    
    
    }

