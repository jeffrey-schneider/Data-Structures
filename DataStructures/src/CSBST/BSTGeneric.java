/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
*
*Tree Interview Questions 
*https://www.interviewcake.com/concept/java/tree
 */
package CSBST;

import java.util.*;

import CSBST.BSTGeneric.Node;

/**
 *
 * @author JCSchneider
 * @param <E>
 */
public class BSTGeneric<E extends Comparable<E>> implements Iterable<E> {

    protected Node<E> root;
    private Comparator<E> comparator;
    protected boolean addReturn = false;
    protected E deleteReturn;

    /**
     * Null constructor
     */
    public BSTGeneric() {
        root = null;
        comparator = null;
    }

    /**
     * Constructor
     *
     * @param comp
     */
    public BSTGeneric(Comparator<E> comp) {
        root = null;
        comparator = comp;
    }

    /**
     * Compares two objects
     *
     * @param x first object
     * @param y second object
     * @return integer
     */
    private int compare(E x, E y) {
        if (comparator == null) {
            return x.compareTo(y);
        } else {
            return comparator.compare(x, y);
        }
    }

    /**
     * ***************************************************
     *
     * INSERT
     *
     * * Sample exercise, given this code, we see that the compare method is
     * called twice. Can this be improved?
     *
     * Return type, void ****************************************************
     */
    public void insert(E data) {
        root = insert(root, data);
    }

    private Node<E> insert(Node<E> root, E toInsert) {
        if (root == null) {
            return new Node<E>(toInsert);
        }
        if (compare(toInsert, root.data) == 0) {
            return root;
        }
        if (compare(toInsert, root.data) < 0) {
            root.left = insert(root.left, toInsert);
        } else {
            root.right = insert(root.right, toInsert);
        }
        return root;
    }

    /**
     * complexity O(n)
     *
     * @param T2
     * @return
     */
    public boolean isEqual(BSTGeneric E2) {
        return isEqual(root, E2.root);
    }

    private boolean isEqual(Node node1, Node node2) {
        if (node1 == null && node2 == null) {
            return true;
        } else if (node1 == null || node2 == null) {
            return false;
        } else {
            return (isEqual(node1.left, node2.left)
                    && isEqual(node1.right, node2.right)
                    && (node1.data == node2.data));
        }
    }

    /**
     * Print everything in the tree
     */
    public void printAllPath() {
        Stack<E> stk = new Stack<E>();
        printAllPath(root, (Stack<E>) stk);
    }

    private void printAllPath(Node root, Stack<E> stk) {
        if (root == null) {
            return;
        }
        stk.push((E) root.data);
        if (root.left == null && root.right == null) {
            System.out.println(stk.toString());
            stk.pop();
            return;
        }
        printAllPath(root.right, stk);
        printAllPath(root.left, stk);
        stk.pop();
    }

    public int numFullNodesBT() {
        return numFullNodesBT(root);
    }

    private int numFullNodesBT(Node root) {
        int count = 0;
        if (root == null) {
            return 0;
        }
        count = numFullNodesBT(root.right) + numFullNodesBT(root.left);
        if (root.right != null && root.left != null) {
            count++;
        }
        return count;
    }

    /**
     * ***************************************************
     *
     * SEARCH
     *
     * * Sample exercise, given this code, we see that the compare method is
     * called twice. Can this be improved?
     *
     *****************************************************
     */
    public boolean search(E toSearch) {
        return search(root, toSearch);
    }

    private boolean search(Node<E> root, E toSearch) {
        if (root == null) {
            return false;
        } else if (compare(toSearch, root.data) == 0) {
            return true;
        } else if (compare(toSearch, root.data) < 0) {
            return search(root.left, toSearch);
        } else {
            return search(root.right, toSearch);
        }
    }

    /**
     * ***************************************************
     *
     * DELETE
     *
     *****************************************************
     */
    public void delete(E toDelete) {
        root = delete(root, toDelete);
    }

    /**
     * Sample exercise, given this code, we see that the compare method is
     * called twice. Can this be improved?
     *
     * @param root
     * @param toDelete
     * @return
     */
    private Node<E> delete(Node<E> root, E toDelete) {
        //if (root == null)  throw new RuntimeException("cannot delete.");
        if (root == null) {
            return null;
        } else if (compare(toDelete, root.data) < 0) {
            root.left = delete(root.left, toDelete);
            return root;
        } else if (compare(toDelete, root.data) > 0) {
            root.right = delete(root.right, toDelete);
            return root;
        } else if (root.left == null) {
            return root.right;
        } else if (root.right == null) {
            return root.left;
        } else {
            // get data from the rightmost node in the left subtree
            root.data = retrieveData(root.left);
            // delete the rightmost node in the left subtree
            root.left = delete(root.left, root.data);
        }
        return root;
    }

    private E retrieveData(Node<E> root) {
        while (root.right != null) {
            root = root.right;
        }

        return root.data;
    }

    /**
     * ***********************************************
     *
     * toString
     *
     *************************************************
     */
    public String toString() {
        StringBuffer sb = new StringBuffer();
        for (E data : this) {
            sb.append(data.toString());
        }
        return sb.toString();
    }

    /**
     * ***********************************************
     * TRAVERSAL * ************************************************
     */
    /**
     * Preorder traversal is used to create a copy of the tree. Algorithm: 1) if
     * Tree is empty, 2) return else 3) Visit the root 4) Preorder traverse the
     * left subtree 5) Preorder traverse the right subtree
     *
     * from:
     * https://www.geeksforgeeks.org/tree-traversals-inorder-preorder-and-postorder/
     */
    public void preOrderTraversal() {
        preOrderHelper(root);
    }

    private void preOrderHelper(Node root) {
        if (root != null) {
            System.out.print(root + " -> ");
            preOrderHelper(root.left);
            preOrderHelper(root.right);
        }
    }

    /**
     * Postorder traversal is used to delete the tree. Algorithm for PostOrder
     * Traversal 1) if the tree is empty 2) Return else 3) Postorder traverse
     * the left subtree 4) Postorder traverse the right subtree 5) Visit the
     * root. * from:
     * https://www.geeksforgeeks.org/tree-traversals-inorder-preorder-and-postorder/
     */
    public void postOrderTraversal() {
        postOrderHelper(root);
    }

    private void postOrderHelper(Node node) {
        if (node != null) {
            postOrderHelper(node.left);
            postOrderHelper(node.right);
            System.out.print(node + " <-- ");
        }
    }

    /**
     * Algorithm for Inorder traversal 1) if the tree is empty 2) return else 3)
     * Inorder traverse the left subtree 4) Visit the root 5) Inorder traverse
     * the right subtree
     *
     * Inorder traversal give nodes in non-decreasing order
     */
    public void inOrderTraversal() {
        inOrderHelper(root);
    }

    private void inOrderHelper(Node node) {
        if (node != null) {
            inOrderHelper(node.left);
            System.out.print(node + " <-> ");
            inOrderHelper(node.right);
        }
    }

    public BSTGeneric<E> getLeftSubtree() {
        if (root != null && root.left != null) {
            // We need to cast root.left as follows since the constructor cannot be converted to BSTGeneric
            // constructor won't handle it.
            return new BSTGeneric<E>((Comparator<E>) root.left);
        } else {
            return null;
        }
    }

    public BSTGeneric<E> getRightSubtree() {
        if (root != null && root.right != null) {
            return new BSTGeneric<E>((Comparator<E>) root.right);
        } else {
            return null;
        }
    }

    /**
     * Does this tree have any subtrees?
     *
     * @return Boolean
     */
    public boolean isLeaf() {
        return (root.left == null && root.right == null);
    }

    /**
     * Wikipedia Breadth First Search Breadth-first search (BFS) is an algorithm
     * for traversing or searching tree or graph data structures. It starts at
     * the tree root (or some arbitrary node of a graph, sometimes referred to
     * as a 'search key'[1]), and explores all of the neighbor nodes at the
     * present depth prior to moving on to the nodes at the next depth level.
     *
     * https://www.baeldung.com/java-breadth-first-search The basic approach of
     * the Breadth-First Search (BFS) algorithm is to search for a node into a
     * tree or graph structure by exploring neighbors before children. The idea
     * behind the BFS algorithm for trees is to maintain a queue of nodes that
     * will ensure the order of traversal. At the beginning of the algorithm,
     * the queue contains only the root node. We'll repeat these steps as long
     * as the queue still contains one or more nodes: Pop the first node from
     * the queue If that node is the one we're searching for, then the search is
     * over Otherwise, add this node's children to the end of the queue and
     * repeat the steps
     */
    public void levelOrderTraversal() {
        levelOrderTraversal(root);
    }

    private void levelOrderTraversal(Node root) {
        if (root != null) {
            int h = height(root);
            for (int i = 1; i <= h; i++) {
                printGivenLevel(root, i);
            }
        }
    }

    /**
     * Prints all nodes at desired level
     *
     * @param root
     * @param level
     */
    private void printGivenLevel(Node root, int level) {
        if (root == null) {
            return;
        }
        if (level == 1) {
            System.out.print(root.data + " ");
        } else if (level > 1) {
            printGivenLevel(root.left, level - 1);
            printGivenLevel(root.right, level - 1);
        }
    }

    /**
     * ***********************************************
     *
     * CLONE
     *
     * Deep copy of an object will have exact copy of all the fields of original
     * object just like shallow copy. But in additional, if original object has
     * any references to other objects as fields, then copy of those objects are
     * also created by calling clone() method on them. From
     * https://javaconceptoftheday.com/difference-between-shallow-copy-vs-deep-copy-in-java/
     *
     *************************************************
     */
    public BSTGeneric<E> clone() {
        BSTGeneric<E> twin = null;

        if (comparator == null) {
            twin = new BSTGeneric<E>();
        } else {
            twin = new BSTGeneric<E>(comparator);
        }

        twin.root = clone(root);
        return twin;
    }

    private Node<E> clone(Node<E> root) {
        if (root == null) {
            return null;
        } else {
            return new Node<E>(root.data, clone(root.left), clone(root.right));
        }
    }

    /**
     * ***********************************************
     *
     * MISC
     *
     * @return ************************************************
     */
    public int height() {
        return height(root);
    }

    private int height(Node<E> root) {
        if (root == null) {
            return 0;
        } else {
            return 1 + Math.max(height(root.left), height(root.right));
        }
    }

    public int countLeaves() {
        return countLeaves(root);
    }

    private int countLeaves(Node<E> root) {
        if (root == null) {
            return 0;
        } else if (root.left == null && root.right == null) {
            return 1;
        } else {
            return countLeaves(root.left) + countLeaves(root.right);
        }
    }

    //This method restores a BSTGeneric given preorder and inorder traversals
    public void restore(E[] pre, E[] in) {
        root = restore(pre, 0, pre.length - 1, in, 0, in.length - 1);
    }

    private Node<E> restore(E[] pre, int preL, int preR, E[] in, int inL, int inR) {
        if (preL <= preR) {
            int count = 0;
            //find the root in the inorder array
            while (pre[preL] != in[inL + count]) {
                count++;
            }

            Node<E> tmp = new Node<E>(pre[preL]);
            tmp.left = restore(pre, preL + 1, preL + count, in, inL, inL + count - 1);
            tmp.right = restore(pre, preL + count + 1, preR, in, inL + count + 1, inR);
            return tmp;
        } else {
            return null;
        }
    }

    //The width of a binary tree is the maximum number of elements on one level of the tree.
    public int width() {
        int max = 0;
        for (int k = 0; k <= height(); k++) {
            int tmp = width(root, k);
            if (tmp > max) {
                max = tmp;
            }
        }
        return max;
    }
    //rerturns the number of node on a given level

    public int width(Node<E> root, int depth) {
        if (root == null) {
            return 0;
        } else if (depth == 0) {
            return 1;
        } else {
            return width(root.left, depth - 1) + width(root.right, depth - 1);
        }
    }

    //The diameter of a tree is the number of nodes
    //on the longest path between two leaves in the tree.
    public int diameter() {
        return diameter(root);
    }

    private int diameter(Node<E> root) {
        if (root == null) {
            return 0;
        }

        //the path goes through the root
        int len1 = height(root.left) + height(root.right) + 3;

        //the path does not pass the root
        int len2 = Math.max(diameter(root.left), diameter(root.right));

        return Math.max(len1, len2);
    }

    /**
     * *******************************
     * From Data Structures, Edition 2, Koffman and Wolfgang page 319-328 Page
     * 285 Edition 3
     */
    /**
     * Starter method find pre: The target object must implement the Comparable
     * interface.
     *
     * @param target The object being sought
     * @return The object, if found, otherwise null;
     */
    public E find(E target) {
        return find(root, target);
    }

    /**
     * Recursive find method. It is more efficient to call compareTo once and
     * save the result in a local variable.
     *
     * @param localRoot
     * @param target
     * @return The object, if found, otherwise null;
     */
    private E find(Node<E> localRoot, E target) {
        if (localRoot == null) {
            return null;
        }

        int compResult = target.compareTo(localRoot.data);
        if (compResult == 0) {
            return localRoot.data;
        } else if (compResult < 0) {
            return find(localRoot.left, target);
        } else {
            return find(localRoot.right, target);
        }
    }

    public boolean contains(E target) {
        return contains(root, target);
    }

    private boolean contains(Node<E> localRoot, E target) {
        if (find(localRoot, target) == null) {
            return false;
        }
        return true;
    }

    /**
     * Starter method add pre: the object to insert must implement the
     * Comparable interface
     *
     * See:
     * https://howtodoinjava.com/java/collections/java-comparable-interface/
     *
     * @param data
     * @return If the object is inserted, true if the object already exists in
     * the tree, false
     *
     * returns boolean
     */
    public boolean add(E data) {
        root = add(root, data);
        return addReturn;
    }

    /**
     * post: the data field addReturn is set true if the data is added to the
     * tree false if the data is already in the tree
     *
     * @param localRoot
     * @param data being added
     * @return True if the object is inserted, false if the object already
     * exists.
     */
    private Node<E> add(Node<E> localRoot, E data) {
        if (localRoot == null) {
            //item is not in tree - insert it.
            addReturn = true;
            return new Node<>(data);
        } else if (data.compareTo(localRoot.data) == 0) {
            //item is equal to localRoot.data
            addReturn = false;
            return localRoot;
        } else if (data.compareTo(localRoot.data) < 0) {
            //item is less than localRoot.data
            localRoot.left = add(localRoot.left, data);
            return localRoot;
        } else {
            //Item is greater than localRoot.data
            localRoot.right = add(localRoot.right, data);
            return localRoot;
        }
    }

    /**
     * find the node that is the inorder predecessor and replace it with its
     * left child(if any) post: The inorder predecessor is removed from the
     * tree.
     *
     * @param parent the parent of possible inorder predecessor(ip)
     * @return The data in the ip
     */
    private E findLargestChild(Node<E> parent) {
        //If the right child has no right child, it is the inorder predecessor
        if (parent.right.right == null) {
            E returnValue = parent.right.data;
            parent.right = parent.right.left;
            return returnValue;
        } else {
            return findLargestChild(parent.right);
        }
    }

    /**
     * ***************************************************
     *
     * TREE ITERATOR
     *
     *****************************************************
     */
    @Override
    public Iterator<E> iterator() {
        return new MyIterator();
    }

    //pre-order
    private class MyIterator implements Iterator<E> {

        Stack<Node<E>> stk = new Stack<Node<E>>();

        public MyIterator() {
            if (root != null) {
                stk.push(root);
            }
        }

        @Override
        public boolean hasNext() {
            return !stk.isEmpty();
        }

        @Override
        public E next() {
            Node<E> cur = stk.peek();
            if (cur.left != null) {
                stk.push(cur.left);
            } else {
                Node<E> tmp = stk.pop();
                while (tmp.right == null) {
                    if (stk.isEmpty()) {
                        return cur.data;
                    }
                    tmp = stk.pop();
                }
                stk.push(tmp.right);
            }

            return cur.data;
        }//end of next()

    }//end of MyIterator

    public void printDepthFirst() {
        System.out.println("printDepthFirst()");
        Stack<Node> stk = new Stack<Node>();
        Node temp;

        if (root != null) {
            stk.push(root);
        }
        while (stk.size() != 0) {
            temp = stk.pop();
            System.out.print(temp.data + " ");

            if (temp.left != null) {
                stk.push(temp.left);
            }
            if (temp.right != null) {
                stk.push(temp.right);
            }
        }
    }//end of printDepthFirst

    public void CreateBinaryTree(int[] arr) {
        root = CreateBinaryTree(arr, 0, arr.length - 1);
    }

    private Node CreateBinaryTree(int[] arr, int start, int end) {
        Node curr = null;
        if (start > end) {
            return null;
        }
        int mid = (start + end) / 2;
        curr = new Node(arr[mid]);
        curr.left = CreateBinaryTree(arr, start, mid - 1);
        curr.right = CreateBinaryTree(arr, mid + 1, end);
        return curr;
    }

    public void printLeafNodes() {
        printLeafNodes(root);
    }

    private void printLeafNodes(Node node) {
        if (node == null) {
            return;
        }
        if (node.left == null && node.right == null) {
//            System.out.printf("%d ", node.data);
            System.out.println(node.data);
        }

        printLeafNodes(node.left);
        printLeafNodes(node.right);
    }

    public Node<E> findMin() {
        Node node = root;
        if (node == null) {
            return null;
        }
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }

    public Node<E> findMax() {
        Node node = root;
        if (node == null) {
            return null;
        }
        while (node.right != null) {
            node = node.right;
        }
        return node;
    }

//    Node<E> root
    //https://stackoverflow.com/questions/4965335/how-to-print-binary-tree-diagram-in-java
    public void print() {
        print("", root, false);
    }

    public void print(String prefix, Node n, boolean isLeft) {
        if (n != null) {
            System.out.println(prefix + (isLeft ? "|-- " : "\\-- ") + n.data);
            print(prefix + (isLeft ? "|   " : "    "), n.left, true);
            print(prefix + (isLeft ? "|   " : "    "), n.right, false);
        }
    }

    /**
     * ***************************************************
     * the Node class See page 268 in 3rd edition
     * ****************************************************
     */
    public class Node<E> {

//        private E key;
        public E data;
        public Node<E> left;
        public Node<E> right;

        /**
         * See chapter on Trees, the constructor section
         *
         * @param data
         * @param l
         * @param r
         */
        public Node(E data, Node<E> l, Node<E> r) {
            left = l;
            right = r;
            this.data = data;
        }

        public Node(E data) {
            this(data, null, null);
        }

        public String toString() {
            return data.toString();
        }
    } //end of Node  

}//end of BSTGeneric

/**
 * Include in 10/30/19 lecture. Nah.
 *
 * @author JCSchneider
 */
class MyComp1 implements Comparator<Integer> {

    public int compare(Integer x, Integer y) {
        return y - x;
    }
}
