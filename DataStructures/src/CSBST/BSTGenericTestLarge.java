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
package CSBST;

import java.util.Random;

/**
 *
 * @author JCSchneider
 */
public class BSTGenericTestLarge {
    public static void main(String[] args) {
        int upperbound = 100;
        
        BSTGeneric<Integer> b = new BSTGeneric<>();
        Random ran = new Random();
        int x ;
        for (int i = 0; i < upperbound; i++) {
            b.add(ran.nextInt(1000));
        }
        
        System.out.println("\nPre order");
        b.preOrderTraversal();
        System.out.println("\nIn order");
        b.inOrderTraversal();
        System.out.println("\nPost order");
        b.postOrderTraversal();
        
        System.out.println("\nFind 9: " + b.find(9));
        System.out.println("\nLeaf nodes: " + b.countLeaves() );
        System.out.println("\nFindMin: " + b.findMin());
        System.out.println("\nFindMax: " + b.findMax());
        System.out.println("\nDiameter: " + b.diameter());
        System.out.println("Width: " + b.width());
        //testing height
        System.out.println("Height: " + b.height());
        System.out.println("Is 10 in the tree? " +  b.search(10));        
        System.out.println("Is 99 in the tree? " + b.search(99));        
        //b.printAllPath();
        System.out.println("numFullNodesBT()" + b.numFullNodesBT());
        System.out.println("Delete 10 ");
        b.delete(10);
        b.printDepthFirst();
        System.out.println(b);
        //System.out.println("printLeafNodes()");
        //b.printLeafNodes();
        System.out.println("Min: " + b.findMin());
        System.out.println("Max: " + b.findMax());
        
        b.print();
    }
}
