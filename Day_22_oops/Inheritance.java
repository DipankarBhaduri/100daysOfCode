package Day_22_oops;

public class Inheritance {
    public static void main(String[] args) {
        Triangle T1 = new Triangle();
        T1.color = "Red";
        T1.printinfo();
    }
}

class shape {
    String color;
}

class Triangle extends shape {
    void printinfo() {
        System.out.print(this.color);
    }
}