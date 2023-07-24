package Homework1;
import java.util.Scanner;
public class Task4 {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Decisions

        System.out.print("Please insert amount of money: ");
        double moneyAmount = scanner.nextDouble();

        System.out.print("Is it work day?(true/false): ");
        boolean isDayOff = scanner.nextBoolean();

        System.out.print("Please insert working hours: ");
        int wH = scanner.nextInt();

        if (isDayOff) {
            System.out.println("Will go to work.");
        } else {
            if (moneyAmount > 0.00) {
                System.out.println("Will go to cinema.");//
            } else {
                System.out.println("Stay at home and watch TV.");
                if (moneyAmount <= 0.00) {
                    System.out.println("I don't have enough money for ice cream.");
                } else {
                    System.out.println("I will go for ice cream.");
                }
            }
        }


    }
}