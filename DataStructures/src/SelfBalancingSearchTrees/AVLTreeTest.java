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
 */
package SelfBalancingSearchTrees;

/**
 *
 * @author JeffreySchneider
 */
public class AVLTreeTest {
    public static void main(String[] args) {
        AVLTree<String> tree = new AVLTree<String>();
        tree.add("The");
        tree.add("quick");
        tree.add("brown");
        tree.add("fox");
        tree.add("jumps");
        tree.add("over");
        tree.add("the");
        tree.add("lazy");
        tree.add("dog");
        
        System.out.println(tree.countLeaves());
        System.out.println(tree.find("quick"));
                
    }
}
