package Day_73;

public class Binary_search_in_rotated_sorted_array {
    public static void main(String[] args) {
        int[] arr = { 6, 8, 9, 10, 12, 13, 14, 15, 1, 2, 3, 4, 5 };
        int ans = search_in_rotated_sorted_array(arr, 4);
        System.out.print(ans);
    }

    static int search_in_rotated_sorted_array(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                return mid;
            }

            if (arr[start] <= arr[mid]) {
                if (arr[start] <= target && arr[mid] > target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

            if (arr[mid] <= arr[end]) {
                if (arr[mid] < target && arr[end] >= target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }

        }

        return -1;
    }
}
