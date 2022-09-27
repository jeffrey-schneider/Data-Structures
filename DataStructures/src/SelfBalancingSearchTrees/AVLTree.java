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

K&W Data Structures with Java Chapter 09
 */
package SelfBalancingSearchTrees;

import CHBST.BSTGeneric.Node;

/**
 *
 * @author JeffreySchneider
 */
/**
 * A self-balancing binary search tree using the algorithm defined by
 *  Adelson-Velskii and Landis.
 * @author JeffreySchneider
 * @param <E> 
 */
public class AVLTree<E extends Comparable<E>> extends BSTGenericWithRotate<E> {
    /** Flag to indicate that height of tree has increased.*/
    private boolean increase;
    
    public boolean add(E item){
            increase = false;
            root = add((AVLNode<E>) root, item);
            return addReturn;
        }
    
    private AVLNode<E> add(AVLNode<E> localRoot, E item){
        if (localRoot == null) {
            addReturn = true;
            increase = true;
            return new AVLNode<E>(item);
        }
        if (item.compareTo(localRoot.data) == 0) {
            //Item is already in the tree.
            increase = false;
            addReturn = false;
            return localRoot;
        }
        else if(item.compareTo(localRoot.data) < 0){
            localRoot.left = add((AVLNode<E>) localRoot.left, item);            
            if(increase){
                decrementBalance(localRoot);
                if (localRoot.balance < AVLNode.LEFT_HEAVY) {
                    increase = false;
                    return rebalanceLeft(localRoot);
                }
            }
        }
            return localRoot;  //Rebalance not needed.            
    }

    private AVLNode<E> rebalanceLeft(AVLNode<E> localRoot) {
        AVLNode<E> leftChild = (AVLNode<E>) localRoot.left;
        if(leftChild.balance > AVLNode.BALANCED){
            AVLNode leftRightChild = (AVLNode<E>)leftChild.right;
            if (leftRightChild.balance < AVLNode.BALANCED) {
                leftChild.balance = AVLNode.BALANCED;
                leftRightChild.balance = AVLNode.BALANCED;
                localRoot.balance = AVLNode.RIGHT_HEAVY;
            }else{
                leftChild.balance = AVLNode.LEFT_HEAVY;
                leftRightChild.balance = AVLNode.BALANCED;
                localRoot.balance = AVLNode.BALANCED;
            }
            //Perform left rotation
            localRoot.left = rotateLeft(leftChild);           
        }else{
            leftChild.balance = AVLNode.BALANCED;
            localRoot.balance = AVLNode.BALANCED;
        }
        //Now rotate the local root right
        return(AVLNode<E>) rotateRight(localRoot);
    }

    private void decrementBalance(AVLNode<E> node) {
        node.balance--;
        if(node.balance == AVLNode.BALANCED){
            increase = false;
        }
    }
    
    /**
     * Class to represent AVL node. In extends the BSTGeneric Node
     * by adding the balance field. 
     * @param <E> 
     */
    private static class AVLNode<E> extends Node<E>{
        public static final int LEFT_HEAVY = -1;
        
        public static final int BALANCED = 0;

        public static final int RIGHT_HEAVY = 1;

        private int balance;
     
        
        public AVLNode(E item){
            super(item);
            balance = BALANCED;
        }
        
        

        @Override
        public String toString() {
            return balance + ": " + super.toString(); //To change body of generated methods, choose Tools | Templates.
        }
        
       
    }
    
    
}
