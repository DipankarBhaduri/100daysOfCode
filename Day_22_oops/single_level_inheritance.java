package Day_22_oops;

public class single_level_inheritance {
    public static void main(String[] args) {
        Teacher math = new Teacher("Kamalesh", 45);
        math.printInfo();
    }
}

class Student23 {
    String name;
    int age;
}

class Teacher extends Student23 {
    Teacher(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void printInfo() {
        System.out.print(this.name + " " + this.age);
    }
}