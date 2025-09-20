import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class newBfs {
    public static void bfs_all(ArrayList<ArrayList<Integer>> ls,int v,int src) {
        boolean[] visit = new boolean[v];
        visit[src] = true;
//        int c=0;
        for (int i = 0; i <v; i++) {
            bfs(ls, v, i, visit);


        }
    }
    public static void bfs(ArrayList<ArrayList<Integer>>ls, int v, int src,boolean[] visit){
//        boolean[] visit=new boolean[v];
        Queue<Integer> q=new LinkedList<>();
        q.add(src);
        visit[src]=true;
        while(!q.isEmpty()){
            int curr=q.poll();
            System.out.print(curr+" ,");
            ArrayList<Integer>neighbour= ls.get(src);
            for (Integer nei : ls.get(curr)) {
                if (!visit[nei]) {
                    q.add(nei);
                    visit[nei] = true;
                }
            }
        }
    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> ls = new ArrayList<>();
        int vertices = 8;

        // Initialize the adjacency list for the graph
        for (int i = 0; i < vertices; i++) {
            ls.add(new ArrayList<>());
        }

        // Add edges to the graph
        ls.get(0).add(1);
        ls.get(0).add(2);
        ls.get(0).add(3);
        ls.get(1).add(2);
        ls.get(3).add(4);
        ls.get(5).add(6);

//        System.out.println("BFS traversal starting from vertex 0:");
//        bfs(ls, vertices, 0,null);
        bfs_all(ls,vertices,0);
    }}
