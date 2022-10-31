package Day_15;

public class Selection_sort {
    public static void main(String[] args) {
        int[] arr = { 7, 8, 3, 1, 2 };
        perfrom_selection_sort(arr);
    }

    public static void perfrom_selection_sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;
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
