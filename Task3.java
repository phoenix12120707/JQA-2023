package Homework1;

import java.util.Scanner;

//Въведете 3 числа от клавиатурата ч1, ч2 и ч3. Разменете стойностите им така,
// че ч1 да има стойността на ч2, ч2 да има стойността на ч3, а ч3 да има старатастойност на ч1.
// Съберете ч1 и ч2 и след това намерете разликата между получения сбор и ч3.
// Разпечатете стойностите на числата на етапи
public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
            System.out.println("Please insert a");
        int a = scan.nextInt();
            System.out.println("A is" + a);
            System.out.println("Please insert b");
        int b = scan.nextInt();
            System.out.println("B is" + b);
            System.out.println("Please insert c");
        int c = scan.nextInt();
            System.out.println("C is" + c);
        int temp = a;
        a = b;
            System.out.println("A is" + a);
        b = c;
            System.out.println("B is" + b);
        c = temp;
            System.out.println("C is" + c);

       int D = (a + b) - c;
       System.out.println(D);

    }
}