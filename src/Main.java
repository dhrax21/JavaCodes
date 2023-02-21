import DynamicProgramming.UniquePaths;
import Extra.CountAndSay;
import Extra.LargestNumber;
import Extra.PascalTriangle;
import Graph.AdjacencyList;
import Sorting.QuickSort;
import immutableClass.Database;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        AdjacencyList adj=new AdjacencyList();
        ArrayList<AdjacencyList.Edge> graph[]=new ArrayList[4];
        adj.createGraph(graph);

//        adj.printGraph(graph,3);
//        adj.bfs(graph,4);

          adj.dfs(graph,0,new boolean[4]);
    }


}