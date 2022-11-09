package Day_24;

import java.util.*;

public class SORTED_SUBSEQUENCE_OF_SIZE_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();
        int ans = sorted_sequences_of_three(arr);
        System.out.print(ans);
    }

    static int sorted_sequences_of_three(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] < arr[j] && arr[j] < arr[k]) {
                        return 1;
                    }
                }
            }
        }

        return 0;
    }
}
