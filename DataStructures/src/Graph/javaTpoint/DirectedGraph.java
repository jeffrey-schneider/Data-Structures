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

https://www.javatpoint.com/java-graph
 */
package Graph.javaTpoint;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jschneider
 */
public class DirectedGraph {
    class Edge{
        int source, destination;
        
        Edge(int source, int destination){
            this.source = source;
            this.destination = destination;
        }
    }
    
    class Graph{
        List<List<Integer>> adjlist = new ArrayList<>();
        public Graph(List<Edge> edges){
            int n = 0;
            for(Edge e:edges){
                n = Integer.max(n, Integer.max(e.source, e.destination));
            }
        }
    }
}
