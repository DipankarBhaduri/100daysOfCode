package Day_57;

import java.util.*;

public class Most_Frequent_Element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();
        int[] ans = find_out_most_frequent_element(arr, n, k);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }

    static int[] find_out_most_frequent_element(int[] arr, int n, int k) {
        int[] ans = new int[k];

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int val : arr) {
            if (map.containsKey(val)) {
                int value = map.get(val);
                map.put(val, value + 1);
            } else {
                map.put(val, 1);
            }
        }

        int idx = 0;

        while (idx < k) {

            int maxFreqValue = 0;
            int maxFreq_number = 0;

            for (Map.Entry<Integer, Integer> e : map.entrySet()) {
                if (e.getValue() > maxFreqValue) {
                    maxFreqValue = e.getValue();
                    maxFreq_number = e.getKey();
                }
            }
            ans[idx++] = maxFreq_number;
            map.remove(maxFreq_number);
        }

        return ans;
    }
}
