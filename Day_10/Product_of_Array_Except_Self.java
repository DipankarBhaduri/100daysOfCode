package Day_10;

import java.util.*;

public class Product_of_Array_Except_Self {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        long product = 1;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            product *= arr[i];
        }

        sc.close();
        productOfArray(arr, product);
    }

    public static void productOfArray(int[] arr, long product) {
        for (int val : arr) {
            System.out.print((product / val) + " ");
        }
    }
}

/*
 * 
 * Example 1
 * Input
 * 
 * 4
 * 4 3 2 10
 * Output
 * 
 * 60 80 120 24
 * Explanation
 * 
 * Product of array except 4 is 3*2*10=60
 * Product of array except 3 is 4*2*10=80
 * Product of array except 2 is 4*3*10=120
 * Product of array except 10 is 4*3*2=24
 * 
 */