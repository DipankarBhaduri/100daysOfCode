package Day_68;

import java.util.*;
import java.io.*;

public class Orange_rotation {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        Solution obj = new Solution();
        System.out.println(obj.orangesRotting(arr));
    }
}

class Solution {
    public static int orangesRotting(int[][] grid) {
        if (grid == null || grid.length == 0)
            return 0;
        int rows = grid.length;
        int cols = grid[0].length;
        Queue<int[]> queue = new LinkedList<>();
        int count_fresh = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 2) {
                    queue.offer(new int[] { i, j });
                } else if (grid[i][j] == 1) {
                    count_fresh++;
                }
            }
        }
        // if count of fresh oranges is zero --> return 0
        if (count_fresh == 0)
            return 0;
        int count = 0;
        int[][] dirs = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };
        // bfs starting from initially rotten oranges
        while (!queue.isEmpty()) {
            ++count;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int[] point = queue.poll();
                for (int dir[] : dirs) {
                    int x = point[0] + dir[0];
                    int y = point[1] + dir[1];
                    // if x or y is out of bound
                    // or the orange at (x , y) is already rotten
                    // or the cell at (x , y) is empty
                    // we do nothing
                    if (x < 0 || y < 0 || x >= rows || y >= cols || grid[x][y] == 0 || grid[x][y] == 2)
                        continue;
                    // mark the orange at (x , y) as rotten
                    grid[x][y] = 2;
                    // put the new rotten orange at (x , y) in queue
                    queue.offer(new int[] { x, y });
                    // decrease the count of fresh oranges by 1
                    count_fresh--;
                }
            }
        }
        return count_fresh == 0 ? count - 1 : -1;
    }
}
