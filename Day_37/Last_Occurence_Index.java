package Day_37;

import java.util.Scanner;

class Solution {
    static int lastIndex(int A[], int T, int startIndex) {
        int last = -1;

        for (int i = startIndex; i >= 0; i--) {
            if (A[i] == T) {
                last = i;
                break;
            }
        }
        return last;
    }
}

class Last_Occurence_Index {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = s.nextInt();
        }
        int T = s.nextInt();
        System.out.println(Solution.lastIndex(A, T, N - 1));
    }
}