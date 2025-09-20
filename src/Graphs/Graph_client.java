package Graphs;

import java.util.HashSet;

public class Graph_client {
    public static void main(String[] args) {
//        Graph gr=new Graph(7);
//        gr.addEdge(1,2,3);
//        gr.addEdge(1,4,2);
//        gr.addEdge(2,3,4);
//        gr.addEdge(3,4,10);
//        gr.addEdge(4,5,5);
//        gr.addEdge(5,6,9);
////        gr.addEdge(5,7,12);
//        gr.addEdge(6,7,6);
////        gr.display();
////        gr.removeVertex(4);
////        System.out.println(gr.hasPath(1,6,new HashSet<>()));
////        gr.PrintAllPath(1,6,new HashSet<>()," ");
////        System.out.println(gr.BFS(1,8));
//
////        System.out.println(gr.DFS(1,6));
//    gr.DFT();
//    }
    Cycle cl=new Cycle(7);
        cl.addEdge(1,2);
        cl.addEdge(1,4);
        cl.addEdge(2,3);
//        cl.addEdge(3,4);
        cl.addEdge(4,5);
        cl.addEdge(5,6);
        cl.addEdge(5,7);
        cl.addEdge(6,7);
        cl.BFS(1,7);
    }
}
