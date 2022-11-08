package Day_23;

import java.util.*;

public class Beautiful_Year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        sc.close();
        int beautiful_yr = search_the_next_beautiful_year(year);
        System.out.print(beautiful_yr);
    }

    static int search_the_next_beautiful_year(int year) {
        for (int i = year + 1; i <= 9000; i++) {
            boolean bool = helper_to_searching_the_beautiful_year(i);
            if (bool) {
                return i;
            }
        }

        return -1;
    }

    static boolean helper_to_searching_the_beautiful_year(int year) {
        HashSet<Integer> set = new HashSet<>();

        while (year > 0) {
            int rem = year % 10;
            set.add(rem);
            year = year / 10;
        }

        if (set.size() == 4) {
            return true;
        } else {
            return false;
        }
    }
}
