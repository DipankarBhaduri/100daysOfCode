package Arrays;
/*
 * Given an array arr[] of distinct elements size N that is sorted and then
 * around an
 * unknown point, the task is to check if the array has a pair with a given sum
 * X.
 * 
 * Examples :
 * 
 * Input: arr[] = {11, 15, 6, 8, 9, 10}, X = 16
 * Output: true
 * Explanation: There is a pair (6, 10) with sum 16
 * 
 * Input: arr[] = {11, 15, 26, 38, 9, 10}, X = 35
 * Output: true
 * Explanation: There is a pair (26, 9) with sum 35
 * 
 */

public class Find_if_there_is_a_pair_with_a_given_sum {
    public static void main(String[] args) {
        int arr[] = { 11, 15, 6, 8, 9, 10 };
        int X = 16;
        int N = arr.length;

        if (pairInSortedRotated(arr, N, X))
            System.out.print("true");
        else
            System.out.print("false");
    }

    static boolean pairInSortedRotated(int arr[], int n, int x) {

        return false;
    }
}