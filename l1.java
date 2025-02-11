//import java.util.*;
//import java.util.ArrayList;
//public class l1 {
//    private HashMap<Integer,HashMap<Integer,Integer>>graph;
//    public  l1(int n){
//        this.graph=new HashMap<>();
//        for (int i=1;i<=n;i++){
//            this.graph.put(i,new HashMap<>());
//        }
//    }
//    public void addkey(int v1,int v2){
//        this.graph.get(v1).put(v2,-1);
//        this.graph.get(v2).put(v1,-1);
//    }
//    public void removeedge(int v1,int v2){
//        if(this.graph.get(v1).containsKey(v2)){
//            this.graph.get(v1).remove(v2);
//        }
//        if(this.graph.get(v2).containsKey(v1)){
//            this.graph.get(v2).remove(v1);
//        }
//    }
//    public boolean isneighbour(int v1,int v2){
//        return this.graph.get(v1).containsKey(v2);
//    }
//    public void print(){
//        for(int vertex:this.graph.keySet()){
//            HashMap<Integer,Integer>neighbours=this.graph.get(vertex);
//            System.out.print(vertex + ": ");
//            for (int neighbour : neighbours.keySet()) {
//                System.out.print(neighbour + " ");
//            }
//            System.out.println();
//        }
//    }
//    public static void bfs(ArrayList<ArrayList<Integer>>ls,int v,int src){
//        boolean[] visit=new boolean[v];
//        Queue<Integer>q=new LinkedList<>();
//        q.add(src);
//        visit[src]=true;
//        while(!q.isEmpty()){
//            int curr=q.poll();
//            System.out.print(curr+" ,");
//            ArrayList<Integer>neighbour= ls.get(src);
//            for(Integer nei:q){
//                if(!visit[nei]){
//                    q.add(nei);
//                    visit[src]=true;
//                }
//            }
//        }
//    }
////    public static void main(String[] args) {
////        l1 graph=new l1(8);
////        List<List<Integer>> ls = new ArrayList<>();
////        graph.addkey(0,1);
////        graph.addkey(0,2);
////        graph.addkey(0,3);
////        graph.addkey(2,4);
////        graph.addkey(3,4);
////        graph.addkey(5,6);
//////        bfs(ls,8,0);
////        graph.print();
////
////    }
//public static void main(String[] args) {
//    List<List<Integer>> graph = new ArrayList<>();
//    int vertices = 8;
//
//    for (int i = 0; i < vertices; i++) {
//        graph.add(new ArrayList<>());
//    }
//
//    graph.get(0).add(1);
//    graph.get(0).add(2);
//    graph.get(0).add(3);
//    graph.get(1).add(2);
//    graph.get(3).add(4);
//    graph.get(5).add(6);
////    bfs(graph, vertices, 0);\
//    bfs_
//}
//}
