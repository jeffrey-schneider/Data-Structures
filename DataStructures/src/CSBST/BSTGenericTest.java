/*
 *   https://www.cs.cmu.edu/~adamchik/15-121/lectures/Trees/code/BST.java

* Tree Interview Questions 
* https://www.interviewcake.com/concept/java/tree
 */
package CSBST;

//import FlightApplication.BaseFlight;
//import FlightApplication.CommercialFlight;
import java.util.Arrays;

/**
 *
 * @author JCSchneider with help
 */
public class BSTGenericTest {

    public static void main(String[] args) {

        BSTGeneric<Integer> b = new BSTGeneric<>(); 
        BSTGeneric<String> letters = new BSTGeneric<>();
        b.add(85);
        //b.insert(85);
//        System.out.println(b.add(40));
        b.add(40);
        b.add(20);        
        b.add(50);
        b.add(10);
        b.add(60);
        b.add(30);
        b.add(15);
        b.add(35);
        b.add(33);
        b.add(-44);
        b.delete(40);
        b.add(22);
        //* <- these comments indicate that this part of lecture has not been given.
        //int[] arr = new int[]{6,4,2,5,1,3,8,7,9,10};
//        Arrays.sort(arr);
//        b.CreateBinaryTree(arr);
//       
//        
        System.out.print("\nPre order: ");
        b.preOrderTraversal();
        System.out.println("");
//        
        System.out.print("In order: ");        
        b.inOrderTraversal();
        System.out.println("");
        
        System.out.print("Post Order: ");
        b.postOrderTraversal();
        System.out.println("");
//       
//        
        System.out.println("Find 10 " + b.find(10));
        System.out.println("Find 20 " + b.find(20));
        System.out.println("Find -1 " + b.find(-1));
//        
        System.out.println("Contains 20? "+ b.contains(20));
        System.out.println("Contains -1? " + b.contains(-1));
//        
        System.out.println("Leaf Nodes:");
        b.printLeafNodes();

        
        System.out.print("\nPost order: ");
        b.postOrderTraversal();
//        
        System.out.print("\nBreadth first: ");
        b.levelOrderTraversal();
        
        System.out.print("\nDepth first: ");
        b.printDepthFirst();
        
        System.out.print("\nfindMin: ");
        System.out.println(b.findMin());        
        
        System.out.print("\nfindMax: ");
        System.out.println(b.findMax());
//        
//        
//        //testing diameter
//        System.out.println("\nDiameter: " + b.diameter());
//        //testing width
//        System.out.println("Width: " + b.width());
//        //testing height
//        System.out.println("Height: " + b.height());
//        System.out.println("Is 10 in the tree? " +  b.search(10));        
//        System.out.println("Is 99 in the tree? " + b.search(99));        
//        System.out.println("\nLeaves: " + b.countLeaves());
//        
        BSTGeneric<Integer> c = new BSTGeneric<Integer>();
        c = b.clone();        
        System.out.println("\nare b and c equal? " + b.isEqual(c));
        
        System.out.println("PrintAllPath");
        b.printAllPath();
//        //
        System.out.println("Number of full nodes:");
        System.out.println(b.numFullNodesBT());
        
//        System.out.println("========");
//        //b.printAncestors(b.root, 10);
//      
        b.print();
        
        System.out.println("\n\nAnimals:");
        BSTGeneric02<String> animal = new BSTGeneric02<>();
        animal.add("Reptile");
        animal.add("Animal");
        
        animal.add("Lizard");
        animal.add("Snake");
        animal.add("Bird");
        animal.add("Salamander");
        animal.add("Canary");
        animal.add("Mammal");        
        animal.add("Equine");
        animal.add("Horse");
        animal.add("Zebra");
        animal.add("Bovine");
        
        animal.add("Cow");
        animal.add("Canine");

        animal.printAllPath();
        System.out.println("Leaf Nodes:");
        animal.printLeafNodes();
        
        System.out.print("\nPost order: ");
        animal.postOrderTraversal();
        
        System.out.print("\nBreadth first: ");
        animal.levelOrderTraversal();
        
        System.out.print("\nDepth first: ");
        animal.printDepthFirst();
        
        System.out.println("Width: " + animal.width());
        //testing height
        System.out.println("Height: " + animal.height());
        System.out.println("Is Equine in the tree? " +  animal.search("Equine"));        
        System.out.println("Is Feline in the tree? " + animal.search("Feline"));        
        System.out.println("\nLeaves: " + animal.countLeaves());
        
        
//        animal.printAncestors(animal.root);
//        animal.numFullNodesBT();
        animal.print();
//        
        letters.add("J");
        letters.add("A");
        letters.add("C");
        letters.add("F"); 
        letters.add("B");
        letters.add("E");
        letters.add("D");        
        letters.add("G");
        letters.add("H");
        letters.add("I");
        
        letters.add("K");
        System.out.println("Pre order:");
        letters.preOrderTraversal();
        
        System.out.println("\nIn order");
        letters.inOrderTraversal();
        
        System.out.println("\nPost");
        letters.postOrderTraversal();
        
        System.out.println("\nLevel Order");
        letters.levelOrderTraversal();
        
        System.out.println("\nDepth first");
        letters.printDepthFirst();
        
        System.out.println("\nAll Path");
        letters.printAllPath();
        
        System.out.println("Count Leaves " + letters.countLeaves());
        letters.print();
        
        System.out.println("height :" + letters.height());
        System.out.println("Width: " + letters.width());
        
        System.out.println("Finding max: " + letters.findMax());
        System.out.println("Finding min: " + letters.findMin());
        
    }
}
