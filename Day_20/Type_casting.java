package Day_20;

public class Type_casting {
    public static void main(String[] args) {
        byte b = 4;
        char c = 'a';
        Short s = 512;
        int i = 1000;
        float f = 3.14f;
        double d = 99.9954;

        double result = (f * b) + (i % c) - (d * s);
        System.out.print(result);

    }
}
