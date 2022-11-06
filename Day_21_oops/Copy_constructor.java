package Day_21_oops;

public class Copy_constructor {
    public static void main(String[] args) {
        Watch w1 = new Watch();
        w1.band = "Sonata";
        w1.price = 699;

        Watch w2 = new Watch(w1);
        w2.printInfo();

    }
}

class Watch {
    String band;
    int price;

    public void printInfo() {
        System.out.println(this.band);
        System.out.println(this.price);
    }

    Watch(Watch w1) {
        this.band = w1.band;
        this.price = w1.price;
    }

    Watch() {

    }
}