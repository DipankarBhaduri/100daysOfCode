package Day_2;

import java.util.*;

public class Flipping_bits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();

        while (testcase > 0) {
            Long n = sc.nextLong();
            Flip_bits(n);
            testcase--;
        }
    }

    public static void Flip_bits(Long n) {
        long bitmask = (1L << 32) - 1;
        System.out.println(bitmask ^ n);
    }
}

/*
 * 
 * You will be given a list of 32 bit unsigned integers. Flip all the bits (
 * 1->0 and 0->1) and
 * return the result as an unsigned integer.
 * 
 * Input Format
 * The first line of the input contains, an integer q, the number of test cases.
 * Each test case contains an integer n.
 * 
 * Output Format
 * For each test case, print a single unsigned integer obtained by flipping the
 * bits.
 * 
 * 
 * Example 1
 * Input
 * 3
 * 2147483647
 * 1
 * 0
 * Output
 * 2147483648
 * 4294967294
 * 4294967295
 * 
 */