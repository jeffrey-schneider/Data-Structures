/*
 * Copyright (C) 2022 JeffreySchneider
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

K&W Chapter 9 SelfBalancing Search Trees
 */
package SelfBalancingSearchTrees;

import CHBST.BSTGeneric;

/**
 *
 * @author JeffreySchneider
 * 
 */

/**
 * This class extends the BSTGeneric by adding the rotate
 * operations. Rotation will change the balance of a search
 * tree while preserving the search tree property.
 * Used a s a common base class for self-balancing trees.
 * 
 * @author JeffreySchneider
 * @param <E> 
 */
public class BSTGenericWithRotate<E extends Comparable<E>> extends BSTGeneric<E> {
    //Methods
    /**
     * Method to perform a right rotation
     * pre:     root is the root of a BSTGeneric
     * post:    root.right is the root of a BSTGeneric
     *          root.right.right is raised one level.
     *          root.right.left does not change levels
     *          root.left is lowered one level.
     *          the new root is returned.
     * @param root  The root of the BSTGeneric to be rotated.
     * 
     * @return  The new root of the rotated tree.
     */
    protected Node<E>  rotateRight(Node<E> root){
        Node<E> temp = root.left;
        root.left = temp.right;
        temp.right = root;
        return temp;
    }
      
    
    protected Node<E> rotateLeft(Node<E> root){
        Node<E> temp = root.right;
        root.right = temp.left;
        temp.left = root;
        return temp;
    }
}
