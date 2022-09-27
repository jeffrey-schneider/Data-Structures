/*
 * Copyright (C) 2022 jschneider
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
/** Implement Priority Queue using linked list
 * https://www.geeksforgeeks.org/priority-queue-using-linked-list/
 */
package PriorityQueue;

import java.util.*;

/**
 *
 * @author jschneider
 */
public class PriorityQueue {

    static Node node = new Node();

    static Node newNode(int d, int p) {
        Node temp = new Node();
        temp.data = d;
        temp.priority = p;
        temp.next = null;
        return temp;
    }

    //Return the value at head
    static int peek(Node head) {
        return (head).data;
    }

    static Node pop(Node head) {
        Node temp = head;
        (head) = (head).next;
        return head;
    }

    //Function to push according to priority
    static Node push(Node head, int d, int p) {
        Node start = (head);
        //Create new node
        Node temp = newNode(d, p);

        //Special case: The head of list has lesser
        // priority than new node. So insert new
        // node before head node and change head node.
        if ((head).priority > p) {
            //Insert new node before head
            temp.next = head;
            (head) = temp;
        } else { //Traverse the list and find a
            // position to insert new node
            while (start.next != null
                    && start.next.priority < p) {
                start = start.next;
            }

            //Either at the ends of the list
            // or at required position
            temp.next = start.next;
            start.next = temp;
        }
        return head;
    }

    static int isEmpty(Node head) {
        return ((head) == null) ? 1 : 0;
    }

    public static void main(String[] args) {
        Node pq = newNode(4, 1);
        pq = push(pq, 5, 2);
        pq = push(pq, 6, 3);
        pq = push(pq, 7, 0);
        pq = push(pq, 6, 10);
        pq = push(pq, 6, 43);
        pq = push(pq, 85, 3);

        while (isEmpty(pq) == 0) {
            System.out.printf("%d ", peek(pq));
            pq = pop(pq);
        }
    }

    static class Node {

        int data;
        int priority;
        Node next;
    }
}
