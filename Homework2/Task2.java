package Homework2;


import java.util.Scanner;

//Да се състави метод, който приема като аргументи две числа и връща тяхното средноаритметично.
public class Task2 {
    public static void myMethod(){

        Scanner scan = new Scanner((System.in));
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = (a+b)/2;
        System.out.println( "Аverage "+ c);



    }
    public static void main(String[] args){

        myMethod();

    }
}
