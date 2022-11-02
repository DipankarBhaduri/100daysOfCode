package Day_17;

public class Insertion_sort {
    public static void main(String[] args) {
        int[] arr = { 9, 4, 6, 7, 8, 2 };

        int n = arr.length;
        perfrom_insertion_sort(arr);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void perfrom_insertion_sort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int cur = arr[i];
            int j = i - 1;
            while (j >= 0 && cur < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = cur;
        }
    }
}
