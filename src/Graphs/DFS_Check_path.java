package Graphs;

import java.util.ArrayList;

public class DFS_Check_path {
    private static boolean dfs_check(ArrayList<ArrayList<Integer>> ls, int v, int src,int parent, boolean[] visited){
        visited[src]=true;
        ArrayList<Integer>nei_list=ls.get(src);
        for(Integer nei:nei_list) {
            if (!visited[nei]) {
                dfs_check(ls, v, nei, src, visited);
            }
            if (nei != parent) {
                return true;
            }
        }
        return false;
    }
    private static boolean dfs_check_directed(ArrayList<ArrayList<Integer>> ls, int v, int src, boolean[] visited,boolean[] inpath){
        visited[src]=true;
        inpath[src]=true;
        ArrayList<Integer>nei_list=ls.get(src);
        for(Integer nei:nei_list) {
            if (!visited[nei]) {
                return dfs_check_directed(ls, v, nei, visited, inpath);
            }
            if (inpath[nei]) {
                return true;
            }
        }
        inpath[src]=false;
        return false;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> ls = new ArrayList<>();
        int vertices = 6;

        // Initialize the adjacency list for the graph
        for (int i = 0; i < vertices; i++) {
            ls.add(new ArrayList<>());
        }

        // Add edges to the graph
        ls.get(0).add(1);
        ls.get(0).add(2);
        ls.get(1).add(4);
        ls.get(1).add(3);
        ls.get(5).add(4);
        ls.get(4).add(1);
        System.out.println(dfs_check_directed(ls,vertices,0,new boolean[vertices],new boolean[vertices]));
    }
}
