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
package Graph;

/**
 *
 * @author jschneider
 */
public class GraphTest {
    public static void main(String[] args) {
        Graph graph = new Graph(5, false, true);
        graph.addEdge(0, 2, 19);
        graph.addEdge(0, 3, -2);
        graph.addEdge(1, 2, 3);
        graph.addEdge(1,3); //default weight is 0
        graph.addEdge(1, 4);
        graph.addEdge(2,3);
        graph.addEdge(3, 4);
        
        graph.printMatrix();
        System.out.println("\n");
        graph.printEdges();
        
        System.out.println("");
        System.out.println("Check for edge from 1 to 0");
        if (graph.hasEdge(0, 1)) {
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
