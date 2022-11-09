package Day_24;

import java.util.*;

public class Maximum_Product_of_Three_Elements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();
        int ans = max_product_of_three_element(arr);
        System.out.print(ans);
    }

    public static int max_product_of_three_element(int[] arr) {
        int n = arr.length;
        int maxProduct = 1;

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    int curProduct = arr[i] * arr[j] * arr[k];
                    maxProduct = Math.max(maxProduct, curProduct);
                }
            }
        }

        return maxProduct;
    }
}
