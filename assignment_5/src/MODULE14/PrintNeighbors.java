package MODULE14;
import java.util.*;

public class PrintNeighbors {

    public static void main(String[] args) {

        int V = 4;
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < V; i++)
            graph.add(new ArrayList<>());

        graph.get(0).add(1);
        graph.get(0).add(2);

        int node = 0;

        System.out.println("Neighbors of " + node + ": " + graph.get(node));
    }
}