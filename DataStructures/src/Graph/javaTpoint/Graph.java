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

import java.util.*;

/**
 *
 * @author jschneider
 */
public class Graph<T> {

    //creating a Map object storing the graph edges
    private Map<T, List<T>> map = new HashMap<>();

    /**
     * Adds a new vertex to the graph
     *
     * @param s
     */
    public void addNewVertex(T s) {
        map.put(s, new LinkedList<T>());
    }

    /**
     * Adds an edge between source and destination If bidirectional, adds contra
     * edge.
     *
     * @param source
     * @param destination
     * @param bidrectional
     */
    public void addNewEdge(T source, T destination, boolean bidrectional) {
        if (!map.containsKey(source)) {
            addNewVertex(source);
        }
        if (!map.containsKey(destination)) {
            addNewVertex(destination);
        }
        map.get(source).add(destination);
        if (bidrectional) {
            map.get(destination).add(source);
        }
    }

    public boolean containsVertex(T s){
        return map.containsKey(s);
    }
    /**
     * Counts the number of vertices.
     *
     * @return integer of vertices count.
     */
    public int countVertices() {
        return map.keySet().size();
    }

    public int countEdges(boolean bidirection) {
        int edgeCount = 0;
        for (T v : map.keySet()) {
            edgeCount += map.get(v).size();
        }
        if (bidirection) {
            edgeCount /= 2;
        }
        return edgeCount;
    }

    /**
     * Is there an edge between s and d?
     *
     * @param s
     * @param d
     * @return
     */
    public boolean containsEdge(T s, T d) {
        return map.get(s).contains(d);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        //Iterate over keys
        for (T v : map.keySet()) {
            sb.append(v.toString() + ": ");
            for (T w : map.get(v)) {
                sb.append(w.toString() + " ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
