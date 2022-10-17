// Given a number N and a digit D. Write a program to find how many times the digit D appears in the number N.

package Day_1;

import java.util.*;

public class CountFrequencyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int digit = sc.nextInt();

        System.out.print(countFrequency(num, digit));
    }

    public static int countFrequency(int num, int digit) {
        int counter = 0;
        int rem = 0;

        while (num > 0) {
            rem = num % 10;
            if (rem == digit) {
                counter++;
            }
            num = num / 10;
        }

        return counter;
    }
}
