package Graphs;

import java.util.ArrayList;
import java.util.Stack;

public class BFS_topology {
    private static void dfs(ArrayList<ArrayList<Integer>> ls, int v, int src, boolean[] visited, Stack<Integer>stack){
        visited[src]=true;
        ArrayList<Integer>nei_list=ls.get(src);
        for(Integer nei:nei_list){
            if(!visited[nei]){
                dfs(ls,v,nei,visited,stack);
            }
        }
        stack.push(src);

    }

}