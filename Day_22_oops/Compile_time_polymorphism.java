package Day_22_oops;
/*

What Is Compile-time Polymorphism? 
--> Compile-time polymorphism is obtained through method overloading. 
The term method overloading allows us to have more than one method with the same name. 
Since this process is executed during compile time, 
that's why it is known as Compile-Time Polymorphism.

 */

public class Compile_time_polymorphism {
    public static void main(String[] args) {
        Student S1 = new Student();
        S1.name = "Dipakar";
        S1.age = 25;

        S1.printinfo(S1.name, S1.age);

    }
}

class Student {
    String name;
    int age;

    void printinfo(String name) {
        System.out.print(name);
    }

    void printinfo(int age) {
        System.out.print(age);
    }

    void printinfo(String name, int age) {
        System.out.print(name + " " + age);
    }
}