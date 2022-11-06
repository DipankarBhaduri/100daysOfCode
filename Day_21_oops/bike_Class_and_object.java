package Day_21_oops;

public class bike_Class_and_object {
    public static void main(String[] args) {
        Bike b1 = new Bike("Gixxer", 150);

    }
}

class Bike {
    String model;
    int cc;

    Bike(String model, int cc) {
        this.model = model;
        this.cc = cc;

        System.out.print("Suzuki Gixxer SF" + " " + cc);
    }
}