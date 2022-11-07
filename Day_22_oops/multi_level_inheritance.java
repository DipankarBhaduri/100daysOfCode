package Day_22_oops;

public class multi_level_inheritance {
    public static void main(String[] args) {
        principal1 p1 = new principal1();
        p1.printInfo("Dipankar Paul", 43, 20);

    }
}

class Student1 {
    String name;
    int age;

    public void printinfo() {
        System.out.print("Students details");
    }
}

class Teacher1 extends Student1 {
    public void printInfo(String name, int age) {
        System.out.print(name + " " + age + " ");
    }
}

class principal1 extends Teacher1 {
    public void printInfo(String name, int age, int max) {
        System.out.print(name + " " + age + " ");
        System.out.print(max);
    }
}
