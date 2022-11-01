package Day_16;

import java.util.*;

public class Maximum_Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int num = sc.nextInt();
            int ans = after_swap_maximum_number(num);
            System.out.println(ans);
        }
        sc.close();
    }

    public static int after_swap_maximum_number(int num) {
        int length = 0;
        int copy = num;

        while (copy > 0) {
            length++;
            copy = copy / 10;
        }

        int[] arr = new int[length];
        int idx = 0;
        copy = num;

        while (copy > 0) {
            int rem = copy % 10;
            arr[idx++] = rem;
            copy = copy / 10;
        }
        Arrays.sort(arr);
        int finalNum = 0;

        for (int i = length - 1; i >= 0; i--) {
            finalNum = finalNum * 10 + arr[i];
        }

        return finalNum;
    }
}
