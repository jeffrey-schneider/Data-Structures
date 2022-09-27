/*
*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSBST;

/**
 *
 * @author JCSchneider
 */
public class BSTTest {

    public static void main(String[] args) {
        BST b = new BST();
        b.insert(25);
        b.display(b.root);
        System.out.println("====");
        b.insert(3);
        b.display(b.root);
        System.out.println("====");
        b.insert(-85);
        b.display(b.root);
        System.out.println("====");
        b.insert(1);
        b.display(b.root);
        System.out.println("====");
        b.insert(4);
        b.display(b.root);
        System.out.println("====");
        b.insert(6);
        b.display(b.root);
        System.out.println("====");
        b.insert(2);
        b.display(b.root);
        System.out.println("====");
        b.insert(10);
        b.display(b.root);
        System.out.println("====");
        b.insert(95);
        b.display(b.root);
        System.out.println("====");
        b.insert(20);
        b.display(b.root);
        System.out.println("====");

        b.insert(15);
        b.display(b.root);
        System.out.println("====");
        b.insert(16);

        b.display(b.root);
        System.out.println("");
        System.out.println("Find 4");
        b.find(4);
//        System.out.println("Maximum Width: " + b.findMaximumWidth());
//        System.out.println("Maximum Height: " + b.findMaximumHeight(b.root));
        System.out.println("Delete nodes");
        System.out.println("No children (2): " + b.delete(2));
        System.out.println("One child  (4): " + b.delete(4));
        System.out.println("Two children: " + b.delete(10));
        b.display(b.root);
        System.out.println("");

    }

}
