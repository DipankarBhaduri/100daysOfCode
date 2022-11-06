package Day_21_oops;

public class parameterized_constructor {
    public static void main(String[] args) {
        Book B1 = new Book("Math", 500, 496);
        B1.printInfo();

    }
}

class Book {
    String name;
    int price;
    int Total_pages;

    Book(String name, int price, int pages) {
        this.name = name;
        this.price = price;
        this.Total_pages = pages;
    }

    void printInfo() {
        System.out.print(this.name + " " + this.price + " " + this.Total_pages);
    }
}