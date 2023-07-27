package Homework2;

import java.util.Scanner;

//Да се състави метод, който приема като аргументи две числа и отпечатва на екрана техния сбор.
public class Task1 {
    public static void myMethod(){

        Scanner scan = new Scanner((System.in));
                int a = scan.nextInt();
                int b = scan.nextInt();
                int c = a+b;
                System.out.println( "Sum of the variables "+ c);



    }
    public static void main(String[] args){

        myMethod();

    }
}
