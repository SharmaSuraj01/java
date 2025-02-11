package Graphs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class Cycle {
    HashMap<Integer, HashSet<Integer>>map;

    public Cycle(int v){
        map=new HashMap<>();

        for(int i=1;i<=v;i++){
            map.put(i,new HashSet<>());
        }
    }
    public void addEdge(int v1,int v2){
        map.get(v1).add(v2);
        map.get(v2).add(v1);
    }

    public void BFS(int src ,int dest){
        HashSet<Integer> visit=new HashSet<>();
        Queue<Integer> q=new LinkedList<>();
        q.add(src);
        while(!q.isEmpty()){
            //remove
            int rv=q.poll();
            //ignore
            if(visit.contains(rv)){
                System.out.println("Cycle");
                return;
            }
            //visit
            visit.add(rv);
            //nbrs add
            for(int nbrs:map.get(rv)){
                if(!visit.contains(nbrs)){
                    q.add(nbrs);
                }
            }
        }
        System.out.println("no cycle");
    }
}
