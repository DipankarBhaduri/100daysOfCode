package Day_21_oops;

public class Non_parameterized_constructor {
    public static void main(String[] args) {
        Phone p1 = new Phone();
        p1.model = "Realme 5s";
        p1.price = 10999;
        p1.printInfo();

    }
}

class Phone {
    String model;
    int price;

    Phone() {
        System.out.println("Autometically Constructor will called");
    }

    void printInfo() {
        System.out.print(this.model + " " + this.price);
    }
}