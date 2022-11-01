package Day_16;

import java.util.*;

public class Maximum_Frequency_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int ans = maximum_frequency_num(arr);
            System.out.println(n - ans);
        }
        sc.close();
    }

    public static int maximum_frequency_num(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int val : arr) {
            if (map.containsKey(val)) {
                int temp = map.get(val);
                map.put(val, temp + 1);
            } else {
                map.put(val, 1);
            }
        }

        int fre = 0;
        for (int i = 0; i < arr.length; i++) {
            int temp = map.get(arr[i]);
            if (fre < temp) {
                fre = temp;
            }
        }

        return fre;
    }
}
