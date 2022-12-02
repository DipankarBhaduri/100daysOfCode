package Day_47;

public class Replace_all_0s_with_5 {
    public static void main(String[] args) {

    }
}

class GfG {
    int convertfive(int num) {
        // Your code here
        if (num == 0) {
            return 5;
        }

        if (num < 10) {
            return num;
        }

        int rev = 0;
        while (num > 0) {
            int rem = num % 10;
            if (rem == 0) {
                rev = rev * 10 + 5;
            } else {
                rev = rev * 10 + rem;
            }
            num = num / 10;
        }

        int two = 0;
        while (rev > 0) {
            int temp = rev % 10;
            two = two * 10 + temp;
            rev = rev / 10;
        }

        return two;
    }
}