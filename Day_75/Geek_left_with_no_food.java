package Day_75;

public class Geek_left_with_no_food {
    public static void main(String[] args) {
        int N = 7;
        int ans = solve(N);
        System.out.print(ans);
    }

    public static int solve(int N) {
        // code here
        if (N == 0) {
            return 0;
        }

        int n = 0;
        while (N > 0) {
            if (N % 2 == 0) {
                N = N / 2;
                n++;
                if (N == 1) {
                    break;
                }
            } else {
                N = (N + 1) / 2;
                n++;
                if (N == 1) {
                    break;
                }
            }
        }

        return n;
    }
}
