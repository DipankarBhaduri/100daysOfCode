package Day_15;

public class Insertion_sort {
    public static void main(String[] args) {
        int[] arr = { 7, 8, 3, 1, 2 };
        perfrom_selection_sort(arr);
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
