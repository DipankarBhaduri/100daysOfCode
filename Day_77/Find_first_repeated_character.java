package Day_77;

public class Find_first_repeated_character {
    public static void main(String[] args) {

    }
}

class Solution {
    String firstRepChar(String s) {
        HashSet<Character> set = new HashSet<>();
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (set.contains(ch)) {
                ans += ch;
                break;
            } else {
                set.add(ch);
            }
        }

        if (ans.length() < 1) {
            return "-1";
        }
        return ans;
    }
}