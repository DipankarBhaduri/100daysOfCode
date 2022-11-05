package Day_20;

import java.util.*;

public class Cost_of_three_items {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float pen = sc.nextFloat();
        float pencil = sc.nextFloat();
        float eraser = sc.nextFloat();
        sc.close();

        float total_cost = pen + pencil + eraser;
        float gst = (total_cost * 18) / 100;
        System.out.println(total_cost + gst);

    }
}
