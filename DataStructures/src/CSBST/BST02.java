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

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author JCSchneider
 */
public class BST02 extends BST{

    public int findMaximumWidth(){
        int maxWidth = 0;
        
        int nodesInLevel = 0;
        Queue<Node> queue = new LinkedList<Node>();
        
        if(root == null){
            System.out.println("Tree is empty.");
            return 0;
        }else{
            //Add root node to queue as it represents the first level
            queue.add(root);
            while (queue.size()!= 0) {
                nodesInLevel = queue.size();
                maxWidth = Math.max(maxWidth, nodesInLevel);
                
                while (nodesInLevel > 0) {
                    Node current = queue.remove();
                    if(current.left != null)
                        queue.add(current.left);
                    if(current.right != null)
                        queue.add(current.right);
                    nodesInLevel--;
                }
                
            }
        }
        return maxWidth;
    }
    
public int findMaximumHeight(Node temp){
    //is tree empty?
    if(root == null){
        System.out.println("Empty tree.");
        return 0;
    }else{
        int leftHeight = 0, rightHeight = 0;
        //Calculate the left subtree height
        if(temp.left != null)
            leftHeight = findMaximumHeight(temp.left);
        
        //Calculate the right subtree height
        if(temp.right != null)
            rightHeight = findMaximumHeight(temp.right);
        
        //compare heights and store maximum in variable
        int max = (leftHeight > rightHeight) ? leftHeight : rightHeight;
        //Add height of root
        return(max + 1);
    }
}
       
}
