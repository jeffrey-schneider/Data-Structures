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

From: https://stackabuse.com/graphs-in-java-representing-graphs-in-code/

Strengths: Uses 2d array for speed.
Weakness:  Uses 2d array - how to extend?
 */
package Graph;

/**
 *
 * @author jschneider
 */
public class Graph {
    private int numOfNodes;
    private boolean directed;
    private boolean weighted;
    private float[][] matrix;
    
    //We can safely add weighted graphs since we will
    // be able to check whether an edge exists without
    // relying on special values.
    private boolean[][] isSetMatrix;
    
    public Graph(int numOfNodes, boolean directed, boolean weighted){
        this.directed = directed;
        this.weighted = weighted;
        this.numOfNodes = numOfNodes;
        
        //initialize adjancency matrix
        matrix = new float[numOfNodes][numOfNodes];
        isSetMatrix = new boolean[numOfNodes][numOfNodes];
    }
    
    /*Since matrices for directed graphs are symmetrical, we have to add
    [destination][source] at the same time as [source][destination]
    */
    public void addEdge(int source, int destination){
        int valueToAdd = 1;
        
        if(weighted){
            valueToAdd=0;
        }
        matrix[source][destination] = valueToAdd;
        isSetMatrix[source][destination] = true;
        
        if(!directed){
            matrix[destination][source] = valueToAdd;
            isSetMatrix[destination][source] = true;
        }
    }
    
    /**In case graph isn't weighted but a weight is provided
     * ignore it and set [source,destination] value to 1.
     */
    public void addEdge(int source, int destination, float weight){
        float valueToAdd = weight;
        if(!weighted){
            valueToAdd = 1;
        }
        matrix[source][destination] = valueToAdd;
        isSetMatrix[source][destination] = true;
        
        if(!directed){
            matrix[destination][source] = valueToAdd;
            isSetMatrix[destination][source] = true;
        }
    }
    
   /**
    *Method allowing adjacency printout 
    */
    public void printMatrix(){
        for (int i = 0; i < numOfNodes; i++) {
            for (int j = 0; j < numOfNodes; j++) {
                if(isSetMatrix[i][j])
                    System.out.format("%8s", String.valueOf(matrix[i][j]));
                else
                    System.out.format("%8s", "/ ");
            }
            System.out.println("");
            }
        }
    
    /**
     * Print out edges in a more understandable way
     * 
     */
    public void printEdges(){
        for (int i = 0; i < numOfNodes; i++) {
            System.out.print("Node: " + i + " connects to: ");
            for (int j = 0; j < numOfNodes; j++) {
                if(isSetMatrix[i][j]){
                    System.out.print(j + " ");
                }
            }
            System.out.println("");
        }
    }
    
    public boolean hasEdge(int source, int destination){
        return isSetMatrix[source][destination];
    }
    
    public Float getEdgeValue(int source, int destination){
        if(!weighted || !isSetMatrix[source][destination])
            return null;
        return matrix[source][destination];
    }
}
