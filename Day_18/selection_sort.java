package Day_18;

public class selection_sort {
    public static void main(String[] args) {
        int[] arr = { 9, 5, 4, 3, 6, 7, 8, 2 };
        perfrom_the_selection_sort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void perfrom_the_selection_sort(int[] arr) {

        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int smallest = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[smallest]) {
                    smallest = j;
                }
            }
            // swap
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;
        }
    }
}
