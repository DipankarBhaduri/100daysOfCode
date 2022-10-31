package Day_15;

public class Bubble_sort {
    public static void main(String[] args) {
        int[] arr = { 7, 8, 3, 1, 2 };
        perfrom_bubble_sort(arr);
    }

    public static void perfrom_bubble_sort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j]; // TC ----> O(n^2) ;
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            print_array(arr);
        }

    }

    public static void print_array(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
