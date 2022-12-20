package Day_65;

import java.util.*;

public class Subarray_Problem_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();
        int ans = Subarray_Problem(arr, n);
        System.out.print(ans);

    }

    static int Subarray_Problem(int[] arr, int n) {
        if (n < 4) {
            return 0;
        }
        int ans = 0;
        int start = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            list.add(arr[i]);
        }

        if (n == 4) {
            boolean b = helper_of_Subarray_problem(list);
            if (b) {
                return 1;
            } else {
                return 0;
            }
        }

        boolean b = helper_of_Subarray_problem(list);
        if (b) {
            ans += 1;
        }

        for (int i = 4; i < n; i++) {
            list.remove(start);
            list.add(arr[i]);
            boolean b1 = helper_of_Subarray_problem(list);
            if (b1) {
                ans += 1;
            }
        }

        return ans;
    }

    static boolean helper_of_Subarray_problem(ArrayList<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i) < list.get(i + 1)) {
            } else {
                return false;
            }
        }
        return true;
    }
}
