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

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author JCSchneider
 */
public class BubbleSortTest<E> {

    public static void main(String[] args) throws FileNotFoundException {
        String driveName = "D:";
        String dirName = "\\ChattState\\Courses\\SharedFiles\\IntegerLists\\";
        String fileName = "1Kints.txt";
        File file = new File(driveName + dirName + fileName);

        //ArrayList<Integer> masterArray = new ArrayList<>();
        Integer[] masterArray = new Integer[1000];
        String st;
        int lineCounter = 0;
        BufferedReader br = new BufferedReader(new FileReader(file));
        try {
            while ((st = br.readLine()) != null) {
                try {
                    masterArray[lineCounter++] = Integer.parseInt(st.replaceAll("\\s", ""), 10);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        Integer[] intArray = Arrays.copyOf(masterArray, masterArray.length);
        Integer[] intArray2 = Arrays.copyOf(masterArray, masterArray.length);
        runBubbleSort(intArray);

    }

    private static void runBubbleSort(Integer[] masterArray) {
        long startTime;
        long endTime;
        double duration;
        System.out.println("\nBubble Sort");
        //BubbleSort bubbleSort = new BubbleSort();
        startTime = System.nanoTime();

        BubbleSort.sort(masterArray);
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000000.0;

        for (int i = 0; i < 100; i++) {
            System.out.println(masterArray[i]);
        }
        System.out.println("Duration: " + duration);
    }
}
