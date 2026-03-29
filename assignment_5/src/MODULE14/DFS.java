package MODULE14;
import java.util.*;

public class DFS {

    static void dfs(ArrayList<ArrayList<Integer>> graph, int v, boolean[] visited) {
        visited[v] = true;
        System.out.print(v + " ");

        for (int n : graph.get(v)) {
            if (!visited[n])
                dfs(graph, n, visited);
        }
    }

    public static void main(String[] args) {

        int V = 5;
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < V; i++)
            graph.add(new ArrayList<>());

        graph.get(0).add(1);
        graph.get(0).add(2);
        graph.get(1).add(3);
        graph.get(2).add(4);

        boolean[] visited = new boolean[V];
        dfs(graph, 0, visited);
    }
}