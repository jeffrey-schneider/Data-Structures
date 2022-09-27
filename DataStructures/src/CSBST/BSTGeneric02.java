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

/**
 *
 * @author JCSchneider
 */
public class BSTGeneric02<E> extends BSTGeneric {

    public BSTGeneric02() {
    }
   
    
    
    
//    public  boolean printAncestors(Node<E> root, Node node){
//        if(root == null){
//            return false;
//        }
//        if(root == node){
//            return true;
//        }
//        boolean left = printAncestors(root.left, node);
//        boolean right = false;
//        if(!left){
//            right = printAncestors(root.right, node);
//        }
//        if(left || right){
//            System.out.println(root.data + " " );
//        }   
//        return left || right;
//       }

    void printAncestors(Node root) {
        printAncestors(root, -44);
    }
    
    /* If target is present in tree, then prints the ancestors
       and returns true, otherwise returns false. */
    boolean printAncestors(Node node, int target)
    {
         /* base cases */
        if (node == null)
            return false;
  
        if (node.data.equals(target))
            return true;
  
        /* If target is present in either left or right subtree
           of this node, then print this node */
        if (printAncestors(node.left, target)
                || printAncestors(node.right, target))
        {
            System.out.print(node.data + " ");
            return true;
        }
  
        /* Else return false */
        return false;
    }

    
}
