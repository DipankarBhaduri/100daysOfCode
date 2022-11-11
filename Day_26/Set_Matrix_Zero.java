package Day_26;

public class Set_Matrix_Zero {
    public static void main(String[] args) {
        int arr[][] = { { 0, 1, 2, 0 }, { 3, 4, 5, 2 }, { 1, 3, 1, 5 } };

        set_zeros(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void set_zeros(int[][] arr) {
        int[] row = new int[arr.length];
        int[] column = new int[arr[0].length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == 0) {
                    row[i] = -1;
                    column[j] = -1;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (row[i] == -1 || column[j] == -1) {
                    arr[i][j] = 0;
                }
            }
        }
    }
}
