/*Question: 1 of 1

Graphs: Edges

You are given an integer N. the number of edges in a graph.

Find the total number of nodes in the graph.

Note

A vertex or a node is one of the points on which the graph/tree is defined and m

connected by lines/edges.

Alphabets, numbers, or alphanumeric values denote a vertex.

Edge is the connection between two vertices.

Each edge connects one vertex to another vertex in the graph/tree.

Function Description

In the provided code snippet, implement the provided totalEdges (...) method to find the total number of nodes in the graph. You can write your code in the space below the phrase "WRITE YOUR LOGIC HERE"

There will be multiple test cases running so the input and Output should match

as provided.

The base Output variable result is set to a default value of 484 which can be

modified. Additionally, you can add or remove these output variables.

Input Format

The first line contains an integer N, denoting the number of edges. The next N lines contain 2 space-separated integers, X and Y, denoting an edge between nodes X and Y.

Sample Input

3 denotes N
12 denotes X and Y 
23 denotes X and Y
13 denotes X and Y

*/
import java.lang.*;
import java.io.*;
import java.util.*;

public class Main
{   
    public static int totalEdges(int N,int[][] edges){
        //this is default OUTPUT. You can change it.
        int result=-404;
        
        //WRITE YOUR LOGIC HERE
        int max=0;
        for(int i=0;i<N;i++){
            for(int j=0;j<2;j++){
                if(edges[i][j]>max){
                    max=edges[i][j];
                }
            }
        }
        result=max;


        //OUTPUT [uncomment & modify if required]




        


        return result;
    }
    public static void main(String[] args)
    {   
        //INPUT [uncomment & modify if required]
  
        Scanner sc=new Scanner(System.in);

        

        int N=sc.nextInt();
       

        int[][] edges=new int[N][2];

        for(int i=0;i<N;i++){
            for(int j=0;j<2;j++){
                edges[i][j]=sc.nextInt();
            }
        }
        //OUTPUT [uncomment & modify if required]
        System.out.println(totalEdges(N,edges));
    
    }
}


