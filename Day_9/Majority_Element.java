package Day_9;

import java.util.*;

/*

5
1 2 2 2 3
Output : 2

*/

public class Majority_Element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int ans = count_majority(arr);
        System.out.print(ans);
        sc.close();

    }

    public static int count_majority(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int val : arr) {
            if (map.containsKey(val)) {
                int fre = map.get(val);
                map.put(val, fre + 1);
            } else {
                map.put(val, 1);
            }
        }

        int maxfre = 0;
        int maxresult = 0;

        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            if (maxfre < e.getValue()) {
                maxfre = e.getValue();
                maxresult = e.getKey();
            }
        }

        return maxresult;
    }
}
