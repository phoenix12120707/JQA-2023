package Homework2;

//Да се състави масив със следните стойности {10 12 1 8 4}. След създаването на масива да се копират стойностите в нов масив
public class Task5 {
    public static void main(String[] args) {
        int myArray[] = {10, 12, 1, 8, 4};
        int mySecondArray[] = new int[myArray.length];
        mySecondArray = myArray;
        mySecondArray[0]++;
        System.out.print("First array : ");
        for (int i = 0; i < myArray.length; i++)
            System.out.print(myArray[i] + " ");
        System.out.println();
        System.out.print("Second array ");
        for (int i = 0; i < mySecondArray.length; i++)
            System.out.print(mySecondArray[i] + " ");


    }
}