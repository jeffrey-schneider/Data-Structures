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
Based on https://www.geeksforgeeks.org/implementing-generic-graph-in-java/
 */
package Graph;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author jschneider
 */
public class Graph02<T> {
    //We use Hashmap to store the edges in the graph
    private Map<T, List<T>> map = new HashMap<>();
    static boolean ISBIDIRECTIONAL = true;
    //This function adds a new vertex to the graph
    public void addVertex(T s){
        map.put(s, new LinkedList<T>());
    }
    
    //This function adds the edge between
    // source and destination
    public void addEdge(T source,
                        T destination,
                        boolean bidirectional){
        if (!map.containsKey(source)){
            addVertex(source);
        }
        if (!map.containsKey(destination)){
            addVertex(destination);
        }
        map.get(source).add(destination);
        if(bidirectional){
            map.get(destination).add(source);
        }
    }
    
    //This function gives the count of vertices
    public void getVertexCount(){
        System.out.println("Graph has " +
                map.keySet().size()+
                " vertex.");
        }
    
    //This function gives the count of edges
    public void getEdgesCount(boolean bidirection){
        int count=0;
        for(T v: map.keySet()){
            count += map.get(v).size();
        }
        if (bidirection) {
            count = count/2;
        }
        System.out.println("Graph has " + 
                count + 
                " edges.");
    }
    
    //This function shows whether a vertex
    // is present or not.
    public void hasVertex(T s){
        if (map.containsKey(s)) {
            System.out.println(s + " is a vertex. ");
        }else{
            System.out.println(s + " is not a vertex. ");
        }
    }
    
    //This function shows whether an edgs is present.
    public void hasEdge(T s, T d){
        if (map.get(s).contains(d)) {
            System.out.println("Edge between " + s + " and " + d);
        }else{
            System.out.println("No edge between " + s + " and " + d);
        }
    }
    
    //Prints the adjancency list of each vertex.
    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        for(T v: map.keySet()){
            builder.append(v.toString() + ": ");
            for(T w: map.get(v)){
                builder.append(w.toString()+ " ");
            }
            builder.append("\n");
        }
        return builder.toString();
    }
    
    public static void main(String[] args) {
        //Object of graph is created
        Graph02<Integer> g = new Graph02<Integer>();
        //edges are added.
        // Graph02 is bidirectional so boolean is true
//        g.addEdge(0, 1, ISBIDIRECTIONAL);
//        g.addEdge(0, 4, ISBIDIRECTIONAL);
//        g.addEdge(1, 2, ISBIDIRECTIONAL);
//        g.addEdge(1, 3, ISBIDIRECTIONAL);
//        g.addEdge(1, 4, ISBIDIRECTIONAL);
//        g.addEdge(2, 3, ISBIDIRECTIONAL);
//        g.addEdge(3, 4, ISBIDIRECTIONAL);
        g.addEdge(3,5, ISBIDIRECTIONAL);
        g.addEdge(3,25, ISBIDIRECTIONAL);
        g.addEdge(3,8, ISBIDIRECTIONAL);
        g.addEdge(5,1,ISBIDIRECTIONAL);
        g.addEdge(5, 2, ISBIDIRECTIONAL);
        g.addEdge(25, 12, ISBIDIRECTIONAL);
        g.addEdge(25, 8, ISBIDIRECTIONAL);
        g.addEdge(12, 6, ISBIDIRECTIONAL);
        g.addEdge(6, 4, ISBIDIRECTIONAL);
        g.addEdge(6, 9, ISBIDIRECTIONAL);
        
        
        //Print graph
        System.out.println("Graph: " + g.toString());
        
        //Number of vertices
        g.getVertexCount();
        
        //Number of edges
        g.getEdgesCount(ISBIDIRECTIONAL);
        
        //Is edge present?
        g.hasEdge(3, 4);
        
        //Is vertex present?
        g.hasVertex(5);
    }
}
