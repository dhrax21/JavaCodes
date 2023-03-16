package Graph;

import java.util.*;

public class AdjacencyList {

   public class Edge{
       private int src;
       private int dest;

       private int weight;

        public Edge(int src, int dest,int w) {
            this.src = src;
            this.dest = dest;
            this.weight=w;
        }
    }

    public void createGraph(ArrayList<Edge>[] graph) {
        for(int i=0; i<graph.length;i++){
            graph[i]= new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0,1,2));

        graph[1].add(new Edge(0,2,4));
        graph[1].add(new Edge(1,3,7));

        graph[2].add(new Edge(1,2,7));
        graph[2].add(new Edge(2,4,3));

        graph[3].add(new Edge(3,5,1));

        graph[4].add(new Edge(4,2,2));
        graph[4].add(new Edge(4,5,5));
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

    public static class Pair implements Comparable<Pair>{
       int node;
       int dist;

       public Pair(int n,int d){
           this.dist=d;
           this.node=n;
       }

        @Override
        public int compareTo(Pair o) {
            return this.dist-o.dist;
        }
    }

    public void dijkstra(ArrayList<Edge> graph[],int src){
       PriorityQueue<Pair> pq=new PriorityQueue<>();
       int[] dist=new int[5];

       for(int i=0; i<5; i++){
           if(dist[i] != src){
               dist[i]=Integer.MAX_VALUE;
           }
       }
       boolean[] vis=new boolean[5];
       pq.add(new Pair(0,0));

       while(!pq.isEmpty()){
           Pair curr=pq.remove();

           if(!vis[curr.node]){
               vis[curr.node]=true;

               for (int i = 0; i < graph[curr.node].size(); i++) {
                   Edge e=graph[curr.node].get(i);
                   int u=e.src;
                   int v=e.dest;

                   if(dist[u]+e.weight<dist[v]){
                       dist[v]=dist[u]+ e.weight;
                   }
               }
           }
       }
        System.out.println(Arrays.toString(dist));
    }
}

