package Day_33;

import java.util.*;

public class Box_Rotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        char ch[][] = new char[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                ch[i][j] = sc.next().charAt(0);
            }
        }

        sc.close();
        char[][] ans = rotateTheBox(ch);
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static char[][] rotateTheBox(char[][] box) {
        int r = box.length, c = box[0].length;
        char[][] box2 = new char[c][r];

        for (int i = 0; i < r; ++i) {
            int empty = c - 1;
            for (int j = c - 1; j >= 0; --j) {
                if (box[i][j] == '*') {
                    empty = j - 1;
                }
                if (box[i][j] == '#') {
                    box[i][j] = '.';
                    box[i][empty] = '#';
                    --empty;
                }
            }
        }

        for (int i = 0; i < r; ++i) {
            for (int j = c - 1; j >= 0; --j)
                box2[j][r - i - 1] = box[i][j];
        }

        return box2;
    }
}

/*
 * 
 * 2 4
 * # . * .
 * # # * .
 * 
 */