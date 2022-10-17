package Day_1;

public class Print_primeNumber_1_to_100_reverse_order {
    public static void main(String[] args) {
        for (int i = 100; i >= 1; i--) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.print(i + " ");
            }
        }
    }
}
