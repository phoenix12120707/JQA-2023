package Homework1;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please insert a");
        int a = scan.nextInt();
        System.out.println("A is" + a);
        System.out.println("Please insert b");
        int b = scan.nextInt();
        System.out.println("B is" + b);
        System.out.println("Please insert c");
        double c = scan.nextDouble();
        System.out.println("C is" + c);
        if (a < c && c < b) {
            System.out.println("Number C is between");}
        else {
            System.out.println("Number C is not between");}



    }
}