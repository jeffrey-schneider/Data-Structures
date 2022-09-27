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
 */
package CSSorting;

/**
 *
 * @author JCSchneider
 */
public class HeapSort {
    
    static void heapify(Integer[] array, int length,int i){
        int leftChild = 2 * i+1;
        int rightChild = 2*i+2;
        int largest = i;
        
        //If the left child is larger than parent
        if (leftChild < length && array[leftChild] > array[largest]){
            largest = leftChild;       
        }
        //If the right child is larger than parent
        if(rightChild < length && array[rightChild] > array[largest]){
            largest = rightChild;
        }
        
        //if a swap needs to occur
        if (largest != i) {
            int temp = array[i];
            array[i] = array[largest];
            array[largest] = temp;
            heapify(array,length, largest);
        }
    }
    
    public static void heapSort(Integer[] array){
        if(array.length == 0) return;
        
        //Building the heap
        int length = array.length;
        
        //We are going from the first non-leaf to the root.
        for (int i = length/2-1; i >= 0; i--) 
            heapify(array, length, i);
        
        for (int i = length-1; i >= 0; i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;
            
            heapify(array, i, 0);            
        }
            
        
    }
}
