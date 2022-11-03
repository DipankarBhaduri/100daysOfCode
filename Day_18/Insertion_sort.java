package Day_18;

public class Insertion_sort {
    public static void main(String[] args) {
        int[] arr = { 9, 5, 4, 3, 6, 7, 8, 2 };
        perfrom_selection_sort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void perfrom_selection_sort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && current < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = current;
        }

    }
}
