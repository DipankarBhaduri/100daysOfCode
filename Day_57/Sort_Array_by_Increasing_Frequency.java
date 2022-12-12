package Day_57;

import java.util.*;

public class Sort_Array_by_Increasing_Frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();
        sort_the_array_by_Incressing_frequency(arr);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void sort_the_array_by_Incressing_frequency(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int val : arr) {
            if (map.containsKey(val)) {
                int value = map.get(val);
                map.put(val, value + 1);
            } else {
                map.put(val, 1);
            }
        }

        int ans[] = new int[arr.length];
        int idx = 0;

        while (idx < ans.length) {
            int maxFreqValue = Integer.MAX_VALUE;
            int maxFreq_number = Integer.MIN_VALUE;

            for (Map.Entry<Integer, Integer> e : map.entrySet()) {
                if (e.getValue() < maxFreqValue) {
                    maxFreqValue = e.getValue();
                    maxFreq_number = e.getKey();
                }

                if (e.getValue() == maxFreqValue && e.getKey() > maxFreq_number) {
                    maxFreqValue = e.getValue();
                    maxFreq_number = e.getKey();
                }
            }

            for (int i = 0; i < maxFreqValue; i++) {
                ans[idx++] = maxFreq_number;
            }

            map.remove(maxFreq_number);
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = ans[i];
        }
    }
}

/*
 * 
 * Input : 6
 * 1 1 2 2 2 3
 * 
 * Output :
 * 3 1 1 2 2 2
 * 
 */