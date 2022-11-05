package Day_20;

import java.util.*;

public class First_Come_First_Serve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fre = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();
        int ans = check_first_come_with_k_fre(arr, fre);
        System.out.print(ans);
    }

    public static int check_first_come_with_k_fre(int[] arr, int fre) {
        int n = arr.length;
        if (fre > n) {
            return -1;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int cur = arr[i];
            if (map.containsKey(cur)) {
                int val = map.get(cur);
                map.put(cur, val + 1);
            } else {
                map.put(cur, 1);
            }
        }
        for (int i = 0; i < n; i++) {
            int curVal = arr[i];
            if (map.get(curVal) == fre) {
                return curVal;
            }
        }
        return -1;
    }
}
