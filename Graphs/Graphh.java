package Graphs;

import java.util.*;

public class Graphh {
    private HashMap<Integer, HashMap<Integer, Integer>> graph;

    public Graphh(int n) {
        this.graph = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            this.graph.put(i, new HashMap<>());
        }
    }

    public void addEdge(int v1, int v2) {
        this.graph.get(v1).put(v2, -1);
        this.graph.get(v2).put(v1, -1);
    }

    public void removeEdge(int v1, int v2) {
        if (this.graph.get(v1).containsKey(v2)) {
            this.graph.get(v1).remove(v2);
        }
        if (this.graph.get(v2).containsKey(v1)) {
            this.graph.get(v2).remove(v1);
        }
    }

    public boolean isNeighbour(int v1, int v2) {
        return this.graph.get(v1).containsKey(v2);
    }

    public void print() {
        for (int vertex : this.graph.keySet()) {
            HashMap<Integer, Integer> neighbours = this.graph.get(vertex);
            System.out.print(vertex + ": ");
            for (int neighbour : neighbours.keySet()) {
                System.out.print(neighbour + " ");
            }
            System.out.println();
        }
    }
    private static void dfs(ArrayList<ArrayList<Integer>> ls,int v,int src,boolean[] visited){
        System.out.println(src+" ");
        visited[src]=true;
        ArrayList<Integer>nei_list=ls.get(src);
        for(Integer nei:nei_list){
            if(!visited[nei]){
                dfs(ls,v,nei,visited);
            }
        }

    }
    public static void bfs_all(ArrayList<ArrayList<Integer>> ls,int v,int src){

        boolean[] visit = new boolean[v];

        visit[src] =true;
//        int c=0;
        for(int i=1;i<=v;i++){
            bfs(ls,v,i,visit);


        }
//        System.out.print(c);
    }

    public static void bfs(ArrayList<ArrayList<Integer>> ls, int v, int src,boolean[] visit) {
        Queue<Integer> q = new LinkedList<>();
        q.add(src);
        visit[src] = true;
        while (!q.isEmpty()) {
            int curr = q.poll();
            System.out.print(curr + " ");

            for (Integer nei : ls.get(curr)) {
                if (!visit[nei]) {
                    q.add(nei);
                    visit[nei] = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        Graphh graph = new Graphh(8);
        ArrayList<ArrayList<Integer>> ls = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            ls.add(new ArrayList<>());
        }

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(0, 3);
        graph.addEdge(2, 4);
        graph.addEdge(3, 4);
        graph.addEdge(5, 6);

        // Add edges to the adjacency list
        ls.get(0).add(1);
        ls.get(0).add(2);
        ls.get(0).add(3);
        ls.get(2).add(4);
        ls.get(3).add(4);
        ls.get(5).add(6);
//        bfs(ls, 8, 0);
        dfs(ls,8,0,null);
    }

}
