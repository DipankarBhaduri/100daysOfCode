package Day_79_Stack;

import java.util.*;

public class stock_span_problem {
    public static int[] span_calculation(int[] span) {
        int n = span.length;
        Stack<Integer> s = new Stack<>();
        int[] result = new int[n];
        int index = 0;

        result[index++] = 1;
        s.push(0);

        if (n == 1) {
            return result;
        }

        for (int i = 1; i < n; i++) {
            while (s.size() > 0 && span[s.peek()] < span[i]) {
                s.pop();
            }

            if (s.size() == 0) {
                result[index++] = i + 1;
            } else {
                result[index++] = i - s.peek();
            }

            s.push(i);
        }

        return result;
    }

    public static void main(String[] args) {
        int span[] = { 100, 80, 60, 70, 60, 85, 100 };
        int result[] = span_calculation(span);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}