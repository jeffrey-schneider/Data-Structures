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
package Graph.javaTpoint;

/**
 *
 * @author jschneider
 */
public class GraphTest {
    public static void main(String[] args) {
        Graph graph = new Graph();
        //add edges
        graph.addNewEdge(0, 1, true);
        graph.addNewEdge(0, 4, true);
        graph.addNewEdge(1,2,true);
        graph.addNewEdge(1, 3, false);
        graph.addNewEdge(1, 4, true);
        graph.addNewEdge(2, 3, true);
        graph.addNewEdge(2, 4, true);
        graph.addNewEdge(3, 0, true);
        graph.addNewEdge(2, 0, true);
        
        System.out.println("Adjacency List: " + graph.toString());
        //vertices number
        System.out.println("Vertices: " + graph.countVertices());
        //count edges
        System.out.println("Edges: " + graph.countEdges(true));
        System.out.println("Edge between 3 and 4? " + graph.containsEdge(3, 4));
        System.out.println("Edge between 2 and 4? " + graph.containsEdge(2, 4));
        System.out.println("Contains vertex 3 " + graph.containsVertex(3) );
        System.out.println("Contains vertex 5 " + graph.containsVertex(5));
        
    }
}
