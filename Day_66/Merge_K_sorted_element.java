package Day_66;

import java.util.*;

public class Merge_K_sorted_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        while (t-- > 0) {
            int num = sc.nextInt();
            for (int i = 0; i < num; i++) {
                list.add(sc.nextInt());
            }
        }

        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
