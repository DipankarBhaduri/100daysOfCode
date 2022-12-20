package Day_65;

import java.util.*;

public class Longest_Consecutive_Ones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Stack<Integer> stk = new Stack<>();

        while (num > 0) {
            if (num % 2 == 0) {
                stk.push(0);
            } else {
                stk.push(1);
            }
            num = num / 2;
        }

        sc.close();
        int ans = find_Longest_Consecutive_Ones(stk);
        System.out.print(ans);
    }

    static int find_Longest_Consecutive_Ones(Stack<Integer> stk) {
        int oneCount = 0;
        int maxOnes = 0;

        while (!stk.isEmpty()) {
            int num = stk.pop();
            if (num == 1) {
                oneCount++;
            } else {
                maxOnes = Math.max(maxOnes, oneCount);
                oneCount = 0;
            }
        }

        maxOnes = Math.max(maxOnes, oneCount);
        oneCount = 0;
        return maxOnes;

    }
}
