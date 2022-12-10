package Day_55;

import java.util.*;

public class Rank_of_the_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();
        int[] ans = make_the_rank_of_the_array(arr);
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    static int[] make_the_rank_of_the_array(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int val : arr) {
            set.add(val);
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (int val : set) {
            list.add(val);
        }

        Collections.sort(list);
        int[] ans = new int[arr.length];

        for (int i = 0; i < ans.length; i++) {
            ans[i] = helper_of_ranking_array(arr[i], list);
        }

        return ans;
    }

    static int helper_of_ranking_array(int n, ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == n) {
                return i + 1;
            }
        }

        return -1;
    }
}
