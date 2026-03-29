package MODULE14;
import java.util.*;

public class Bipartite {

    public static void main(String[] args) {

        int V = 4;
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < V; i++)
            graph.add(new ArrayList<>());

        graph.get(0).add(1);
        graph.get(1).add(0);

        graph.get(1).add(2);
        graph.get(2).add(1);

        graph.get(2).add(3);
        graph.get(3).add(2);

        int[] color = new int[V];
        Arrays.fill(color, -1);

        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        color[0] = 0;

        boolean isBipartite = true;

        while (!q.isEmpty()) {
            int node = q.poll();

            for (int n : graph.get(node)) {
                if (color[n] == -1) {
                    color[n] = 1 - color[node];
                    q.add(n);
                } else if (color[n] == color[node]) {
                    isBipartite = false;
                }
            }
        }

        System.out.println("Bipartite: " + isBipartite);
    }
}