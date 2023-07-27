package Homework2;
//Напишете програма, която създава масив с 10 елемента от тип int и обходете масива:
//1) с помоща на for loop
//2) с помоща на while loop
//Да се изведат елементите на екрана.
public class Task4 {
    public static void main(String[] args) {
        int[] myArray = new int [10];
                myArray [0] = 5;
                myArray [1] = 7;
                myArray [2] = 9;
                myArray [3] = 11;
                myArray [4] = 27;
                myArray [5] = 32;
                myArray [6] = 36;
                myArray [7] = 40;
                myArray [8] = 45;
                myArray [9] = 50;

        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);

        }
        int x = myArray.length;
        int z= 0;
        while (z < x) {
        System.out.println(myArray[z]);
        z=z+1;
        }
    }
}