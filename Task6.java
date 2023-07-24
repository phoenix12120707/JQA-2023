package Homework1;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Въведете число от 1 до 7: ");
        int dayNumber = scanner.nextInt();
        String dayName;
          if (dayNumber == 1) {
            dayName = "Monday";
        } else if (dayNumber == 2) {
            dayName = "Tuesday";
        } else if (dayNumber == 3) {
            dayName = "Wednesday";
        } else if (dayNumber == 4) {
            dayName = "Thursday";
        } else if (dayNumber == 5) {
            dayName = "Friday";
        } else if (dayNumber == 6) {
            dayName = "Saturday";
        } else if (dayNumber == 7) {
            dayName = "Sunday";
        } else {
            dayName = "Not valid number";
        }

        System.out.println(dayName);

    }
}
