package Day_12;

import java.util.*;

public class Maximum_Distance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        int ans = max_distance(arr);
        System.out.print(ans);
    }

    public static int max_distance(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = arr.length;
        int max_dis = 0;

        for (int i = 0; i < n; i++) {
            if (!map.containsKey(arr[i])) {
                map.put(arr[i], i);

            } else {
                max_dis = Math.max(max_dis, i - map.get(arr[i]));
            }

        }

        return max_dis;
    }
}
