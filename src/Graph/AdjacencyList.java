package Graph;

import java.util.*;

public class AdjacencyList {

   public class Edge{
       private int src;
       private int dest;

        public Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }

    public void createGraph(ArrayList<Edge>[] graph) {
        for(int i=0; i<graph.length;i++){
            graph[i]= new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0,2));
        graph[1].add(new Edge(1,2));
        graph[1].add(new Edge(1,3));

        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,3));
        graph[2].add(new Edge(2,1));

        graph[3].add(new Edge(3,2));
        graph[3].add(new Edge(3,1));
    }

    public void printGraph(ArrayList<Edge>[] graph,int index){
        for (int i = 0; i < graph[index].size(); i++) {
            Edge e=graph[index].get(i);
            System.out.print(e.dest+"->");
        }
        System.out.print("End!");
    }

    public void bfs(ArrayList<Edge> graph[],int v){
       Queue<Integer> q=new LinkedList<>();
       boolean[] vis=new boolean[v];

       q.add(0);
       while(!q.isEmpty()){
           int curr=q.remove();

           if(vis[curr]==false){
               System.out.print(curr+" ");
               vis[curr]=true;

               for(int i=0;i<graph[curr].size(); i++){
                   Edge e=graph[curr].get(i);
                   q.add(e.dest);
               }
           }
       }
    }
    public void dfs(ArrayList<Edge> graph[],int curr,boolean[] vis){
        System.out.print(curr+"->");
        vis[curr]=true;

        for(int i=0; i<graph[curr].size(); i++){
            Edge e=graph[curr].get(i);
            if(vis[e.dest]==false){
                dfs(graph,e.dest,vis);
            }
        }
    }

}
