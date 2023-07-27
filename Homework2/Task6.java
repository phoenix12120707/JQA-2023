package Homework2;

//Дадени са два масива със стойности {1, 2, 3} и {1, 2, 3} да се състави програма, която проверява дали масивите са еднакви
public class Task6 {
    public static void main(String[] args) {
        int myFirstArray[] = {1, 2, 3};
        int mySecondArray[] = {1, 2, 3};
        if (check(myFirstArray, mySecondArray))
            System.out.println("Arrays are the same");
        else
            System.out.println("Arrays are different");

    }

    public static boolean check(int[] myFirstArray, int[] mySecondArray) {
        if (myFirstArray.length != mySecondArray.length)
            return false;
        for (int i = 0; i < myFirstArray.length; i++) {
            if (myFirstArray[i] != mySecondArray[i]) {
                return false;
            }


        }
        return true;
    }
}