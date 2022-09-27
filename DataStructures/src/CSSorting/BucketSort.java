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

/**
 *
 * @author JeffreySchneider
 * 
 * https://www.codespeedy.com/bucket-sort-in-java/
 */
public class BucketSort {
    public static int[] bucket_sort(int[] arr, int max_value){
        int[] bucket = new int[max_value+1];
        int[] sorted_arr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) 
            bucket[arr[i]]++;
            
        int pos=0;
            for (int i = 0; i < bucket.length; i++) {
                for (int j = 0; j < bucket[i]; j++) {
                    sorted_arr[pos++] = i;
                }
            }
            return sorted_arr;        
    }
    
    static int maxValue(int[] arr){
        int max_value = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max_value) {
                max_value = arr[i];
            }
        }
        return max_value;
    }
}
