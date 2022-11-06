package Day_21_oops;

public class class_AND_object {
    public static void main(String[] args) {
        pen p1 = new pen();
        p1.type = "Gel Pen";
        p1.color = "black";

        p1.write();

        pen p2 = new pen();
        p2.color = "red";
        p2.type = "Ball point pen";
        p2.printinfo();
    }
}

class pen {
    String color;
    String type;

    // pen(String color) {
    // this.color = color;
    // System.out.println(color);
    // }

    public void write() {
        System.out.println(this.type);
    }

    public void printinfo() {
        System.out.println(this.color + " --> " + this.type);
    }
}