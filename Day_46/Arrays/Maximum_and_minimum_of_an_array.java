package Arrays;
/*
 * Given an array A of size N of integers. Your task is to find the sum of
 * minimum
 * and maximum element in the array.
 * 
 * Example 1:
 * Input:
 * N = 5
 * A[] = {-2, 1, -4, 5, 3}
 * Output: 1
 * Explanation: min = -4, max = 5. Sum = -4 + 5 = 1
 * 
 * 
 * Example 2:
 * Input:
 * N = 4
 * A[] = {1, 3, 4, 1}
 * Output: 5
 * Explanation: min = 1, max = 4. Sum = 1 + 4 = 5
 * 
 */

class Solution {
    public static int findSum(int A[], int N) {
        int max = A[0];
        int min = A[0];

        for (int i = 0; i < N; i++) {
            if (A[i] > max) {
                max = A[i];
            }

            if (A[i] < min) {
                min = A[i];
            }

        }

        int sum = max + min;
        return sum;
    }
}