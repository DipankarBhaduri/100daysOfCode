package Day_98;

public class GCD_Array {
    public static void main(String[] args) {

    }
}

class Solution {
    public static int solve(int N, int K, int[] arr) {
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += arr[i];
        }
        ArrayList<Integer> v = new ArrayList<>();
        for (int i = 1; i * i <= sum; i++) {
            if (sum % i == 0) {
                v.add(sum / i);
                if (i * i != sum) {
                    v.add(i);
                }
            }
        }
        Collections.sort(v, Collections.reverseOrder());
        int cnt;
        int ans = 1;
        sum = 0;
        for (int i = 0; i < v.size(); i++) {
            int x = v.get(i);
            cnt = 0;
            sum = 0;
            for (int j = 0; j < N; j++) {
                sum += arr[j];
                if (sum % x == 0) {
                    cnt++;
                    sum = 0;
                }
            }
            if (cnt >= K) {
                return v.get(i);
            }
        }
        return ans;
    }
}