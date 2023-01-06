package Day_82;

import java.util.*;

public class Shortest_Prime_Path {
    class Solution

    {
        int[] prime;
        int numSize = 4;

        Solution() {
            // Every index of prime stores zero or one

            // If prime[i] is zero means i is not a prime

            // If prime[i] is one means i is a prime

            prime = new int[10000];

            for (int i = 1000; i < 10000; i++) {

                if (i % 2 == 0)

                    prime[i] = 0;

                else if (i % 3 == 0)

                    prime[i] = 0;

                else {

                    int flag = 0;

                    for (int j = 5; j <= (i / 2); j++) {

                        if (i % j == 0) {

                            flag = 1;

                            break;

                        }

                    }

                    if (flag == 0)
                        prime[i] = 1;

                }

            }

        }

        public int getNum(int arr[]) {
            String num = arr[0] + "" + arr[1] + "" + arr[2] + "" + arr[3];
            return Integer.parseInt(num);
        }

        public int[] getArr(int num) {
            int n = numSize;
            int arr[] = new int[n];
            String temp = num + "";
            for (int i = 0; i < n; i++) {
                arr[i] = temp.charAt(i) - '0';
            }
            return arr;
        }

        public void getPossibleNum(int num, Queue<Integer> q) {
            for (int i = 0; i < numSize; i++) {
                int arr[] = getArr(num);
                for (int j = 0; j < 10; j++) {
                    if (i == 0 && j == 0)
                        continue;
                    arr[i] = j;
                    int newNum = getNum(arr);
                    if (prime[newNum] == 1) {
                        q.add(newNum);
                    }
                }
            }
        }

        public int shortestPath(int Num1, int Num2) {
            if (Num1 == Num2)
                return 0;

            int level = 1;
            Queue<Integer> q = new LinkedList<>();
            Set<Integer> set = new HashSet<>();

            getPossibleNum(Num1, q);
            while (!q.isEmpty()) {
                int n = q.size();
                for (int i = 0; i < n; i++) {
                    int queueNum = q.remove();
                    if (queueNum == Num2) {
                        return level;
                    }
                    if (set.contains(queueNum))
                        continue;
                    set.add(queueNum);
                    getPossibleNum(queueNum, q);
                }
                level++;
            }
            return level;
        }
    }
}
