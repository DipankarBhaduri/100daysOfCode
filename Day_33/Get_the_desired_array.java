package Day_33;

import java.util.*;

public class Get_the_desired_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();
        int ans = countMinOperations(n, arr);
        System.out.print(ans);
    }

    public static int countMinOperations(int n, int[] arr)

    {

        int result = 0;

        while (true) {

            int zero_count = 0;

            int i;
            for (i = 0; i < n; i++) {

                if (arr[i] % 2 == 1)
                    break;

                else if (arr[i] == 0)
                    zero_count++;
            }

            if (zero_count == n)
                return result;

            if (i == n) {

                for (int j = 0; j < n; j++)
                    arr[j] = arr[j] / 2;
                result++;
            }

            for (int j = i; j < n; j++) {
                if (arr[j] % 2 == 1) {
                    arr[j]--;
                    result++;
                }
            }
        }
    }
}