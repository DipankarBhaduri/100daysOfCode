package Day_90;

import java.util.*;

public class Create_a_Graph_using_adjacency_list {

    // Edge class :-->>
    static class Edge {
        int src;
        int dest;
        int we;

        Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.we = w;
        }
    }

    public static void main(String[] args) {
        int V = 5;
        // Created new ArrayList of each new array index :-->>
        ArrayList<Edge>[] graph = new ArrayList[V];

        // Created new ArrayList of each new array index :-->>
        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<>();
        }

        // 0 -vertex :-->>
        graph[0].add(new Edge(0, 1, 5));

        // 1 -vertex :-->>
        graph[1].add(new Edge(1, 0, 5));
        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 3));

        // 2 -vertex :-->>
        graph[2].add(new Edge(2, 1, 1));
        graph[2].add(new Edge(2, 3, 1));
        graph[2].add(new Edge(2, 4, 2));

        // 3 -vertex :-->>
        graph[3].add(new Edge(3, 1, 3));
        graph[3].add(new Edge(3, 2, 1));

        // 4 -vertex :-->>
        graph[4].add(new Edge(4, 2, 2));

        // 2's neighbors :-->>
        for (int i = 0; i < graph[2].size(); i++) {
            Edge e = graph[2].get(i);
            System.out.println(e.dest);
        }
    }
}