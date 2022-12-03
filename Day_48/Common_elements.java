package Day_48;

import java.util.*;

public class Common_elements {
    public static void main(String[] args) {

    }
}

class Solution {
    ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for (int i = 0; i < n1; i++) {
            int temp = A[i];
            set1.add(temp);
        }

        for (int i = 0; i < n2; i++) {
            int temp = B[i];
            set2.add(temp);
        }

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < n3; i++) {
            int temp = C[i];
            if (set1.contains(temp) && set2.contains(temp)) {
                list.add(temp);
                set1.remove(temp);
                set2.remove(temp);
            }
        }
        return list;
    }
}