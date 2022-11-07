package Day_22_oops;

public class Hierarchial_Inheritance {
    public static void main(String[] args) {
        dog d1 = new dog();
        d1.printinfo();
        System.out.println();

        haski h1 = new haski();
        h1.printInfo("lalu", 2);

        System.out.println();
        bulldog b1 = new bulldog();
        b1.printInfo("kalu", 4);

    }
}

class dog {
    String name;
    int age;

    public void printinfo() {
        System.out.print("dog details");
    }
}

class haski extends dog {
    public void printInfo(String name, int age) {
        System.out.print(name + " " + age + " ");
    }
}

class bulldog extends dog {
    public void printInfo(String name, int age) {
        System.out.print(name + " " + age + " ");
    }
}
