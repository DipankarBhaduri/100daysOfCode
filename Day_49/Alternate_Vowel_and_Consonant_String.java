package Day_49;

import java.util.*;

/*
 * Input:
 * S = "aeroplane"
 * Output: alanepero
 * Explanation: alanepero
 * The vowels and cosonants are arranged
 * alternatively with vowels shown in bold.
 * Also, there's no lexicographically smaller
 * string possible with required conditions.
 * 
 * Input:
 * S = "mississippi"
 * Output: -1
 * Explanation: The number of vowels is 4
 * whereas the number of consonants is 7.
 * Hence, there's no way to arrange the
 * vowels and consonants alternatively.
 */

public class Alternate_Vowel_and_Consonant_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        sc.close();
        String ans = Vowel_and_Consonant_String(str);
        System.out.print(ans);
    }

    static String Vowel_and_Consonant_String(String str) {
        int vowelCount = 0;
        int alphabetCount = 0;
        int n = str.length();
        ArrayList<Character> list1 = new ArrayList<>();
        ArrayList<Character> list2 = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
                list1.add(ch);
            } else {
                alphabetCount++;
                list2.add(ch);
            }
        }

        if (n % 2 == 0) {
            if (vowelCount != alphabetCount) {
                return "-1";
            }

            Collections.sort(list1);
            Collections.sort(list2);
            String ans = "";

            for (int i = 0; i < list2.size(); i++) {
                char c1 = list1.get(i);
                char c2 = list2.get(i);
                ans += c1;
                ans += c2;
            }
            return ans;

        } else {
            if (vowelCount != alphabetCount + 1) {
                return "-1";
            }
            Collections.sort(list1);
            Collections.sort(list2);
            String ans = "";

            for (int i = 0; i < list2.size(); i++) {
                char c1 = list1.get(i);
                char c2 = list2.get(i);
                ans += c1;
                ans += c2;
            }
            ans += list1.get(list1.size() - 1);
            return ans;
        }
    }
}
