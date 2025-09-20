package Graphs;

import java.util.*;

public class Graph {
    HashMap<Integer,HashMap<Integer,Integer>>map;

    public Graph(int v){
        map=new HashMap<>();

        for(int i=1;i<=v;i++){
            map.put(i,new HashMap<>());
        }
    }
    public void addEdge(int v1,int v2, int val){
        map.get(v1).put(v2,val);
        map.get(v2).put(v1,val);
    }
    public boolean containsEdge(int v1 ,int v2){
        return map.get(v1).containsKey(v2);
    }
    public boolean containsVertex(int v1){
        return map.containsKey(v1);
    }
    public int noOfEdge(){
        int Edge=0;
        for(int key: map.keySet()){
            Edge+=map.get(key).size();
        }
        return Edge;
    }
    public void removeEdge(int v1,int v2){
        if (containsEdge(v1,v2)) {
            map.get(v1).remove(v2);
            map.get(v2).remove(v1);
        }
    }
    public void removeVertex(int v1){
        if(containsVertex(v1)) {
            for (int nbrs : map.get(v1).keySet()) {
                map.get(nbrs).remove(v1);
            }
            map.remove(v1);
        }
    }
    public boolean hasPath(int src, int dest, HashSet<Integer>visited){
        if(src == dest){
            return true;
        }
        visited.add(src);
        for(int nbrs:map.get(src).keySet()){
            if(!visited.contains(nbrs)) {
                boolean ans = hasPath(nbrs, dest, visited);
                if (ans == true) {
                    return true;
                }
            }
        }
        visited.remove(src);
        return false;
    }
    public void PrintAllPath(int src, int dest, HashSet<Integer>visited,String ans){
        if(src == dest){
            System.out.println(ans);
            return;
        }
        visited.add(src);
        for(int nbrs:map.get(src).keySet()){
            if(!visited.contains(nbrs)) {
                PrintAllPath(nbrs, dest, visited,ans+src);
            }
        }
        visited.remove(src);
    }
    public boolean BFS(int src ,int dest){
        HashSet<Integer>visit=new HashSet<>();
        Queue<Integer>q=new LinkedList<>();
        q.add(src);
        while(!q.isEmpty()){
            //remove
            int rv=q.poll();
            //ignore
            if(visit.contains(rv)){
                continue;
            }//visit
            visit.add(rv);
            //self
            if(rv==dest){
                return true;
            }//nbrs add
            for(int nbrs:map.get(rv).keySet()){
                if(!visit.contains(nbrs)){
                    q.add(nbrs);
                }
            }
        }
        return false;
    }
    public void BFT(){
        HashSet<Integer>visit=new HashSet<>();
        Queue<Integer>q=new LinkedList<>();
        for(int key: map.keySet()){
            if (visit.contains(key)) {
                continue;
            }
        q.add(key);
        while(!q.isEmpty()) {
            //remove
            int rv = q.poll();
            //ignore
            if (visit.contains(rv)) {
                continue;
            }//visit
            System.out.println(rv);
            visit.add(rv);
            //nbrs add
            for (int nbrs : map.get(rv).keySet()) {
                if (!visit.contains(nbrs)) {
                    q.add(nbrs);
                }
            }
            System.out.println();
            }
        }
    }
    public boolean DFS(int src ,int dest){
        HashSet<Integer>visit=new HashSet<>();
        Stack<Integer>st=new Stack<>();
        st.add(src);
        while(!st.isEmpty()){
            //remove
            int rv=st.pop();
            //ignore
            if(visit.contains(rv)){
                continue;
            }//visit
//            System.out.println(rv);
            visit.add(rv);
            //self work
            if(rv==dest){
                return true;
            }//nbrs add
            for(int nbrs:map.get(rv).keySet()){
                if(!visit.contains(nbrs)){
                    st.push(nbrs);
                }
            }
        }
        return false;
    }
    public void DFT(){
        HashSet<Integer>visit=new HashSet<>();
        Stack<Integer>st=new Stack<>();
        for(int key: map.keySet()) {
            if (visit.contains(key)) {
                continue;
            }
            st.add(key);
            while (!st.isEmpty()) {
                //remove
                int rv = st.pop();
                //ignore
                if (visit.contains(rv)) {
                    continue;
                }//visit
                System.out.print(rv);
                visit.add(rv);
                //nbrs add
                for (int nbrs : map.get(rv).keySet()) {
                    if (!visit.contains(nbrs)) {
                        st.push(nbrs);
                    }
                }
            }
            System.out.println();
        }
    }

    public void display(){
        for(int key:map.keySet()){
            System.out.println(key+"->"+map.get(key));
        }
    }
}
