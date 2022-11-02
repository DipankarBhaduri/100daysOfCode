package Day_17;

public class Selection_sort {
    public static void main(String[] args) {
        int[] arr = { 9, 6, 8, 4, 2, 7 };
        int n = arr.length;

        perfrom_selection_sort(arr);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void perfrom_selection_sort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[smallest]) {
                    smallest = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;
        }
    }
}
