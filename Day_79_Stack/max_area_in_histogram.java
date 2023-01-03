package Day_79_Stack;

import java.util.*;

public class max_area_in_histogram {
    static int max_area(int[] arr) {
        int maxArea = 0;
        int[] nsr = new int[arr.length];
        int[] nsl = new int[arr.length];

        // Next Smaller right :-->>
        Stack<Integer> s = new Stack<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            while (s.size() > 0 && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsr[i] = arr.length;
            } else {
                nsr[i] = s.peek();
            }
            s.push(i);
        }

        // for (int i = 0; i < arr.length; i++) {
        // System.out.print(nsr[i] + " ");
        // }

        // Next smaller left :-->>
        s = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while (s.size() > 0 && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsl[i] = -1;
            } else {
                nsl[i] = s.peek();
            }
            s.push(i);
        }
        // current Area :-->>
        // current area : width = nsr[i] - nsl[i] + 1 ;
        for (int i = 0; i < arr.length; i++) {
            int height = arr[i];
            int width = nsr[i] - nsl[i] - 1;
            int currArea = height * width;
            maxArea = Math.max(maxArea, currArea);
        }
        return maxArea;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = max_area(arr);
        System.out.print(ans);
        sc.close();
    }
}
