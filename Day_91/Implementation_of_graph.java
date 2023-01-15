package Day_91;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Implementation_of_graph {

    // Edge class --
    static class Edge {
        int src;
        int dest;
        int wt;

        // Constructor of Edge class --
        Edge(int src, int dest, int wt) {
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }

    // Create graph method to create the graph --
    static void createGraph(ArrayList<Edge>[] graph) {

        // Created of arraylist instreat of null point --
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        // 0 - vertex --
        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 1));

        // 1 - vertex --
        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 4, 1));

        // 2 - vertex --
        graph[2].add(new Edge(2, 0, 1));
        graph[2].add(new Edge(2, 3, 1));

        // 3 - vertex --
        graph[3].add(new Edge(3, 2, 1));
        graph[3].add(new Edge(3, 5, 1));

        // 4 - vertex --
        graph[4].add(new Edge(4, 1, 1));
        graph[4].add(new Edge(4, 6, 1));

        // 5 - vertex --
        graph[5].add(new Edge(5, 3, 1));
        graph[5].add(new Edge(5, 7, 1));

        // 6 - vertex --
        graph[6].add(new Edge(6, 4, 1));
        graph[6].add(new Edge(6, 7, 1));

        // 7 - vertex --
        graph[7].add(new Edge(7, 5, 1));
        graph[7].add(new Edge(7, 6, 1));
        graph[7].add(new Edge(7, 8, 1));

        // 8 - vertex --
        graph[8].add(new Edge(8, 7, 1));
    }

    // Breadth First Search --
    static void BFS(ArrayList<Edge>[] graph) {
        Queue<Integer> q = new LinkedList<>();
        boolean[] vis = new boolean[graph.length];
        q.add(0);

        while (!q.isEmpty()) {
            int curr = q.remove();
            if (!vis[curr]) {
                System.out.print(curr + " ");
                vis[curr] = true;

                for (int i = 0; i < graph[curr].size(); i++) {
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
        System.out.println();
    }

    // Depth First Search --
    static void DFS(ArrayList<Edge>[] graph, int cur, boolean[] vis) {
        System.out.print(cur + " ");
        vis[cur] = true;

        for (int i = 0; i < graph[cur].size(); i++) {
            Edge e = graph[cur].get(i);
            if (!vis[e.dest]) {
                DFS(graph, e.dest, vis);
            }
        }
    }

    // Main Function of this application --
    public static void main(String[] args) {

        // total number of vertex --
        int v = 9;

        // Created a Array of Arraylist of Edges --
        ArrayList<Edge>[] graph = new ArrayList[v];

        // Calling the createGraph method to create a graph --
        createGraph(graph);

        // Breadth First Search --
        BFS(graph);

        // Depth First Search --
        boolean[] vis = new boolean[v];
        int cur = 0;
        DFS(graph, cur, vis);
    }
}
