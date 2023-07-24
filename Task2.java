package Homework1;
import java.util.Scanner;
// Въведете 4 различни числа от конзолата и разменте стойността
// им две по две. Нека числата бъдат от различен тип (int и duoble).
// Разпечатайте новите им стойности. Направете кастване (casting)
// конвертиране на числата веднъж от int to double и после от
// double to int и след всяко конвертиране изведете сумата им
public class Task2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please insert A");
        int A = scan.nextInt();
            System.out.println("Number A =" + A);
            double newA = A;
                System.out.println("Number A =" + newA);
        System.out.println("Please insert B");
        int B = scan.nextInt();
            System.out.println("Number B =" + B);
            double newB = B;
                System.out.println("Number B =" + newB);
        System.out.println("Please insert C");
        double C = scan.nextDouble();
            System.out.println("Number C =" + C);
            int newC = (int) C;
        System.out.println("Number C =" + newC);
        System.out.println("Please insert D");
        double D = scan.nextDouble();
        System.out.println("Number D =" + D);
        int newD = (int) D;
        System.out.println("Number D =" + newD);



    }

}
