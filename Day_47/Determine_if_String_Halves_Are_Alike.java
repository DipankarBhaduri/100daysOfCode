package Day_47;

public class Determine_if_String_Halves_Are_Alike {
    public static void main(String[] args) {

    }
}

class Solution {
    public boolean halvesAreAlike(String s) {
        char ch[] = s.toCharArray();
        int n = s.length();
        int firstCount = 0;

        for (int i = 0; i < n / 2; i++) {
            char c = ch[i];
            c = Character.toLowerCase(c);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                firstCount++;
            }
        }

        int secondCount = 0;
        for (int i = n / 2; i < n; i++) {
            char c = ch[i];
            c = Character.toLowerCase(c);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                secondCount++;
            }
        }

        if (firstCount == secondCount) {
            return true;
        } else {
            return false;
        }
    }
}