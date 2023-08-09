package Homework4;

public class Computer {

    int year;
    double price;
    String operationSystem;

    Computer(int year, double price, String operationSystem) {

        this.year = year;
        this.price = price;
        this.operationSystem = operationSystem;
    }

    Computer() {

    }

    public void display() {
        System.out.println(year);
        System.out.println(price);
        System.out.println(operationSystem);
    }

    public int comparePrice(Computer compare) {
        if (this.price > compare.price) {
            return -1;
        }
        else if (this.price < compare.price) {
            return 1;
        }
        else {
            return 0;
        }
    }
}