package Day_50;

import java.util.*;

public class Shortest_Path_by_Removing_K_walls {
    public static void main(String[] args) {

    }
}

class Solution {
    public static final int[] dirX = { -1, 1, 0, 0 };
    public static final int[] dirY = { 0, 0, -1, 1 };
    public static final int DIRS = 4;

    static int shotestPath(int[][] mat, int n, int m, int k) {
        boolean[][][] vis = new boolean[n][m][k + 1];
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[] { 0, 0, 0, k });
        vis[0][0][k] = true;
        while (!queue.isEmpty()) {
            int[] curPos = queue.poll();
            if (curPos[0] == n - 1 && curPos[1] == m - 1) {
                return curPos[2];
            }
            for (int dir = 0; dir < DIRS; dir++) {
                int newX = curPos[0] + dirX[dir];
                int newY = curPos[1] + dirY[dir];
                int newK = curPos[3];
                if (!isSafe(newX, newY, n, m)) {
                    continue;
                }
                if (mat[newX][newY] == 0 && !vis[newX][newY][newK]) {
                    queue.add(new int[] { newX, newY, curPos[2] + 1, newK });
                    vis[newX][newY][newK] = true;
                } else if (newK > 0 && !vis[newX][newY][newK - 1]) {
                    queue.add(new int[] { newX, newY, curPos[2] + 1, newK - 1 });
                    vis[newX][newY][newK - 1] = true;
                }
            }
        }
        return -1;
    }

    static boolean isSafe(int x, int y, int n, int m) {
        return (x >= 0 && x < n && y >= 0 && y < m);
    }
}