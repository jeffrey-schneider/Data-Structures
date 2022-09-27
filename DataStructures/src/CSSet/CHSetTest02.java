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
package CSSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author JCSchneider
 */
public class CHSetTest02 {
    public static void main(String[] args) {
        String[] hockey = {"Chicago", "Detroit", "New York", "Boston", "Buffalo", "Florida", "Montreal",
            "Ottawa", "Tampa Bay", "Toronto"};
        String[] baseball = {"Baltimore","Boston", "New York", "Cleveland", "Houston", "Detroit","Chicago"};
        String[] soccer = {"Atlanta", "Chicago", "Columbus", "Cincinnati", "Miami", "New York"};
            
        Set<String> setHockey = new HashSet<>();
        Set<String> setHockeyCopy = new HashSet<>();
        Set<String> setBaseball= new HashSet<>();
        Set<String> setSoccer = new HashSet<>();
        
        //Load sets from arrays
        for (String s : hockey) {
            setHockey.add(s);
            setHockeyCopy.add(s);
        }
        for (String s : baseball) {
            setBaseball.add(s);
        }
        
        for (String s : soccer) {
            setSoccer.add(s);
        }
        
        System.out.println("Baseball: " + setBaseball);
        System.out.println("Hockey: " + setHockey);
        System.out.println("Soccer: " + setSoccer);
        setHockey.addAll(setBaseball);      //<-union
        setHockey.addAll(setSoccer);
        System.out.println("Hockey (After): " + setHockey);
        setHockeyCopy.retainAll(setBaseball); //<-intersection
        System.out.println("\nUnion: " + setHockey);
        System.out.println("Intersection: " + setHockeyCopy);
        
        //Create an iterator to setHockey.
        Iterator<String> setBaseballIter = setBaseball.iterator();
        while (setBaseballIter.hasNext()) {
            String nextItem = setBaseballIter.next();
            System.out.println(nextItem);
        }
        
        
        
        
        System.out.println("\n\nBaseball");
        for (String nextItem : setBaseball) {
            System.out.println(nextItem);
        }
        
        
        String jeff = "Tom";
        System.out.println(jeff.hashCode());
        jeff = "Dick";
        System.out.println(jeff.hashCode());
    }
        
    }

