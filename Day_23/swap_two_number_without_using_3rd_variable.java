package Day_23;

public class swap_two_number_without_using_3rd_variable {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;

        // swaping :->>

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.print("a = " + a + "\nb = " + b);
    }
}
