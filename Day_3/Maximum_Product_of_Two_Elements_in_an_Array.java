package Day_3;

import java.util.*;

public class Maximum_Product_of_Two_Elements_in_an_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = Maximum_Product_of_two_element(arr);
        System.out.print(result);

    }

    public static int Maximum_Product_of_two_element(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int ans = (arr[n - 1] - 1) * (arr[n - 2] - 1);
        return ans;
    }
}
