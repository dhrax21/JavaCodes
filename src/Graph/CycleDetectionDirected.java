package Graph;

import java.util.ArrayList;
import java.util.Scanner;

public class CycleDetectionDirected {

    public boolean isCyclic(int V, ArrayList<Integer>[] adj) {
        boolean[] vis=new boolean[V];
        boolean[] rec=new boolean[V];

        for(int i=0; i<V; i++){
            if(isCyclicUtil(i,vis,rec,adj)){
                return true;
            }
        }
        return false;
    }
    private boolean isCyclicUtil(int v, boolean[] visited, boolean[] recStack, ArrayList<Integer>[] adj) {
        if (!visited[v]) {
            visited[v] = true;
            recStack[v] = true;

            for (int i = 0; i < adj[v].size(); i++) {
                if (!visited[adj[v].get(i)] && isCyclicUtil(adj[v].get(i), visited, recStack, adj)) {
                    return true;
                } else if (recStack[adj[v].get(i)]) {
                    return true;
                }
            }
        }
        recStack[v] = false;
        return false;
    }
}
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int V, E;
        V = sc.nextInt();
        E = sc.nextInt();
        ArrayList<Integer>[] adj = new ArrayList[V];
        for (int i = 0; i < V; i++) {
            adj[i] = new ArrayList<Integer>();
        }
        for (int i = 0; i < E; i++) {
            int u, v;
            u = sc.nextInt();
            v = sc.nextInt();
            adj[u].add(v);
        }
        CycleDetectionDirected obj = new CycleDetectionDirected();
        boolean ans = obj.isCyclic(V, adj);
        if (ans == true) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}