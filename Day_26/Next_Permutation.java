package Day_26;

import java.util.*;

public class Next_Permutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();
        modify_the_arrray_with_next_permutation(arr);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void modify_the_arrray_with_next_permutation(int[] arr) {
        /*
         * arr = 1 3 5 4 2 ;
         * there are 4 steps we have to follow
         * 
         * 1->> arr[i] < arr[i+1] --find out the i ; -----------------------> ( arr[1]
         * or 3 )
         * 2->> find out the grater value of arr[i]; -----------------------> ( arr[3]
         * or 4)
         * 3->> swap the values ; ------------------------------------------> ( after
         * swap 1 4 5 3 2 )
         * now 4th or final step after the 4 all element to be reversed and
         * if the that element is the last one then no need any reversing
         * 
         */

        int n = arr.length;
        int small = arr[0];
        int smallIdx = 0;

        int big = arr[n - 1];
        int bigIdx = n - 1;

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                small = arr[i];
                smallIdx = i;
                break;
            }
        }

        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] > small) {
                big = arr[i];
                bigIdx = i;
                break;
            }
        }

        arr[smallIdx] = big;
        arr[bigIdx] = small;

        // if (bigIdx != (n - 1)) {
        int rev[] = new int[n - bigIdx + 1];
        int idx = 0;

        for (int i = n - 1; i >= (bigIdx + 1); i--) {
            rev[idx++] = arr[i];
        }

        for (int i = bigIdx + 1; i < n; i++) {
            arr[i] = rev[--idx];
        }
        // }

    }
}
