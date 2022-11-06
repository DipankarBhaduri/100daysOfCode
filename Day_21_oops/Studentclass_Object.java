package Day_21_oops;

public class Studentclass_Object {
    public static void main(String[] args) {
        student S1 = new student();
        S1.name = "Dipankar";
        S1.age = 25;

        S1.printStudentInfo();
    }
}

class student {
    String name;
    int age;

    public void printStudentInfo() {
        System.out.print("Name :- " + this.name);
        System.out.print(", Age :- " + this.age);
    }
}
