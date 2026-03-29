package MODULE14;
import java.util.*;

public class CycleDetection {

    static boolean dfs(ArrayList<ArrayList<Integer>> graph, int v,
                       boolean[] visited, int parent) {

        visited[v] = true;

        for (int n : graph.get(v)) {
            if (!visited[n]) {
                if (dfs(graph, n, visited, v))
                    return true;
            } else if (n != parent) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int V = 3;
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < V; i++)
            graph.add(new ArrayList<>());

        graph.get(0).add(1);
        graph.get(1).add(0);

        graph.get(1).add(2);
        graph.get(2).add(1);

        graph.get(2).add(0); // cycle edge
        graph.get(0).add(2);

        boolean[] visited = new boolean[V];

        boolean hasCycle = dfs(graph, 0, visited, -1);

        System.out.println("Cycle present: " + hasCycle);
    }
}