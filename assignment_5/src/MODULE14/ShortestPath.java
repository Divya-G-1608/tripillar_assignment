package MODULE14;
import java.util.*;

public class ShortestPath {

    public static void main(String[] args) {

        int V = 5;
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < V; i++)
            graph.add(new ArrayList<>());

        graph.get(0).add(1);
        graph.get(1).add(2);
        graph.get(2).add(3);
        graph.get(3).add(4);

        int[] dist = new int[V];
        Arrays.fill(dist, -1);

        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        dist[0] = 0;

        while (!q.isEmpty()) {
            int node = q.poll();

            for (int n : graph.get(node)) {
                if (dist[n] == -1) {
                    dist[n] = dist[node] + 1;
                    q.add(n);
                }
            }
        }

        System.out.println(Arrays.toString(dist));
    }
}