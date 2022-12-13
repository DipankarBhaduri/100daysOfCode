package Day_58;

import java.util.*;

public class Pattern_Printing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        sc.close();
        print_pattern(n);
    }

    static void print_pattern(int n) {
        if (n % 2 == 0) {
            int start = 0;
            int end = n - 1;
            for (int i = 0; i < (n / 2); i++) {
                for (int j = 0; j < n; j++) {
                    if (j == start || j == end) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
                start++;
                end--;
            }

            start--;
            end++;

            for (int i = 0; i < (n / 2); i++) {
                for (int j = 0; j < n; j++) {
                    if (j == start || j == end) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
                start--;
                end++;
            }

        } else {
            int start = 0;
            int end = n - 1;
            for (int i = 0; i < (n / 2); i++) {
                for (int j = 0; j < n; j++) {
                    if (j == start || j == end) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
                start++;
                end--;
            }

            start--;
            end++;
            for (int i = 0; i < n; i++) {
                if (i == (n / 2)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

            for (int i = 0; i < (n / 2); i++) {
                for (int j = 0; j < n; j++) {
                    if (j == start || j == end) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
                start--;
                end++;
            }

        }
    }
}

// ************

// *********