////public class Leet684 {
////    import java.util.*;
////
////    class Solution {
////        public int[] findRedundantConnection(int[][] edges) {
////            int n = edges.length;
////            ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
////            for (int i = 0; i <= n; i++) {
////                graph.add(new ArrayList<>());
////            }
////
////            for (int[] edge : edges) {
////                int u = edge[0];
////                int v = edge[1];
////                graph.get(u).add(v);
////                graph.get(v).add(u);
////            }
////
////            boolean[] visited = new boolean[n + 1];
////            for (int[] edge : edges) {
////                int u = edge[0];
////                int v = edge[1];
////                visited[u] = true;
////                visited[v] = true;
////
////                if (dfsCheck(graph, n, u, -1, visited)) {
////                    return edge;
////                }
////
////                visited[u] = false;
////                visited[v] = false;
////            }
////
////            return new int[2]; // Placeholder
////        }
////
////        private boolean dfsCheck(ArrayList<ArrayList<Integer>> graph, int v, int src, int parent, boolean[] visited) {
////            visited[src] = true;
////            for (Integer nei : graph.get(src)) {
////                if (!visited[nei]) {
////                    if (dfsCheck(graph, v, nei, src, visited)) {
////                        return true;
////                    }
////                } else if (nei != parent) {
////                    return true;
////                }
////            }
////            return false;
////        }
////    }
////
////}
//
//import java.util.*;
//
//    // Function to perform topological sorting
//    private static void topologicalSort(int N, List<List<int[]>> graph, int[] inDegree) {
//        Queue<Integer> zeroInDegreeQueue = new LinkedList<>();
//        List<Integer> topoOrder = new ArrayList<>();
//
//        for (int i = 0; i < N; i++) {
//            if (inDegree[i] == 0) {
//                zeroInDegreeQueue.add(i);
//            }
//        }
//
//        while (!zeroInDegreeQueue.isEmpty()) {
//            int node = zeroInDegreeQueue.poll();
//            topoOrder.add(node);
//
//            for (int[] neighbor : graph.get(node)) {
//                int v = neighbor[0];
//                inDegree[v]--;
//                if (inDegree[v] == 0) {
//                    zeroInDegreeQueue.add(v);
//                }
//            }
//        }
//        return topoOrder;
//    }
//
//    // Function to find the shortest paths in a DAG
//    public static int[] shortestPathDAG(int N, int M, int[][] edges) {
//        // Create graph and in-degree array
//        List<List<int[]>> graph = new ArrayList<>();
//        for (int i = 0; i < N; i++) {
//            graph.add(new ArrayList<>());
//        }
//        int[] inDegree = new int[N];
//        int[] distances = new int[N];
//
//        // Initialize distances with infinity
//        Arrays.fill(distances, Integer.MAX_VALUE);
//
//        // Build the graph and calculate in-degrees
//        for (int[] edge : edges) {
//            int u = edge[0];
//            int v = edge[1];
//            int weight = edge[2];
//            graph.get(u).add(new int[]{v, weight});
//            inDegree[v]++;
//        }
//
//        // Perform topological sort
//        List<Integer> topoOrder = topologicalSort(N, graph, inDegree);
//
//        // Initialize distance from source vertex (0)
//        distances[0] = 0;
//
//        // Relax edges according to topological order
//        for (int u : topoOrder) {
//            if (distances[u] != Integer.MAX_VALUE) {
//                for (int[] neighbor : graph.get(u)) {
//                    int v = neighbor[0];
//                    int weight = neighbor[1];
//                    if (distances[v] > distances[u] + weight) {
//                        distances[v] = distances[u] + weight;
//                    }
//                }
//            }
//        }
//
//        // Replace unreachable distances with -1
//        for (int i = 0; i < N; i++) {
//            if (distances[i] == Integer.MAX_VALUE) {
//                distances[i] = -1;
//            }
//        }
//
//        return distances;
//    }
//
//    public static void main(String[] args) {
//        int N = 4;
//        int M = 2;
//        int[][] edges = {{0, 1, 2}, {0, 2, 1}};
//        int[] result = shortestPathDAG(N, M, edges);
//
//        System.out.println(Arrays.toString(result)); // Output: [0, 2, 1, -1]
//    }
//}
