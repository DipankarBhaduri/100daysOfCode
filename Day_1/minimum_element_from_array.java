package Day_1;

import java.util.Scanner;

public class minimum_element_from_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("The minimum value from the array is " + get_minimum_number(arr));
    }

    public static int get_minimum_number(int[] arr) {
        int minimum = arr[0];
        for (int current_value : arr) {
            if (current_value < minimum) {
                minimum = current_value;
            }
        }
        return minimum;
    }
}