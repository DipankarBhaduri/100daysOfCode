package Day_51;

import java.util.*;

class Accio {
    int BillDivision(int n, int k, int[] bill, int charge) {
        int Totalsum = 0;
        for (int i = 0; i < n; ++i)
            Totalsum += bill[i];
        Totalsum -= bill[k];
        Totalsum /= 2;
        return charge - Totalsum;
    }
}

public class Bill_Division {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] bill = new int[n];
        for (int i = 0; i < n; ++i) {
            bill[i] = sc.nextInt();
        }
        int charge = sc.nextInt();
        Accio obj = new Accio();
        int ans = obj.BillDivision(n, k, bill, charge);
        System.out.println(ans);
        sc.close();
    }
}