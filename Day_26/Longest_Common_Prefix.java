package Day_26;

import java.util.*;

public class Longest_Common_Prefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = sc.next();
        }

        sc.close();
        String ans = longest_common_prefix(str);
        System.out.print(ans);
    }

    public static String longest_common_prefix(String[] arr) {
        Arrays.sort(arr);
        if (arr.length < 2 || arr[0].equals("")) {
            return "";
        }

        String start = arr[0];
        String end = arr[arr.length - 1];
        int c = 0;

        while (c < arr[0].length()) {
            if (start.charAt(c) == end.charAt(c)) {
                c++;
            } else {
                break;
            }
        }

        if (c == 0) {
            return "";
        } else {
            return start.substring(0, c);
        }
    }
}
