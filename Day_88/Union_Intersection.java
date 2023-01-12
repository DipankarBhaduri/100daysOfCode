package Day_88;

import java.util.ArrayList;
import java.util.HashSet;

public class Union_Intersection {
    public static void main(String[] args) {

        // Here is array_1 and Array_2 :-->>
        int[] arr1 = { 7, 3, 9 };
        int[] arr2 = { 6, 3, 9, 2, 9, 4 };

        // Creating object of my class :-->>
        solution1 s1 = new solution1();

        // union of the two given array :-->>
        int[] uni = s1.union(arr1, arr2);
        System.out.print("Union are : ");
        for (int i = 0; i < uni.length; i++) {
            System.out.print(uni[i] + ",");
        }
        System.out.println();

        // Creating object of my class :-->>
        solution2 s2 = new solution2();

        // Intersection of the two given array :-->>
        ArrayList<Integer> inter = s2.Intersection(arr1, arr2);
        System.out.print("Intersection : ");
        for (int i = 0; i < inter.size(); i++) {
            System.out.print(inter.get(i) + ",");
        }
    }
}

class solution1 {
    public int[] union(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<>();
        int n1 = 0;
        int n2 = 0;

        while (n1 < arr1.length || n2 < arr2.length) {
            if (n1 < arr1.length) {
                if (!set.contains(arr1[n1])) {
                    set.add(arr1[n1]);
                }
                n1++;
            }

            if (n2 < arr2.length) {
                if (!set.contains(arr2[n2])) {
                    set.add(arr2[n2]);
                }
                n2++;
            }
        }

        int result[] = new int[set.size()];
        int index = 0;
        for (int val : set) {
            result[index++] = val;
        }

        return result;
    }
}

class solution2 {
    public ArrayList<Integer> Intersection(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        int n1 = 0;
        int n2 = 0;

        while (n1 < arr1.length) {
            if (!set.contains(arr1[n1])) {
                set.add(arr1[n1]);
            }
            n1++;
        }

        while (n2 < arr2.length) {
            if (set.contains(arr2[n2])) {
                list.add(arr2[n2]);
                set.remove(arr2[n2]);
            }
            n2++;
        }

        return list;
    }
}
