package Day_94;

import java.util.ArrayList;

public class All_Possible_Combinations {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("aa");
        list.add("bb");

        Solution1 s1 = new Solution1();
        ArrayList<String> ans = s1.specialStrings(list);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
    }
}

class Solution1 {
    public ArrayList<String> specialStrings(ArrayList<String> A) {
        ArrayList<String> ans = new ArrayList<>();
        if (A.size() == 1) {
            return A;
        } else {
            for (int i = 0; i < A.size() - 1; i++) {
                for (int j = i + 1; j < A.size(); j++) {
                    String s1 = A.get(i);
                    String s2 = A.get(j);
                    int n1 = s1.length();
                    int n2 = s2.length();
                    for (int e = 0; e < n1; e++) {
                        for (int f = 0; f < n2; f++) {
                            String curr = "" + s1.charAt(e) + s2.charAt(f);
                            ans.add(curr);
                            curr = "";
                        }
                    }
                }
            }
        }

        return ans;
    }
}