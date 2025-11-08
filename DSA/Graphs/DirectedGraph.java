package DSA.Graphs;
import java.util.*;

public class DirectedGraph {
    private Map<Integer, List<Integer>> adjacencyList;

    public DirectedGraph() {
        adjacencyList = new HashMap<>();
    }

    public void addEdge(int source, int destination) {
        adjacencyList.putIfAbsent(source, new ArrayList<>());
        adjacencyList.putIfAbsent(destination, new ArrayList<>());
        adjacencyList.get(source).add(destination);
    }

    public List<Integer> getNeighbors(int node) {
        return adjacencyList.getOrDefault(node, new ArrayList<>());
    }

    public Set<Integer> getNodes() {
        return adjacencyList.keySet();
    }
}
