package DSA.Graphs;

import java.util.*;

public class TopologicalSort {

    public static void dfs(int node, int[] vis, Deque<Integer> stack, DirectedGraph graph) {
        vis[node] = 1;

        for(Integer neighbor : graph.getNeighbors(node)) {
            if(vis[neighbor] == 0) {
                dfs(neighbor, vis, stack, graph);
            }
        }

        stack.push(node);
    }
    public static void main(String[] args) {
        DirectedGraph graph = new DirectedGraph();
        graph.addEdge(5, 1);
        graph.addEdge(6, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(2, 4);

        int[] vis = new int[7];

        Deque<Integer> stack = new ArrayDeque<>();

        for(int i = 1; i < 7; i++) {
            if(vis[i] == 0) {
                dfs(i, vis, stack, graph);
            }
        }

        System.out.println("Topological Sort Order:");
        while(!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }


    }
}
