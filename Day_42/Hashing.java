package Day_42;

import java.util.*;

public class Hashing {
    public static void main(String[] args) {

    }
}

// Longest consecutive subsequence ( GFG )

class Solution1 {
    static int findLongestConseqSubseq(int arr[], int N) {
        int max = 1;
        int curMax = 1;

        Arrays.sort(arr);
        for (int i = 1; i < N; i++) {
            if (arr[i] - arr[i - 1] == 1) {
                curMax++;
            } else if (arr[i] - arr[i - 1] >= 2) {
                curMax = 1;
            }

            if (curMax > max) {
                max = curMax;
            }
        }
        return max;
    }
}

// Subarray with 0 sum ( GFG )

class Solution2 {
    // Function to check whether there is a subarray present with 0-sum or not.
    static boolean findsum(int arr[], int n) {
        HashSet<Integer> set = new HashSet<>();
        int prefSum = arr[0];
        set.add(prefSum);
        if (prefSum == 0) {
            return true;
        }

        for (int i = 1; i < n; i++) {
            prefSum += arr[i];
            if (prefSum == 0 || set.contains(prefSum)) {
                return true;
            } else {
                set.add(prefSum);
            }
        }
        return false;
    }
}

// Key Pair ( GFG )

class Solution3 {
    boolean hasArrayTwoCandidates(int arr[], int n, int x) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            int val = arr[i];

            if (set.contains(x - val)) {
                return true;
            }
            set.add(val);
        }
        return false;
    }
}

// Anagram Palindrome ( GFG )

class Sol {
    int isPossible(String S) {
        HashMap<Character, Integer> map = new HashMap<>();
        int n = S.length();
        for (int i = 0; i < n; i++) {
            char ch = S.charAt(i);
            if (map.containsKey(ch)) {
                int val = map.get(ch);
                map.put(ch, val + 1);
            } else {
                map.put(ch, 1);
            }
        }

        int odd = 0;
        for (Map.Entry<Character, Integer> e : map.entrySet()) {
            if (e.getValue() % 2 != 0) {
                odd++;
            }
        }

        if (odd < 2) {
            return 1;
        }
        return 0;
    }
}

// Remove duplicates in small prime array ( GFG )

class Solution4 {
    ArrayList<Integer> removeDuplicate(int arr[], int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (!map.containsKey(arr[i])) {
                list.add(arr[i]);
                map.put(arr[i], 1);
            }
        }
        return list;
    }
}
