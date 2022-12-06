package Day_51;

import java.util.*;

public class Distance_of_nearest_cell_having_1 {
    public static void main(String[] args) {

    }
}

class Pair {
    int i_part;
    int j_part;
    int step;

    Pair(int i, int j, int s) {
        i_part = i;
        j_part = j;
        step = s;
    }
}

class Solution {
    // Function to find distance of nearest 1 in the grid for each cell.
    public int[][] nearest(int[][] grid) {
        // Code here
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        int[][] ans = new int[grid.length][grid[0].length];
        Queue<Pair> q = new ArrayDeque<>();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    q.add(new Pair(i, j, 0));
                    visited[i][j] = true;
                }
            }
        }
        int[] row = { 1, 0, -1, 0 };
        int[] col = { 0, 1, 0, -1 };
        while (q.size() > 0) {
            // remove
            Pair p = q.remove();
            // get data
            int ip = p.i_part;
            int jp = p.j_part;
            int steps = p.step;
            ans[ip][jp] = steps;
            // mark
            visited[ip][jp] = true;
            // add neighbours
            for (int i = 0; i < 4; i++) {
                int i_part = row[i] + ip;
                int j_part = col[i] + jp;
                if (i_part >= 0 && j_part >= 0 && i_part < grid.length && j_part < grid[0].length
                        && visited[i_part][j_part] == false) {
                    q.add(new Pair(i_part, j_part, steps + 1));
                    visited[i_part][j_part] = true;
                }
            }
        }
        return ans;
    }
}