package Day_73;

import java.util.*;

public class group_anagram {

    // Main Function :-->>
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.next();
        }

        // String[] arr = { "eat", "tea", "tan", "ate", "nat" };

        // Function call :-->>
        ArrayList<ArrayList<String>> ans = find_the_anagram(arr);
        System.out.print(ans);
    }

    // Group anagram function :-->>
    public static ArrayList<ArrayList<String>> find_the_anagram(String[] arr) {
        HashMap<String, ArrayList<String>> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            String cur = arr[i];
            char ch[] = cur.toCharArray();
            Arrays.sort(ch);
            String temp = new String(ch);

            if (map.containsKey(temp)) {
                map.get(temp).add(cur);
            } else {
                map.put(temp, new ArrayList<>());
                map.get(temp).add(cur);
            }
        }

        ArrayList<ArrayList<String>> ans = new ArrayList<>();
        for (Map.Entry<String, ArrayList<String>> e : map.entrySet()) {
            ans.add(e.getValue());
        }

        return ans;
    }
}

/*
 * Input: strs = ["eat","tea","tan","ate","nat","bat"]
 * Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
 */

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            String temp = strs[i];
            char ch[] = temp.toCharArray();
            Arrays.sort(ch);
            // String s = String.valueOf(ch);
            String s = new String(ch);
            if (map.containsKey(s)) {
                map.get(s).add(temp);
            } else {
                map.put(s, new ArrayList());
                map.get(s).add(temp);
            }
        }
        List<List<String>> ans = new ArrayList<>();
        for (String ss : map.keySet()) {
            ans.add(map.get(ss));
        }
        return ans;
    }
}